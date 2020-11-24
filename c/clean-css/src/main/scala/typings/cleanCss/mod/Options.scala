package typings.cleanCss.mod

import typings.cleanCss.cleanCssBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Discriminant union of both sets of options types.  If you initialize without setting `returnPromise: true`
  *  and want to return a promise, you will need to cast to the correct options type so that TypeScript
  *  knows what the expected return type will be:
  *  `(options = options as CleanCSS.OptionsPromise).returnPromise = true`
  */
/* Rewritten from type alias, can be one of: 
  - typings.cleanCss.mod.OptionsPromise
  - typings.cleanCss.mod.OptionsOutput
*/
trait Options extends js.Object
object Options {
  
  @scala.inline
  def OptionsPromise(returnPromise: `true`): Options = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  def OptionsOutput(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
}
