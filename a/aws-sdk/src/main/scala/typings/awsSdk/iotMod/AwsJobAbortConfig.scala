package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobAbortConfig extends js.Object {
  
  /**
    * The list of criteria that determine when and how to abort the job.
    */
  var abortCriteriaList: AwsJobAbortCriteriaList = js.native
}
object AwsJobAbortConfig {
  
  @scala.inline
  def apply(abortCriteriaList: AwsJobAbortCriteriaList): AwsJobAbortConfig = {
    val __obj = js.Dynamic.literal(abortCriteriaList = abortCriteriaList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobAbortConfig]
  }
  
  @scala.inline
  implicit class AwsJobAbortConfigOps[Self <: AwsJobAbortConfig] (val x: Self) extends AnyVal {
    
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
    def setAbortCriteriaListVarargs(value: AwsJobAbortCriteria*): Self = this.set("abortCriteriaList", js.Array(value :_*))
    
    @scala.inline
    def setAbortCriteriaList(value: AwsJobAbortCriteriaList): Self = this.set("abortCriteriaList", value.asInstanceOf[js.Any])
  }
}
