package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberFabricLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with a member's Certificate Authority (CA). CA logs help you determine when a member in your account joins the network, or when new peers register with a member CA.
    */
  var CaLogs: js.UndefOr[LogConfigurations] = js.undefined
}
object MemberFabricLogPublishingConfiguration {
  
  inline def apply(): MemberFabricLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFabricLogPublishingConfiguration]
  }
  
  extension [Self <: MemberFabricLogPublishingConfiguration](x: Self) {
    
    inline def setCaLogs(value: LogConfigurations): Self = StObject.set(x, "CaLogs", value.asInstanceOf[js.Any])
    
    inline def setCaLogsUndefined: Self = StObject.set(x, "CaLogs", js.undefined)
  }
}
