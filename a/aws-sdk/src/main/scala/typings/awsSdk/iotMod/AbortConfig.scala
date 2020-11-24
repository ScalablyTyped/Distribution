package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortConfig extends js.Object {
  
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var criteriaList: AbortCriteriaList = js.native
}
object AbortConfig {
  
  @scala.inline
  def apply(criteriaList: AbortCriteriaList): AbortConfig = {
    val __obj = js.Dynamic.literal(criteriaList = criteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortConfig]
  }
  
  @scala.inline
  implicit class AbortConfigOps[Self <: AbortConfig] (val x: Self) extends AnyVal {
    
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
    def setCriteriaListVarargs(value: AbortCriteria*): Self = this.set("criteriaList", js.Array(value :_*))
    
    @scala.inline
    def setCriteriaList(value: AbortCriteriaList): Self = this.set("criteriaList", value.asInstanceOf[js.Any])
  }
}
