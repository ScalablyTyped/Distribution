package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[typings.awsSdk.elbMod.Max] = js.native
  /**
    * The name of the limit. The possible values are:   classic-listeners   classic-load-balancers   classic-registered-instances  
    */
  var Name: js.UndefOr[typings.awsSdk.elbMod.Name] = js.native
}

object Limit {
  @scala.inline
  def apply(): Limit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Limit]
  }
  @scala.inline
  implicit class LimitOps[Self <: Limit] (val x: Self) extends AnyVal {
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
    def setMax(value: Max): Self = this.set("Max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("Max", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

