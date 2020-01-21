package typings.awsSdkClientGlacierNode.typesInsufficientCapacityExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsufficientCapacityExceptionDetails extends js.Object {
  /**
    * _string shape
    */
  var code: js.UndefOr[String] = js.undefined
  /**
    * _string shape
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * _string shape
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object InsufficientCapacityExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): InsufficientCapacityExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientCapacityExceptionDetails]
  }
}

