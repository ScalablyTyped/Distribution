package typings.chaiHttp.mod.global.Chai

import typings.chaiHttp.mod.global.ChaiHttp.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiStatic extends js.Object {
  @JSName("request")
  var request_Original: ChaiHttpRequest = js.native
  def request(server: js.Any): Agent = js.native
}

