package typings.azureIdentity.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "AggregateAuthenticationError")
@js.native
open class AggregateAuthenticationError protected ()
  extends StObject
     with Error {
  def this(errors: js.Array[Any]) = this()
  def this(errors: js.Array[Any], errorMessage: String) = this()
  
  /**
    * The array of error objects that were thrown while trying to authenticate
    * with the credentials in a {@link ChainedTokenCredential}.
    */
  var errors: js.Array[Any] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
