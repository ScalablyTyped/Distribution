package typings.coinbaseCommerceNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base charge properties.
  */
@js.native
trait BaseCharge extends js.Object {
  
  /**
    * Redirect the user to this URL on cancel.
    */
  var cancel_url: js.UndefOr[String] = js.native
  
  /**
    * More detailed description of the charge.
    * 200 characters or less.
    */
  var description: String = js.native
  
  /**
    * Optional key value pairs for your own use.
    */
  var metadata: js.UndefOr[KeyVal] = js.native
  
  /**
    * Charge name.
    * 100 characters or less.
    */
  var name: String = js.native
  
  /**
    * Charge pricing type.
    */
  var pricing_type: PricingType = js.native
  
  /**
    * Redirect the user to this URL on completion.
    */
  var redirect_url: js.UndefOr[String] = js.native
}
object BaseCharge {
  
  @scala.inline
  def apply(description: String, name: String, pricing_type: PricingType): BaseCharge = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCharge]
  }
  
  @scala.inline
  implicit class BaseChargeOps[Self <: BaseCharge] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricing_type(value: PricingType): Self = this.set("pricing_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel_url(value: String): Self = this.set("cancel_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel_url: Self = this.set("cancel_url", js.undefined)
    
    @scala.inline
    def setMetadata(value: KeyVal): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setRedirect_url(value: String): Self = this.set("redirect_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect_url: Self = this.set("redirect_url", js.undefined)
  }
}
