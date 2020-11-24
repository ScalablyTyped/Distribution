package typings.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChoiceOptions extends js.Object {
  
  var allowNoAnswer: js.UndefOr[Boolean] = js.native
  
  var returnNumeric: js.UndefOr[Boolean] = js.native
}
object ChoiceOptions {
  
  @scala.inline
  def apply(): ChoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChoiceOptions]
  }
  
  @scala.inline
  implicit class ChoiceOptionsOps[Self <: ChoiceOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowNoAnswer(value: Boolean): Self = this.set("allowNoAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNoAnswer: Self = this.set("allowNoAnswer", js.undefined)
    
    @scala.inline
    def setReturnNumeric(value: Boolean): Self = this.set("returnNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnNumeric: Self = this.set("returnNumeric", js.undefined)
  }
}
