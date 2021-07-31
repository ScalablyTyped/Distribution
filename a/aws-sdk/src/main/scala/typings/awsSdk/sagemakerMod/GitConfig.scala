package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitConfig extends StObject {
  
  /**
    * The default branch for the Git repository.
    */
  var Branch: js.UndefOr[typings.awsSdk.sagemakerMod.Branch] = js.undefined
  
  /**
    * The URL where the Git repository is located.
    */
  var RepositoryUrl: GitConfigUrl
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the git repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var SecretArn: js.UndefOr[typings.awsSdk.sagemakerMod.SecretArn] = js.undefined
}
object GitConfig {
  
  @scala.inline
  def apply(RepositoryUrl: GitConfigUrl): GitConfig = {
    val __obj = js.Dynamic.literal(RepositoryUrl = RepositoryUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitConfig]
  }
  
  @scala.inline
  implicit class GitConfigMutableBuilder[Self <: GitConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: Branch): Self = StObject.set(x, "Branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "Branch", js.undefined)
    
    @scala.inline
    def setRepositoryUrl(value: GitConfigUrl): Self = StObject.set(x, "RepositoryUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
