package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsConfiguration extends js.Object {
  /**
    * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
    */
  var ManifestEndpointPrefix: js.UndefOr[string] = js.native
}

object HlsConfiguration {
  @scala.inline
  def apply(ManifestEndpointPrefix: string = null): HlsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ManifestEndpointPrefix != null) __obj.updateDynamic("ManifestEndpointPrefix")(ManifestEndpointPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsConfiguration]
  }
}

