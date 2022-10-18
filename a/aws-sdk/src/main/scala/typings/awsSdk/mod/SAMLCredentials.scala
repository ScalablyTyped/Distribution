package typings.awsSdk.mod

import typings.awsSdk.libCredentialsSamlCredentialsMod.SAMLCredentialsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-sdk", "SAMLCredentials")
@js.native
open class SAMLCredentials protected ()
  extends typings.awsSdk.libCoreMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}
