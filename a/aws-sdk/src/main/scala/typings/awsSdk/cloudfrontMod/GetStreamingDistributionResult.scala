package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamingDistributionResult extends js.Object {
  /**
    * The current version of the streaming distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.native
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsSdk.cloudfrontMod.StreamingDistribution] = js.native
}

object GetStreamingDistributionResult {
  @scala.inline
  def apply(): GetStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStreamingDistributionResult]
  }
  @scala.inline
  implicit class GetStreamingDistributionResultOps[Self <: GetStreamingDistributionResult] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setStreamingDistribution(value: StreamingDistribution): Self = this.set("StreamingDistribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingDistribution: Self = this.set("StreamingDistribution", js.undefined)
  }
  
}

