package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axe-core", "configure")
@js.native
object configure extends js.Object {
  
  /**
  	 * Method for configuring the data format used by axe. Helpful for adding new
  	 * rules, which must be registered with the library to execute.
  	 * @param  {Spec}       Spec Object with valid `branding`, `reporter`, `checks` and `rules` data
  	 */
  def apply(spec: Spec): Unit = js.native
}
