package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<bson.bson.SerializeOptions, 'serializeFunctions' | 'ignoreUndefined'> */
trait CalculateObjectSizeOptions extends StObject {
  
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}
object CalculateObjectSizeOptions {
  
  inline def apply(): CalculateObjectSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateObjectSizeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalculateObjectSizeOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
  }
}
