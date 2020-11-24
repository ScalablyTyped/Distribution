package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationsRequest extends js.Object {
  
  /**
    * Configuration ID of an application to be deleted.
    */
  var configurationIds: ApplicationIdsList = js.native
}
object DeleteApplicationsRequest {
  
  @scala.inline
  def apply(configurationIds: ApplicationIdsList): DeleteApplicationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationsRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationsRequestOps[Self <: DeleteApplicationsRequest] (val x: Self) extends AnyVal {
    
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
    def setConfigurationIdsVarargs(value: ApplicationId*): Self = this.set("configurationIds", js.Array(value :_*))
    
    @scala.inline
    def setConfigurationIds(value: ApplicationIdsList): Self = this.set("configurationIds", value.asInstanceOf[js.Any])
  }
}
