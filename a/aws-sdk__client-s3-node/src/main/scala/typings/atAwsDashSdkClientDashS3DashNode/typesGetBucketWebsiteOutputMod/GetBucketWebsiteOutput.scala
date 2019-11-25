package typings.atAwsDashSdkClientDashS3DashNode.typesGetBucketWebsiteOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreErrorDocumentMod._UnmarshalledErrorDocument
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreIndexDocumentMod._UnmarshalledIndexDocument
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRedirectAllRequestsToMod._UnmarshalledRedirectAllRequestsTo
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRoutingRuleMod._UnmarshalledRoutingRule
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
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument.asInstanceOf[js.Any])
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument.asInstanceOf[js.Any])
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo.asInstanceOf[js.Any])
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
}

