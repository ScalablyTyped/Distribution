package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValuePair[TKey, TValue] extends StObject {
  
  var item: TValue = js.native
  
  var key: TKey = js.native
}
object KeyValuePair {
  
  @scala.inline
  def apply[TKey, TValue](item: TValue, key: TKey): KeyValuePair[TKey, TValue] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
  }
  
  @scala.inline
  implicit class KeyValuePairMutableBuilder[Self <: KeyValuePair[_, _], TKey, TValue] (val x: Self with (KeyValuePair[TKey, TValue])) extends AnyVal {
    
    @scala.inline
    def setItem(value: TValue): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
