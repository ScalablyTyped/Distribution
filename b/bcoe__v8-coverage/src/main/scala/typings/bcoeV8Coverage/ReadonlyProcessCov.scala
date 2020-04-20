package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.ScriptCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ProcessCov> */
trait ReadonlyProcessCov extends js.Object {
  val result: js.Array[ScriptCov]
}

object ReadonlyProcessCov {
  @scala.inline
  def apply(result: js.Array[ScriptCov]): ReadonlyProcessCov = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProcessCov]
  }
}

