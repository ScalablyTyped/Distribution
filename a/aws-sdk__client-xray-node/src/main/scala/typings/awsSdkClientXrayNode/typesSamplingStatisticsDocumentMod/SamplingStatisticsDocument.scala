package typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStatisticsDocument extends js.Object {
  /**
    * <p>The number of requests recorded with borrowed reservoir quota.</p>
    */
  var BorrowCount: js.UndefOr[Double] = js.undefined
  /**
    * <p>A unique identifier for the service in hexadecimal.</p>
    */
  var ClientID: String
  /**
    * <p>The number of requests that matched the rule.</p>
    */
  var RequestCount: Double
  /**
    * <p>The name of the sampling rule.</p>
    */
  var RuleName: String
  /**
    * <p>The number of requests recorded.</p>
    */
  var SampledCount: Double
  /**
    * <p>The current time.</p>
    */
  var Timestamp: Date | String | Double
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: String,
    RequestCount: Double,
    RuleName: String,
    SampledCount: Double,
    Timestamp: Date | String | Double,
    BorrowCount: Int | Double = null
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (BorrowCount != null) __obj.updateDynamic("BorrowCount")(BorrowCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
}

