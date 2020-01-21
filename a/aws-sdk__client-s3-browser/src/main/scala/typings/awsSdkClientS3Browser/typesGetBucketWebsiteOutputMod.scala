package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesErrorDocumentMod.UnmarshalledErrorDocument
import typings.awsSdkClientS3Browser.typesIndexDocumentMod.UnmarshalledIndexDocument
import typings.awsSdkClientS3Browser.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typings.awsSdkClientS3Browser.typesRoutingRuleMod.UnmarshalledRoutingRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/GetBucketWebsiteOutput", JSImport.Namespace)
@js.native
object typesGetBucketWebsiteOutputMod extends js.Object {
  @js.native
  trait GetBucketWebsiteOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.native
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.native
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
  }
  
}

