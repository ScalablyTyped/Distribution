package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to retrieve.
    */
  var Name: NameString
}
object GetTriggerRequest {
  
  inline def apply(Name: NameString): GetTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTriggerRequest]
  }
  
  extension [Self <: GetTriggerRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
