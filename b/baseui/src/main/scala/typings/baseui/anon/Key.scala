package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends js.Object {
  
  var expanded: js.Array[typings.react.mod.Key] = js.native
  
  var key: typings.react.mod.Key = js.native
}
object Key {
  
  @scala.inline
  def apply(expanded: js.Array[typings.react.mod.Key], key: typings.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    
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
    def setExpandedVarargs(value: typings.react.mod.Key*): Self = this.set("expanded", js.Array(value :_*))
    
    @scala.inline
    def setExpanded(value: js.Array[typings.react.mod.Key]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
