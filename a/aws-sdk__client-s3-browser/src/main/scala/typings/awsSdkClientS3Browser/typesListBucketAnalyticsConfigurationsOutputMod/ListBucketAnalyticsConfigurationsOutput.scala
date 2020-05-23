package typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketAnalyticsConfigurationsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The list of analytics configurations for a bucket.</p>
    */
  var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.undefined
  /**
    * <p>The ContinuationToken that represents where this request began.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.undefined
  /**
    * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.undefined
}

object ListBucketAnalyticsConfigurationsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AnalyticsConfigurationList: js.Array[UnmarshalledAnalyticsConfiguration] = null,
    ContinuationToken: String = null,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    NextContinuationToken: String = null
  ): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AnalyticsConfigurationList != null) __obj.updateDynamic("AnalyticsConfigurationList")(AnalyticsConfigurationList.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.get.asInstanceOf[js.Any])
    if (NextContinuationToken != null) __obj.updateDynamic("NextContinuationToken")(NextContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
}

