package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * Display information for the account
    */
  var displayInfo: AccountDisplayInfo
  
  /**
    * Indicates if the account needs refreshing
    */
  var isStale: Boolean
  
  /**
    * The key that identifies the account
    */
  var key: AccountKey
  
  /**
    * Custom properties stored with the account
    */
  var properties: js.Any
}
object Account {
  
  inline def apply(displayInfo: AccountDisplayInfo, isStale: Boolean, key: AccountKey, properties: js.Any): Account = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], isStale = isStale.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setDisplayInfo(value: AccountDisplayInfo): Self = StObject.set(x, "displayInfo", value.asInstanceOf[js.Any])
    
    inline def setIsStale(value: Boolean): Self = StObject.set(x, "isStale", value.asInstanceOf[js.Any])
    
    inline def setKey(value: AccountKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
