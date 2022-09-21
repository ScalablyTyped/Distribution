package typings.awsSdk.pinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAttribute extends StObject {
  
  /**
    * The name of the account attribute.
    */
  var Name: AccountAttributeName
  
  /**
    * The value associated with the account attribute name.
    */
  var Value: String
}
object AccountAttribute {
  
  inline def apply(Name: AccountAttributeName, Value: String): AccountAttribute = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttribute]
  }
  
  extension [Self <: AccountAttribute](x: Self) {
    
    inline def setName(value: AccountAttributeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
