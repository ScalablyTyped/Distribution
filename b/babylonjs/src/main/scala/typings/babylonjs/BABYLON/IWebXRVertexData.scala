package typings.babylonjs.BABYLON

import typings.babylonjs.XRMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
