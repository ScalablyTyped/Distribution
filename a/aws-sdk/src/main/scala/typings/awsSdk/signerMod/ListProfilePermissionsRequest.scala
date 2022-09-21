package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProfilePermissionsRequest extends StObject {
  
  /**
    * String for specifying the next set of paginated results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the signing profile containing the cross-account permissions.
    */
  var profileName: ProfileName
}
object ListProfilePermissionsRequest {
  
  inline def apply(profileName: ProfileName): ListProfilePermissionsRequest = {
    val __obj = js.Dynamic.literal(profileName = profileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilePermissionsRequest]
  }
  
  extension [Self <: ListProfilePermissionsRequest](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
  }
}
