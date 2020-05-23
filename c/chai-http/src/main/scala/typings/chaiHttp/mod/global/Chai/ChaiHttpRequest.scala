package typings.chaiHttp.mod.global.Chai

import typings.chaiHttp.mod.global.ChaiHttp.Agent
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

