package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRPlaneDetectorMod {
  
  @JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector")
  @js.native
  open class WebXRPlaneDetector protected () extends WebXRAbstractFeature {
    /**
      * construct a new Plane Detector
      * @param _xrSessionManager an instance of xr Session manager
      * @param _options configuration to use when constructing this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions) = this()
    
    /* private */ var _detectedPlanes: Any = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /**
      * avoiding using Array.find for global support.
      * @param xrPlane the plane to find in the array
      */
    /* private */ var _findIndexInPlaneArray: Any = js.native
    
    /* private */ var _init: Any = js.native
    
    /* private */ var _lastFrameDetected: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _updatePlaneWithXRPlane: Any = js.native
    
    /**
      * Observers registered here will be executed when a new plane was added to the session
      */
    var onPlaneAddedObservable: Observable[IWebXRPlane] = js.native
    
    /**
      * Observers registered here will be executed when a plane is no longer detected in the session
      */
    var onPlaneRemovedObservable: Observable[IWebXRPlane] = js.native
    
    /**
      * Observers registered here will be executed when an existing plane updates (for example - expanded)
      * This can execute N times every frame
      */
    var onPlaneUpdatedObservable: Observable[IWebXRPlane] = js.native
  }
  /* static members */
  object WebXRPlaneDetector {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRPlane extends StObject {
    
    /**
      * a babylon-assigned ID for this polygon
      */
    var id: Double
    
    /**
      * an array of vector3 points in babylon space. right/left hand system is taken into account.
      */
    var polygonDefinition: js.Array[Vector3]
    
    /**
      * A transformation matrix to apply on the mesh that will be built using the polygonDefinition
      * Local vs. World are decided if worldParentNode was provided or not in the options when constructing the module
      */
    var transformationMatrix: Matrix
    
    /**
      * the native xr-plane object
      */
    var xrPlane: XRPlane
  }
  object IWebXRPlane {
    
    inline def apply(id: Double, polygonDefinition: js.Array[Vector3], transformationMatrix: Matrix, xrPlane: XRPlane): IWebXRPlane = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], polygonDefinition = polygonDefinition.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrPlane = xrPlane.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRPlane]
    }
    
    extension [Self <: IWebXRPlane](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPolygonDefinition(value: js.Array[Vector3]): Self = StObject.set(x, "polygonDefinition", value.asInstanceOf[js.Any])
      
      inline def setPolygonDefinitionVarargs(value: Vector3*): Self = StObject.set(x, "polygonDefinition", js.Array(value*))
      
      inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
      
      inline def setXrPlane(value: XRPlane): Self = StObject.set(x, "xrPlane", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWebXRPlaneDetectorOptions extends StObject {
    
    /**
      * If set to true a reference of the created planes will be kept until the next session starts
      * If not defined, planes will be removed from the array when the feature is detached or the session ended.
      */
    var doNotRemovePlanesOnSessionEnded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preferred detector configuration, not all preferred options will be supported by all platforms.
      */
    var preferredDetectorOptions: js.UndefOr[XRGeometryDetectorOptions] = js.undefined
    
    /**
      * The node to use to transform the local results to world coordinates
      */
    var worldParentNode: js.UndefOr[TransformNode] = js.undefined
  }
  object IWebXRPlaneDetectorOptions {
    
    inline def apply(): IWebXRPlaneDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
    }
    
    extension [Self <: IWebXRPlaneDetectorOptions](x: Self) {
      
      inline def setDoNotRemovePlanesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", value.asInstanceOf[js.Any])
      
      inline def setDoNotRemovePlanesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", js.undefined)
      
      inline def setPreferredDetectorOptions(value: XRGeometryDetectorOptions): Self = StObject.set(x, "preferredDetectorOptions", value.asInstanceOf[js.Any])
      
      inline def setPreferredDetectorOptionsUndefined: Self = StObject.set(x, "preferredDetectorOptions", js.undefined)
      
      inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
      
      inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
    }
  }
}
