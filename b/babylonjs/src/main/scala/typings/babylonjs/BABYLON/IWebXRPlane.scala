package typings.babylonjs.BABYLON

import typings.babylonjs.XRPlane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
