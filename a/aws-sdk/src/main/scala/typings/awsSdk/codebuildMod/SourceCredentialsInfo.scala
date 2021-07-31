package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCredentialsInfo extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN. 
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    *  The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET. 
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
}
object SourceCredentialsInfo {
  
  @scala.inline
  def apply(): SourceCredentialsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCredentialsInfo]
  }
  
  @scala.inline
  implicit class SourceCredentialsInfoMutableBuilder[Self <: SourceCredentialsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
  }
}
