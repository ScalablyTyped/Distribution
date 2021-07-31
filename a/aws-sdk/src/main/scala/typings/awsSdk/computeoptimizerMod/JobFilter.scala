package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFilter extends StObject {
  
  /**
    * The name of the filter. Specify ResourceType to return export jobs of a specific resource type (e.g., Ec2Instance). Specify JobStatus to return export jobs with a specific status (e.g, Complete).
    */
  var name: js.UndefOr[JobFilterName] = js.undefined
  
  /**
    * The value of the filter. If you specify the name parameter as ResourceType, the valid values are Ec2Instance or AutoScalingGroup. If you specify the name parameter as JobStatus, the valid values are Queued, InProgress, Complete, or Failed.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object JobFilter {
  
  @scala.inline
  def apply(): JobFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFilter]
  }
  
  @scala.inline
  implicit class JobFilterMutableBuilder[Self <: JobFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JobFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
