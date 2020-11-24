package typings.botvs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GetLastError")
@js.native
object GetLastError extends js.Object {
  
  /**
    * 获取最近一次出错信息,一般无需使用,因为程序会把出错信息自动上传到日志系统
    *
    * @return {string}
    */
  def apply(): String = js.native
}
