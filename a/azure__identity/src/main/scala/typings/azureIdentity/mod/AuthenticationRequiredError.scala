package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.GetTokenOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AuthenticationRequiredError")
@js.native
open class AuthenticationRequiredError protected ()
  extends StObject
     with Error {
  def this(/**
    * Optional parameters. A message can be specified. The {@link GetTokenOptions} of the request can also be specified to more easily associate the error with the received parameters.
    */
  options: AuthenticationRequiredErrorOptions) = this()
  
  /**
    * The options passed to the getToken request.
    */
  var getTokenOptions: js.UndefOr[GetTokenOptions] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The list of scopes for which the token will have access.
    */
  var scopes: js.Array[String] = js.native
}
