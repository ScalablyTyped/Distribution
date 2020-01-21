package typings.botvs.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GetCommand")
@js.native
object GetCommand extends js.Object {
  /**
    * 获取交互命令(utf-8)
    *
    * 获取策略交互界面发来的命令并清空, 没有命令则返回null, 返回的命令格式为 "按钮名称:参数", 如果没有参数, 则命令就是按钮名称
    * while (true) {
    * var cmd = GetCommand();
    * if (cmd) {
    *   Log(cmd);
    * }
    * Sleep(1000);
    * }
    *
    * @return {string}
    */
  def apply(): String | Null = js.native
}

