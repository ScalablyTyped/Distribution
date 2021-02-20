package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramEntry extends StObject {
  
  /**
    * The prevalence of the entry.
    */
  var Count: js.UndefOr[Integer] = js.native
  
  /**
    * The value of the entry.
    */
  var Value: js.UndefOr[Double] = js.native
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
    def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
