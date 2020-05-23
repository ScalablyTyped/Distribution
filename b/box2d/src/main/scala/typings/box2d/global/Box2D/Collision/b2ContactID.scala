package typings.box2d.global.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ContactID")
@js.native
/**
  * Creates a new Contact ID.
  **/
class b2ContactID ()
  extends typings.box2d.Box2D.Collision.b2ContactID {
  /**
    * ID Key
    **/
  /* CompleteClass */
  override var Key: Double = js.native
  /**
    * Features
    **/
  /* CompleteClass */
  override var features: typings.box2d.Box2D.Collision.Features = js.native
  /**
    * Copies the Contact ID.
    * @return Copied Contact ID.
    **/
  /* CompleteClass */
  override def Copy(): typings.box2d.Box2D.Collision.b2ContactID = js.native
  /**
    * Sets the Contact ID from a Contact ID.
    * @param id The Contact ID to copy values from.
    **/
  /* CompleteClass */
  override def Set(id: typings.box2d.Box2D.Collision.b2ContactID): Unit = js.native
}

