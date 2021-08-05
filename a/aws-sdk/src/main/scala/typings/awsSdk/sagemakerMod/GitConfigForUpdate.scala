package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConfigForUpdate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.sagemakerMod.SecretArn] = js.undefined
}
object GitConfigForUpdate {
  
  inline def apply(): GitConfigForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitConfigForUpdate]
  }
  
  extension [Self <: GitConfigForUpdate](x: Self) {
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
