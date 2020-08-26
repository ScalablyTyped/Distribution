package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typings.awsSdk.rdsMod.GlobalCluster] = js.native
}

object CreateGlobalClusterResult {
  @scala.inline
  def apply(): CreateGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalClusterResult]
  }
  @scala.inline
  implicit class CreateGlobalClusterResultOps[Self <: CreateGlobalClusterResult] (val x: Self) extends AnyVal {
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
    def setGlobalCluster(value: GlobalCluster): Self = this.set("GlobalCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalCluster: Self = this.set("GlobalCluster", js.undefined)
  }
  
}

