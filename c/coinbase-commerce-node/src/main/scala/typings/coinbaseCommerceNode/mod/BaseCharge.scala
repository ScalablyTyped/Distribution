package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base charge properties.
  */
@js.native
trait BaseCharge extends StObject {
  
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
  implicit class BaseChargeMutableBuilder[Self <: BaseCharge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel_url(value: String): Self = StObject.set(x, "cancel_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel_urlUndefined: Self = StObject.set(x, "cancel_url", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: KeyVal): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricing_type(value: PricingType): Self = StObject.set(x, "pricing_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_url(value: String): Self = StObject.set(x, "redirect_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirect_urlUndefined: Self = StObject.set(x, "redirect_url", js.undefined)
  }
}
