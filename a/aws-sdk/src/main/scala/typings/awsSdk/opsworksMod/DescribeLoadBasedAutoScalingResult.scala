package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBasedAutoScalingResult extends StObject {
  
  /**
    * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
    */
  var LoadBasedAutoScalingConfigurations: js.UndefOr[typings.awsSdk.opsworksMod.LoadBasedAutoScalingConfigurations] = js.native
}
object DescribeLoadBasedAutoScalingResult {
  
  @scala.inline
  def apply(): DescribeLoadBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
  }
  
  @scala.inline
  implicit class DescribeLoadBasedAutoScalingResultMutableBuilder[Self <: DescribeLoadBasedAutoScalingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBasedAutoScalingConfigurations(value: LoadBasedAutoScalingConfigurations): Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBasedAutoScalingConfigurationsUndefined: Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", js.undefined)
    
    @scala.inline
    def setLoadBasedAutoScalingConfigurationsVarargs(value: LoadBasedAutoScalingConfiguration*): Self = StObject.set(x, "LoadBasedAutoScalingConfigurations", js.Array(value :_*))
  }
}
