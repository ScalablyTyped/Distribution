package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PauseClusterResult extends js.Object {
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.native
}

object PauseClusterResult {
  @scala.inline
  def apply(): PauseClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PauseClusterResult]
  }
  @scala.inline
  implicit class PauseClusterResultOps[Self <: PauseClusterResult] (val x: Self) extends AnyVal {
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

