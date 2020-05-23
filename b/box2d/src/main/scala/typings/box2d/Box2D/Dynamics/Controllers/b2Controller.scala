package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Controller extends js.Object {
  /**
    * Body count.
    **/
  var m_bodyCount: Double
  /**
    * List of bodies.
    **/
  var m_bodyList: b2ControllerEdge
  /**
    * Adds a body to the controller.
    * @param body Body to add.
    **/
  def AddBody(body: b2Body): Unit
  /**
    * Removes all bodies from the controller.
    **/
  def Clear(): Unit
  /**
    * Debug drawing.
    * @param debugDraw Handle to drawer.
    **/
  def Draw(debugDraw: b2DebugDraw): Unit
  /**
    * Gets the body list.
    * @return Body list.
    **/
  def GetBodyList(): b2ControllerEdge
  /**
    * Gets the next controller.
    * @return Next controller.
    **/
  def GetNext(): b2Controller
  /**
    * Gets the world.
    * @return World.
    **/
  def GetWorld(): b2World
  /**
    * Removes a body from the controller.
    * @param body Body to remove from this controller.
    **/
  def RemoveBody(body: b2Body): Unit
  /**
    * Step
    * @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
    **/
  def Step(step: js.Any): Unit
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
}

