package typings.cytoscape.cytoscapeMod.Css

import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.yes
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
  var events: yes | no
  /**
    *  Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text on active so you know the text is activatable.
    */
  var `text-events`: yes | no
}

object Events {
  @scala.inline
  def apply(events: yes | no, `text-events`: yes | no): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
}

