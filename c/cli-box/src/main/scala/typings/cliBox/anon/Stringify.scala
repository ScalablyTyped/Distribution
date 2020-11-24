package typings.cliBox.anon

import typings.cliBox.cliBoxBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stringify extends js.Object {
  
  var stringify: `true` = js.native
}
object Stringify {
  
  @scala.inline
  def apply(stringify: `true`): Stringify = {
    val __obj = js.Dynamic.literal(stringify = stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stringify]
  }
  
  @scala.inline
  implicit class StringifyOps[Self <: Stringify] (val x: Self) extends AnyVal {
    
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
    def setStringify(value: `true`): Self = this.set("stringify", value.asInstanceOf[js.Any])
  }
}
