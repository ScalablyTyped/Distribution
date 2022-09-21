package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseServiceConfiguration extends StObject {
  
  /**
    * The endpoint of the license service that is accessed by the studio component resource.
    */
  var endpoint: js.UndefOr[SensitiveString] = js.undefined
}
object LicenseServiceConfiguration {
  
  inline def apply(): LicenseServiceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseServiceConfiguration]
  }
  
  extension [Self <: LicenseServiceConfiguration](x: Self) {
    
    inline def setEndpoint(value: SensitiveString): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
  }
}
