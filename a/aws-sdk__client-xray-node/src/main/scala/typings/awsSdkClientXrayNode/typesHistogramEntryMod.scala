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
    
    @scala.inline
    def apply(): HistogramEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistogramEntry]
    }
    
    @scala.inline
    implicit class HistogramEntryMutableBuilder[Self <: HistogramEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
    }
  }
  
  type UnmarshalledHistogramEntry = HistogramEntry
}
