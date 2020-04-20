package typings.bcoeV8Coverage

import typings.bcoeV8Coverage.typesMod.FunctionCov
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@bcoe/v8-coverage.@bcoe/v8-coverage/dist/lib/types.ScriptCov> */
trait ReadonlyScriptCov extends js.Object {
  val functions: js.Array[FunctionCov]
  val scriptId: String
  val url: String
}

object ReadonlyScriptCov {
  @scala.inline
  def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ReadonlyScriptCov = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyScriptCov]
  }
}

