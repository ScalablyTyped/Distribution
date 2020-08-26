package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDiscovererResponse extends js.Object {
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.native
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.native
}

object StopDiscovererResponse {
  @scala.inline
  def apply(): StopDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDiscovererResponse]
  }
  @scala.inline
  implicit class StopDiscovererResponseOps[Self <: StopDiscovererResponse] (val x: Self) extends AnyVal {
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
    def setDiscovererId(value: string): Self = this.set("DiscovererId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscovererId: Self = this.set("DiscovererId", js.undefined)
    @scala.inline
    def setState(value: DiscovererState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

