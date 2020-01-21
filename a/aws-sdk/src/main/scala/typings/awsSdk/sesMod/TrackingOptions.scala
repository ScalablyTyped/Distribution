package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackingOptions extends js.Object {
  /**
    * The custom subdomain that will be used to redirect email recipients to the Amazon SES event tracking domain.
    */
  var CustomRedirectDomain: js.UndefOr[typings.awsSdk.sesMod.CustomRedirectDomain] = js.native
}

object TrackingOptions {
  @scala.inline
  def apply(CustomRedirectDomain: CustomRedirectDomain = null): TrackingOptions = {
    val __obj = js.Dynamic.literal()
    if (CustomRedirectDomain != null) __obj.updateDynamic("CustomRedirectDomain")(CustomRedirectDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingOptions]
  }
}

