package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.created
  - typings.coinbase.coinbaseStrings.completed
  - typings.coinbase.coinbaseStrings.canceled
*/
trait DepositStatus extends js.Object

object DepositStatus {
  @scala.inline
  def canceled: typings.coinbase.coinbaseStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: typings.coinbase.coinbaseStrings.completed = this.cast("completed")
  @scala.inline
  def created: typings.coinbase.coinbaseStrings.created = this.cast("created")
}

