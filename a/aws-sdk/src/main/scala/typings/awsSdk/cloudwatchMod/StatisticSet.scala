package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatisticSet extends StObject {
  
  /**
    * The maximum value of the sample set.
    */
  var Maximum: DatapointValue = js.native
  
  /**
    * The minimum value of the sample set.
    */
  var Minimum: DatapointValue = js.native
  
  /**
    * The number of samples used for the statistic set.
    */
  var SampleCount: DatapointValue = js.native
  
  /**
    * The sum of values for the sample set.
    */
  var Sum: DatapointValue = js.native
}
object StatisticSet {
  
  @scala.inline
  def apply(Maximum: DatapointValue, Minimum: DatapointValue, SampleCount: DatapointValue, Sum: DatapointValue): StatisticSet = {
    val __obj = js.Dynamic.literal(Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], SampleCount = SampleCount.asInstanceOf[js.Any], Sum = Sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticSet]
  }
  
  @scala.inline
  implicit class StatisticSetMutableBuilder[Self <: StatisticSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaximum(value: DatapointValue): Self = StObject.set(x, "Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: DatapointValue): Self = StObject.set(x, "Minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleCount(value: DatapointValue): Self = StObject.set(x, "SampleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSum(value: DatapointValue): Self = StObject.set(x, "Sum", value.asInstanceOf[js.Any])
  }
}
