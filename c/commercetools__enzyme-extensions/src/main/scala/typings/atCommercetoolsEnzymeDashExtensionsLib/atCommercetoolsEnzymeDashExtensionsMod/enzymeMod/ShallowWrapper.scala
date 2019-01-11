package typings
package atCommercetoolsEnzymeDashExtensionsLib.atCommercetoolsEnzymeDashExtensionsMod.enzymeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShallowWrapper[P] extends js.Object {
  def drill(expander: js.Function1[/* props */ js.Any, this.type]): ShallowWrapper[P] = js.native
  def renderProp(propName: java.lang.String, args: js.Any*): ShallowWrapper[P] = js.native
  def until(selector: enzymeLib.enzymeMod.EnzymeSelector): ShallowWrapper[P] = js.native
  def until(selector: enzymeLib.enzymeMod.EnzymeSelector, options: UntilOptions): ShallowWrapper[P] = js.native
}

