package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCredentialsInfo extends js.Object {
  
  /**
    *  The Amazon Resource Name (ARN) of the token. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    *  The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN. 
    */
  var authType: js.UndefOr[AuthType] = js.native
  
  /**
    *  The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET. 
    */
  var serverType: js.UndefOr[ServerType] = js.native
}
object SourceCredentialsInfo {
  
  @scala.inline
  def apply(): SourceCredentialsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCredentialsInfo]
  }
  
  @scala.inline
  implicit class SourceCredentialsInfoOps[Self <: SourceCredentialsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAuthType(value: AuthType): Self = this.set("authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthType: Self = this.set("authType", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType): Self = this.set("serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
  }
}
