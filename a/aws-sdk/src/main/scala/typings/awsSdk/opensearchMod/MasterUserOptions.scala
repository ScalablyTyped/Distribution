package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasterUserOptions extends StObject {
  
  /**
    * ARN for the master user (if IAM is enabled).
    */
  var MasterUserARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * The master user's username, which is stored in the Amazon OpenSearch Service domain's internal database.
    */
  var MasterUserName: js.UndefOr[Username] = js.undefined
  
  /**
    * The master user's password, which is stored in the Amazon OpenSearch Service domain's internal database.
    */
  var MasterUserPassword: js.UndefOr[Password] = js.undefined
}
object MasterUserOptions {
  
  inline def apply(): MasterUserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MasterUserOptions]
  }
  
  extension [Self <: MasterUserOptions](x: Self) {
    
    inline def setMasterUserARN(value: ARN): Self = StObject.set(x, "MasterUserARN", value.asInstanceOf[js.Any])
    
    inline def setMasterUserARNUndefined: Self = StObject.set(x, "MasterUserARN", js.undefined)
    
    inline def setMasterUserName(value: Username): Self = StObject.set(x, "MasterUserName", value.asInstanceOf[js.Any])
    
    inline def setMasterUserNameUndefined: Self = StObject.set(x, "MasterUserName", js.undefined)
    
    inline def setMasterUserPassword(value: Password): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
  }
}
