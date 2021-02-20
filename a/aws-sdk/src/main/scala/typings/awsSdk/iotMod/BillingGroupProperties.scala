package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingGroupProperties extends StObject {
  
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.native
}
object BillingGroupProperties {
  
  @scala.inline
  def apply(): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupProperties]
  }
  
  @scala.inline
  implicit class BillingGroupPropertiesMutableBuilder[Self <: BillingGroupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingGroupDescription(value: BillingGroupDescription): Self = StObject.set(x, "billingGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupDescriptionUndefined: Self = StObject.set(x, "billingGroupDescription", js.undefined)
  }
}
