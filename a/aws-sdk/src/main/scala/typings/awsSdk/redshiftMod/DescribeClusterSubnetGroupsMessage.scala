package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterSubnetGroupsMessage extends js.Object {
  /**
    * The name of the cluster subnet group for which information is requested.
    */
  var ClusterSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeClusterSubnetGroups request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * A tag key or keys for which you want to return all matching cluster subnet groups that are associated with the specified key or keys. For example, suppose that you have subnet groups that are tagged with keys called owner and environment. If you specify both of these tag keys in the request, Amazon Redshift returns a response with the subnet groups that have either or both of these tag keys associated with them.
    */
  var TagKeys: js.UndefOr[TagKeyList] = js.native
  /**
    * A tag value or values for which you want to return all matching cluster subnet groups that are associated with the specified tag value or values. For example, suppose that you have subnet groups that are tagged with values called admin and test. If you specify both of these tag values in the request, Amazon Redshift returns a response with the subnet groups that have either or both of these tag values associated with them.
    */
  var TagValues: js.UndefOr[TagValueList] = js.native
}

object DescribeClusterSubnetGroupsMessage {
  @scala.inline
  def apply(
    ClusterSubnetGroupName: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    TagKeys: TagKeyList = null,
    TagValues: TagValueList = null
  ): DescribeClusterSubnetGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroupName != null) __obj.updateDynamic("ClusterSubnetGroupName")(ClusterSubnetGroupName.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords.get.asInstanceOf[js.Any])
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys.asInstanceOf[js.Any])
    if (TagValues != null) __obj.updateDynamic("TagValues")(TagValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterSubnetGroupsMessage]
  }
}

