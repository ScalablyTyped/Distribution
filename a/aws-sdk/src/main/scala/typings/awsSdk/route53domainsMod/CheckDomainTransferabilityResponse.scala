package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckDomainTransferabilityResponse extends StObject {
  
  /**
    * A complex type that contains information about whether the specified domain can be transferred to Route 53.
    */
  var Transferability: DomainTransferability = js.native
}
object CheckDomainTransferabilityResponse {
  
  @scala.inline
  def apply(Transferability: DomainTransferability): CheckDomainTransferabilityResponse = {
    val __obj = js.Dynamic.literal(Transferability = Transferability.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckDomainTransferabilityResponse]
  }
  
  @scala.inline
  implicit class CheckDomainTransferabilityResponseMutableBuilder[Self <: CheckDomainTransferabilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransferability(value: DomainTransferability): Self = StObject.set(x, "Transferability", value.asInstanceOf[js.Any])
  }
}
