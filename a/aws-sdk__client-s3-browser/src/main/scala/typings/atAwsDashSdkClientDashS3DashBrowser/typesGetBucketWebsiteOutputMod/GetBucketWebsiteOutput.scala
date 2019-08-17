package typings.atAwsDashSdkClientDashS3DashBrowser.typesGetBucketWebsiteOutputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreErrorDocumentMod._UnmarshalledErrorDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreIndexDocumentMod._UnmarshalledIndexDocument
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRedirectAllRequestsToMod._UnmarshalledRedirectAllRequestsTo
import typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreRoutingRuleMod._UnmarshalledRoutingRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[_UnmarshalledErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[_UnmarshalledIndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[_UnmarshalledRedirectAllRequestsTo] = js.undefined
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[_UnmarshalledRoutingRule]] = js.undefined
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ErrorDocument: _UnmarshalledErrorDocument = null,
    IndexDocument: _UnmarshalledIndexDocument = null,
    RedirectAllRequestsTo: _UnmarshalledRedirectAllRequestsTo = null,
    RoutingRules: js.Array[_UnmarshalledRoutingRule] = null
  ): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument)
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument)
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo)
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules)
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
}

