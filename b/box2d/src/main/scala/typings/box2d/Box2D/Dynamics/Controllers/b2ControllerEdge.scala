package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2ControllerEdge extends js.Object {
  
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
  
  @scala.inline
  implicit class b2ControllerEdgeOps[Self <: b2ControllerEdge] (val x: Self) extends AnyVal {
    
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
    def setBody(value: b2Body): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setController(value: b2Controller): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBody(value: b2ControllerEdge): Self = this.set("nextBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextController(value: b2ControllerEdge): Self = this.set("nextController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevBody(value: b2ControllerEdge): Self = this.set("prevBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevController(value: b2ControllerEdge): Self = this.set("prevController", value.asInstanceOf[js.Any])
  }
}
