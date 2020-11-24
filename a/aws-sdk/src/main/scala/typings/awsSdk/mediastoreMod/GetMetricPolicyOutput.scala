package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMetricPolicyOutput extends js.Object {
  
  /**
    * The metric policy that is associated with the specific container.
    */
  var MetricPolicy: typings.awsSdk.mediastoreMod.MetricPolicy = js.native
}
object GetMetricPolicyOutput {
  
  @scala.inline
  def apply(MetricPolicy: MetricPolicy): GetMetricPolicyOutput = {
    val __obj = js.Dynamic.literal(MetricPolicy = MetricPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricPolicyOutput]
  }
  
  @scala.inline
  implicit class GetMetricPolicyOutputOps[Self <: GetMetricPolicyOutput] (val x: Self) extends AnyVal {
    
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
    def setMetricPolicy(value: MetricPolicy): Self = this.set("MetricPolicy", value.asInstanceOf[js.Any])
  }
}
