package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseMasterUserPasswordRequest extends StObject {
  
  /**
    * The password version to return. Specifying CURRENT or PREVIOUS returns the current or previous passwords respectively. Specifying PENDING returns the newest version of the password that will rotate to CURRENT. After the PENDING password rotates to CURRENT, the PENDING password is no longer available. Default: CURRENT 
    */
  var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined
  
  /**
    * The name of your database for which to get the master user password.
    */
  var relationalDatabaseName: ResourceName
}
object GetRelationalDatabaseMasterUserPasswordRequest {
  
  inline def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseMasterUserPasswordRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
  }
  
  extension [Self <: GetRelationalDatabaseMasterUserPasswordRequest](x: Self) {
    
    inline def setPasswordVersion(value: RelationalDatabasePasswordVersion): Self = StObject.set(x, "passwordVersion", value.asInstanceOf[js.Any])
    
    inline def setPasswordVersionUndefined: Self = StObject.set(x, "passwordVersion", js.undefined)
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
