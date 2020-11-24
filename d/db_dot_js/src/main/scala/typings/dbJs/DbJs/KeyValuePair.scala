package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyValuePair[TKey, TValue] extends js.Object {
  
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
  implicit class KeyValuePairOps[Self <: KeyValuePair[_, _], TKey, TValue] (val x: Self with (KeyValuePair[TKey, TValue])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItem(value: TValue): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: TKey): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
