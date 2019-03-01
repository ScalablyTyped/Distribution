package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Redo extends js.Object {
  var redo: scala.Double
  var undo: scala.Double
}

object Anon_Redo {
  @scala.inline
  def apply(redo: scala.Double, undo: scala.Double): Anon_Redo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("redo")(redo)
    __obj.updateDynamic("undo")(undo)
    __obj.asInstanceOf[Anon_Redo]
  }
}

