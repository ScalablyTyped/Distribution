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
  def apply(): DescribeUsageLimitsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsageLimitsMessage]
  }
  @scala.inline
  implicit class DescribeUsageLimitsMessageOps[Self <: DescribeUsageLimitsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    @scala.inline
    def setFeatureType(value: UsageLimitFeatureType): Self = this.set("FeatureType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureType: Self = this.set("FeatureType", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("TagKeys", js.Array(value :_*))
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagKeys: Self = this.set("TagKeys", js.undefined)
    @scala.inline
    def setTagValuesVarargs(value: String*): Self = this.set("TagValues", js.Array(value :_*))
    @scala.inline
    def setTagValues(value: TagValueList): Self = this.set("TagValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagValues: Self = this.set("TagValues", js.undefined)
    @scala.inline
    def setUsageLimitId(value: String): Self = this.set("UsageLimitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageLimitId: Self = this.set("UsageLimitId", js.undefined)
  }
  
}

