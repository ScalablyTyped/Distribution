package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptFailedResult extends js.Object {
  /**
  		 * Type guard for differentiating user cancelled sign in errors from other errors
  		 */
  var canceled: Boolean
}

object PromptFailedResult {
  @scala.inline
  def apply(canceled: Boolean): PromptFailedResult = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromptFailedResult]
  }
}

