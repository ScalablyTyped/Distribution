package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFamilyCreditSpecification extends js.Object {
  
  /**
    * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.native
  
  /**
    * The instance family.
    */
  var InstanceFamily: js.UndefOr[UnlimitedSupportedInstanceFamily] = js.native
}
object InstanceFamilyCreditSpecification {
  
  @scala.inline
  def apply(): InstanceFamilyCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFamilyCreditSpecification]
  }
  
  @scala.inline
  implicit class InstanceFamilyCreditSpecificationOps[Self <: InstanceFamilyCreditSpecification] (val x: Self) extends AnyVal {
    
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
    def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
  }
}
