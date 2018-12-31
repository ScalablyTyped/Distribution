package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs.CssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/events
  */
trait Events extends js.Object {
  /**
    * Whether events should occur on an element (e.g.tap, mouseover, etc.).
    *  * For "no", the element receives no events and events simply pass through to the core/viewport.
    */
  var events: cytoscapeLib.cytoscapeLibStrings.yes | cytoscapeLib.cytoscapeLibStrings.no
  /**
    *  Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text on active so you know the text is activatable.
    */
  var `text-events`: cytoscapeLib.cytoscapeLibStrings.yes | cytoscapeLib.cytoscapeLibStrings.no
}

