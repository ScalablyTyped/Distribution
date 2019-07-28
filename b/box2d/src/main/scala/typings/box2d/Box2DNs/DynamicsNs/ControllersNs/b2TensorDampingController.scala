package typings.box2d.Box2DNs.DynamicsNs.ControllersNs

import typings.box2d.Box2DNs.CommonNs.MathNs.b2Mat22
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers.b2TensorDampingController")
@js.native
class b2TensorDampingController () extends b2Controller {
  /**
  		* Tensor to use in damping model.
  		**/
  var T: b2Mat22 = js.native
  /**
  		* Set this to a positive number to clamp the maximum amount of damping done.
  		* @default = 0
  		**/
  var maxTimeStep: Double = js.native
  /**
  		* Helper function to set T in a common case.
  		* @param xDamping x
  		* @param yDamping y
  		**/
  def SetAxisAligned(xDamping: Double, yDamping: Double): Unit = js.native
}

