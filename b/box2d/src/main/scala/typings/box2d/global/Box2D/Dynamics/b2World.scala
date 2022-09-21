package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2World")
@js.native
open class b2World protected ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2World {
  /**
    * Creates a new world.
    * @param gravity The world gravity vector.
    * @param doSleep Improvie performance by not simulating inactive bodies.
    **/
  def this(gravity: b2Vec2, doSleep: Boolean) = this()
}
/* static members */
object b2World {
  
  @JSGlobal("Box2D.Dynamics.b2World")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Locked
    **/
  @JSGlobal("Box2D.Dynamics.b2World.e_locked")
  @js.native
  def e_locked: Double = js.native
  inline def e_locked_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_locked")(x.asInstanceOf[js.Any])
  
  /**
    * New Fixture
    **/
  @JSGlobal("Box2D.Dynamics.b2World.e_newFixture")
  @js.native
  def e_newFixture: Double = js.native
  inline def e_newFixture_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("e_newFixture")(x.asInstanceOf[js.Any])
}
