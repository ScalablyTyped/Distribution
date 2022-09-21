package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuthenticationProfilesMessage extends StObject {
  
  /**
    * The name of the authentication profile to describe. If not specified then all authentication profiles owned by the account are listed.
    */
  var AuthenticationProfileName: js.UndefOr[AuthenticationProfileNameString] = js.undefined
}
object DescribeAuthenticationProfilesMessage {
  
  inline def apply(): DescribeAuthenticationProfilesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuthenticationProfilesMessage]
  }
  
  extension [Self <: DescribeAuthenticationProfilesMessage](x: Self) {
    
    inline def setAuthenticationProfileName(value: AuthenticationProfileNameString): Self = StObject.set(x, "AuthenticationProfileName", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationProfileNameUndefined: Self = StObject.set(x, "AuthenticationProfileName", js.undefined)
  }
}
