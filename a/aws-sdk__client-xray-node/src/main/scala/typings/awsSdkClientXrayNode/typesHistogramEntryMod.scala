package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHistogramEntryMod {
  
  trait HistogramEntry extends StObject {
    
    /**
      * <p>The prevalence of the entry.</p>
      */
    var Count: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The value of the entry.</p>
      */
    var Value: js.UndefOr[Double] = js.undefined
  }
  object HistogramEntry {
    
    inline def apply(): HistogramEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistogramEntry]
    }
    
    extension [Self <: HistogramEntry](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledHistogramEntry = HistogramEntry
}
