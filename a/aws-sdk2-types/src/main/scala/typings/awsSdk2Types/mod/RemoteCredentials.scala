package typings.awsSdk2Types.mod

import typings.awsSdk2Types.libCredentialsRemoteCredentialsMod.RemoteCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk2-types", "RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class RemoteCredentials ()
  extends typings.awsSdk2Types.libCoreMod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}
