package typings.chartmogulNode.anon

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomStrings extends js.Object {
  
  var custom: Strings = js.native
}
object CustomStrings {
  
  @scala.inline
  def apply(custom: Strings): CustomStrings = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStrings]
  }
  
  @scala.inline
  implicit class CustomStringsOps[Self <: CustomStrings] (val x: Self) extends AnyVal {
    
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
    def setCustomVarargs(value: String*): Self = this.set("custom", js.Array(value :_*))
    
    @scala.inline
    def setCustom(value: Strings): Self = this.set("custom", value.asInstanceOf[js.Any])
  }
}
