package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessLevelFilter extends StObject {
  
  /**
    * The access level.    Account - Filter results based on the account.    Role - Filter results based on the federated role of the specified user.    User - Filter results based on the specified user.  
    */
  var Key: js.UndefOr[AccessLevelFilterKey] = js.undefined
  
  /**
    * The user to which the access level applies. The only supported value is Self.
    */
  var Value: js.UndefOr[AccessLevelFilterValue] = js.undefined
}
object AccessLevelFilter {
  
  inline def apply(): AccessLevelFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessLevelFilter]
  }
  
  extension [Self <: AccessLevelFilter](x: Self) {
    
    inline def setKey(value: AccessLevelFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: AccessLevelFilterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
