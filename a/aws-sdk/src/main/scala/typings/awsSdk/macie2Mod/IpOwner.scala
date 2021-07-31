package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpOwner extends StObject {
  
  /**
    * The autonomous system number (ASN) for the autonomous system that included the IP address.
    */
  var asn: js.UndefOr[string] = js.undefined
  
  /**
    * The organization identifier that's associated with the autonomous system number (ASN) for the autonomous system that included the IP address.
    */
  var asnOrg: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the internet service provider (ISP) that owned the IP address.
    */
  var isp: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the organization that owned the IP address.
    */
  @JSName("org")
  var org_ : js.UndefOr[string] = js.undefined
}
object IpOwner {
  
  @scala.inline
  def apply(): IpOwner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpOwner]
  }
  
  @scala.inline
  implicit class IpOwnerMutableBuilder[Self <: IpOwner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsn(value: string): Self = StObject.set(x, "asn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnOrg(value: string): Self = StObject.set(x, "asnOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsnOrgUndefined: Self = StObject.set(x, "asnOrg", js.undefined)
    
    @scala.inline
    def setAsnUndefined: Self = StObject.set(x, "asn", js.undefined)
    
    @scala.inline
    def setIsp(value: string): Self = StObject.set(x, "isp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIspUndefined: Self = StObject.set(x, "isp", js.undefined)
    
    @scala.inline
    def setOrg_(value: string): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
  }
}
