package typings.awsSdk2Types

import typings.awsSdk2Types.libCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCredentialsEnvironmentCredentialsMod {
  
  @JSImport("aws-sdk2-types/lib/credentials/environment_credentials", "EnvironmentCredentials")
  @js.native
  open class EnvironmentCredentials protected () extends Credentials {
    /**
      * Creates a new EnvironmentCredentials class with a given variable prefix envPrefix.
      * @param {string} envPrefix - The prefix for the environment variable names excluding the separating underscore.
      */
    def this(envPrefix: String) = this()
  }
}
