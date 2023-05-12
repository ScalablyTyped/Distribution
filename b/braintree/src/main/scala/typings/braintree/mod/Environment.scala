package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("braintree", "Environment")
@js.native
open class Environment protected () extends StObject {
  def this(
    server: String,
    port: String,
    authUrl: String,
    ssl: Boolean,
    graphQLServer: String,
    graphQLPort: String
  ) = this()
  
  var baseGraphQLUrl: String = js.native
  
  var baseUrl: String = js.native
  
  var uriScheme: String = js.native
}
/* static members */
object Environment {
  
  @JSImport("braintree", "Environment.Development")
  @js.native
  val Development: Environment = js.native
  
  @JSImport("braintree", "Environment.Production")
  @js.native
  val Production: Environment = js.native
  
  @JSImport("braintree", "Environment.Qa")
  @js.native
  val Qa: Environment = js.native
  
  @JSImport("braintree", "Environment.Sandbox")
  @js.native
  val Sandbox: Environment = js.native
}
