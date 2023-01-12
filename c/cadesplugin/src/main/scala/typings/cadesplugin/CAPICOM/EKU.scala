package typings.cadesplugin.CAPICOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EKU extends StObject {
  
  var Name: String
  
  var OID: String
}
object EKU {
  
  inline def apply(Name: String, OID: String): EKU = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OID = OID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EKU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EKU] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOID(value: String): Self = StObject.set(x, "OID", value.asInstanceOf[js.Any])
  }
}
