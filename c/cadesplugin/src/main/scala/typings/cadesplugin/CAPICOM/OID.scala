package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OID extends StObject {
  
  var FriendlyName: String
  
  var Name: CAPICOM_OID
  
  var Value: String
}
object OID {
  
  @scala.inline
  def apply(FriendlyName: String, Name: CAPICOM_OID, Value: String): OID = {
    val __obj = js.Dynamic.literal(FriendlyName = FriendlyName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OID]
  }
  
  @scala.inline
  implicit class OIDMutableBuilder[Self <: OID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: String): Self = StObject.set(x, "FriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: CAPICOM_OID): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
