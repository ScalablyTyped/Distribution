package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRevealConfigurationRequest extends StObject {
  
  /**
    * The new configuration settings and the status of the configuration for the account.
    */
  var configuration: RevealConfiguration
}
object UpdateRevealConfigurationRequest {
  
  inline def apply(configuration: RevealConfiguration): UpdateRevealConfigurationRequest = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRevealConfigurationRequest]
  }
  
  extension [Self <: UpdateRevealConfigurationRequest](x: Self) {
    
    inline def setConfiguration(value: RevealConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
