package typings.atAwsDashSdkClientDashS3DashNode.typesListBucketMetricsConfigurationsOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreMetricsConfigurationMod._UnmarshalledMetricsConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketMetricsConfigurationsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The list of metrics configurations for a bucket.</p>
    */
  var MetricsConfigurationList: js.UndefOr[js.Array[_UnmarshalledMetricsConfiguration]] = js.undefined
  /**
    * <p>The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.undefined
}

object ListBucketMetricsConfigurationsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ContinuationToken: String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    MetricsConfigurationList: js.Array[_UnmarshalledMetricsConfiguration] = null,
    NextContinuationToken: String = null
  ): ListBucketMetricsConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (MetricsConfigurationList != null) __obj.updateDynamic("MetricsConfigurationList")(MetricsConfigurationList.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketMetricsConfigurationsOutput]
  }
}

