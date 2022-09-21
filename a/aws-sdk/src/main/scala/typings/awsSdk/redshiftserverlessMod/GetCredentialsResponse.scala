package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsResponse extends StObject {
  
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName.
    */
  var dbPassword: js.UndefOr[DbPassword] = js.undefined
  
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC.
    */
  var dbUser: js.UndefOr[DbUser] = js.undefined
  
  /**
    * The date and time the password in DbPassword expires.
    */
  var expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time of when the DbUser and DbPassword authorization refreshes.
    */
  var nextRefreshTime: js.UndefOr[js.Date] = js.undefined
}
object GetCredentialsResponse {
  
  inline def apply(): GetCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsResponse]
  }
  
  extension [Self <: GetCredentialsResponse](x: Self) {
    
    inline def setDbPassword(value: DbPassword): Self = StObject.set(x, "dbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbPasswordUndefined: Self = StObject.set(x, "dbPassword", js.undefined)
    
    inline def setDbUser(value: DbUser): Self = StObject.set(x, "dbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "dbUser", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setNextRefreshTime(value: js.Date): Self = StObject.set(x, "nextRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setNextRefreshTimeUndefined: Self = StObject.set(x, "nextRefreshTime", js.undefined)
  }
}
