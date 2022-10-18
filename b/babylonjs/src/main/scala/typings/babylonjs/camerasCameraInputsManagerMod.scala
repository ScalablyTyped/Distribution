package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasCameraInputsManagerMod {
  
  @JSImport("babylonjs/Cameras/cameraInputsManager", "CameraInputsManager")
  @js.native
  open class CameraInputsManager[TCamera /* <: Camera */] protected () extends StObject {
    /**
      * Instantiate a new Camera Input Manager.
      * @param camera Defines the camera the input manager belongs to
      */
    def this(camera: TCamera) = this()
    
    /* private */ var _addCheckInputs: Any = js.native
    
    /**
      * Add an input method to a camera
      * @see https://doc.babylonjs.com/how_to/customizing_camera_inputs
      * @param input camera input method
      */
    def add(input: ICameraInput[TCamera]): Unit = js.native
    
    /**
      * Attach the current manager inputs controls to a specific dom element to listen the events from.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      */
    def attachElement(): Unit = js.native
    def attachElement(noPreventDefault: Boolean): Unit = js.native
    
    /**
      * Attach the input controls to the currently attached dom element to listen the events from.
      * @param input Defines the input to attach
      */
    def attachInput(input: ICameraInput[TCamera]): Unit = js.native
    
    /**
      * Defines the list of inputs attached to the camera.
      */
    var attached: CameraInputsMap[TCamera] = js.native
    
    /**
      * Defines the dom element the camera is collecting inputs from.
      * This is null if the controls have not been attached.
      */
    var attachedToElement: Boolean = js.native
    
    /**
      * Defined the camera the input manager belongs to.
      */
    var camera: TCamera = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    def checkInputs(): Unit = js.native
    
    /**
      * Remove all attached input methods from a camera
      */
    def clear(): Unit = js.native
    
    /**
      * Detach the current manager inputs controls from a specific dom element.
      * @param disconnect Defines whether the input should be removed from the current list of attached inputs
      */
    def detachElement(): Unit = js.native
    def detachElement(disconnect: Boolean): Unit = js.native
    
    /**
      * Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      */
    var noPreventDefault: Boolean = js.native
    
    /**
      * Parses an input manager serialized JSON to restore the previous list of inputs
      * and states associated to a camera.
      * @param parsedCamera Defines the JSON to parse
      */
    def parse(parsedCamera: Any): Unit = js.native
    
    /**
      * Rebuild the dynamic inputCheck function from the current list of
      * defined inputs in the manager.
      */
    def rebuildInputCheck(): Unit = js.native
    
    /**
      * Remove a specific input method from a camera
      * example: camera.inputs.remove(camera.inputs.attached.mouse);
      * @param inputToRemove camera input method
      */
    def remove(inputToRemove: ICameraInput[TCamera]): Unit = js.native
    
    /**
      * Remove a specific input type from a camera
      * example: camera.inputs.remove("ArcRotateCameraGamepadInput");
      * @param inputType the type of the input to remove
      */
    def removeByType(inputType: String): Unit = js.native
    
    /**
      * Serialize the current input manager attached to a camera.
      * This ensures than once parsed,
      * the input associated to the camera will be identical to the current ones
      * @param serializedCamera Defines the camera serialization JSON the input serialization should write to
      */
    def serialize(serializedCamera: Any): Unit = js.native
  }
  
  type CameraInputsMap[TCamera /* <: Camera */] = (/**
    * Accessor to the input by input type.
    */
  StringDictionary[ICameraInput[TCamera]]) & (/**
    * Accessor to the input by input index.
    */
  NumberDictionary[ICameraInput[TCamera]])
  
  @js.native
  trait ICameraInput[TCamera /* <: Camera */] extends StObject {
    
    /**
      * Attach the input controls to a specific dom element to get the input from.
      * @param noPreventDefault Defines whether event caught by the controls should call preventdefault() (https://developer.mozilla.org/en-US/docs/Web/API/Event/preventDefault)
      */
    def attachControl(): Unit = js.native
    def attachControl(noPreventDefault: Boolean): Unit = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    var camera: Nullable[TCamera] = js.native
    
    /**
      * Update the current camera state depending on the inputs that have been used this frame.
      * This is a dynamically created lambda to avoid the performance penalty of looping for inputs in the render loop.
      */
    var checkInputs: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Detach the current controls from the specified dom element.
      */
    def detachControl(): Unit = js.native
    
    /**
      * Gets the class name of the current input.
      * @returns the class name
      */
    def getClassName(): String = js.native
    
    /**
      * Get the friendly name associated with the input class.
      * @returns the input friendly name
      */
    def getSimpleName(): String = js.native
  }
}
