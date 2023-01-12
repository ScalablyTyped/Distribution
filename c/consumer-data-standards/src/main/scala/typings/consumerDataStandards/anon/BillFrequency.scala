package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillFrequency
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The frequency with which a bill will be issued.  Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var billFrequency: String
}
object BillFrequency {
  
  inline def apply(billFrequency: String): BillFrequency = {
    val __obj = js.Dynamic.literal(billFrequency = billFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillFrequency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillFrequency] (val x: Self) extends AnyVal {
    
    inline def setBillFrequency(value: String): Self = StObject.set(x, "billFrequency", value.asInstanceOf[js.Any])
  }
}
