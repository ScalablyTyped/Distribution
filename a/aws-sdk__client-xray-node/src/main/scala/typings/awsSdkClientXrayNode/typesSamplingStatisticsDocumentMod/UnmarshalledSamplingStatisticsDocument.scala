package typings.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSamplingStatisticsDocument extends SamplingStatisticsDocument {
  /**
    * <p>The current time.</p>
    */
  @JSName("Timestamp")
  var Timestamp_UnmarshalledSamplingStatisticsDocument: Date = js.native
}

object UnmarshalledSamplingStatisticsDocument {
  @scala.inline
  def apply(ClientID: String, RequestCount: Double, RuleName: String, SampledCount: Double, Timestamp: Date): UnmarshalledSamplingStatisticsDocument = {
    val __obj = js.Dynamic.literal(ClientID = ClientID.asInstanceOf[js.Any], RequestCount = RequestCount.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any], SampledCount = SampledCount.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingStatisticsDocument]
  }
  @scala.inline
  implicit class UnmarshalledSamplingStatisticsDocumentOps[Self <: UnmarshalledSamplingStatisticsDocument] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
  }
  
}

