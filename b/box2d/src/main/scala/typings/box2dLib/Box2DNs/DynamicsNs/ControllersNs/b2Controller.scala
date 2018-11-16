package typings
package box2dLib.Box2DNs.DynamicsNs.ControllersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.Controllers.b2Controller")
@js.native
class b2Controller () extends js.Object {
  /**
  		* Body count.
  		**/
  var m_bodyCount: scala.Double = js.native
  /**
  		* List of bodies.
  		**/
  var m_bodyList: b2ControllerEdge = js.native
  /**
  		* Adds a body to the controller.
  		* @param body Body to add.
  		**/
  def AddBody(body: box2dLib.Box2DNs.DynamicsNs.b2Body): scala.Unit = js.native
  /**
  		* Removes all bodies from the controller.
  		**/
  def Clear(): scala.Unit = js.native
  /**
  		* Debug drawing.
  		* @param debugDraw Handle to drawer.
  		**/
  def Draw(debugDraw: box2dLib.Box2DNs.DynamicsNs.b2DebugDraw): scala.Unit = js.native
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
  def GetWorld(): box2dLib.Box2DNs.DynamicsNs.b2World = js.native
  /**
  		* Removes a body from the controller.
  		* @param body Body to remove from this controller.
  		**/
  def RemoveBody(body: box2dLib.Box2DNs.DynamicsNs.b2Body): scala.Unit = js.native
  /**
  		* Step
  		* @param step b2TimeStep -> Private internal class.  Not sure why this is exposed.
  		**/
  def Step(step: js.Any): scala.Unit = js.native
}

