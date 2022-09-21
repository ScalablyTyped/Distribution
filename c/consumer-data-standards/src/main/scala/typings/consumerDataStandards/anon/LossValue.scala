package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LossValue
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * A code used to identify data loss factor for the service point values.  Refer to AEMO distribution loss factor documents for each financial year to interpret
    */
  var code: String
  
  /**
    * Description of the data loss factor code and value
    */
  var description: String
  
  /**
    * The value associated with the loss factor code
    */
  var lossValue: String
}
object LossValue {
  
  inline def apply(code: String, description: String, lossValue: String): LossValue = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], lossValue = lossValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LossValue]
  }
  
  extension [Self <: LossValue](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setLossValue(value: String): Self = StObject.set(x, "lossValue", value.asInstanceOf[js.Any])
  }
}
