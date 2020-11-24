package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HPOObjective extends js.Object {
  
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.native
  
  /**
    * The type of the metric. Valid values are Maximize and Minimize.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.native
}
object HPOObjective {
  
  @scala.inline
  def apply(): HPOObjective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HPOObjective]
  }
  
  @scala.inline
  implicit class HPOObjectiveOps[Self <: HPOObjective] (val x: Self) extends AnyVal {
    
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
    def setMetricName(value: MetricName): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    
    @scala.inline
    def setMetricRegex(value: MetricRegex): Self = this.set("metricRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricRegex: Self = this.set("metricRegex", js.undefined)
    
    @scala.inline
    def setType(value: HPOObjectiveType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
