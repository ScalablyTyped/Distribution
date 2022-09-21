package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Box2D.Dynamics.b2FixtureDef")
@js.native
/**
  * The constructor sets the default fixture definition values.
  **/
open class b2FixtureDef ()
  extends StObject
     with typings.box2d.Box2D.Dynamics.b2FixtureDef {
  
  /**
    * The density, usually in kg/m^2.
    **/
  /* CompleteClass */
  var density: Double = js.native
  
  /**
    * Contact filtering data.
    **/
  /* CompleteClass */
  var filter: typings.box2d.Box2D.Dynamics.b2FilterData = js.native
  
  /**
    * The friction coefficient, usually in the range [0,1].
    **/
  /* CompleteClass */
  var friction: Double = js.native
  
  /**
    * A sensor shape collects contact information but never generates a collision response.
    **/
  /* CompleteClass */
  var isSensor: Boolean = js.native
  
  /**
    * The restitution (elasticity) usually in the range [0,1].
    **/
  /* CompleteClass */
  var restitution: Double = js.native
  
  /**
    * The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
    **/
  /* CompleteClass */
  var shape: b2Shape = js.native
  
  /**
    * Use this to store application specific fixture data.
    **/
  /* CompleteClass */
  var userData: Any = js.native
}
