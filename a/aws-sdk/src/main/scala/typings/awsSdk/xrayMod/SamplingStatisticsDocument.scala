package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStatisticsDocument extends js.Object {
  /**
    * The number of requests recorded with borrowed reservoir quota.
    */
  var BorrowCount: js.UndefOr[typings.awsSdk.xrayMod.BorrowCount] = js.native
  /**
    * A unique identifier for the service in hexadecimal.
    */
  var ClientID: typings.awsSdk.xrayMod.ClientID = js.native
  /**
    * The number of requests that matched the rule.
    */
  var RequestCount: typings.awsSdk.xrayMod.RequestCount = js.native
  /**
    * The name of the sampling rule.
    */
  var RuleName: typings.awsSdk.xrayMod.RuleName = js.native
  /**
    * The number of requests recorded.
    */
  var SampledCount: typings.awsSdk.xrayMod.SampledCount = js.native
  /**
    * The current time.
    */
  var Timestamp: typings.awsSdk.xrayMod.Timestamp = js.native
}

object SamplingStatisticsDocument {
  @scala.inline
  def apply(
    ClientID: ClientID,
    RequestCount: RequestCount,
    RuleName: RuleName,
    SampledCount: SampledCount,
    Timestamp: Timestamp,
    BorrowCount: js.UndefOr[BorrowCount] = js.undefined
  ): SamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(BorrowCount)) __obj.updateDynamic("BorrowCount")(BorrowCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStatisticsDocument]
  }
}

