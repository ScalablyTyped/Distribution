package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HlsConfiguration extends js.Object {
  
  /**
    * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
    */
  var ManifestEndpointPrefix: js.UndefOr[string] = js.native
}
object HlsConfiguration {
  
  @scala.inline
  def apply(): HlsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsConfiguration]
  }
  
  @scala.inline
  implicit class HlsConfigurationOps[Self <: HlsConfiguration] (val x: Self) extends AnyVal {
    
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
    def setManifestEndpointPrefix(value: string): Self = this.set("ManifestEndpointPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestEndpointPrefix: Self = this.set("ManifestEndpointPrefix", js.undefined)
  }
}
