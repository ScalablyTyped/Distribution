package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomEntityTypeResponse extends StObject {
  
  /**
    * The name of the custom pattern you deleted.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object DeleteCustomEntityTypeResponse {
  
  inline def apply(): DeleteCustomEntityTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCustomEntityTypeResponse]
  }
  
  extension [Self <: DeleteCustomEntityTypeResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
