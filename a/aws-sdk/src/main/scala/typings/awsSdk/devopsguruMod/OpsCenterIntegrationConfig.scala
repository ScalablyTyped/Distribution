package typings.awsSdk.devopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpsCenterIntegrationConfig extends StObject {
  
  /**
    *  Specifies if DevOps Guru is enabled to create an Amazon Web Services Systems Manager OpsItem for each created insight. 
    */
  var OptInStatus: js.UndefOr[typings.awsSdk.devopsguruMod.OptInStatus] = js.undefined
}
object OpsCenterIntegrationConfig {
  
  inline def apply(): OpsCenterIntegrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsCenterIntegrationConfig]
  }
  
  extension [Self <: OpsCenterIntegrationConfig](x: Self) {
    
    inline def setOptInStatus(value: OptInStatus): Self = StObject.set(x, "OptInStatus", value.asInstanceOf[js.Any])
    
    inline def setOptInStatusUndefined: Self = StObject.set(x, "OptInStatus", js.undefined)
  }
}
