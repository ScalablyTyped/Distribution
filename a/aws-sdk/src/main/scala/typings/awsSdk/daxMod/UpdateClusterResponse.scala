package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster, after it has been modified.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.native
}

object UpdateClusterResponse {
  @scala.inline
  def apply(): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateClusterResponse]
  }
  @scala.inline
  implicit class UpdateClusterResponseOps[Self <: UpdateClusterResponse] (val x: Self) extends AnyVal {
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
    def setCluster(value: Cluster): Self = this.set("Cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("Cluster", js.undefined)
  }
  
}

