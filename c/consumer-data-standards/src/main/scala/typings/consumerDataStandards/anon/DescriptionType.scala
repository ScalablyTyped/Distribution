package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ENVIRONMENTAL
import typings.consumerDataStandards.consumerDataStandardsStrings.METERING
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.RCTI
import typings.consumerDataStandards.consumerDataStandardsStrings.REGULATED
import typings.consumerDataStandards.consumerDataStandardsStrings.RETAIL_SERVICE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionType
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The aggregate total of charges for this item (exclusive of GST)
    */
  var amount: String
  
  /**
    * A free text description of the type of charge
    */
  var description: String
  
  /**
    * Type of charge. Assumed to be other if absent
    */
  var `type`: js.UndefOr[ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER] = js.undefined
}
object DescriptionType {
  
  inline def apply(amount: String, description: String): DescriptionType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescriptionType] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setType(value: ENVIRONMENTAL | REGULATED | NETWORK | METERING | RETAIL_SERVICE | RCTI | OTHER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
