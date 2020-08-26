package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceCreditSpecification extends js.Object {
  /**
    * The credit option for CPU usage of the instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object InstanceCreditSpecification {
  @scala.inline
  def apply(): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
  @scala.inline
  implicit class InstanceCreditSpecificationOps[Self <: InstanceCreditSpecification] (val x: Self) extends AnyVal {
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
    def setCpuCredits(value: String): Self = this.set("CpuCredits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpuCredits: Self = this.set("CpuCredits", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
  }
  
}

