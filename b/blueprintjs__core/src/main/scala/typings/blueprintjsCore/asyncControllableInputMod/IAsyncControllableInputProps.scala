package typings.blueprintjsCore.asyncControllableInputMod

import typings.react.mod.ClassAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LegacyRef
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAsyncControllableInputProps
  extends InputHTMLAttributes[HTMLInputElement]
     with ClassAttributes[HTMLInputElement] {
  
  var inputRef: js.UndefOr[LegacyRef[HTMLInputElement]] = js.native
}
object IAsyncControllableInputProps {
  
  @scala.inline
  def apply(): IAsyncControllableInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAsyncControllableInputProps]
  }
  
  @scala.inline
  implicit class IAsyncControllableInputPropsOps[Self <: IAsyncControllableInputProps] (val x: Self) extends AnyVal {
    
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
    def setInputRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = this.set("inputRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInputRef(value: LegacyRef[HTMLInputElement]): Self = this.set("inputRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputRef: Self = this.set("inputRef", js.undefined)
    
    @scala.inline
    def setInputRefNull: Self = this.set("inputRef", null)
  }
}
