package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2TensorDampingController extends b2Controller {
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

object b2TensorDampingController {
  @scala.inline
  def apply(
    AddBody: b2Body => Unit,
    Clear: () => Unit,
    Draw: b2DebugDraw => Unit,
    GetBodyList: () => b2ControllerEdge,
    GetNext: () => b2Controller,
    GetWorld: () => b2World,
    RemoveBody: b2Body => Unit,
    SetAxisAligned: (Double, Double) => Unit,
    Step: js.Any => Unit,
    T: b2Mat22,
    m_bodyCount: Double,
    m_bodyList: b2ControllerEdge,
    maxTimeStep: Double
  ): b2TensorDampingController = {
    val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), SetAxisAligned = js.Any.fromFunction2(SetAxisAligned), Step = js.Any.fromFunction1(Step), T = T.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any], maxTimeStep = maxTimeStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TensorDampingController]
  }
  @scala.inline
  implicit class b2TensorDampingControllerOps[Self <: b2TensorDampingController] (val x: Self) extends AnyVal {
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
    def setSetAxisAligned(value: (Double, Double) => Unit): Self = this.set("SetAxisAligned", js.Any.fromFunction2(value))
    @scala.inline
    def setT(value: b2Mat22): Self = this.set("T", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxTimeStep(value: Double): Self = this.set("maxTimeStep", value.asInstanceOf[js.Any])
  }
  
}

