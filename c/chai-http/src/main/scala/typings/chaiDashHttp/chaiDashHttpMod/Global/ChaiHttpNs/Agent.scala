package typings.chaiDashHttp.chaiDashHttpMod.Global.ChaiHttpNs

import typings.superagent.superagentMod.SuperAgentStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Agent extends SuperAgentStatic {
  def close(): Agent = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): Agent = js.native
  def keepOpen(): Agent = js.native
}

