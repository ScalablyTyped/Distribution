package typings.bell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.bell.mod.CustomProviderOptions
  - typings.bell.mod.KnownProviderOptions
*/
trait BellOptions extends js.Object
object BellOptions {
  
  @scala.inline
  def CustomProviderOptions(
    clientId: String,
    clientSecret: String,
    password: String,
    provider: CustomProtocol1 | CustomProtocol2
  ): BellOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BellOptions]
  }
  
  @scala.inline
  def KnownProviderOptions(clientId: String, clientSecret: String, password: String, provider: Provider): BellOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BellOptions]
  }
}
