package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAvailabilityOptionsRequest extends StObject {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * You expand an existing search domain to a second Availability Zone by setting the Multi-AZ option to true. Similarly, you can turn off the Multi-AZ option to downgrade the domain to a single Availability Zone by setting the Multi-AZ option to false. 
    */
  var MultiAZ: Boolean
}
object UpdateAvailabilityOptionsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, MultiAZ: Boolean): UpdateAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], MultiAZ = MultiAZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailabilityOptionsRequest]
  }
  
  @scala.inline
  implicit class UpdateAvailabilityOptionsRequestMutableBuilder[Self <: UpdateAvailabilityOptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
  }
}
