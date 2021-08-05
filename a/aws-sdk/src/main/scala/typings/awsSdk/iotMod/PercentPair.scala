package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentPair extends StObject {
  
  /**
    * The percentile.
    */
  var percent: js.UndefOr[Percent] = js.undefined
  
  /**
    * The value of the percentile.
    */
  var value: js.UndefOr[PercentValue] = js.undefined
}
object PercentPair {
  
  inline def apply(): PercentPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PercentPair]
  }
  
  extension [Self <: PercentPair](x: Self) {
    
    inline def setPercent(value: Percent): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setValue(value: PercentValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
