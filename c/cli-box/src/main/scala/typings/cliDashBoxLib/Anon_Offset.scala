package typings
package cliDashBoxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: Anon_Y
  var text: java.lang.String
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Anon_Y, text: java.lang.String): Anon_Offset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Offset]
  }
}

