package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreStartingPositionMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AFTER_SEQUENCE_NUMBER
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_SEQUENCE_NUMBER
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.AT_TIMESTAMP
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.LATEST
import typings.atAwsDashSdkClientDashKinesisDashBrowser.atAwsDashSdkClientDashKinesisDashBrowserStrings.TRIM_HORIZON
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _StartingPosition extends js.Object {
  /**
    * _SequenceNumber shape
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * _Timestamp shape
    */
  var Timestamp: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * _ShardIteratorType shape
    */
  var Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String
}

object _StartingPosition {
  @scala.inline
  def apply(
    Type: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
    SequenceNumber: String = null,
    Timestamp: Date | String | Double = null
  ): _StartingPosition = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[_StartingPosition]
  }
}

