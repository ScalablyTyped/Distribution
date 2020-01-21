package typings.botvs.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SetErrorFilter")
@js.native
object SetErrorFilter extends js.Object {
  /**
    * 错误信息过滤
    *
    * 被此正则表达式匹配的错误将不上传到日志系统, 可多次调用设置多个
    * SetErrorFilter("502:|503:|tcp|character|unexpected|network|timeout|WSARecv|Connect|GetAddr|no
    * such|reset|http|received|EOF|reused");
    *
    * @param {string} RegEx
    */
  def apply(RegEx: String): Unit = js.native
}

