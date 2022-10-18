package typings.awsSdk.mod

import typings.awsSdk.libCredentialsCognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
open class CognitoIdentityCredentials ()
  extends typings.awsSdk.libCoreMod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(
    options: CognitoIdentityOptions,
    clientConfig: typings.awsSdk.libConfigBaseMod.ConfigurationOptions
  ) = this()
}
