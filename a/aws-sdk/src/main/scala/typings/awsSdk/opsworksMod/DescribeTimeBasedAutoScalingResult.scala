package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTimeBasedAutoScalingResult extends StObject {
  
  /**
    * An array of TimeBasedAutoScalingConfiguration objects that describe the configuration for the specified instances.
    */
  var TimeBasedAutoScalingConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.TimeBasedAutoScalingConfigurations] = js.undefined
}
object DescribeTimeBasedAutoScalingResult {
  
  @scala.inline
  def apply(): DescribeTimeBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTimeBasedAutoScalingResult]
  }
  
  @scala.inline
  implicit class DescribeTimeBasedAutoScalingResultMutableBuilder[Self <: DescribeTimeBasedAutoScalingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeBasedAutoScalingConfigurations(value: TimeBasedAutoScalingConfigurations): Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeBasedAutoScalingConfigurationsUndefined: Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", js.undefined)
    
    @scala.inline
    def setTimeBasedAutoScalingConfigurationsVarargs(value: TimeBasedAutoScalingConfiguration*): Self = StObject.set(x, "TimeBasedAutoScalingConfigurations", js.Array(value :_*))
  }
}
