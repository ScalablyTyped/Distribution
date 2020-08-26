package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultCreditSpecificationResult extends js.Object {
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typings.awsSdk.ec2Mod.InstanceFamilyCreditSpecification] = js.native
}

object GetDefaultCreditSpecificationResult {
  @scala.inline
  def apply(): GetDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDefaultCreditSpecificationResult]
  }
  @scala.inline
  implicit class GetDefaultCreditSpecificationResultOps[Self <: GetDefaultCreditSpecificationResult] (val x: Self) extends AnyVal {
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
    def setInstanceFamilyCreditSpecification(value: InstanceFamilyCreditSpecification): Self = this.set("InstanceFamilyCreditSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFamilyCreditSpecification: Self = this.set("InstanceFamilyCreditSpecification", js.undefined)
  }
  
}

