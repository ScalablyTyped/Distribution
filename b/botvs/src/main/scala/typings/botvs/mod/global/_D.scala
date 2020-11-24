package typings.botvs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("_D")
@js.native
object _D extends js.Object {
  
  /**
    * 返回指定时间戳(ms)字符串, 不传任何参数就返回当前时间,
    * 如_D(),或者_D(1478570053241), 默认格式为yyyy-MM-dd hh:mm:ss
    *
    * @param {string} timestamp
    * @param {string} format
    * @return {string}
    */
  def apply(timestamp: String, format: String): String = js.native
}
