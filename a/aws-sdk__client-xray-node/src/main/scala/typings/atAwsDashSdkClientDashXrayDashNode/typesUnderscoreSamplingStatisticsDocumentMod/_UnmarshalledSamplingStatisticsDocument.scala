package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingStatisticsDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSamplingStatisticsDocument extends _SamplingStatisticsDocument {
  /**
    * <p>The current time.</p>
    */
  @JSName("Timestamp")
  var Timestamp__UnmarshalledSamplingStatisticsDocument: Date
}

object _UnmarshalledSamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: String,
    RequestCount: Double,
    RuleName: String,
    SampledCount: Double,
    Timestamp: Date,
    BorrowCount: Int | Double = null
  ): _UnmarshalledSamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSamplingStatisticsDocument]
  }
}

