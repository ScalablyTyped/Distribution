package typings.awsSdk.clientsWorklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainResponse extends StObject {
  
  /**
    * The ARN of an issued ACM certificate that is valid for the domain being associated.
    */
  var AcmCertificateArn: js.UndefOr[typings.awsSdk.clientsWorklinkMod.AcmCertificateArn] = js.undefined
  
  /**
    * The time that the domain was added.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DisplayName] = js.undefined
  
  /**
    * The name of the domain.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DomainName] = js.undefined
  
  /**
    * The current state for the domain.
    */
  var DomainStatus: js.UndefOr[typings.awsSdk.clientsWorklinkMod.DomainStatus] = js.undefined
}
object DescribeDomainResponse {
  
  inline def apply(): DescribeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainResponse]
  }
  
  extension [Self <: DescribeDomainResponse](x: Self) {
    
    inline def setAcmCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "AcmCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setAcmCertificateArnUndefined: Self = StObject.set(x, "AcmCertificateArn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "DomainStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainStatusUndefined: Self = StObject.set(x, "DomainStatus", js.undefined)
  }
}
