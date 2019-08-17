package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreWebsiteConfigurationMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreErrorDocumentMod._ErrorDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreIndexDocumentMod._IndexDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRedirectAllRequestsToMod._RedirectAllRequestsTo
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRoutingRuleMod._RoutingRule
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WebsiteConfiguration extends js.Object {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[_ErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[_IndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[_RedirectAllRequestsTo] = js.undefined
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[_RoutingRule] | Iterable[_RoutingRule]] = js.undefined
}

object _WebsiteConfiguration {
  @scala.inline
  def apply(
    ErrorDocument: _ErrorDocument = null,
    IndexDocument: _IndexDocument = null,
    RedirectAllRequestsTo: _RedirectAllRequestsTo = null,
    RoutingRules: js.Array[_RoutingRule] | Iterable[_RoutingRule] = null
  ): _WebsiteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument)
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument)
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo)
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WebsiteConfiguration]
  }
}

