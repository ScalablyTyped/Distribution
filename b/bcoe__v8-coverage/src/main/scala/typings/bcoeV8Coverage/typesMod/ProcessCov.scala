package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCov extends js.Object {
  var result: js.Array[ScriptCov]
}

object ProcessCov {
  @scala.inline
  def apply(result: js.Array[ScriptCov]): ProcessCov = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCov]
  }
}

