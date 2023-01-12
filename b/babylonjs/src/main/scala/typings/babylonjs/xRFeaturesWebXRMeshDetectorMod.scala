package typings.babylonjs

import typings.babylonjs.mathsMathMod.Matrix
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.xRFeaturesWebXRAbstractFeatureMod.WebXRAbstractFeature
import typings.babylonjs.xRWebXRSessionManagerMod.WebXRSessionManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xRFeaturesWebXRMeshDetectorMod {
  
  @JSImport("babylonjs/XR/features/WebXRMeshDetector", "WebXRMeshDetector")
  @js.native
  open class WebXRMeshDetector protected () extends WebXRAbstractFeature {
    def this(_xrSessionManager: WebXRSessionManager) = this()
    def this(_xrSessionManager: WebXRSessionManager, _options: IWebXRMeshDetectorOptions) = this()
    
    /* private */ var _detectedMeshes: Any = js.native
    
    /* private */ var _init: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _updateVertexDataWithXRMesh: Any = js.native
    
    /**
      * Observers registered here will be executed when a new mesh was added to the session
      */
    var onMeshAddedObservable: Observable[IWebXRVertexData] = js.native
    
    /**
      * Observers registered here will be executed when a mesh is no longer detected in the session
      */
    var onMeshRemovedObservable: Observable[IWebXRVertexData] = js.native
    
    /**
      * Observers registered here will be executed when an existing mesh updates
      */
    var onMeshUpdatedObservable: Observable[IWebXRVertexData] = js.native
  }
  /* static members */
  object WebXRMeshDetector {
    
    /**
      * The module's name
      */
    @JSImport("babylonjs/XR/features/WebXRMeshDetector", "WebXRMeshDetector.Name")
    @js.native
    val Name: String = js.native
    
    /**
      * The (Babylon) version of this module.
      * This is an integer representing the implementation version.
      * This number does not correspond to the WebXR specs version
      */
    @JSImport("babylonjs/XR/features/WebXRMeshDetector", "WebXRMeshDetector.Version")
    @js.native
    val Version: Double = js.native
  }
  
  trait IWebXRMeshDetectorOptions extends StObject {
    
    /**
      * If set to true, WebXRMeshDetector will convert coordinate systems for meshes.
      * If not defined, mesh conversions from right handed to left handed coordinate systems won't be conducted.
      * Right handed mesh data will be available through IWebXRVertexData.xrMesh.
      */
    var convertCoordinateSystems: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true a reference of the created meshes will be kept until the next session starts
      * If not defined, meshes will be removed from the array when the feature is detached or the session ended.
      */
    var doNotRemoveMeshesOnSessionEnded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preferred detector configuration, not all preferred options will be supported by all platforms.
      */
    var preferredDetectorOptions: js.UndefOr[XRGeometryDetectorOptions] = js.undefined
    
    /**
      * The node to use to transform the local results to world coordinates
      */
    var worldParentNode: js.UndefOr[TransformNode] = js.undefined
  }
  object IWebXRMeshDetectorOptions {
    
    inline def apply(): IWebXRMeshDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWebXRMeshDetectorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRMeshDetectorOptions] (val x: Self) extends AnyVal {
      
      inline def setConvertCoordinateSystems(value: Boolean): Self = StObject.set(x, "convertCoordinateSystems", value.asInstanceOf[js.Any])
      
      inline def setConvertCoordinateSystemsUndefined: Self = StObject.set(x, "convertCoordinateSystems", js.undefined)
      
      inline def setDoNotRemoveMeshesOnSessionEnded(value: Boolean): Self = StObject.set(x, "doNotRemoveMeshesOnSessionEnded", value.asInstanceOf[js.Any])
      
      inline def setDoNotRemoveMeshesOnSessionEndedUndefined: Self = StObject.set(x, "doNotRemoveMeshesOnSessionEnded", js.undefined)
      
      inline def setPreferredDetectorOptions(value: XRGeometryDetectorOptions): Self = StObject.set(x, "preferredDetectorOptions", value.asInstanceOf[js.Any])
      
      inline def setPreferredDetectorOptionsUndefined: Self = StObject.set(x, "preferredDetectorOptions", js.undefined)
      
      inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
      
      inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
    }
  }
  
  trait IWebXRVertexData extends StObject {
    
    /**
      * A babylon-assigned ID for this mesh
      */
    var id: Double
    
    /**
      * An array of indices in babylon space. Indices have a counterclockwise winding order.
      * Indices will only be populated if convertCoordinateSystems is set to true in the IWebXRMeshDetectorOptions.
      */
    var indices: js.UndefOr[js.typedarray.Uint32Array] = js.undefined
    
    /**
      * An array of vertex normals in babylon space. right/left hand system is taken into account.
      * Normals will not be calculated if convertCoordinateSystems is undefined in the IWebXRMeshDetectorOptions.
      * Different platforms may or may not support mesh normals when convertCoordinateSystems is set to true.
      */
    var normals: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    /**
      * An array of vertex positions in babylon space. right/left hand system is taken into account.
      * Positions will only be calculated if convertCoordinateSystems is set to true in the IWebXRMeshDetectorOptions.
      */
    var positions: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    /**
      * A transformation matrix to apply on the mesh that will be built using the meshDefinition.
      * Local vs. World are decided if worldParentNode was provided or not in the options when constructing the module.
      * TransformationMatrix will only be calculated if convertCoordinateSystems is set to true in the IWebXRMeshDetectorOptions.
      */
    var transformationMatrix: js.UndefOr[Matrix] = js.undefined
    
    /**
      * The node to use to transform the local results to world coordinates.
      * WorldParentNode will only exist if it was declared in the IWebXRMeshDetectorOptions.
      */
    var worldParentNode: js.UndefOr[TransformNode] = js.undefined
    
    /**
      * Data required for constructing a mesh in Babylon.js.
      */
    var xrMesh: XRMesh
  }
  object IWebXRVertexData {
    
    inline def apply(id: Double, xrMesh: XRMesh): IWebXRVertexData = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], xrMesh = xrMesh.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebXRVertexData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebXRVertexData] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndices(value: js.typedarray.Uint32Array): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
      
      inline def setNormals(value: js.typedarray.Float32Array): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
      
      inline def setNormalsUndefined: Self = StObject.set(x, "normals", js.undefined)
      
      inline def setPositions(value: js.typedarray.Float32Array): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
      
      inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
      
      inline def setTransformationMatrixUndefined: Self = StObject.set(x, "transformationMatrix", js.undefined)
      
      inline def setWorldParentNode(value: TransformNode): Self = StObject.set(x, "worldParentNode", value.asInstanceOf[js.Any])
      
      inline def setWorldParentNodeUndefined: Self = StObject.set(x, "worldParentNode", js.undefined)
      
      inline def setXrMesh(value: XRMesh): Self = StObject.set(x, "xrMesh", value.asInstanceOf[js.Any])
    }
  }
}
