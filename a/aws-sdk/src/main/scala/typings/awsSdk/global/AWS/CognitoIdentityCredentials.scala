package typings.awsSdk.global.AWS

import typings.awsSdk.libCredentialsCognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
open class CognitoIdentityCredentials ()
  extends typings.awsSdk.mod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(
    options: CognitoIdentityOptions,
    clientConfig: typings.awsSdk.libConfigBaseMod.ConfigurationOptions
  ) = this()
}
