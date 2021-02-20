package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConfigForUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.sagemakerMod.SecretArn] = js.native
}
object GitConfigForUpdate {
  
  @scala.inline
  def apply(): GitConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitConfigForUpdate]
  }
  
  @scala.inline
  implicit class GitConfigForUpdateMutableBuilder[Self <: GitConfigForUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
