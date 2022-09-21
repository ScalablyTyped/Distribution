package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomEntityTypeRequest extends StObject {
  
  /**
    * The name of the custom pattern that you want to delete.
    */
  var Name: NameString
}
object DeleteCustomEntityTypeRequest {
  
  inline def apply(Name: NameString): DeleteCustomEntityTypeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomEntityTypeRequest]
  }
  
  extension [Self <: DeleteCustomEntityTypeRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
