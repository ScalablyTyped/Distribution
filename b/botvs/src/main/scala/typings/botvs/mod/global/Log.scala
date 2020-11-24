package typings.botvs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Log")
@js.native
object Log extends js.Object {
  
  /**
    * 保存一条信息到日志列表
    *
    * 如果在字符串后面加上@字符则消息会进入推送队列, 推送到使用绑定的微信账号上(账户安全里绑定)(50条/小时, 1条/5秒 限制)
    * 如: Log("微信你好 !@"); 或Log("微信你好, #ff0000@");
    * Log支持打印base64编码后的图片, 以"`"开头, 以"`"结尾, 如Log("`data:image/png;base64,AAAA`")
    * Log支持直接打印Python的matplotlib.pyplot对象, 只要对象包含savefig方法就可以直接Log打印, 如:
    * import matplotlib.pyplot as plt
    * def main():
    * plt.plot([3,6,2,4,7,1])
    * Log(plt)
    *
    * @param {*[]} arg
    */
  def apply(arg: js.Any*): Unit = js.native
}
