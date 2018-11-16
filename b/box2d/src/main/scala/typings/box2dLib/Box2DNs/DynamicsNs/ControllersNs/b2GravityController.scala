package typings
package box2dLib.Box2DNs.DynamicsNs.ControllersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers.b2GravityController")
@js.native
class b2GravityController () extends b2Controller {
  /**
  		* Specifies the strength of the gravitation force.
  		* @default = 1
  		**/
  var G: scala.Double = js.native
  /**
  		* If true, gravity is proportional to r^-2, otherwise r^-1.
  		**/
  var invSqr: scala.Boolean = js.native
}

