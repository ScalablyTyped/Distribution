package typings.cleaveJs.propsMod

import typings.cleaveJs.optionsMod.CleaveOptions
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactInstance
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends InputHTMLAttributes[HTMLInputElement] {
  
  var htmlRef: js.UndefOr[js.Function1[/* i */ js.Any, Unit]] = js.native
  
  @JSName("onChange")
  var onChange_Props: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  
  var onInit: js.UndefOr[InitHandler] = js.native
  
  var options: CleaveOptions = js.native
}
object Props {
  
  @scala.inline
  def apply(options: CleaveOptions): Props = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setOptions(value: CleaveOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlRef(value: /* i */ js.Any => Unit): Self = this.set("htmlRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHtmlRef: Self = this.set("htmlRef", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInit(value: /* owner */ ReactInstance => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
  }
}
