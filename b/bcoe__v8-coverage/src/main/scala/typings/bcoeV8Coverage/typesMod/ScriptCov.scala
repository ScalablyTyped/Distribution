package typings.bcoeV8Coverage.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptCov extends js.Object {
  var functions: js.Array[FunctionCov]
  var scriptId: String
  var url: String
}

object ScriptCov {
  @scala.inline
  def apply(functions: js.Array[FunctionCov], scriptId: String, url: String): ScriptCov = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any], scriptId = scriptId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScriptCov]
  }
}

