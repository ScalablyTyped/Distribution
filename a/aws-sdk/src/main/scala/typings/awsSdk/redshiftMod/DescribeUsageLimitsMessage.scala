package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsageLimitsMessage extends js.Object {
  /**
    * The identifier of the cluster for which you want to describe usage limits.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The feature type for which you want to describe usage limits.
    */
  var FeatureType: js.UndefOr[UsageLimitFeatureType] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeUsageLimits request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A tag key or keys for which you want to return all matching usage limit objects that are associated with the specified key or keys. For example, suppose that you have parameter groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the usage limit objects have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * A tag value or values for which you want to return all matching usage limit objects that are associated with the specified tag value or values. For example, suppose that you have parameter groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the usage limit objects that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.native
  /**
    * The identifier of the usage limit to describe.
    */
  var UsageLimitId: js.UndefOr[String] = js.native
}

object DescribeUsageLimitsMessage {
  @scala.inline
  def apply(
    ClusterIdentifier: String = null,
    FeatureType: UsageLimitFeatureType = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    TagKeys: TagKeyList = null,
    TagValues: TagValueList = null,
    UsageLimitId: String = null
  ): DescribeUsageLimitsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier.asInstanceOf[js.Any])
    if (FeatureType != null) __obj.updateDynamic("FeatureType")(FeatureType.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues.asInstanceOf[js.Any])
    if (UsageLimitId != null) __obj.updateDynamic("UsageLimitId")(UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsageLimitsMessage]
  }
}

