package typings.consumerDataStandards.adminMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseErrorListV2
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var errors: js.Array[Code]
}
object ResponseErrorListV2 {
  
  inline def apply(errors: js.Array[Code]): ResponseErrorListV2 = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseErrorListV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseErrorListV2] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: js.Array[Code]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Code*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
