package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityProfileResponse extends StObject {
  
  /**
    * The ARN of the security profile.
    */
  var securityProfileArn: js.UndefOr[SecurityProfileArn] = js.undefined
  
  /**
    * The name you gave to the security profile.
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
}
object CreateSecurityProfileResponse {
  
  inline def apply(): CreateSecurityProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityProfileResponse]
  }
  
  extension [Self <: CreateSecurityProfileResponse](x: Self) {
    
    inline def setSecurityProfileArn(value: SecurityProfileArn): Self = StObject.set(x, "securityProfileArn", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileArnUndefined: Self = StObject.set(x, "securityProfileArn", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
  }
}
