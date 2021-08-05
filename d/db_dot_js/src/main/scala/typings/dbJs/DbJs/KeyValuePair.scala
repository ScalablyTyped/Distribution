package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyValuePair[TKey, TValue] extends StObject {
  
  var item: TValue
  
  var key: TKey
}
object KeyValuePair {
  
  inline def apply[TKey, TValue](item: TValue, key: TKey): KeyValuePair[TKey, TValue] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
  }
  
  extension [Self <: KeyValuePair[?, ?], TKey, TValue](x: Self & (KeyValuePair[TKey, TValue])) {
    
    inline def setItem(value: TValue): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
