package typings.cfnDashResponse.cfnDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cfnDashResponse.cfnDashResponseStrings.SUCCESS
  - typings.cfnDashResponse.cfnDashResponseStrings.FAILED
*/
trait ResponseStatus extends js.Object

object ResponseStatus {
  @scala.inline
  def FAILED: typings.cfnDashResponse.cfnDashResponseStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def SUCCESS: typings.cfnDashResponse.cfnDashResponseStrings.SUCCESS = this.cast("SUCCESS")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

