package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The rate of the discount applied to the usageamount
    */
  var rate: String
}
object Rate {
  
  inline def apply(rate: String): Rate = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
    
    inline def setRate(value: String): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
  }
}
