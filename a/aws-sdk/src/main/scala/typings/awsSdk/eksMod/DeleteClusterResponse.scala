package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterResponse extends js.Object {
  /**
    * The full description of the cluster to delete.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object DeleteClusterResponse {
  @scala.inline
  def apply(): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterResponse]
  }
  @scala.inline
  implicit class DeleteClusterResponseOps[Self <: DeleteClusterResponse] (val x: Self) extends AnyVal {
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
    def setCluster(value: Cluster): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
  }
  
}

