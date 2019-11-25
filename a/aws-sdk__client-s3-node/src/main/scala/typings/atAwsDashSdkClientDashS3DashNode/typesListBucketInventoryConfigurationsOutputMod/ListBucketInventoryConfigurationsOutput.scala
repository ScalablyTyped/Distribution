package typings.atAwsDashSdkClientDashS3DashNode.typesListBucketInventoryConfigurationsOutputMod

import typings.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod._OutputTypesUnion
import typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryConfigurationMod._UnmarshalledInventoryConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketInventoryConfigurationsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>If sent in the request, the marker that is used as a starting point for this inventory configuration list response.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The list of inventory configurations for a bucket.</p>
    */
  var InventoryConfigurationList: js.UndefOr[js.Array[_UnmarshalledInventoryConfiguration]] = js.undefined
  /**
    * <p>Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.undefined
}

object ListBucketInventoryConfigurationsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    ContinuationToken: String = null,
    InventoryConfigurationList: js.Array[_UnmarshalledInventoryConfiguration] = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    NextContinuationToken: String = null
  ): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (InventoryConfigurationList != null) __obj.updateDynamic("InventoryConfigurationList")(InventoryConfigurationList.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
}

