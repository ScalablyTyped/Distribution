package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfferingPromotion extends StObject {
  
  /**
    * A string that describes the offering promotion.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * The ID of the offering promotion.
    */
  var id: js.UndefOr[OfferingPromotionIdentifier] = js.native
}
object OfferingPromotion {
  
  @scala.inline
  def apply(): OfferingPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingPromotion]
  }
  
  @scala.inline
  implicit class OfferingPromotionMutableBuilder[Self <: OfferingPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
