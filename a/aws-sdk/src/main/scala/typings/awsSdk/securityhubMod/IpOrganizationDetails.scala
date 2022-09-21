package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpOrganizationDetails extends StObject {
  
  /**
    * The Autonomous System Number (ASN) of the internet provider
    */
  var Asn: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the organization that registered the ASN.
    */
  var AsnOrg: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ISP information for the internet provider.
    */
  var Isp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the internet provider.
    */
  var Org: js.UndefOr[NonEmptyString] = js.undefined
}
object IpOrganizationDetails {
  
  inline def apply(): IpOrganizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOrganizationDetails]
  }
  
  extension [Self <: IpOrganizationDetails](x: Self) {
    
    inline def setAsn(value: Integer): Self = StObject.set(x, "Asn", value.asInstanceOf[js.Any])
    
    inline def setAsnOrg(value: NonEmptyString): Self = StObject.set(x, "AsnOrg", value.asInstanceOf[js.Any])
    
    inline def setAsnOrgUndefined: Self = StObject.set(x, "AsnOrg", js.undefined)
    
    inline def setAsnUndefined: Self = StObject.set(x, "Asn", js.undefined)
    
    inline def setIsp(value: NonEmptyString): Self = StObject.set(x, "Isp", value.asInstanceOf[js.Any])
    
    inline def setIspUndefined: Self = StObject.set(x, "Isp", js.undefined)
    
    inline def setOrg(value: NonEmptyString): Self = StObject.set(x, "Org", value.asInstanceOf[js.Any])
    
    inline def setOrgUndefined: Self = StObject.set(x, "Org", js.undefined)
  }
}
