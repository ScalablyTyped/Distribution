package typings.babylonjs.webXRPlaneDetectorMod

import typings.babylonjs.XRPlane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRPlane extends js.Object {
  
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
  implicit class IWebXRPlaneOps[Self <: IWebXRPlane] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonDefinitionVarargs(value: Vector3*): Self = this.set("polygonDefinition", js.Array(value :_*))
    
    @scala.inline
    def setPolygonDefinition(value: js.Array[Vector3]): Self = this.set("polygonDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationMatrix(value: Matrix): Self = this.set("transformationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrPlane(value: XRPlane): Self = this.set("xrPlane", value.asInstanceOf[js.Any])
  }
}
