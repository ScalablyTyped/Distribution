package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chui {
  /**
    * Interface of the JQuery extension of the W3C event object
    */
  type BaseJQueryEventObject = typings.std.Event
  type JQueryInputEventObject = typings.chui.BaseJQueryEventObject
  type JQueryKeyEventObject = typings.chui.JQueryInputEventObject
  type JQueryMouseEventObject = typings.chui.JQueryInputEventObject
}
