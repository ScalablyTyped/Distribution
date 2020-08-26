package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResult extends js.Object {
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.native
}

object CreateClusterResult {
  @scala.inline
  def apply(): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterResult]
  }
  @scala.inline
  implicit class CreateClusterResultOps[Self <: CreateClusterResult] (val x: Self) extends AnyVal {
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

