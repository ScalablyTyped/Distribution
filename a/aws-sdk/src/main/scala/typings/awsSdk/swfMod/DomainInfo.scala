package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainInfo extends StObject {
  
  /**
    * The ARN of the domain.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The description of the domain provided through RegisterDomain.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The name of the domain. This name is unique within the account.
    */
  var name: DomainName
  
  /**
    * The status of the domain:    REGISTERED – The domain is properly registered and available. You can use this domain for registering types and creating new workflow executions.     DEPRECATED – The domain was deprecated using DeprecateDomain, but is still in use. You should not create new workflow executions in this domain.   
    */
  var status: RegistrationStatus
}
object DomainInfo {
  
  inline def apply(name: DomainName, status: RegistrationStatus): DomainInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainInfo]
  }
  
  extension [Self <: DomainInfo](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: RegistrationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
