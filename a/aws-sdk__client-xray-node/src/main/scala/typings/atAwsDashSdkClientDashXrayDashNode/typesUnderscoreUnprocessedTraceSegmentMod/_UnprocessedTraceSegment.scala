package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreUnprocessedTraceSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnprocessedTraceSegment extends js.Object {
  /**
    * <p>The error that caused processing to fail.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * <p>The segment's ID.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * <p>The error message.</p>
    */
  var Message: js.UndefOr[String] = js.undefined
}

object _UnprocessedTraceSegment {
  @scala.inline
  def apply(ErrorCode: String = null, Id: String = null, Message: String = null): _UnprocessedTraceSegment = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[_UnprocessedTraceSegment]
  }
}

