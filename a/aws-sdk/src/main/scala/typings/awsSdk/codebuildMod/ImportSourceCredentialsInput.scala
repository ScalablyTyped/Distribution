package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSourceCredentialsInput extends StObject {
  
  /**
    *  The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console. 
    */
  var authType: AuthType
  
  /**
    *  The source provider used for this project. 
    */
  var serverType: ServerType
  
  /**
    *  Set to false to prevent overwriting the repository source credentials. Set to true to overwrite the repository source credentials. The default value is true. 
    */
  var shouldOverwrite: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    *  For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password. 
    */
  var token: SensitiveNonEmptyString
  
  /**
    *  The Bitbucket username when the authType is BASIC_AUTH. This parameter is not valid for other types of source providers or connections. 
    */
  var username: js.UndefOr[NonEmptyString] = js.undefined
}
object ImportSourceCredentialsInput {
  
  inline def apply(authType: AuthType, serverType: ServerType, token: SensitiveNonEmptyString): ImportSourceCredentialsInput = {
    val __obj = js.Dynamic.literal(authType = authType.asInstanceOf[js.Any], serverType = serverType.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSourceCredentialsInput]
  }
  
  extension [Self <: ImportSourceCredentialsInput](x: Self) {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setShouldOverwrite(value: WrapperBoolean): Self = StObject.set(x, "shouldOverwrite", value.asInstanceOf[js.Any])
    
    inline def setShouldOverwriteUndefined: Self = StObject.set(x, "shouldOverwrite", js.undefined)
    
    inline def setToken(value: SensitiveNonEmptyString): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: NonEmptyString): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
