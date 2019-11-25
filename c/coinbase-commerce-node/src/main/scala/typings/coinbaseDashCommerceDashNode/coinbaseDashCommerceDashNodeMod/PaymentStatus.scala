package typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Payment status.
  */
/* Rewritten from type alias, can be one of: 
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.NEW
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.PENDING
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.CONFIRMED
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.UNRESOLVED
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.RESOLVED
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.EXPIRED
  - typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.CANCELED
*/
trait PaymentStatus extends js.Object

object PaymentStatus {
  @scala.inline
  def CANCELED: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.CANCELED = this.cast("CANCELED")
  @scala.inline
  def CONFIRMED: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.CONFIRMED = this.cast("CONFIRMED")
  @scala.inline
  def EXPIRED: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.EXPIRED = this.cast("EXPIRED")
  @scala.inline
  def NEW: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.NEW = this.cast("NEW")
  @scala.inline
  def PENDING: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.PENDING = this.cast("PENDING")
  @scala.inline
  def RESOLVED: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.RESOLVED = this.cast("RESOLVED")
  @scala.inline
  def UNRESOLVED: typings.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.UNRESOLVED = this.cast("UNRESOLVED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

