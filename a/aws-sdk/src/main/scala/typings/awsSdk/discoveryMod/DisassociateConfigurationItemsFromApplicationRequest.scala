package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateConfigurationItemsFromApplicationRequest extends StObject {
  
  /**
    * Configuration ID of an application from which each item is disassociated.
    */
  var applicationConfigurationId: ApplicationId = js.native
  
  /**
    * Configuration ID of each item to be disassociated from an application.
    */
  var configurationIds: ConfigurationIdList = js.native
}
object DisassociateConfigurationItemsFromApplicationRequest {
  
  @scala.inline
  def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): DisassociateConfigurationItemsFromApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
  }
  
  @scala.inline
  implicit class DisassociateConfigurationItemsFromApplicationRequestMutableBuilder[Self <: DisassociateConfigurationItemsFromApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationConfigurationId(value: ApplicationId): Self = StObject.set(x, "applicationConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
  }
}
