package typings.box2d.Box2D.Dynamics

import typings.box2d.Box2D.Dynamics.Joints.b2Joint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DestructionListener extends StObject {
  
  /**
    * Called when any fixture is about to be destroyed due to the destruction of its parent body.
    * @param fixture b2Fixture being destroyed.
    **/
  def SayGoodbyeFixture(fixture: b2Fixture): Unit
  
  /**
    * Called when any joint is about to be destroyed due to the destruction of one of its attached bodies.
    * @param joint b2Joint being destroyed.
    **/
  def SayGoodbyeJoint(joint: b2Joint): Unit
}
object b2DestructionListener {
  
  inline def apply(SayGoodbyeFixture: b2Fixture => Unit, SayGoodbyeJoint: b2Joint => Unit): b2DestructionListener = {
    val __obj = js.Dynamic.literal(SayGoodbyeFixture = js.Any.fromFunction1(SayGoodbyeFixture), SayGoodbyeJoint = js.Any.fromFunction1(SayGoodbyeJoint))
    __obj.asInstanceOf[b2DestructionListener]
  }
  
  extension [Self <: b2DestructionListener](x: Self) {
    
    inline def setSayGoodbyeFixture(value: b2Fixture => Unit): Self = StObject.set(x, "SayGoodbyeFixture", js.Any.fromFunction1(value))
    
    inline def setSayGoodbyeJoint(value: b2Joint => Unit): Self = StObject.set(x, "SayGoodbyeJoint", js.Any.fromFunction1(value))
  }
}
