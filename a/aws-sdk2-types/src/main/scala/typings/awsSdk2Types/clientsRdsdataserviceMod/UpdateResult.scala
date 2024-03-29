package typings.awsSdk2Types.clientsRdsdataserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResult extends StObject {
  
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.undefined
}
object UpdateResult {
  
  inline def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateResult] (val x: Self) extends AnyVal {
    
    inline def setGeneratedFields(value: FieldList): Self = StObject.set(x, "generatedFields", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFieldsUndefined: Self = StObject.set(x, "generatedFields", js.undefined)
    
    inline def setGeneratedFieldsVarargs(value: Field*): Self = StObject.set(x, "generatedFields", js.Array(value*))
  }
}
