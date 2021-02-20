package typings.babylonjs

import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.webXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.webXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webXRPlaneDetectorMod {
  
  @JSImport("babylonjs/XR/features/WebXRPlaneDetector", "WebXRPlaneDetector")
  @js.native
  class WebXRPlaneDetector protected () extends WebXRAbstractFeature {
    /**
      * construct a new Plane Detector
      * @param _xrSessionManager an instance of xr Session manager
      * @param _options configuration to use when constructing this feature
      */
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRPlaneDetectorOptions) = this()
    
    var _detectedPlanes: js.Any = js.native
    
    var _enabled: js.Any = js.native
    
    var _init: js.Any = js.native
    
    var _lastFrameDetected: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _updatePlaneWithXRPlane: js.Any = js.native
    
    /**
      * avoiding using Array.find for global support.
      * @param xrPlane the plane to find in the array
      */
    var findIndexInPlaneArray: js.Any = js.native
    
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
  
  @js.native
  trait IWebXRPlane extends StObject {
    
    /**
      * a babylon-assigned ID for this polygon
      */
    var id: Double = js.native
    
    /**
      * an array of vector3 points in babylon space. right/left hand system is taken into account.
      */
    var polygonDefinition: js.Array[Vector3] = js.native
    
    /**
      * A transformation matrix to apply on the mesh that will be built using the polygonDefinition
      * Local vs. World are decided if worldParentNode was provided or not in the options when constructing the module
      */
    var transformationMatrix: Matrix = js.native
    
    /**
      * the native xr-plane object
      */
    var xrPlane: XRPlane = js.native
  }
  object IWebXRPlane {
    
    @scala.inline
    def apply(id: Double, polygonDefinition: js.Array[Vector3], transformationMatrix: Matrix, xrPlane: XRPlane): IWebXRPlane = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], polygonDefinition = polygonDefinition.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrPlane = xrPlane.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRPlane]
    }
    
    @scala.inline
    implicit class IWebXRPlaneMutableBuilder[Self <: IWebXRPlane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonDefinition(value: js.Array[Vector3]): Self = StObject.set(x, "polygonDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonDefinitionVarargs(value: Vector3*): Self = StObject.set(x, "polygonDefinition", js.Array(value :_*))
      
      @scala.inline
      def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXrPlane(value: XRPlane): Self = StObject.set(x, "xrPlane", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWebXRPlaneDetectorOptions extends StObject {
    
    /**
      * If set to true a reference of the created planes will be kept until the next session starts
      * If not defined, planes will be removed from the array when the feature is detached or the session ended.
      */
    var doNotRemovePlanesOnSessionEnded: js.UndefOr[Boolean] = js.native
    
    /**
      * The node to use to transform the local results to world coordinates
      */
    var worldParentNode: js.UndefOr[TransformNode] = js.native
  }
  object IWebXRPlaneDetectorOptions {
    
    @scala.inline
    def apply(): IWebXRPlaneDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
    }
    
    @scala.inline
    implicit class IWebXRPlaneDetectorOptionsMutableBuilder[Self <: IWebXRPlaneDetectorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoNotRemovePlanesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoNotRemovePlanesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemovePlanesOnSessionEnded", js.undefined)
      
      @scala.inline
      def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
    }
  }
}
