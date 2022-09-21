package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateConfigurationItemsFromApplicationRequest extends StObject {
  
  /**
    * Configuration ID of an application from which each item is disassociated.
    */
  var applicationConfigurationId: ApplicationId
  
  /**
    * Configuration ID of each item to be disassociated from an application.
    */
  var configurationIds: ConfigurationIdList
}
object DisassociateConfigurationItemsFromApplicationRequest {
  
  inline def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): DisassociateConfigurationItemsFromApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
  }
  
  extension [Self <: DisassociateConfigurationItemsFromApplicationRequest](x: Self) {
    
    inline def setApplicationConfigurationId(value: ApplicationId): Self = StObject.set(x, "applicationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value*))
  }
}
