package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2Controller extends js.Object {
  
  /**
    * Adds a body to the controller.
    * @param body Body to add.
    **/
  def AddBody(body: b2Body): Unit = js.native
  
  /**
    * Removes all bodies from the controller.
    **/
  def Clear(): Unit = js.native
  
  /**
    * Debug drawing.
    * @param debugDraw Handle to drawer.
    **/
  def Draw(debugDraw: b2DebugDraw): Unit = js.native
  
  /**
    * Gets the body list.
    * @return Body list.
    **/
  def GetBodyList(): b2ControllerEdge = js.native
  
  /**
    * Gets the next controller.
    * @return Next controller.
    **/
  def GetNext(): b2Controller = js.native
  
  /**
    * Gets the world.
    * @return World.
    **/
  def GetWorld(): b2World = js.native
  
  /**
    * Removes a body from the controller.
    * @param body Body to remove from this controller.
    **/
  def RemoveBody(body: b2Body): Unit = js.native
  
  /**
    * Step
    * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
    **/
  def Step(step: js.Any): Unit = js.native
  
  /**
    * Body count.
    **/
  var m_bodyCount: Double = js.native
  
  /**
    * List of bodies.
    **/
  var m_bodyList: b2ControllerEdge = js.native
}
object b2Controller {
  
  @scala.inline
  def apply(
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
  ): b2Controller = {
    val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), Step = js.Any.fromFunction1(Step), m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Controller]
  }
  
  @scala.inline
  implicit class b2ControllerOps[Self <: b2Controller] (val x: Self) extends AnyVal {
    
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
    def setAddBody(value: b2Body => Unit): Self = this.set("AddBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDraw(value: b2DebugDraw => Unit): Self = this.set("Draw", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBodyList(value: () => b2ControllerEdge): Self = this.set("GetBodyList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNext(value: () => b2Controller): Self = this.set("GetNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorld(value: () => b2World): Self = this.set("GetWorld", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveBody(value: b2Body => Unit): Self = this.set("RemoveBody", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStep(value: js.Any => Unit): Self = this.set("Step", js.Any.fromFunction1(value))
    
    @scala.inline
    def setM_bodyCount(value: Double): Self = this.set("m_bodyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_bodyList(value: b2ControllerEdge): Self = this.set("m_bodyList", value.asInstanceOf[js.Any])
  }
}
