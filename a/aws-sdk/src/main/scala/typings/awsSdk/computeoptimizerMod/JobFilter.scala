package typings.awsSdk.computeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobFilter extends js.Object {
  
  /**
    * The name of the filter. Specify ResourceType to return export jobs of a specific resource type (e.g., Ec2Instance). Specify JobStatus to return export jobs with a specific status (e.g, Complete).
    */
  var name: js.UndefOr[JobFilterName] = js.native
  
  /**
    * The value of the filter. If you specify the name parameter as ResourceType, the valid values are Ec2Instance or AutoScalingGroup. If you specify the name parameter as JobStatus, the valid values are Queued, InProgress, Complete, or Failed.
    */
  var values: js.UndefOr[FilterValues] = js.native
}
object JobFilter {
  
  @scala.inline
  def apply(): JobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFilter]
  }
  
  @scala.inline
  implicit class JobFilterOps[Self <: JobFilter] (val x: Self) extends AnyVal {
    
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
    def setName(value: JobFilterName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: FilterValues): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
