package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketWebsiteOutput extends js.Object {
  /**
    * The name of the error document for the website.
    */
  var ErrorDocument: js.UndefOr[typings.awsSdk.s3Mod.ErrorDocument] = js.native
  /**
    * The name of the index document for the website.
    */
  var IndexDocument: js.UndefOr[typings.awsSdk.s3Mod.IndexDocument] = js.native
  /**
    * Specifies the redirect behavior of all requests to a website endpoint of an Amazon S3 bucket.
    */
  var RedirectAllRequestsTo: js.UndefOr[typings.awsSdk.s3Mod.RedirectAllRequestsTo] = js.native
  /**
    * Rules that define when a redirect is applied and the redirect behavior.
    */
  var RoutingRules: js.UndefOr[typings.awsSdk.s3Mod.RoutingRules] = js.native
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply(
    ErrorDocument: ErrorDocument = null,
    IndexDocument: IndexDocument = null,
    RedirectAllRequestsTo: RedirectAllRequestsTo = null,
    RoutingRules: RoutingRules = null
  ): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument.asInstanceOf[js.Any])
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument.asInstanceOf[js.Any])
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo.asInstanceOf[js.Any])
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
}

