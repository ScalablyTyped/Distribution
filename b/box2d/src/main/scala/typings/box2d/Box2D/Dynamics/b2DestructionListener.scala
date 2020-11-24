package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Dynamics.Joints.b2Joint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2DestructionListener extends js.Object {
  
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
object b2DestructionListener {
  
  @scala.inline
  def apply(SayGoodbyeFixture: b2Fixture => Unit, SayGoodbyeJoint: b2Joint => Unit): b2DestructionListener = {
    val __obj = js.Dynamic.literal(SayGoodbyeFixture = js.Any.fromFunction1(SayGoodbyeFixture), SayGoodbyeJoint = js.Any.fromFunction1(SayGoodbyeJoint))
    __obj.asInstanceOf[b2DestructionListener]
  }
  
  @scala.inline
  implicit class b2DestructionListenerOps[Self <: b2DestructionListener] (val x: Self) extends AnyVal {
    
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
    def setSayGoodbyeFixture(value: b2Fixture => Unit): Self = this.set("SayGoodbyeFixture", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSayGoodbyeJoint(value: b2Joint => Unit): Self = this.set("SayGoodbyeJoint", js.Any.fromFunction1(value))
  }
}
