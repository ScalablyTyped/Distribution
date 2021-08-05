package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogFacebookResultSelection extends StObject {
  
  var first_name: String
  
  var gender: String
  
  var id: String
  
  var last_name: String
  
  var name: String
}
object DialogFacebookResultSelection {
  
  inline def apply(first_name: String, gender: String, id: String, last_name: String, name: String): DialogFacebookResultSelection = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookResultSelection]
  }
  
  extension [Self <: DialogFacebookResultSelection](x: Self) {
    
    inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
