package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * When included in a request, the parameter depends on the repository type.   For Amazon S3 bundles, set Password to the appropriate IAM secret access key.   For HTTP bundles and Subversion repositories, set Password to the password.   For more information on how to safely handle IAM credentials, see https://docs.aws.amazon.com/general/latest/gr/aws-access-keys-best-practices.html. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var Password: js.UndefOr[String] = js.undefined
  
  /**
    * The application's version. AWS OpsWorks Stacks enables you to easily deploy new versions of an application. One of the simplest approaches is to have branches or revisions in your repository that represent different versions that can potentially be deployed.
    */
  var Revision: js.UndefOr[String] = js.undefined
  
  /**
    * In requests, the repository's SSH key. In responses, AWS OpsWorks Stacks returns *****FILTERED***** instead of the actual value.
    */
  var SshKey: js.UndefOr[String] = js.undefined
  
  /**
    * The repository type.
    */
  var Type: js.UndefOr[SourceType] = js.undefined
  
  /**
    * The source URL. The following is an example of an Amazon S3 source URL: https://s3.amazonaws.com/opsworks-demo-bucket/opsworks_cookbook_demo.tar.gz.
    */
  var Url: js.UndefOr[String] = js.undefined
  
  /**
    * This parameter depends on the repository type.   For Amazon S3 bundles, set Username to the appropriate IAM access key ID.   For HTTP bundles, Git repositories, and Subversion repositories, set Username to the user name.  
    */
  var Username: js.UndefOr[String] = js.undefined
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setRevision(value: String): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionUndefined: Self = StObject.set(x, "Revision", js.undefined)
    
    @scala.inline
    def setSshKey(value: String): Self = StObject.set(x, "SshKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshKeyUndefined: Self = StObject.set(x, "SshKey", js.undefined)
    
    @scala.inline
    def setType(value: SourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
