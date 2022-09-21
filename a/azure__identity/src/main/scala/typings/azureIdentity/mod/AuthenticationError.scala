package typings.azureIdentity.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AuthenticationError")
@js.native
open class AuthenticationError protected ()
  extends StObject
     with Error {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, errorBody: String) = this()
  def this(statusCode: Double, errorBody: js.Object) = this()
  
  /**
    * The error response details.
    */
  val errorResponse: ErrorResponse = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * The HTTP status code returned from the authentication request.
    */
  val statusCode: Double = js.native
}
