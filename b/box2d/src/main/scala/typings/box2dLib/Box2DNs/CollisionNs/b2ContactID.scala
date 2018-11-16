package typings
package box2dLib.Box2DNs.CollisionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Collision.b2ContactID")
@js.native
class b2ContactID () extends js.Object {
  /**
  		* ID Key
  		**/
  var Key: scala.Double = js.native
  /**
  		* Features
  		**/
  var features: Features = js.native
  /**
  		* Copies the Contact ID.
  		* @return Copied Contact ID.
  		**/
  def Copy(): b2ContactID = js.native
  /**
  		* Sets the Contact ID from a Contact ID.
  		* @param id The Contact ID to copy values from.
  		**/
  def Set(id: b2ContactID): scala.Unit = js.native
}

