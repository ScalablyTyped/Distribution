package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreWebsiteConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreErrorDocumentMod._UnmarshalledErrorDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreIndexDocumentMod._UnmarshalledIndexDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRedirectAllRequestsToMod._UnmarshalledRedirectAllRequestsTo
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRoutingRuleMod._UnmarshalledRoutingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWebsiteConfiguration extends _WebsiteConfiguration {
  /**
    * _ErrorDocument shape
    */
  @JSName("ErrorDocument")
  var ErrorDocument__UnmarshalledWebsiteConfiguration: js.UndefOr[_UnmarshalledErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  @JSName("IndexDocument")
  var IndexDocument__UnmarshalledWebsiteConfiguration: js.UndefOr[_UnmarshalledIndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  @JSName("RedirectAllRequestsTo")
  var RedirectAllRequestsTo__UnmarshalledWebsiteConfiguration: js.UndefOr[_UnmarshalledRedirectAllRequestsTo] = js.undefined
  /**
    * _RoutingRules shape
    */
  @JSName("RoutingRules")
  var RoutingRules__UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[_UnmarshalledRoutingRule]] = js.undefined
}

object _UnmarshalledWebsiteConfiguration {
  @scala.inline
  def apply(
    ErrorDocument: _UnmarshalledErrorDocument = null,
    IndexDocument: _UnmarshalledIndexDocument = null,
    RedirectAllRequestsTo: _UnmarshalledRedirectAllRequestsTo = null,
    RoutingRules: js.Array[_UnmarshalledRoutingRule] = null
  ): _UnmarshalledWebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument)
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument)
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo)
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules)
    __obj.asInstanceOf[_UnmarshalledWebsiteConfiguration]
  }
}

