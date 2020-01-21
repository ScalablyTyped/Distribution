package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.UnmarshalledMetricsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser/types/ListBucketMetricsConfigurationsOutput", JSImport.Namespace)
@js.native
object typesListBucketMetricsConfigurationsOutputMod extends js.Object {
  @js.native
  trait ListBucketMetricsConfigurationsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    /**
      * <p>Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * <p>The list of metrics configurations for a bucket.</p>
      */
    var MetricsConfigurationList: js.UndefOr[js.Array[UnmarshalledMetricsConfiguration]] = js.native
    /**
      * <p>The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.native
  }
  
}

