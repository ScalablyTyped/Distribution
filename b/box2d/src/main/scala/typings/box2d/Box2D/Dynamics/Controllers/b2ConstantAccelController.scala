package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ConstantAccelController extends b2Controller {
  /**
    * The acceleration to apply.
    **/
  var A: b2Vec2 = js.native
}

object b2ConstantAccelController {
  @scala.inline
  def apply(
    A: b2Vec2,
    AddBody: b2Body => Unit,
    Clear: () => Unit,
    Draw: b2DebugDraw => Unit,
    GetBodyList: () => b2ControllerEdge,
    GetNext: () => b2Controller,
    GetWorld: () => b2World,
    RemoveBody: b2Body => Unit,
    Step: js.Any => Unit,
    m_bodyCount: Double,
    m_bodyList: b2ControllerEdge
  ): b2ConstantAccelController = {
    val __obj = js.Dynamic.literal(A = A.asInstanceOf[js.Any], AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ConstantAccelController]
  }
  @scala.inline
  implicit class b2ConstantAccelControllerOps[Self <: b2ConstantAccelController] (val x: Self) extends AnyVal {
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
    def setA(value: b2Vec2): Self = this.set("A", value.asInstanceOf[js.Any])
  }
  
}

