package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentOperatorInfo extends js.Object {
  var categoryName: String
  var emailAddress: String
  var enabled: Boolean
  var id: Double
  var lastEmailDate: String
  var lastNetSendDate: String
  var lastPagerDate: String
  var name: String
  var netSendAddress: String
  var pagerAddress: String
  var pagerDays: WeekDays
  var saturdayPagerEndTime: String
  var saturdayPagerStartTime: String
  var sundayPagerEndTime: String
  var sundayPagerStartTime: String
  var weekdayPagerEndTime: String
  var weekdayPagerStartTime: String
}

object AgentOperatorInfo {
  @scala.inline
  def apply(
    categoryName: String,
    emailAddress: String,
    enabled: Boolean,
    id: Double,
    lastEmailDate: String,
    lastNetSendDate: String,
    lastPagerDate: String,
    name: String,
    netSendAddress: String,
    pagerAddress: String,
    pagerDays: WeekDays,
    saturdayPagerEndTime: String,
    saturdayPagerStartTime: String,
    sundayPagerEndTime: String,
    sundayPagerStartTime: String,
    weekdayPagerEndTime: String,
    weekdayPagerStartTime: String
  ): AgentOperatorInfo = {
    val __obj = js.Dynamic.literal(categoryName = categoryName.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastEmailDate = lastEmailDate.asInstanceOf[js.Any], lastNetSendDate = lastNetSendDate.asInstanceOf[js.Any], lastPagerDate = lastPagerDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], netSendAddress = netSendAddress.asInstanceOf[js.Any], pagerAddress = pagerAddress.asInstanceOf[js.Any], pagerDays = pagerDays.asInstanceOf[js.Any], saturdayPagerEndTime = saturdayPagerEndTime.asInstanceOf[js.Any], saturdayPagerStartTime = saturdayPagerStartTime.asInstanceOf[js.Any], sundayPagerEndTime = sundayPagerEndTime.asInstanceOf[js.Any], sundayPagerStartTime = sundayPagerStartTime.asInstanceOf[js.Any], weekdayPagerEndTime = weekdayPagerEndTime.asInstanceOf[js.Any], weekdayPagerStartTime = weekdayPagerStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorInfo]
  }
}

