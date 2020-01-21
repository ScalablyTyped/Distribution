package typings.botvs.mod._Global_

import typings.botvs.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HttpQuery")
@js.native
object HttpQuery extends js.Object {
  /**
    * 网络URL访问
    *
    * HttpQuery(Url, PostData, Cookies, Headers, IsReturnHeader)
    * 获取一个Url的返回内容, 如果第二个参数PostData为字符串就以POST方式提交
    * 第二个参数PostData可以自定义方法比如HttpQuery('http://www.abc.com', {method:'PUT', data:'xx'})
    * 传递Cookie字符串需要第三个参数, 但不需要POST请将第二个参数置为null
    * 模拟测试的时候因为无法模拟访问URL, 函数就返回固定字符串 Dummy Data
    * 可以用此接口发送短信, 或者与其它API进行交互
    * HttpQuery("http://www.baidu.com/"); // Get
    * HttpQuery("http://www.163.com", "xxx"); // Post
    * HttpQuery("http://www.baidu.com/", null, "a=10; b=20", "User-Agent: Mobile\nContent-Type: text/html", true);
    * // will return {Header: HTTP Header, Body: HTML}
    *
    * @param {string} Url
    * @param {string | null | {method: string; data?: string}} PostData
    * @param {string} Cookies
    * @param {string} Headers
    * @return {string}
    */
  def apply(Url: String, PostData: String, Cookies: String, Headers: String): String = js.native
  def apply(Url: String, PostData: Null, Cookies: String, Headers: String): String = js.native
  def apply(Url: String, PostData: AnonData, Cookies: String, Headers: String): String = js.native
}

