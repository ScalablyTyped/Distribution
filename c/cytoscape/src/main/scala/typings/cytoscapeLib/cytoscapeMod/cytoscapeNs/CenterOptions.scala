package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CenterOptions extends js.Object {
  var eles: CollectionArgument | Selector
}

object CenterOptions {
  @scala.inline
  def apply(eles: CollectionArgument | Selector): CenterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eles")(eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterOptions]
  }
}

