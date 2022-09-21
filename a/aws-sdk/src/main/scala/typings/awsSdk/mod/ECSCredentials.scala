package typings.awsSdk.mod

import typings.awsSdk.ecsCredentialsMod.ECSCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "ECSCredentials")
@js.native
/**
  * Represents credentials received.
  * @param {object} options - Override the default (1s) timeout period.
  */
open class ECSCredentials ()
  extends typings.awsSdk.coreMod.ECSCredentials {
  def this(options: ECSCredentialsOptions) = this()
}
