package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressCounters extends StObject {
  
  /**
    * The total number of steps that the system cancelled in all specified AWS Regions and accounts for the current Automation execution.
    */
  var CancelledSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that failed to run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var FailedSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that successfully completed in all specified AWS Regions and accounts for the current Automation execution.
    */
  var SuccessSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps that timed out in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TimedOutSteps: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of steps run in all specified AWS Regions and accounts for the current Automation execution.
    */
  var TotalSteps: js.UndefOr[Integer] = js.undefined
}
object ProgressCounters {
  
  @scala.inline
  def apply(): ProgressCounters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressCounters]
  }
  
  @scala.inline
  implicit class ProgressCountersMutableBuilder[Self <: ProgressCounters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelledSteps(value: Integer): Self = StObject.set(x, "CancelledSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledStepsUndefined: Self = StObject.set(x, "CancelledSteps", js.undefined)
    
    @scala.inline
    def setFailedSteps(value: Integer): Self = StObject.set(x, "FailedSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedStepsUndefined: Self = StObject.set(x, "FailedSteps", js.undefined)
    
    @scala.inline
    def setSuccessSteps(value: Integer): Self = StObject.set(x, "SuccessSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessStepsUndefined: Self = StObject.set(x, "SuccessSteps", js.undefined)
    
    @scala.inline
    def setTimedOutSteps(value: Integer): Self = StObject.set(x, "TimedOutSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedOutStepsUndefined: Self = StObject.set(x, "TimedOutSteps", js.undefined)
    
    @scala.inline
    def setTotalSteps(value: Integer): Self = StObject.set(x, "TotalSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStepsUndefined: Self = StObject.set(x, "TotalSteps", js.undefined)
  }
}
