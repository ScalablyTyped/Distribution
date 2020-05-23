package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ControllerEdge extends js.Object {
  /**
    * Body.
    **/
  var body: b2Body
  /**
    * Provides quick access to the other end of this edge.
    **/
  var controller: b2Controller
  /**
    * The next controller edge in the controller's body list.
    **/
  var nextBody: b2ControllerEdge
  /**
    * The next controller edge in the body's controller list.
    **/
  var nextController: b2ControllerEdge
  /**
    * The previous controller edge in the controller's body list.
    **/
  var prevBody: b2ControllerEdge
  /**
    * The previous controller edge in the body's controller list.
    **/
  var prevController: b2ControllerEdge
}

object b2ControllerEdge {
  @scala.inline
  def apply(
    body: b2Body,
    controller: b2Controller,
    nextBody: b2ControllerEdge,
    nextController: b2ControllerEdge,
    prevBody: b2ControllerEdge,
    prevController: b2ControllerEdge
  ): b2ControllerEdge = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], nextBody = nextBody.asInstanceOf[js.Any], nextController = nextController.asInstanceOf[js.Any], prevBody = prevBody.asInstanceOf[js.Any], prevController = prevController.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ControllerEdge]
  }
}

