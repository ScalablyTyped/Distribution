package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedshiftDatabaseCredentials extends StObject {
  
  var Password: RedshiftDatabasePassword = js.native
  
  var Username: RedshiftDatabaseUsername = js.native
}
object RedshiftDatabaseCredentials {
  
  @scala.inline
  def apply(Password: RedshiftDatabasePassword, Username: RedshiftDatabaseUsername): RedshiftDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabaseCredentials]
  }
  
  @scala.inline
  implicit class RedshiftDatabaseCredentialsMutableBuilder[Self <: RedshiftDatabaseCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: RedshiftDatabasePassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: RedshiftDatabaseUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
