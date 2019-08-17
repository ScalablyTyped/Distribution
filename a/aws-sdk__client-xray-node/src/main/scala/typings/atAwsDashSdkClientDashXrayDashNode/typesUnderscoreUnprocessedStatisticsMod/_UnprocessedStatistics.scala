package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnprocessedStatistics extends js.Object {
  /**
    * <p>The error code.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: js.UndefOr[String] = js.undefined
}

object _UnprocessedStatistics {
  @scala.inline
  def apply(ErrorCode: String = null, Message: String = null, RuleName: String = null): _UnprocessedStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName)
    __obj.asInstanceOf[_UnprocessedStatistics]
  }
}

