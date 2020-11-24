package typings.detectIndent.mod

import typings.detectIndent.detectIndentStrings.space
import typings.detectIndent.detectIndentStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indent extends js.Object {
  
  /**
  		Amount of indentation, for example `2`.
  		*/
  var amount: Double = js.native
  
  /**
  		Actual indentation.
  		*/
  var indent: String = js.native
  
  /**
  		Type of indentation. Is `undefined` if no indentation is detected.
  		*/
  var `type`: js.UndefOr[tab | space] = js.native
}
object Indent {
  
  @scala.inline
  def apply(amount: Double, indent: String): Indent = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indent]
  }
  
  @scala.inline
  implicit class IndentOps[Self <: Indent] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: tab | space): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
