package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscoverInstancesResponse extends js.Object {
  /**
    * A complex type that contains one HttpInstanceSummary for each registered instance.
    */
  var Instances: js.UndefOr[HttpInstanceSummaryList] = js.native
}

object DiscoverInstancesResponse {
  @scala.inline
  def apply(): DiscoverInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInstancesResponse]
  }
  @scala.inline
  implicit class DiscoverInstancesResponseOps[Self <: DiscoverInstancesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstancesVarargs(value: HttpInstanceSummary*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: HttpInstanceSummaryList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
  }
  
}

