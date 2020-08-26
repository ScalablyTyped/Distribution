package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCapacity extends js.Object {
  /**
    * The number of instances that can be launched onto the Dedicated Host based on the host's available capacity.
    */
  var AvailableCapacity: js.UndefOr[Integer] = js.native
  /**
    * The instance type supported by the Dedicated Host.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The total number of instances that can be launched onto the Dedicated Host if there are no instances running on it.
    */
  var TotalCapacity: js.UndefOr[Integer] = js.native
}

object InstanceCapacity {
  @scala.inline
  def apply(): InstanceCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCapacity]
  }
  @scala.inline
  implicit class InstanceCapacityOps[Self <: InstanceCapacity] (val x: Self) extends AnyVal {
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
    def setAvailableCapacity(value: Integer): Self = this.set("AvailableCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableCapacity: Self = this.set("AvailableCapacity", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setTotalCapacity(value: Integer): Self = this.set("TotalCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCapacity: Self = this.set("TotalCapacity", js.undefined)
  }
  
}

