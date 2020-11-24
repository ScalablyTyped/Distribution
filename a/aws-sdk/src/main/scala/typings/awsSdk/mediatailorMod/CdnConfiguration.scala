package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CdnConfiguration extends js.Object {
  
  /**
    * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for ad segments.
    */
  var AdSegmentUrlPrefix: js.UndefOr[string] = js.native
  
  /**
    * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for content segments.
    */
  var ContentSegmentUrlPrefix: js.UndefOr[string] = js.native
}
object CdnConfiguration {
  
  @scala.inline
  def apply(): CdnConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CdnConfiguration]
  }
  
  @scala.inline
  implicit class CdnConfigurationOps[Self <: CdnConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAdSegmentUrlPrefix(value: string): Self = this.set("AdSegmentUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdSegmentUrlPrefix: Self = this.set("AdSegmentUrlPrefix", js.undefined)
    
    @scala.inline
    def setContentSegmentUrlPrefix(value: string): Self = this.set("ContentSegmentUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSegmentUrlPrefix: Self = this.set("ContentSegmentUrlPrefix", js.undefined)
  }
}
