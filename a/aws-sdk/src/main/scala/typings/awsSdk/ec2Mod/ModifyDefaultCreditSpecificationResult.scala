package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDefaultCreditSpecificationResult extends js.Object {
  
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typings.awsSdk.ec2Mod.InstanceFamilyCreditSpecification] = js.native
}
object ModifyDefaultCreditSpecificationResult {
  
  @scala.inline
  def apply(): ModifyDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationResult]
  }
  
  @scala.inline
  implicit class ModifyDefaultCreditSpecificationResultOps[Self <: ModifyDefaultCreditSpecificationResult] (val x: Self) extends AnyVal {
    
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
