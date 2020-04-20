package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleActiveLine extends js.Object {
  /**
    * Controls whether single-line selections, or just cursor selections, are styled. Defaults to false (only cursor selections).
    */
  var nonEmpty: Boolean
}

object StyleActiveLine {
  @scala.inline
  def apply(nonEmpty: Boolean): StyleActiveLine = {
    val __obj = js.Dynamic.literal(nonEmpty = nonEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleActiveLine]
  }
}

