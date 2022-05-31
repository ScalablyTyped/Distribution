package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.DisableDefaultHandMesh
import typings.babylonjs.babylonjsStrings.index
import typings.babylonjs.babylonjsStrings.little
import typings.babylonjs.babylonjsStrings.middle
import typings.babylonjs.babylonjsStrings.ring
import typings.babylonjs.babylonjsStrings.thumb
import typings.babylonjs.babylonjsStrings.wrist
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRInputMod.WebXRInput
import typings.babylonjs.webXRInputSourceMod.WebXRInputSource
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRHandTrackingMod {
  
  @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHand")
  @js.native
  class WebXRHand protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new hand object
      * @param xrController the controller to which the hand correlates
      * @param trackedMeshes the meshes to be used to track the hand joints
      * @param _handMesh an optional hand mesh. if not provided, ours will be used
      * @param _rigMapping an optional rig mapping for the hand mesh. if not provided, ours will be used
      * @param disableDefaultHandMesh should the default mesh creation be disabled
      */
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: Unit,
      _rigMapping: js.Array[String]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: js.Array[String]
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: Unit,
      _rigMapping: js.Array[String],
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: Unit,
      _rigMapping: Unit,
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: js.Array[String],
      disableDefaultHandMesh: Boolean
    ) = this()
    def this(
      /** the controller to which the hand correlates */
    xrController: WebXRInputSource,
      /** the meshes to be used to track the hand joints */
    trackedMeshes: js.Array[AbstractMesh],
      _handMesh: AbstractMesh,
      _rigMapping: Unit,
      disableDefaultHandMesh: Boolean
    ) = this()
    
    /* private */ var _defaultHandMesh: js.Any = js.native
    
    /* private */ var _generateDefaultHandMesh: js.Any = js.native
    
    /* private */ var _handMesh: js.Any = js.native
    
    /* private */ var _rigMapping: js.Any = js.native
    
    /* private */ var _scene: js.Any = js.native
    
    /* private */ var _transformNodeMapping: js.Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Populate the HandPartsDefinition object.
      * This is called as a side effect since certain browsers don't have XRHand defined.
      */
    /* private */ var generateHandPartsDefinition: js.Any = js.native
    
    /**
      * Get meshes of part of the hand
      * @param part the part of hand to get
      * @returns An array of meshes that correlate to the hand part requested
      */
    def getHandPartMeshes(part: HandPart): js.Array[AbstractMesh] = js.native
    
    /**
      * Hand-parts definition (key is HandPart)
      */
    var handPartsDefinition: StringDictionary[js.Array[Double]] = js.native
    
    /** the meshes to be used to track the hand joints */
    val trackedMeshes: js.Array[AbstractMesh] = js.native
    
    /**
      * Update this hand from the latest xr frame
      * @param xrFrame xrFrame to update from
      * @param referenceSpace The current viewer reference space
      * @param scaleFactor optional scale factor for the meshes
      */
    def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace): Unit = js.native
    def updateFromXRFrame(xrFrame: XRFrame, referenceSpace: XRReferenceSpace, scaleFactor: Double): Unit = js.native
    
    /** the controller to which the hand correlates */
    val xrController: WebXRInputSource = js.native
  }
  
  @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking")
  @js.native
  class WebXRHandTracking protected () extends WebXRAbstractFeature {
    /**
      * Creates a new instance of the hit test feature
      * @param _xrSessionManager an instance of WebXRSessionManager
      * @param options options to use when constructing this feature
      */
    def this(
      _xrSessionManager: WebXRSessionManager,
      /**
      * options to use when constructing this feature
      */
    options: IWebXRHandTrackingOptions
    ) = this()
    
    /* private */ var _attachHand: js.Any = js.native
    
    /* private */ var _detachHand: js.Any = js.native
    
    /* private */ var _hands: js.Any = js.native
    
    /**
      * Get the hand object according to the controller id
      * @param controllerId the controller id to which we want to get the hand
      * @returns null if not found or the WebXRHand object if found
      */
    def getHandByControllerId(controllerId: String): Nullable[WebXRHand] = js.native
    
    /**
      * Get a hand object according to the requested handedness
      * @param handedness the handedness to request
      * @returns null if not found or the WebXRHand object if found
      */
    def getHandByHandedness(handedness: XRHandedness): Nullable[WebXRHand] = js.native
    
    /**
      * This observable will notify registered observers when a new hand object was added and initialized
      */
    var onHandAddedObservable: Observable[WebXRHand] = js.native
    
    /**
      * This observable will notify its observers right before the hand object is disposed
      */
    var onHandRemovedObservable: Observable[WebXRHand] = js.native
    
    /**
      * options to use when constructing this feature
      */
    val options: IWebXRHandTrackingOptions = js.native
  }
  /* static members */
  object WebXRHandTracking {
    
    @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking.Version")
    @js.native
    val Version: Double = js.native
    
    @JSImport("babylonjs/XR/features/WebXRHandTracking", "WebXRHandTracking._idCounter")
    @js.native
    def _idCounter: js.Any = js.native
    inline def _idCounter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_idCounter")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babylonjs.babylonjsStrings.wrist
    - typings.babylonjs.babylonjsStrings.thumb
    - typings.babylonjs.babylonjsStrings.index
    - typings.babylonjs.babylonjsStrings.middle
    - typings.babylonjs.babylonjsStrings.ring
    - typings.babylonjs.babylonjsStrings.little
  */
  trait HandPart extends StObject
  object HandPart {
    
    /**
      * HandPart - Index finger
      */
    inline def INDEX: index = "index".asInstanceOf[index]
    
    /**
      * HandPart - Little finger
      */
    inline def LITTLE: little = "little".asInstanceOf[little]
    
    /**
      * HandPart - Middle finger
      */
    inline def MIDDLE: middle = "middle".asInstanceOf[middle]
    
    /**
      * HandPart - Ring finger
      */
    inline def RING: ring = "ring".asInstanceOf[ring]
    
    /**
      * HandPart - The THumb
      */
    inline def THUMB: thumb = "thumb".asInstanceOf[thumb]
    
    /**
      * HandPart - Wrist
      */
    inline def WRIST: wrist = "wrist".asInstanceOf[wrist]
  }
  
  trait IWebXRHandTrackingOptions extends StObject {
    
    /**
      * Configuration object for the joint meshes
      */
    var jointMeshes: js.UndefOr[DisableDefaultHandMesh] = js.undefined
    
    /**
      * The xrInput that will be used as source for new hands
      */
    var xrInput: WebXRInput
  }
  object IWebXRHandTrackingOptions {
    
    inline def apply(xrInput: WebXRInput): IWebXRHandTrackingOptions = {
      val __obj = js.Dynamic.literal(xrInput = xrInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRHandTrackingOptions]
    }
    
    extension [Self <: IWebXRHandTrackingOptions](x: Self) {
      
      inline def setJointMeshes(value: DisableDefaultHandMesh): Self = StObject.set(x, "jointMeshes", value.asInstanceOf[js.Any])
      
      inline def setJointMeshesUndefined: Self = StObject.set(x, "jointMeshes", js.undefined)
      
      inline def setXrInput(value: WebXRInput): Self = StObject.set(x, "xrInput", value.asInstanceOf[js.Any])
    }
  }
}
