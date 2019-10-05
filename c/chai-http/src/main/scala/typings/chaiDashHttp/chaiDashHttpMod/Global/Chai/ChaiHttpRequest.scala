package typings.chaiDashHttp.chaiDashHttpMod.Global.Chai

import typings.chaiDashHttp.chaiDashHttpMod.Global.ChaiHttp.Agent
import typings.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiHttpRequest extends js.Object {
  def apply(server: js.Any): Agent = js.native
  def addPromises(promiseConstructor: PromiseConstructorLike): Unit = js.native
  def agent(server: js.Any): Agent = js.native
}

