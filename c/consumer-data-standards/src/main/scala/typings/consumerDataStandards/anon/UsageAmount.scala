package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageAmount
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The rate of the discount over the usage amount
    */
  var rate: String
  
  /**
    * The usage amount threshold above which the discount applies
    */
  var usageAmount: String
}
object UsageAmount {
  
  inline def apply(rate: String, usageAmount: String): UsageAmount = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], usageAmount = usageAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageAmount] (val x: Self) extends AnyVal {
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setUsageAmount(value: String): Self = StObject.set(x, "usageAmount", value.asInstanceOf[js.Any])
  }
}
