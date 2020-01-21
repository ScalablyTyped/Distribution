package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSentimentDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a sentiment detection job.
    */
  var SentimentDetectionJobProperties: js.UndefOr[typings.awsSdk.comprehendMod.SentimentDetectionJobProperties] = js.native
}

object DescribeSentimentDetectionJobResponse {
  @scala.inline
  def apply(SentimentDetectionJobProperties: SentimentDetectionJobProperties = null): DescribeSentimentDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (SentimentDetectionJobProperties != null) __obj.updateDynamic("SentimentDetectionJobProperties")(SentimentDetectionJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSentimentDetectionJobResponse]
  }
}

