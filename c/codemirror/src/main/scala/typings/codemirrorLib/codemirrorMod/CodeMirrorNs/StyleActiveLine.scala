package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleActiveLine extends js.Object {
  /**
    * Controls whether single-line selections, or just cursor selections, are styled. Defaults to false (only cursor selections).
    */
  var nonEmpty: scala.Boolean
}

object StyleActiveLine {
  @scala.inline
  def apply(nonEmpty: scala.Boolean): StyleActiveLine = {
    val __obj = js.Dynamic.literal(nonEmpty = nonEmpty)
  
    __obj.asInstanceOf[StyleActiveLine]
  }
}

