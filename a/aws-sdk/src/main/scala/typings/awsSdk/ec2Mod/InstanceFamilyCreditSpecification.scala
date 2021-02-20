package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceFamilyCreditSpecification extends StObject {
  
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
  implicit class InstanceFamilyCreditSpecificationMutableBuilder[Self <: InstanceFamilyCreditSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: UnlimitedSupportedInstanceFamily): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
  }
}
