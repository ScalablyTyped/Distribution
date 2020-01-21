package typings.cfnResponse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cfnResponse.cfnResponseStrings.SUCCESS
  - typings.cfnResponse.cfnResponseStrings.FAILED
*/
trait ResponseStatus extends js.Object

object ResponseStatus {
  @scala.inline
  def FAILED: typings.cfnResponse.cfnResponseStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCESS: typings.cfnResponse.cfnResponseStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

