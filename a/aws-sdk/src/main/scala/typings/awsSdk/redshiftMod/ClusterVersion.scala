package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVersion extends js.Object {
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.native
}

object ClusterVersion {
  @scala.inline
  def apply(): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterVersion]
  }
  @scala.inline
  implicit class ClusterVersionOps[Self <: ClusterVersion] (val x: Self) extends AnyVal {
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
    def setClusterParameterGroupFamily(value: String): Self = this.set("ClusterParameterGroupFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterParameterGroupFamily: Self = this.set("ClusterParameterGroupFamily", js.undefined)
    @scala.inline
    def setClusterVersion(value: String): Self = this.set("ClusterVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterVersion: Self = this.set("ClusterVersion", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

