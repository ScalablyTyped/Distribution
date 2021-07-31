package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCreditSpecification extends StObject {
  
  /**
    * The credit option for CPU usage of the instance. Valid values are standard and unlimited.
    */
  var CpuCredits: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}
object InstanceCreditSpecification {
  
  @scala.inline
  def apply(): InstanceCreditSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCreditSpecification]
  }
  
  @scala.inline
  implicit class InstanceCreditSpecificationMutableBuilder[Self <: InstanceCreditSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuCredits(value: String): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
