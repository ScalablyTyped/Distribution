package typings.awsSdk.mediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(AdSegmentUrlPrefix: string = null, ContentSegmentUrlPrefix: string = null): CdnConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AdSegmentUrlPrefix != null) __obj.updateDynamic("AdSegmentUrlPrefix")(AdSegmentUrlPrefix.asInstanceOf[js.Any])
    if (ContentSegmentUrlPrefix != null) __obj.updateDynamic("ContentSegmentUrlPrefix")(ContentSegmentUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[CdnConfiguration]
  }
}

