package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResumeClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to be resumed.
    */
  var ClusterIdentifier: String = js.native
}

object ResumeClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): ResumeClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResumeClusterMessage]
  }
  @scala.inline
  implicit class ResumeClusterMessageOps[Self <: ResumeClusterMessage] (val x: Self) extends AnyVal {
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
  }
  
}

