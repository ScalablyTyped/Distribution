package typings.box2d.Box2DNs.DynamicsNs.ControllersNs

import typings.box2d.Box2DNs.DynamicsNs.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers.b2ControllerEdge")
@js.native
class b2ControllerEdge () extends js.Object {
  /**
  		* Body.
  		**/
  var body: b2Body = js.native
  /**
  		* Provides quick access to the other end of this edge.
  		**/
  var controller: b2Controller = js.native
  /**
  		* The next controller edge in the controller's body list.
  		**/
  var nextBody: b2ControllerEdge = js.native
  /**
  		* The next controller edge in the body's controller list.
  		**/
  var nextController: b2ControllerEdge = js.native
  /**
  		* The previous controller edge in the controller's body list.
  		**/
  var prevBody: b2ControllerEdge = js.native
  /**
  		* The previous controller edge in the body's controller list.
  		**/
  var prevController: b2ControllerEdge = js.native
}

