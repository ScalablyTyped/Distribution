package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDirectoryComputerAttribute extends StObject {
  
  /**
    * The name for the LDAP attribute.
    */
  var name: js.UndefOr[ActiveDirectoryComputerAttributeName] = js.undefined
  
  /**
    * The value for the LDAP attribute.
    */
  var value: js.UndefOr[ActiveDirectoryComputerAttributeValue] = js.undefined
}
object ActiveDirectoryComputerAttribute {
  
  inline def apply(): ActiveDirectoryComputerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryComputerAttribute]
  }
  
  extension [Self <: ActiveDirectoryComputerAttribute](x: Self) {
    
    inline def setName(value: ActiveDirectoryComputerAttributeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: ActiveDirectoryComputerAttributeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
