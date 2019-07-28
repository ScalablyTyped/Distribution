package typings.box2d.Box2DNs.DynamicsNs

import typings.box2d.Box2DNs.DynamicsNs.JointsNs.b2Joint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2DestructionListener")
@js.native
class b2DestructionListener () extends js.Object {
  /**
  		* Called when any fixture is about to be destroyed due to the destruction of its parent body.
  		* @param fixture b2Fixture being destroyed.
  		**/
  def SayGoodbyeFixture(fixture: b2Fixture): Unit = js.native
  /**
  		* Called when any joint is about to be destroyed due to the destruction of one of its attached bodies.
  		* @param joint b2Joint being destroyed.
  		**/
  def SayGoodbyeJoint(joint: b2Joint): Unit = js.native
}

