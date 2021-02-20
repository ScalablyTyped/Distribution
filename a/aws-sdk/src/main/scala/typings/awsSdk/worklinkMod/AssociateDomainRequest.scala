package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateDomainRequest extends StObject {
  
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: typings.awsSdk.worklinkMod.AcmCertificateArn = js.native
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  
  /**
    * The fully qualified domain name (FQDN).
    */
  var DomainName: typings.awsSdk.worklinkMod.DomainName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: typings.awsSdk.worklinkMod.FleetArn = js.native
}
object AssociateDomainRequest {
  
  @scala.inline
  def apply(AcmCertificateArn: AcmCertificateArn, DomainName: DomainName, FleetArn: FleetArn): AssociateDomainRequest = {
    val __obj = js.Dynamic.literal(AcmCertificateArn = AcmCertificateArn.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], FleetArn = FleetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDomainRequest]
  }
  
  @scala.inline
  implicit class AssociateDomainRequestMutableBuilder[Self <: AssociateDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcmCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "AcmCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
  }
}
