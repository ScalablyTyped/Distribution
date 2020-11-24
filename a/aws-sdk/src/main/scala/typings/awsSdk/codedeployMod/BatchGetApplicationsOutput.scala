package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetApplicationsOutput extends js.Object {
  
  /**
    * Information about the applications.
    */
  var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.native
}
object BatchGetApplicationsOutput {
  
  @scala.inline
  def apply(): BatchGetApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetApplicationsOutput]
  }
  
  @scala.inline
  implicit class BatchGetApplicationsOutputOps[Self <: BatchGetApplicationsOutput] (val x: Self) extends AnyVal {
    
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
    def setApplicationsInfoVarargs(value: ApplicationInfo*): Self = this.set("applicationsInfo", js.Array(value :_*))
    
    @scala.inline
    def setApplicationsInfo(value: ApplicationsInfoList): Self = this.set("applicationsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationsInfo: Self = this.set("applicationsInfo", js.undefined)
  }
}
