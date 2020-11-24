package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLoadBasedAutoScalingResult extends js.Object {
  
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
  implicit class DescribeLoadBasedAutoScalingResultOps[Self <: DescribeLoadBasedAutoScalingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadBasedAutoScalingConfigurationsVarargs(value: LoadBasedAutoScalingConfiguration*): Self = this.set("LoadBasedAutoScalingConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setLoadBasedAutoScalingConfigurations(value: LoadBasedAutoScalingConfigurations): Self = this.set("LoadBasedAutoScalingConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBasedAutoScalingConfigurations: Self = this.set("LoadBasedAutoScalingConfigurations", js.undefined)
  }
}
