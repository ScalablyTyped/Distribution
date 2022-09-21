package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTUAL
import typings.consumerDataStandards.consumerDataStandardsStrings.FINAL_SUBSTITUTE
import typings.consumerDataStandards.consumerDataStandardsStrings.SUBSTITUTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The quality of the read taken.  If absent then assumed to be ACTUAL
    */
  var quality: js.UndefOr[ACTUAL | SUBSTITUTE | FINAL_SUBSTITUTE] = js.undefined
  
  /**
    * Interval value.  If positive then it means consumption, if negative it means export
    */
  var value: Double
}
object Value {
  
  inline def apply(value: Double): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setQuality(value: ACTUAL | SUBSTITUTE | FINAL_SUBSTITUTE): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
