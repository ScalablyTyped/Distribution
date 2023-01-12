package typings.babylonjs.BABYLON

import typings.babylonjs.XRPlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRPlane] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPolygonDefinition(value: js.Array[Vector3]): Self = StObject.set(x, "polygonDefinition", value.asInstanceOf[js.Any])
    
    inline def setPolygonDefinitionVarargs(value: Vector3*): Self = StObject.set(x, "polygonDefinition", js.Array(value*))
    
    inline def setTransformationMatrix(value: Matrix): Self = StObject.set(x, "transformationMatrix", value.asInstanceOf[js.Any])
    
    inline def setXrPlane(value: XRPlane): Self = StObject.set(x, "xrPlane", value.asInstanceOf[js.Any])
  }
}
