package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackSetOperationPreferences extends js.Object {
  
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
  implicit class StackSetOperationPreferencesOps[Self <: StackSetOperationPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailureToleranceCount(value: FailureToleranceCount): Self = this.set("FailureToleranceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureToleranceCount: Self = this.set("FailureToleranceCount", js.undefined)
    
    @scala.inline
    def setFailureTolerancePercentage(value: FailureTolerancePercentage): Self = this.set("FailureTolerancePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureTolerancePercentage: Self = this.set("FailureTolerancePercentage", js.undefined)
    
    @scala.inline
    def setMaxConcurrentCount(value: MaxConcurrentCount): Self = this.set("MaxConcurrentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentCount: Self = this.set("MaxConcurrentCount", js.undefined)
    
    @scala.inline
    def setMaxConcurrentPercentage(value: MaxConcurrentPercentage): Self = this.set("MaxConcurrentPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConcurrentPercentage: Self = this.set("MaxConcurrentPercentage", js.undefined)
    
    @scala.inline
    def setRegionOrderVarargs(value: Region*): Self = this.set("RegionOrder", js.Array(value :_*))
    
    @scala.inline
    def setRegionOrder(value: RegionList): Self = this.set("RegionOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionOrder: Self = this.set("RegionOrder", js.undefined)
  }
}
