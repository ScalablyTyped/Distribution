package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuthenticationProfilesResult extends StObject {
  
  /**
    * The list of authentication profiles.
    */
  var AuthenticationProfiles: js.UndefOr[AuthenticationProfileList] = js.undefined
}
object DescribeAuthenticationProfilesResult {
  
  inline def apply(): DescribeAuthenticationProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuthenticationProfilesResult]
  }
  
  extension [Self <: DescribeAuthenticationProfilesResult](x: Self) {
    
    inline def setAuthenticationProfiles(value: AuthenticationProfileList): Self = StObject.set(x, "AuthenticationProfiles", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfilesUndefined: Self = StObject.set(x, "AuthenticationProfiles", js.undefined)
    
    inline def setAuthenticationProfilesVarargs(value: AuthenticationProfile*): Self = StObject.set(x, "AuthenticationProfiles", js.Array(value*))
  }
}
