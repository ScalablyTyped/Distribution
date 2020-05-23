package typings.botvs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_G")
@js.native
object _G extends js.Object {
  /**
    * 可保存的全局字典表
    *
    * KV表, 永久保存在本地文件, 每个机器人单独一个数据库, 重启或者托管者退出后一直存在
    * K必须为数字或者字符串, 不区分大小写, V可以为任何可以JSON序列化的内容
    * _G("num", 1); // 设置一个全局变量num, 值为1
    * _G("num", "ok"); // 更改一个全局变量num, 值为字符串ok
    * _G("num", null); // 删除全局变量 num
    * _G("num"); // 返回全局变量num的值
    * _G(); // 返回当前机器人的ID
    * _G(null); // 删除所有全局变量
    *
    * @param {string} K
    * @param {T} V
    */
  def apply[T](K: String, V: T): Unit = js.native
}

