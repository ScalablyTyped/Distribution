package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment status.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED
  - typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def CONFIRMED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def EXPIRED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.EXPIRED = this.cast("EXPIRED")
  @scala.inline
  def NEW: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.NEW = this.cast("NEW")
  @scala.inline
  def PENDING: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def RESOLVED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.RESOLVED = this.cast("RESOLVED")
  @scala.inline
  def UNRESOLVED: typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNRESOLVED = this.cast("UNRESOLVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

