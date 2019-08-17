package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chui {
  import typings.std.Event

  /**
    * Interface of the JQuery extension of the W3C event object
    */
  type BaseJQueryEventObject = Event
  type JQueryInputEventObject = BaseJQueryEventObject
  type JQueryKeyEventObject = JQueryInputEventObject
  type JQueryMouseEventObject = JQueryInputEventObject
}
