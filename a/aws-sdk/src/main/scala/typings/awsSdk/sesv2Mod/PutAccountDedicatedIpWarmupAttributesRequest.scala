package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountDedicatedIpWarmupAttributesRequest extends js.Object {
  /**
    * Enables or disables the automatic warm-up feature for dedicated IP addresses that are associated with your Amazon SES account in the current AWS Region. Set to true to enable the automatic warm-up feature, or set to false to disable it.
    */
  var AutoWarmupEnabled: js.UndefOr[Enabled] = js.native
}

object PutAccountDedicatedIpWarmupAttributesRequest {
  @scala.inline
  def apply(): PutAccountDedicatedIpWarmupAttributesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAccountDedicatedIpWarmupAttributesRequest]
  }
  @scala.inline
  implicit class PutAccountDedicatedIpWarmupAttributesRequestOps[Self <: PutAccountDedicatedIpWarmupAttributesRequest] (val x: Self) extends AnyVal {
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
    def setAutoWarmupEnabled(value: Enabled): Self = this.set("AutoWarmupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoWarmupEnabled: Self = this.set("AutoWarmupEnabled", js.undefined)
  }
  
}

