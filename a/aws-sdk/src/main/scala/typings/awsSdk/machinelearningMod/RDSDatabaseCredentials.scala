package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDSDatabaseCredentials extends StObject {
  
  var Password: RDSDatabasePassword = js.native
  
  var Username: RDSDatabaseUsername = js.native
}
object RDSDatabaseCredentials {
  
  @scala.inline
  def apply(Password: RDSDatabasePassword, Username: RDSDatabaseUsername): RDSDatabaseCredentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RDSDatabaseCredentials]
  }
  
  @scala.inline
  implicit class RDSDatabaseCredentialsMutableBuilder[Self <: RDSDatabaseCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: RDSDatabasePassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: RDSDatabaseUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
