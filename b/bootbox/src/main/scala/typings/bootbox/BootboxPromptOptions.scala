package typings.bootbox

import typings.bootbox.anon.Group
import typings.bootbox.bootboxStrings.checkbox
import typings.bootbox.bootboxStrings.date
import typings.bootbox.bootboxStrings.email
import typings.bootbox.bootboxStrings.number
import typings.bootbox.bootboxStrings.password
import typings.bootbox.bootboxStrings.radio
import typings.bootbox.bootboxStrings.range
import typings.bootbox.bootboxStrings.select
import typings.bootbox.bootboxStrings.text
import typings.bootbox.bootboxStrings.textarea
import typings.bootbox.bootboxStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Bootbox options available for prompt modals */
@js.native
trait BootboxPromptOptions extends BootboxBaseOptions[String] {
  
  @JSName("buttons")
  var buttons_BootboxPromptOptions: js.UndefOr[BootboxConfirmPromptButtonMap] = js.native
  
  @JSName("callback")
  def callback_MBootboxPromptOptions(result: String): js.Any = js.native
  
  var inputOptions: js.UndefOr[js.Array[Group]] = js.native
  
  var inputType: js.UndefOr[
    text | textarea | email | select | checkbox | date | time | number | password | radio | range
  ] = js.native
  
  @JSName("title")
  var title_BootboxPromptOptions: String = js.native
  
  var value: js.UndefOr[String] = js.native
}
object BootboxPromptOptions {
  
  @scala.inline
  def apply(callback: String => js.Any, title: String): BootboxPromptOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootboxPromptOptions]
  }
  
  @scala.inline
  implicit class BootboxPromptOptionsOps[Self <: BootboxPromptOptions] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: String => js.Any): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: BootboxConfirmPromptButtonMap): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setInputOptionsVarargs(value: Group*): Self = this.set("inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setInputOptions(value: js.Array[Group]): Self = this.set("inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputOptions: Self = this.set("inputOptions", js.undefined)
    
    @scala.inline
    def setInputType(
      value: text | textarea | email | select | checkbox | date | time | number | password | radio | range
    ): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
