package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferingStatus extends StObject {
  
  /**
    * The date on which the offering is effective.
    */
  var effectiveOn: js.UndefOr[DateTime] = js.native
  
  /**
    * Represents the metadata of an offering status.
    */
  var offering: js.UndefOr[Offering] = js.native
  
  /**
    * The number of available devices in the offering.
    */
  var quantity: js.UndefOr[Integer] = js.native
  
  /**
    * The type specified for the offering status.
    */
  var `type`: js.UndefOr[OfferingTransactionType] = js.native
}
object OfferingStatus {
  
  @scala.inline
  def apply(): OfferingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingStatus]
  }
  
  @scala.inline
  implicit class OfferingStatusMutableBuilder[Self <: OfferingStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffectiveOn(value: DateTime): Self = StObject.set(x, "effectiveOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveOnUndefined: Self = StObject.set(x, "effectiveOn", js.undefined)
    
    @scala.inline
    def setOffering(value: Offering): Self = StObject.set(x, "offering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingUndefined: Self = StObject.set(x, "offering", js.undefined)
    
    @scala.inline
    def setQuantity(value: Integer): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setType(value: OfferingTransactionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
