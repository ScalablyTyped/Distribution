package typings.botvs.botvsMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_C")
@js.native
object _C extends js.Object {
  /**
    * 重试函数, 会一直调用指定函数到成功返回(函数返回null或者false会重试),
    * 比如_C(exchange.GetTicker), 默认重试间隔为3秒, 可以调用_CDelay函数来控制重试间隔
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒
    *
    * @param {(...args: any[]) => T} func
    * @param args
    * @return {T}
    */
  def apply[T](func: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
}

