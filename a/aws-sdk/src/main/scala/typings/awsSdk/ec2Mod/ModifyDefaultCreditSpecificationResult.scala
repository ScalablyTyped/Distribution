package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDefaultCreditSpecificationResult extends StObject {
  
  /**
    * The default credit option for CPU usage of the instance family.
    */
  var InstanceFamilyCreditSpecification: js.UndefOr[typings.awsSdk.ec2Mod.InstanceFamilyCreditSpecification] = js.undefined
}
object ModifyDefaultCreditSpecificationResult {
  
  @scala.inline
  def apply(): ModifyDefaultCreditSpecificationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationResult]
  }
  
  @scala.inline
  implicit class ModifyDefaultCreditSpecificationResultMutableBuilder[Self <: ModifyDefaultCreditSpecificationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceFamilyCreditSpecification(value: InstanceFamilyCreditSpecification): Self = StObject.set(x, "InstanceFamilyCreditSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyCreditSpecificationUndefined: Self = StObject.set(x, "InstanceFamilyCreditSpecification", js.undefined)
  }
}
