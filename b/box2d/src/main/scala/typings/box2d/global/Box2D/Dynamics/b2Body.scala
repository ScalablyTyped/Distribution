package typings.box2d.global.Box2D.Dynamics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2Body")
@js.native
class b2Body ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2Body
/* static members */
object b2Body {
  
  @JSGlobal("Box2D.Dynamics.b2Body")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Dynamic Body
    **/
  @JSGlobal("Box2D.Dynamics.b2Body.b2_dynamicBody")
  @js.native
  def b2_dynamicBody: Double = js.native
  inline def b2_dynamicBody_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_dynamicBody")(x.asInstanceOf[js.Any])
  
  /**
    * Kinematic Body
    **/
  @JSGlobal("Box2D.Dynamics.b2Body.b2_kinematicBody")
  @js.native
  def b2_kinematicBody: Double = js.native
  inline def b2_kinematicBody_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_kinematicBody")(x.asInstanceOf[js.Any])
  
  /**
    * Static Body
    **/
  @JSGlobal("Box2D.Dynamics.b2Body.b2_staticBody")
  @js.native
  def b2_staticBody: Double = js.native
  inline def b2_staticBody_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("b2_staticBody")(x.asInstanceOf[js.Any])
}
