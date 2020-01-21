package typings.awsSdkClientS3Browser.typesWebsiteConfigurationMod

import typings.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledWebsiteConfiguration extends WebsiteConfiguration {
  /**
    * _ErrorDocument shape
    */
  @JSName("ErrorDocument")
  var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  @JSName("IndexDocument")
  var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  @JSName("RedirectAllRequestsTo")
  var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.undefined
  /**
    * _RoutingRules shape
    */
  @JSName("RoutingRules")
  var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.undefined
}

object UnmarshalledWebsiteConfiguration {
  @scala.inline
  def apply(
    ErrorDocument: UnmarshalledErrorDocument = null,
    IndexDocument: UnmarshalledIndexDocument = null,
    RedirectAllRequestsTo: UnmarshalledRedirectAllRequestsTo = null,
    RoutingRules: js.Array[UnmarshalledRoutingRule] = null
  ): UnmarshalledWebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument.asInstanceOf[js.Any])
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument.asInstanceOf[js.Any])
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo.asInstanceOf[js.Any])
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
  }
}

