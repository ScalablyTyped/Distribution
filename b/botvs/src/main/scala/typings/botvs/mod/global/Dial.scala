package typings.botvs.mod.global

import typings.botvs.mod.global.botvs.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dial")
@js.native
object Dial extends js.Object {
  
  /**
    * 原始的Socket访问, 支持tcp, udp, tls, unix 协议
    *
    * @example
    *
    * ```
    * var client = Dial("tls://www.baidu.com:443"); // Dial支持tcp://, udp://, tls://, unix:// 协议, 可加一个参数指定超时的秒数
    * if (client) {
    *  client.write("GET / HTTP/1.1\nConnection: Closed\n\n"); // write可再跟一个数字参数指定超时, write返回成功发送的字节数
    *  while (true) {
    *      var buf = client.read();// read可再跟一个数字参数指定超时, 返回null指出错或者超时或者socket已经关闭
    *      if (!buf) {
    *          break;
    *      }
    *      Log(buf);
    *  }
    *  client.close();
    * }
    * ```
    *
    * @param {string} Address
    * @param {number} Timeout
    * @return {botvs.Socket}
    */
  def apply(Address: String): Socket | Unit = js.native
  def apply(Address: String, Timeout: Double): Socket | Unit = js.native
}
