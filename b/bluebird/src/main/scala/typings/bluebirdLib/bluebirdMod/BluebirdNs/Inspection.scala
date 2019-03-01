package typings
package bluebirdLib.bluebirdMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspection[R] extends js.Object {
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  def isCancelled(): scala.Boolean
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  def isFulfilled(): scala.Boolean
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  def isPending(): scala.Boolean
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  def isRejected(): scala.Boolean
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def reason(): js.Any
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  def value(): R
}

object Inspection {
  @scala.inline
  def apply[R](
    isCancelled: js.Function0[scala.Boolean],
    isFulfilled: js.Function0[scala.Boolean],
    isPending: js.Function0[scala.Boolean],
    isRejected: js.Function0[scala.Boolean],
    reason: js.Function0[js.Any],
    value: js.Function0[R]
  ): Inspection[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCancelled")(isCancelled)
    __obj.updateDynamic("isFulfilled")(isFulfilled)
    __obj.updateDynamic("isPending")(isPending)
    __obj.updateDynamic("isRejected")(isRejected)
    __obj.updateDynamic("reason")(reason)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Inspection[R]]
  }
}

