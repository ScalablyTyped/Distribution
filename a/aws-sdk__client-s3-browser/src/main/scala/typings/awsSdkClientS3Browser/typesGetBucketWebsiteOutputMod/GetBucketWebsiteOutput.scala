package typings.awsSdkClientS3Browser.typesGetBucketWebsiteOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketWebsiteOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _ErrorDocument shape
    */
  var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.undefined
  /**
    * _IndexDocument shape
    */
  var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.undefined
  /**
    * _RedirectAllRequestsTo shape
    */
  var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.undefined
  /**
    * _RoutingRules shape
    */
  var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.undefined
}

object GetBucketWebsiteOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ErrorDocument: UnmarshalledErrorDocument = null,
    IndexDocument: UnmarshalledIndexDocument = null,
    RedirectAllRequestsTo: UnmarshalledRedirectAllRequestsTo = null,
    RoutingRules: js.Array[UnmarshalledRoutingRule] = null
  ): GetBucketWebsiteOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ErrorDocument != null) __obj.updateDynamic("ErrorDocument")(ErrorDocument.asInstanceOf[js.Any])
    if (IndexDocument != null) __obj.updateDynamic("IndexDocument")(IndexDocument.asInstanceOf[js.Any])
    if (RedirectAllRequestsTo != null) __obj.updateDynamic("RedirectAllRequestsTo")(RedirectAllRequestsTo.asInstanceOf[js.Any])
    if (RoutingRules != null) __obj.updateDynamic("RoutingRules")(RoutingRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketWebsiteOutput]
  }
}

