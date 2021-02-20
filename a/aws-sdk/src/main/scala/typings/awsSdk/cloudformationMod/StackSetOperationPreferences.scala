package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetOperationPreferences extends StObject {
  
  /**
    * The number of accounts, per Region, for which this operation can fail before AWS CloudFormation stops the operation in that Region. If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in any subsequent Regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both).
    */
  var FailureToleranceCount: js.UndefOr[typings.awsSdk.cloudformationMod.FailureToleranceCount] = js.native
  
  /**
    * The percentage of accounts, per Region, for which this stack operation can fail before AWS CloudFormation stops the operation in that Region. If the operation is stopped in a Region, AWS CloudFormation doesn't attempt the operation in any subsequent Regions. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both.
    */
  var FailureTolerancePercentage: js.UndefOr[typings.awsSdk.cloudformationMod.FailureTolerancePercentage] = js.native
  
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount. MaxConcurrentCount is at most one more than the FailureToleranceCount. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentCount: js.UndefOr[typings.awsSdk.cloudformationMod.MaxConcurrentCount] = js.native
  
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentPercentage: js.UndefOr[typings.awsSdk.cloudformationMod.MaxConcurrentPercentage] = js.native
  
  /**
    * The order of the Regions in where you want to perform the stack operation.
    */
  var RegionOrder: js.UndefOr[RegionList] = js.native
}
object StackSetOperationPreferences {
  
  @scala.inline
  def apply(): StackSetOperationPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationPreferences]
  }
  
  @scala.inline
  implicit class StackSetOperationPreferencesMutableBuilder[Self <: StackSetOperationPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailureToleranceCount(value: FailureToleranceCount): Self = StObject.set(x, "FailureToleranceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureToleranceCountUndefined: Self = StObject.set(x, "FailureToleranceCount", js.undefined)
    
    @scala.inline
    def setFailureTolerancePercentage(value: FailureTolerancePercentage): Self = StObject.set(x, "FailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureTolerancePercentageUndefined: Self = StObject.set(x, "FailureTolerancePercentage", js.undefined)
    
    @scala.inline
    def setMaxConcurrentCount(value: MaxConcurrentCount): Self = StObject.set(x, "MaxConcurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentCountUndefined: Self = StObject.set(x, "MaxConcurrentCount", js.undefined)
    
    @scala.inline
    def setMaxConcurrentPercentage(value: MaxConcurrentPercentage): Self = StObject.set(x, "MaxConcurrentPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrentPercentageUndefined: Self = StObject.set(x, "MaxConcurrentPercentage", js.undefined)
    
    @scala.inline
    def setRegionOrder(value: RegionList): Self = StObject.set(x, "RegionOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionOrderUndefined: Self = StObject.set(x, "RegionOrder", js.undefined)
    
    @scala.inline
    def setRegionOrderVarargs(value: Region*): Self = StObject.set(x, "RegionOrder", js.Array(value :_*))
  }
}
