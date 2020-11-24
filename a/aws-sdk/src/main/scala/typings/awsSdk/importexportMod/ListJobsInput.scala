package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJobsInput extends js.Object {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var Marker: js.UndefOr[typings.awsSdk.importexportMod.Marker] = js.native
  
  var MaxJobs: js.UndefOr[typings.awsSdk.importexportMod.MaxJobs] = js.native
}
object ListJobsInput {
  
  @scala.inline
  def apply(): ListJobsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsInput]
  }
  
  @scala.inline
  implicit class ListJobsInputOps[Self <: ListJobsInput] (val x: Self) extends AnyVal {
    
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
    def setAPIVersion(value: APIVersion_): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPIVersion: Self = this.set("APIVersion", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxJobs(value: MaxJobs): Self = this.set("MaxJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxJobs: Self = this.set("MaxJobs", js.undefined)
  }
}
