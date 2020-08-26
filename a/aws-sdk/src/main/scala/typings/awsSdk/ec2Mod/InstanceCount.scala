package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCount extends js.Object {
  /**
    * The number of listed Reserved Instances in the state specified by the state.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
  /**
    * The states of the listed Reserved Instances.
    */
  var State: js.UndefOr[ListingState] = js.native
}

object InstanceCount {
  @scala.inline
  def apply(): InstanceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCount]
  }
  @scala.inline
  implicit class InstanceCountOps[Self <: InstanceCount] (val x: Self) extends AnyVal {
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
    def setInstanceCount(value: Integer): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    @scala.inline
    def setState(value: ListingState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
  
}

