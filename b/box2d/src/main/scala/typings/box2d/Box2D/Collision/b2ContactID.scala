package typings.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2ContactID extends js.Object {
  /**
    * ID Key
    **/
  var Key: Double
  /**
    * Features
    **/
  var features: Features
  /**
    * Copies the Contact ID.
    * @return Copied Contact ID.
    **/
  def Copy(): b2ContactID
  /**
    * Sets the Contact ID from a Contact ID.
    * @param id The Contact ID to copy values from.
    **/
  def Set(id: b2ContactID): Unit
}

object b2ContactID {
  @scala.inline
  def apply(Copy: () => b2ContactID, Key: Double, Set: b2ContactID => Unit, features: Features): b2ContactID = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), Key = Key.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ContactID]
  }
}

