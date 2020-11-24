package typings.creditCardType.anon

import typings.creditCardType.creditCardTypeNumbers.`3`
import typings.creditCardType.creditCardTypeNumbers.`4`
import typings.creditCardType.typesMod.CreditCardTypeSecurityCodeLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends js.Object {
  
  var name: CreditCardTypeSecurityCodeLabel = js.native
  
  var size: `3` | `4` = js.native
}
object Size {
  
  @scala.inline
  def apply(name: CreditCardTypeSecurityCodeLabel, size: `3` | `4`): Size = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeOps[Self <: Size] (val x: Self) extends AnyVal {
    
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
    def setName(value: CreditCardTypeSecurityCodeLabel): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: `3` | `4`): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
