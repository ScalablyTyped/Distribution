package typings.awsSdk.mod

import typings.awsSdk.libCredentialsRemoteCredentialsMod.RemoteCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class RemoteCredentials ()
  extends typings.awsSdk.libCoreMod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}
