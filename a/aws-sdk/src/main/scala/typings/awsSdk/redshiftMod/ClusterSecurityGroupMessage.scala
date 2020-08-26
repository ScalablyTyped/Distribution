package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterSecurityGroupMessage extends js.Object {
  /**
    * A list of ClusterSecurityGroup instances. 
    */
  var ClusterSecurityGroups: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroups] = js.native
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object ClusterSecurityGroupMessage {
  @scala.inline
  def apply(): ClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMessage]
  }
  @scala.inline
  implicit class ClusterSecurityGroupMessageOps[Self <: ClusterSecurityGroupMessage] (val x: Self) extends AnyVal {
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
    def setClusterSecurityGroupsVarargs(value: ClusterSecurityGroup*): Self = this.set("ClusterSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setClusterSecurityGroups(value: ClusterSecurityGroups): Self = this.set("ClusterSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterSecurityGroups: Self = this.set("ClusterSecurityGroups", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

