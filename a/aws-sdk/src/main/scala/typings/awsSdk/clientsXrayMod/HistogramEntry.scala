package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramEntry extends StObject {
  
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.undefined
}
object HistogramEntry {
  
  inline def apply(): HistogramEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramEntry] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
