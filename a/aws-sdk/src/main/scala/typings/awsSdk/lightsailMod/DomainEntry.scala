package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEntry extends StObject {
  
  /**
    * The ID of the domain recordset entry.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When true, specifies whether the domain entry is an alias used by the Lightsail load balancer. You can include an alias (A type) record in your request, which points to a load balancer DNS name and routes traffic to your load balancer.
    */
  var isAlias: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[DomainName] = js.undefined
  
  /**
    * (Deprecated) The options for the domain entry.  In releases prior to November 29, 2017, this parameter was not included in the API response. It is now deprecated. 
    */
  var options: js.UndefOr[DomainEntryOptions] = js.undefined
  
  /**
    * The target AWS name server (e.g., ns-111.awsdns-22.com.). For Lightsail load balancers, the value looks like ab1234c56789c6b86aba6fb203d443bc-123456789.us-east-2.elb.amazonaws.com. Be sure to also set isAlias to true when setting up an A record for a load balancer.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The type of domain entry, such as address (A), canonical name (CNAME), mail exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT). The following domain entry types can be used:    A     CNAME     MX     NS     SOA     SRV     TXT   
    */
  var `type`: js.UndefOr[DomainEntryType] = js.undefined
}
object DomainEntry {
  
  @scala.inline
  def apply(): DomainEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEntry]
  }
  
  @scala.inline
  implicit class DomainEntryMutableBuilder[Self <: DomainEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsAlias(value: Boolean): Self = StObject.set(x, "isAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAliasUndefined: Self = StObject.set(x, "isAlias", js.undefined)
    
    @scala.inline
    def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOptions(value: DomainEntryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: DomainEntryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
