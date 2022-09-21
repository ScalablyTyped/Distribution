package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportFirewallDomainsRequest extends StObject {
  
  /**
    * The fully qualified URL or URI of the file stored in Amazon Simple Storage Service (Amazon S3) that contains the list of domains to import. The file must be in an S3 bucket that's in the same Region as your DNS Firewall. The file must be a text file and must contain a single domain per line.
    */
  var DomainFileUrl: DomainListFileUrl
  
  /**
    * The ID of the domain list that you want to modify with the import operation.
    */
  var FirewallDomainListId: ResourceId
  
  /**
    * What you want DNS Firewall to do with the domains that are listed in the file. This must be set to REPLACE, which updates the domain list to exactly match the list in the file. 
    */
  var Operation: FirewallDomainImportOperation
}
object ImportFirewallDomainsRequest {
  
  inline def apply(
    DomainFileUrl: DomainListFileUrl,
    FirewallDomainListId: ResourceId,
    Operation: FirewallDomainImportOperation
  ): ImportFirewallDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainFileUrl = DomainFileUrl.asInstanceOf[js.Any], FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportFirewallDomainsRequest]
  }
  
  extension [Self <: ImportFirewallDomainsRequest](x: Self) {
    
    inline def setDomainFileUrl(value: DomainListFileUrl): Self = StObject.set(x, "DomainFileUrl", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: FirewallDomainImportOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
  }
}
