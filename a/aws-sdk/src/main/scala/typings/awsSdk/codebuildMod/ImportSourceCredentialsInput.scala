package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSourceCredentialsInput extends js.Object {
  
  /**
    *  The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console. 
    */
  var authType: AuthType = js.native
  
  /**
    *  The source provider used for this project. 
    */
  var serverType: ServerType = js.native
  
  /**
    *  Set to false to prevent overwriting the repository source credentials. Set to true to overwrite the repository source credentials. The default value is true. 
    */
  var shouldOverwrite: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password. 
    */
  var token: SensitiveNonEmptyString = js.native
  
  /**
    *  The Bitbucket username when the authType is BASIC_AUTH. This parameter is not valid for other types of source providers or connections. 
    */
  var username: js.UndefOr[NonEmptyString] = js.native
}
object ImportSourceCredentialsInput {
  
  @scala.inline
  def apply(authType: AuthType, serverType: ServerType, token: SensitiveNonEmptyString): ImportSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSourceCredentialsInput]
  }
  
  @scala.inline
  implicit class ImportSourceCredentialsInputOps[Self <: ImportSourceCredentialsInput] (val x: Self) extends AnyVal {
    
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
    def setAuthType(value: AuthType): Self = this.set("authType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerType(value: ServerType): Self = this.set("serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: SensitiveNonEmptyString): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldOverwrite(value: WrapperBoolean): Self = this.set("shouldOverwrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldOverwrite: Self = this.set("shouldOverwrite", js.undefined)
    
    @scala.inline
    def setUsername(value: NonEmptyString): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
