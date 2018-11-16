package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chuiLib {
  /**
   * Interface of the JQuery extension of the W3C event object
   */
  type BaseJQueryEventObject = stdLib.Event
  type JQueryInputEventObject = BaseJQueryEventObject
  type JQueryKeyEventObject = JQueryInputEventObject
  type JQueryMouseEventObject = JQueryInputEventObject
}
