package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.DEVICE
import typings.consumerDataStandards.consumerDataStandardsStrings.ENTERTAINMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.EQUIPMENT
import typings.consumerDataStandards.consumerDataStandardsStrings.HANDSET
import typings.consumerDataStandards.consumerDataStandardsStrings.NETWORK
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.SERVICE
import typings.consumerDataStandards.consumerDataStandardsStrings.SOFTWARE
import typings.consumerDataStandards.consumerDataStandardsStrings.SUBSCRIPTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictkAmountDescription
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The aggregate total of charges for this item (exclusive of GST)
    */
  var amount: String
  
  /**
    * A free text description of the charge
    */
  var description: String
  
  /**
    * A free text description of the charge
    */
  var `type`: js.UndefOr[
    SERVICE | EQUIPMENT | NETWORK | HANDSET | DEVICE | ENTERTAINMENT | SUBSCRIPTION | SOFTWARE | OTHER | Null
  ] = js.undefined
}
object DictkAmountDescription {
  
  inline def apply(amount: String, description: String): DictkAmountDescription = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictkAmountDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictkAmountDescription] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: SERVICE | EQUIPMENT | NETWORK | HANDSET | DEVICE | ENTERTAINMENT | SUBSCRIPTION | SOFTWARE | OTHER
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
