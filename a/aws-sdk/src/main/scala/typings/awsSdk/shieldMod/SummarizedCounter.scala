package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummarizedCounter extends StObject {
  
  /**
    * The average value of the counter for a specified time period.
    */
  var Average: js.UndefOr[Double] = js.native
  
  /**
    * The maximum value of the counter for a specified time period.
    */
  var Max: js.UndefOr[Double] = js.native
  
  /**
    * The number of counters for a specified time period.
    */
  var N: js.UndefOr[Integer] = js.native
  
  /**
    * The counter name.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The total of counter values for a specified time period.
    */
  var Sum: js.UndefOr[Double] = js.native
  
  /**
    * The unit of the counters.
    */
  var Unit: js.UndefOr[String] = js.native
}
object SummarizedCounter {
  
  @scala.inline
  def apply(): SummarizedCounter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummarizedCounter]
  }
  
  @scala.inline
  implicit class SummarizedCounterMutableBuilder[Self <: SummarizedCounter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverage(value: Double): Self = StObject.set(x, "Average", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageUndefined: Self = StObject.set(x, "Average", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    @scala.inline
    def setN(value: Integer): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "N", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSum(value: Double): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "Sum", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
