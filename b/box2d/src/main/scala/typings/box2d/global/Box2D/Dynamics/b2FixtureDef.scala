package typings.box2d.global.Box2D.Dynamics

import typings.box2d.Box2D.Collision.Shapes.b2Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Dynamics.b2FixtureDef")
@js.native
/**
  * The constructor sets the default fixture definition values.
  **/
class b2FixtureDef ()
  extends typings.box2d.Box2D.Dynamics.b2FixtureDef {
  /**
    * The density, usually in kg/m^2.
    **/
  /* CompleteClass */
  override var density: Double = js.native
  /**
    * Contact filtering data.
    **/
  /* CompleteClass */
  override var filter: typings.box2d.Box2D.Dynamics.b2FilterData = js.native
  /**
    * The friction coefficient, usually in the range [0,1].
    **/
  /* CompleteClass */
  override var friction: Double = js.native
  /**
    * A sensor shape collects contact information but never generates a collision response.
    **/
  /* CompleteClass */
  override var isSensor: Boolean = js.native
  /**
    * The restitution (elasticity) usually in the range [0,1].
    **/
  /* CompleteClass */
  override var restitution: Double = js.native
  /**
    * The shape, this must be set. The shape will be cloned, so you can create the shape on the stack.
    **/
  /* CompleteClass */
  override var shape: b2Shape = js.native
  /**
    * Use this to store application specific fixture data.
    **/
  /* CompleteClass */
  override var userData: js.Any = js.native
}

