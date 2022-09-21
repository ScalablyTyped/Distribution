package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTransform extends StObject {
  
  /** The list of query key-value pairs to be added or replaced. */
  var addOrReplaceParams: js.UndefOr[js.Array[QueryKeyValue]] = js.undefined
  
  /** The list of query keys to be removed. */
  var removeParams: js.UndefOr[js.Array[String]] = js.undefined
}
object QueryTransform {
  
  inline def apply(): QueryTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTransform]
  }
  
  extension [Self <: QueryTransform](x: Self) {
    
    inline def setAddOrReplaceParams(value: js.Array[QueryKeyValue]): Self = StObject.set(x, "addOrReplaceParams", value.asInstanceOf[js.Any])
    
    inline def setAddOrReplaceParamsUndefined: Self = StObject.set(x, "addOrReplaceParams", js.undefined)
    
    inline def setAddOrReplaceParamsVarargs(value: QueryKeyValue*): Self = StObject.set(x, "addOrReplaceParams", js.Array(value*))
    
    inline def setRemoveParams(value: js.Array[String]): Self = StObject.set(x, "removeParams", value.asInstanceOf[js.Any])
    
    inline def setRemoveParamsUndefined: Self = StObject.set(x, "removeParams", js.undefined)
    
    inline def setRemoveParamsVarargs(value: String*): Self = StObject.set(x, "removeParams", js.Array(value*))
  }
}
