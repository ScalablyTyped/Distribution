package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceTypeDetail extends StObject {
  
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[typings.awsSdk.ec2Mod.ServiceType] = js.undefined
}
object ServiceTypeDetail {
  
  @scala.inline
  def apply(): ServiceTypeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceTypeDetail]
  }
  
  @scala.inline
  implicit class ServiceTypeDetailMutableBuilder[Self <: ServiceTypeDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = StObject.set(x, "ServiceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "ServiceType", js.undefined)
  }
}
