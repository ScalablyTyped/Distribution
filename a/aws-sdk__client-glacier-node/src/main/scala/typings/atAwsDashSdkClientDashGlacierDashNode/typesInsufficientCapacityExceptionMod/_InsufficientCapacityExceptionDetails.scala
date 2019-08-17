package typings.atAwsDashSdkClientDashGlacierDashNode.typesInsufficientCapacityExceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InsufficientCapacityExceptionDetails extends js.Object {
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

object _InsufficientCapacityExceptionDetails {
  @scala.inline
  def apply(code: String = null, message: String = null, `type`: String = null): _InsufficientCapacityExceptionDetails = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (message != null) __obj.updateDynamic("message")(message)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[_InsufficientCapacityExceptionDetails]
  }
}

