package typings.babylonjs.webXRPlaneDetectorMod

import typings.babylonjs.XRPlane
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRPlane extends js.Object {
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
  @scala.inline
  def apply(id: Double, polygonDefinition: js.Array[Vector3], transformationMatrix: Matrix, xrPlane: XRPlane): IWebXRPlane = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], polygonDefinition = polygonDefinition.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrPlane = xrPlane.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRPlane]
  }
}

