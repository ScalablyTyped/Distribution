package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTriggerResponse extends StObject {
  
  /**
    * The name of the trigger that was deleted.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object DeleteTriggerResponse {
  
  inline def apply(): DeleteTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTriggerResponse]
  }
  
  extension [Self <: DeleteTriggerResponse](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
