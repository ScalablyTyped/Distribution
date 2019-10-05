package typings.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseLayoutOptions extends LayoutOptions {
  var name: String
  // on layoutready event
  var ready: js.UndefOr[LayoutHandler] = js.undefined
  // on layoutstop event
  var stop: js.UndefOr[LayoutHandler] = js.undefined
}

object BaseLayoutOptions {
  @scala.inline
  def apply(
    name: String,
    ready: /* e */ LayoutEventObject => Unit = null,
    stop: /* e */ LayoutEventObject => Unit = null
  ): BaseLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[BaseLayoutOptions]
  }
}

