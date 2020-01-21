package typings.awsSdkClientXrayNode.typesUnprocessedStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnprocessedStatistics extends js.Object {
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

object UnprocessedStatistics {
  @scala.inline
  def apply(ErrorCode: String = null, Message: String = null, RuleName: String = null): UnprocessedStatistics = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (RuleName != null) __obj.updateDynamic("RuleName")(RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedStatistics]
  }
}

