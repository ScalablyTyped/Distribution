package typings.callstackReactThemeProvider.anon

import typings.callstackReactThemeProvider.mod.DeepPartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1`[Theme] extends js.Object {
  
  var theme: js.UndefOr[DeepPartial[Theme]] = js.native
}
object `1` {
  
  @scala.inline
  def apply[Theme](): `1`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[Theme]]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`[_], Theme] (val x: Self with `1`[Theme]) extends AnyVal {
    
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
    def setTheme(value: DeepPartial[Theme]): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
