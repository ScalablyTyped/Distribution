package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSummary extends StObject {
  
  /**
    *  The ARN of the domain. 
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  A timestamp that contains the date and time the domain was created. 
    */
  var createdTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The key used to encrypt the domain. 
    */
  var encryptionKey: js.UndefOr[Arn] = js.undefined
  
  /**
    *  The name of the domain. 
    */
  var name: js.UndefOr[DomainName] = js.undefined
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var owner: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  A string that contains the status of the domain. The valid values are:     Active     Deleted   
    */
  var status: js.UndefOr[DomainStatus] = js.undefined
}
object DomainSummary {
  
  inline def apply(): DomainSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSummary]
  }
  
  extension [Self <: DomainSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: Timestamp): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setEncryptionKey(value: Arn): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setName(value: DomainName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: AccountId): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setStatus(value: DomainStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
