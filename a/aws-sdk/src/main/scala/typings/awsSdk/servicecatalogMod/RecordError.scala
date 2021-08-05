package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordError extends StObject {
  
  /**
    * The numeric value of the error.
    */
  var Code: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The description of the error.
    */
  var Description: js.UndefOr[ErrorDescription] = js.undefined
}
object RecordError {
  
  inline def apply(): RecordError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordError]
  }
  
  extension [Self <: RecordError](x: Self) {
    
    inline def setCode(value: ErrorCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: ErrorDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
