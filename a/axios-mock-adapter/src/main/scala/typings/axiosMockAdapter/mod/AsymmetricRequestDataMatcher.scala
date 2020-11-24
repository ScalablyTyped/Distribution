package typings.axiosMockAdapter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.axiosMockAdapter.mod.AsymmetricMatcher
  - typings.axiosMockAdapter.mod.RequestDataMatcher
*/
trait AsymmetricRequestDataMatcher extends js.Object
object AsymmetricRequestDataMatcher {
  
  @scala.inline
  def AsymmetricMatcher(asymmetricMatch: js.Function): AsymmetricRequestDataMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = asymmetricMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsymmetricRequestDataMatcher]
  }
  
  @scala.inline
  def RequestDataMatcher(): AsymmetricRequestDataMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsymmetricRequestDataMatcher]
  }
}
