package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  /**
    * The domain that you want to use for tracking open and click events.
    */
  var CustomRedirectDomain: typings.awsSdk.sesv2Mod.CustomRedirectDomain = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(CustomRedirectDomain: CustomRedirectDomain): TrackingOptions = {
    val __obj = js.Dynamic.literal(CustomRedirectDomain = CustomRedirectDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
  @scala.inline
  implicit class TrackingOptionsOps[Self <: TrackingOptions] (val x: Self) extends AnyVal {
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
    def setCustomRedirectDomain(value: CustomRedirectDomain): Self = this.set("CustomRedirectDomain", value.asInstanceOf[js.Any])
  }
  
}

