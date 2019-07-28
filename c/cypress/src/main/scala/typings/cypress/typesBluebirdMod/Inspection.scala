package typings.cypress.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inspection[R] extends js.Object {
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  def isCancelled(): Boolean
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  def isFulfilled(): Boolean
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  def isPending(): Boolean
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  def isRejected(): Boolean
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
    isCancelled: () => Boolean,
    isFulfilled: () => Boolean,
    isPending: () => Boolean,
    isRejected: () => Boolean,
    reason: () => js.Any,
    value: () => R
  ): Inspection[R] = {
    val __obj = js.Dynamic.literal(isCancelled = js.Any.fromFunction0(isCancelled), isFulfilled = js.Any.fromFunction0(isFulfilled), isPending = js.Any.fromFunction0(isPending), isRejected = js.Any.fromFunction0(isRejected), reason = js.Any.fromFunction0(reason), value = js.Any.fromFunction0(value))
  
    __obj.asInstanceOf[Inspection[R]]
  }
}

