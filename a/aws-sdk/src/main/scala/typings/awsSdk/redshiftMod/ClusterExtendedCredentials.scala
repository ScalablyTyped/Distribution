package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterExtendedCredentials extends StObject {
  
  /**
    * A temporary password that you provide when you connect to a database.
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * A database user name that you provide when you connect to a database. The database user is mapped 1:1 to the source IAM identity. 
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The time (UTC) when the temporary password expires. After this timestamp, a log in with the temporary password fails.
    */
  var Expiration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var NextRefreshTime: js.UndefOr[js.Date] = js.undefined
}
object ClusterExtendedCredentials {
  
  inline def apply(): ClusterExtendedCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterExtendedCredentials]
  }
  
  extension [Self <: ClusterExtendedCredentials](x: Self) {
    
    inline def setDbPassword(value: SensitiveString): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setExpiration(value: js.Date): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setNextRefreshTime(value: js.Date): Self = StObject.set(x, "NextRefreshTime", value.asInstanceOf[js.Any])
    
    inline def setNextRefreshTimeUndefined: Self = StObject.set(x, "NextRefreshTime", js.undefined)
  }
}
