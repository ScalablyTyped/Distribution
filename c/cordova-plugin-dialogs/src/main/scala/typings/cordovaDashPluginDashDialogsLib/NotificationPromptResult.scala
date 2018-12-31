package typings
package cordovaDashPluginDashDialogsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object, passed to promptCallback */
trait NotificationPromptResult extends js.Object {
  /**
    * The index of the pressed button. Note that the index uses one-based indexing, so the value is 1, 2, 3, etc.
    * 0 is the result when the dialog is dismissed without a button press.
    */
  var buttonIndex: scala.Double
  /** The text entered in the prompt dialog box. */
  var input1: java.lang.String
}

