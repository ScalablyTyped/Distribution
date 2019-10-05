package typings.chaiDashHttp.chaiDashHttpMod.Global

import typings.chaiDashHttp.chaiDashHttpMod.Global.ChaiHttp.Agent
import typings.superagent.superagentMod.SuperAgentStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ChaiHttp")
@js.native
object ChaiHttp extends js.Object {
  @js.native
  trait Agent extends SuperAgentStatic {
    def close(): Agent = js.native
    def close(callback: js.Function1[/* err */ js.Any, Unit]): Agent = js.native
    def keepOpen(): Agent = js.native
  }
  
  type Response = typings.superagent.superagentMod.Response
}

