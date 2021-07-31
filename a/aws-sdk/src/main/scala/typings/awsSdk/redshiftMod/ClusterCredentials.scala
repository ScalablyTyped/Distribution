package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterCredentials extends StObject {
  
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[TStamp] = js.undefined
}
object ClusterCredentials {
  
  @scala.inline
  def apply(): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCredentials]
  }
  
  @scala.inline
  implicit class ClusterCredentialsMutableBuilder[Self <: ClusterCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbPassword(value: SensitiveString): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    @scala.inline
    def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    @scala.inline
    def setExpiration(value: TStamp): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
  }
}
