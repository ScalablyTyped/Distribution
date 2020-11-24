package typings.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldsFieldMaskInput extends js.Object {
  
  /**
    * The character to use when masking the input.
    * @default '•'
    */
  var character: js.UndefOr[String] = js.native
  
  /**
    * Only applicable for the credit card field. Whether or not to show the last 4 digits of the card when masking.
    */
  var showLastFour: js.UndefOr[Boolean] = js.native
}
object HostedFieldsFieldMaskInput {
  
  @scala.inline
  def apply(): HostedFieldsFieldMaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldsFieldMaskInput]
  }
  
  @scala.inline
  implicit class HostedFieldsFieldMaskInputOps[Self <: HostedFieldsFieldMaskInput] (val x: Self) extends AnyVal {
    
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
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacter: Self = this.set("character", js.undefined)
    
    @scala.inline
    def setShowLastFour(value: Boolean): Self = this.set("showLastFour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLastFour: Self = this.set("showLastFour", js.undefined)
  }
}
