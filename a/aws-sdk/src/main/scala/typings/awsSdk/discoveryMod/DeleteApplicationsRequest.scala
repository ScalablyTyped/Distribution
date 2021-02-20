package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationsRequest extends StObject {
  
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
  implicit class DeleteApplicationsRequestMutableBuilder[Self <: DeleteApplicationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationIds(value: ApplicationIdsList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: ApplicationId*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
  }
}
