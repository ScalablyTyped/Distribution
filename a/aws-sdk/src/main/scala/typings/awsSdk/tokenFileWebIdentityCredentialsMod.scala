package typings.awsSdk

import typings.awsSdk.configBaseMod.ConfigurationOptions
import typings.awsSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenFileWebIdentityCredentialsMod {
  
  @JSImport("aws-sdk/lib/credentials/token_file_web_identity_credentials", "TokenFileWebIdentityCredentials")
  @js.native
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  class TokenFileWebIdentityCredentials () extends Credentials {
    def this(clientConfig: ConfigurationOptions) = this()
  }
}
