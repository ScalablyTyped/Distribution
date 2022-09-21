package typings.awsSdk.global.AWS

import typings.awsSdk.remoteCredentialsMod.RemoteCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AWS.RemoteCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class RemoteCredentials ()
  extends typings.awsSdk.mod.RemoteCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}
