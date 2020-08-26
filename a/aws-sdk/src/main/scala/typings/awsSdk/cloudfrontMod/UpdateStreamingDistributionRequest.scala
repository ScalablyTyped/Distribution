package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's id.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsSdk.cloudfrontMod.StreamingDistributionConfig = js.native
}

object UpdateStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String, StreamingDistributionConfig: StreamingDistributionConfig): UpdateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStreamingDistributionRequest]
  }
  @scala.inline
  implicit class UpdateStreamingDistributionRequestOps[Self <: UpdateStreamingDistributionRequest] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamingDistributionConfig(value: StreamingDistributionConfig): Self = this.set("StreamingDistributionConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setIfMatch(value: String): Self = this.set("IfMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfMatch: Self = this.set("IfMatch", js.undefined)
  }
  
}

