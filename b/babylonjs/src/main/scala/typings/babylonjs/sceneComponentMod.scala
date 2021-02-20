package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.anon.Action
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.meshMod.InstancesBatch
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.pickingInfoMod.PickingInfo
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.smartArrayMod.SmartArrayNoDuplicate
import typings.babylonjs.subMeshMod.SubMesh
import typings.babylonjs.typesMod.Nullable
import typings.std.Array
import typings.std.HTMLElement
import typings.std.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sceneComponentMod {
  
  @JSImport("babylonjs/sceneComponent", "SceneComponentConstants")
  @js.native
  class SceneComponentConstants () extends StObject
  /* static members */
  object SceneComponentConstants {
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_AUDIO")
    @js.native
    val NAME_AUDIO: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_BOUNDINGBOXRENDERER")
    @js.native
    val NAME_BOUNDINGBOXRENDERER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_DEPTHRENDERER")
    @js.native
    val NAME_DEPTHRENDERER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_EFFECTLAYER")
    @js.native
    val NAME_EFFECTLAYER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_GAMEPAD")
    @js.native
    val NAME_GAMEPAD: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_GEOMETRYBUFFERRENDERER")
    @js.native
    val NAME_GEOMETRYBUFFERRENDERER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_LAYER")
    @js.native
    val NAME_LAYER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_LENSFLARESYSTEM")
    @js.native
    val NAME_LENSFLARESYSTEM: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_OCTREE")
    @js.native
    val NAME_OCTREE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_OUTLINERENDERER")
    @js.native
    val NAME_OUTLINERENDERER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_PARTICLESYSTEM")
    @js.native
    val NAME_PARTICLESYSTEM: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_PHYSICSENGINE")
    @js.native
    val NAME_PHYSICSENGINE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_POSTPROCESSRENDERPIPELINEMANAGER")
    @js.native
    val NAME_POSTPROCESSRENDERPIPELINEMANAGER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_PREPASSRENDERER")
    @js.native
    val NAME_PREPASSRENDERER: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_PROCEDURALTEXTURE")
    @js.native
    val NAME_PROCEDURALTEXTURE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_SHADOWGENERATOR")
    @js.native
    val NAME_SHADOWGENERATOR: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_SIMPLIFICATIONQUEUE")
    @js.native
    val NAME_SIMPLIFICATIONQUEUE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_SPRITE")
    @js.native
    val NAME_SPRITE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.NAME_SUBSURFACE")
    @js.native
    val NAME_SUBSURFACE: String = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERCAMERADRAW_EFFECTLAYER")
    @js.native
    val STEP_AFTERCAMERADRAW_EFFECTLAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERCAMERADRAW_EFFECTLAYER_DRAW")
    @js.native
    val STEP_AFTERCAMERADRAW_EFFECTLAYER_DRAW: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERCAMERADRAW_LAYER")
    @js.native
    val STEP_AFTERCAMERADRAW_LAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERCAMERADRAW_LENSFLARESYSTEM")
    @js.native
    val STEP_AFTERCAMERADRAW_LENSFLARESYSTEM: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERCAMERADRAW_PREPASS")
    @js.native
    val STEP_AFTERCAMERADRAW_PREPASS: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDERINGGROUPDRAW_BOUNDINGBOXRENDERER")
    @js.native
    val STEP_AFTERRENDERINGGROUPDRAW_BOUNDINGBOXRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDERINGGROUPDRAW_EFFECTLAYER_DRAW")
    @js.native
    val STEP_AFTERRENDERINGGROUPDRAW_EFFECTLAYER_DRAW: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDERINGMESH_OUTLINE")
    @js.native
    val STEP_AFTERRENDERINGMESH_OUTLINE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDERINGMESH_PREPASS")
    @js.native
    val STEP_AFTERRENDERINGMESH_PREPASS: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDERTARGETDRAW_LAYER")
    @js.native
    val STEP_AFTERRENDERTARGETDRAW_LAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_AFTERRENDER_AUDIO")
    @js.native
    val STEP_AFTERRENDER_AUDIO: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECAMERADRAW_EFFECTLAYER")
    @js.native
    val STEP_BEFORECAMERADRAW_EFFECTLAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECAMERADRAW_LAYER")
    @js.native
    val STEP_BEFORECAMERADRAW_LAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECAMERADRAW_PREPASS")
    @js.native
    val STEP_BEFORECAMERADRAW_PREPASS: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECAMERAUPDATE_GAMEPAD")
    @js.native
    val STEP_BEFORECAMERAUPDATE_GAMEPAD: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECAMERAUPDATE_SIMPLIFICATIONQUEUE")
    @js.native
    val STEP_BEFORECAMERAUPDATE_SIMPLIFICATIONQUEUE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECLEARSTAGE_PREPASS")
    @js.native
    val STEP_BEFORECLEARSTAGE_PREPASS: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORECLEAR_PROCEDURALTEXTURE")
    @js.native
    val STEP_BEFORECLEAR_PROCEDURALTEXTURE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFOREEVALUATEACTIVEMESH_BOUNDINGBOXRENDERER")
    @js.native
    val STEP_BEFOREEVALUATEACTIVEMESH_BOUNDINGBOXRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORERENDERINGMESH_OUTLINE")
    @js.native
    val STEP_BEFORERENDERINGMESH_OUTLINE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORERENDERINGMESH_PREPASS")
    @js.native
    val STEP_BEFORERENDERINGMESH_PREPASS: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_BEFORERENDERTARGETDRAW_LAYER")
    @js.native
    val STEP_BEFORERENDERTARGETDRAW_LAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_CAMERADRAWRENDERTARGET_EFFECTLAYER")
    @js.native
    val STEP_CAMERADRAWRENDERTARGET_EFFECTLAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_EVALUATESUBMESH_BOUNDINGBOXRENDERER")
    @js.native
    val STEP_EVALUATESUBMESH_BOUNDINGBOXRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_GATHERACTIVECAMERARENDERTARGETS_DEPTHRENDERER")
    @js.native
    val STEP_GATHERACTIVECAMERARENDERTARGETS_DEPTHRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_GATHERRENDERTARGETS_DEPTHRENDERER")
    @js.native
    val STEP_GATHERRENDERTARGETS_DEPTHRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_GATHERRENDERTARGETS_GEOMETRYBUFFERRENDERER")
    @js.native
    val STEP_GATHERRENDERTARGETS_GEOMETRYBUFFERRENDERER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_GATHERRENDERTARGETS_POSTPROCESSRENDERPIPELINEMANAGER")
    @js.native
    val STEP_GATHERRENDERTARGETS_POSTPROCESSRENDERPIPELINEMANAGER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_GATHERRENDERTARGETS_SHADOWGENERATOR")
    @js.native
    val STEP_GATHERRENDERTARGETS_SHADOWGENERATOR: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_ISREADYFORMESH_EFFECTLAYER")
    @js.native
    val STEP_ISREADYFORMESH_EFFECTLAYER: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_POINTERDOWN_SPRITE")
    @js.native
    val STEP_POINTERDOWN_SPRITE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_POINTERMOVE_SPRITE")
    @js.native
    val STEP_POINTERMOVE_SPRITE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_POINTERUP_SPRITE")
    @js.native
    val STEP_POINTERUP_SPRITE: Double = js.native
    
    @JSImport("babylonjs/sceneComponent", "SceneComponentConstants.STEP_PREACTIVEMESH_BOUNDINGBOXRENDERER")
    @js.native
    val STEP_PREACTIVEMESH_BOUNDINGBOXRENDERER: Double = js.native
  }
  
  @JSImport("babylonjs/sceneComponent", "Stage")
  @js.native
  /**
    * Hide ctor from the rest of the world.
    * @param items The items to add.
    */
  class Stage[T /* <: js.Function */] protected () extends Array[Action[T]] {
    
    /**
      * Clears all the steps from the stage.
      */
    def clear(): Unit = js.native
    
    /**
      * Registers a step in an ordered way in the targeted stage.
      * @param index Defines the position to register the step in
      * @param component Defines the component attached to the step
      * @param action Defines the action to launch during the step
      */
    def registerStep(index: Double, component: ISceneComponent, action: T): Unit = js.native
  }
  /* static members */
  object Stage {
    
    /**
      * Creates a new Stage.
      * @returns A new instance of a Stage
      */
    @JSImport("babylonjs/sceneComponent", "Stage.Create")
    @js.native
    def Create[T /* <: js.Function */](): Stage[T] = js.native
  }
  
  type CameraStageAction = js.Function1[/* camera */ Camera, Unit]
  
  type CameraStageFrameBufferAction = js.Function1[/* camera */ Camera, Boolean]
  
  type EvaluateSubMeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* subMesh */ SubMesh, Unit]
  
  @js.native
  trait ISceneComponent extends StObject {
    
    /**
      * Disposes the component and the associated ressources.
      */
    def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    var scene: Scene = js.native
  }
  object ISceneComponent {
    
    @scala.inline
    def apply(dispose: () => Unit, name: String, rebuild: () => Unit, register: () => Unit, scene: Scene): ISceneComponent = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), name = name.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), register = js.Any.fromFunction0(register), scene = scene.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISceneComponent]
    }
    
    @scala.inline
    implicit class ISceneComponentMutableBuilder[Self <: ISceneComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegister(value: () => Unit): Self = StObject.set(x, "register", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISceneSerializableComponent extends ISceneComponent {
    
    /**
      * Adds all the elements from the container to the scene
      * @param container the container holding the elements
      */
    def addFromContainer(container: AbstractScene): Unit = js.native
    
    /**
      * Removes all the elements in the container from the scene
      * @param container contains the elements to remove
      * @param dispose if the removed element should be disposed (default: false)
      */
    def removeFromContainer(container: AbstractScene): Unit = js.native
    def removeFromContainer(container: AbstractScene, dispose: Boolean): Unit = js.native
    
    /**
      * Serializes the component data to the specified json object
      * @param serializationObject The object to serialize to
      */
    def serialize(serializationObject: js.Any): Unit = js.native
  }
  
  type MeshStageAction = js.Function2[/* mesh */ AbstractMesh, /* hardwareInstancedRendering */ Boolean, Boolean]
  
  type PointerMoveStageAction = js.Function5[
    /* unTranslatedPointerX */ Double, 
    /* unTranslatedPointerY */ Double, 
    /* pickResult */ Nullable[PickingInfo], 
    /* isMeshPicked */ Boolean, 
    /* element */ HTMLElement, 
    Nullable[PickingInfo]
  ]
  
  type PointerUpDownStageAction = js.Function4[
    /* unTranslatedPointerX */ Double, 
    /* unTranslatedPointerY */ Double, 
    /* pickResult */ Nullable[PickingInfo], 
    /* evt */ PointerEvent, 
    Nullable[PickingInfo]
  ]
  
  type PreActiveMeshStageAction = js.Function1[/* mesh */ AbstractMesh, Unit]
  
  type RenderTargetStageAction = js.Function1[/* renderTarget */ RenderTargetTexture, Unit]
  
  type RenderTargetsStageAction = js.Function1[/* renderTargets */ SmartArrayNoDuplicate[RenderTargetTexture], Unit]
  
  type RenderingGroupStageAction = js.Function1[/* renderingGroupId */ Double, Unit]
  
  type RenderingMeshStageAction = js.Function4[
    /* mesh */ Mesh, 
    /* subMesh */ SubMesh, 
    /* batch */ InstancesBatch, 
    /* effect */ Nullable[Effect], 
    Unit
  ]
  
  type SimpleStageAction = js.Function0[Unit]
}
