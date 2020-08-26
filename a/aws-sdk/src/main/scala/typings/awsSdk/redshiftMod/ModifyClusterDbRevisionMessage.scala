package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterDbRevisionMessage extends js.Object {
  /**
    * The unique identifier of a cluster whose database revision you want to modify.  Example: examplecluster 
    */
  var ClusterIdentifier: String = js.native
  /**
    * The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
    */
  var RevisionTarget: String = js.native
}

object ModifyClusterDbRevisionMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, RevisionTarget: String): ModifyClusterDbRevisionMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], RevisionTarget = RevisionTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterDbRevisionMessage]
  }
  @scala.inline
  implicit class ModifyClusterDbRevisionMessageOps[Self <: ModifyClusterDbRevisionMessage] (val x: Self) extends AnyVal {
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
    def setRevisionTarget(value: String): Self = this.set("RevisionTarget", value.asInstanceOf[js.Any])
  }
  
}

