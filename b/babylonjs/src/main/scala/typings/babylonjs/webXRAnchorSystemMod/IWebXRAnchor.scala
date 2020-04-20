package typings.babylonjs.webXRAnchorSystemMod

import typings.babylonjs.XRAnchor
import typings.babylonjs.mathVectorMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebXRAnchor extends js.Object {
  /**
    * A babylon-assigned ID for this anchor
    */
  var id: Double
  /**
    * Transformation matrix to apply to an object attached to this anchor
    */
  var transformationMatrix: Matrix
  /**
    * The native anchor object
    */
  var xrAnchor: XRAnchor
}

object IWebXRAnchor {
  @scala.inline
  def apply(id: Double, transformationMatrix: Matrix, xrAnchor: XRAnchor): IWebXRAnchor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrAnchor = xrAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRAnchor]
  }
}

