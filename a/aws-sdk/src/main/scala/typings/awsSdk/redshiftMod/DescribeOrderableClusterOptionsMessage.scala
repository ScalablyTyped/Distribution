package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeOrderableClusterOptionsMessage extends js.Object {
  /**
    * The version filter value. Specify this parameter to show only the available offerings matching the specified version. Default: All versions. Constraints: Must be one of the version returned from DescribeClusterVersions.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * An optional parameter that specifies the starting point to return a set of response records. When the results of a DescribeOrderableClusterOptions request exceed the value specified in MaxRecords, AWS returns a value in the Marker field of the response. You can retrieve the next set of response records by providing the returned marker value in the Marker parameter and retrying the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of response records to return in each call. If the number of remaining response records exceeds the specified MaxRecords value, a value is returned in a marker field of the response. You can retrieve the next set of records by retrying the command with the returned marker value.  Default: 100  Constraints: minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * The node type filter value. Specify this parameter to show only the available offerings matching the specified node type.
    */
  var NodeType: js.UndefOr[String] = js.native
}

object DescribeOrderableClusterOptionsMessage {
  @scala.inline
  def apply(): DescribeOrderableClusterOptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrderableClusterOptionsMessage]
  }
  @scala.inline
  implicit class DescribeOrderableClusterOptionsMessageOps[Self <: DescribeOrderableClusterOptionsMessage] (val x: Self) extends AnyVal {
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
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setNodeType(value: String): Self = this.set("NodeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeType: Self = this.set("NodeType", js.undefined)
  }
  
}

