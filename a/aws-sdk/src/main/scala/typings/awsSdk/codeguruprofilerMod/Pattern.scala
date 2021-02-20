package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends StObject {
  
  /**
    *  A list of the different counters used to determine if there is a match. 
    */
  var countersToAggregate: js.UndefOr[Strings] = js.native
  
  /**
    * The description of the recommendation. This explains a potential inefficiency in a profiled application.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The universally unique identifier (UUID) of this pattern.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name for this pattern.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    *  A string that contains the steps recommended to address the potential inefficiency. 
    */
  var resolutionSteps: js.UndefOr[String] = js.native
  
  /**
    * A list of frame names that were searched during the analysis that generated a recommendation.
    */
  var targetFrames: js.UndefOr[TargetFrames] = js.native
  
  /**
    *  The percentage of time an application spends in one method that triggers a recommendation. The percentage of time is the same as the percentage of the total gathered sample counts during analysis. 
    */
  var thresholdPercent: js.UndefOr[Percentage] = js.native
}
object Pattern {
  
  @scala.inline
  def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountersToAggregate(value: Strings): Self = StObject.set(x, "countersToAggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountersToAggregateUndefined: Self = StObject.set(x, "countersToAggregate", js.undefined)
    
    @scala.inline
    def setCountersToAggregateVarargs(value: String*): Self = StObject.set(x, "countersToAggregate", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResolutionSteps(value: String): Self = StObject.set(x, "resolutionSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionStepsUndefined: Self = StObject.set(x, "resolutionSteps", js.undefined)
    
    @scala.inline
    def setTargetFrames(value: TargetFrames): Self = StObject.set(x, "targetFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFramesUndefined: Self = StObject.set(x, "targetFrames", js.undefined)
    
    @scala.inline
    def setTargetFramesVarargs(value: TargetFrame*): Self = StObject.set(x, "targetFrames", js.Array(value :_*))
    
    @scala.inline
    def setThresholdPercent(value: Percentage): Self = StObject.set(x, "thresholdPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdPercentUndefined: Self = StObject.set(x, "thresholdPercent", js.undefined)
  }
}
