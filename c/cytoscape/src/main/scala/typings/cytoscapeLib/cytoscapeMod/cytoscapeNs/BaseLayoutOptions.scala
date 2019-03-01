package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayoutOptions extends LayoutOptions {
  var name: java.lang.String
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.undefined
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.undefined
}

object BaseLayoutOptions {
  @scala.inline
  def apply(name: java.lang.String, ready: LayoutHandler = null, stop: LayoutHandler = null): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[BaseLayoutOptions]
  }
}

