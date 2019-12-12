package typings.atAwsDashSdkClientDashS3DashNode

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreErrorDocumentMod._UnmarshalledErrorDocument
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreIndexDocumentMod._UnmarshalledIndexDocument
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRedirectAllRequestsToMod._UnmarshalledRedirectAllRequestsTo
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreRoutingRuleMod._UnmarshalledRoutingRule
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketWebsiteOutput", JSImport.Namespace)
@js.native
object typesGetBucketWebsiteOutputMod extends js.Object {
  @js.native
  trait GetBucketWebsiteOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[_UnmarshalledErrorDocument] = js.native
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[_UnmarshalledIndexDocument] = js.native
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[_UnmarshalledRedirectAllRequestsTo] = js.native
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[_UnmarshalledRoutingRule]] = js.native
  }
  
}

