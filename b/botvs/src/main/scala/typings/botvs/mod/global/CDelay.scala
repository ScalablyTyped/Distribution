package typings.botvs.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_CDelay")
@js.native
object CDelay extends js.Object {
  /**
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒, 默认为3秒
    *
    * @param {number} delay
    */
  def apply(delay: Double): Unit = js.native
}

