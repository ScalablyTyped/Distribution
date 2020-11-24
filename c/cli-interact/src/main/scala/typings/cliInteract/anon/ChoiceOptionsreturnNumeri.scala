package typings.cliInteract.anon

import typings.cliInteract.cliInteractBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined cli-interact.cli-interact.ChoiceOptions & {  returnNumeric :true} */
@js.native
trait ChoiceOptionsreturnNumeri extends js.Object {
  
  var allowNoAnswer: js.UndefOr[Boolean] = js.native
  
  var returnNumeric: js.UndefOr[Boolean] with `true` = js.native
}
object ChoiceOptionsreturnNumeri {
  
  @scala.inline
  def apply(returnNumeric: js.UndefOr[Boolean] with `true`): ChoiceOptionsreturnNumeri = {
    val __obj = js.Dynamic.literal(returnNumeric = returnNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptionsreturnNumeri]
  }
  
  @scala.inline
  implicit class ChoiceOptionsreturnNumeriOps[Self <: ChoiceOptionsreturnNumeri] (val x: Self) extends AnyVal {
    
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
    def setReturnNumeric(value: js.UndefOr[Boolean] with `true`): Self = this.set("returnNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNoAnswer(value: Boolean): Self = this.set("allowNoAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNoAnswer: Self = this.set("allowNoAnswer", js.undefined)
  }
}
