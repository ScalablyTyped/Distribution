package typings.cassandraDashDriver.cassandraDashDriverMod.policies.speculativeExecution

import typings.cassandraDashDriver.Anon_NextExecution
import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeculativeExecutionPolicy extends js.Object {
  def getOptions(): Map[String, _] = js.native
  def init(client: Client): Unit = js.native
  def newPlan(keyspace: String, queryInfo: String): Anon_NextExecution = js.native
  def newPlan(keyspace: String, queryInfo: js.Array[String]): Anon_NextExecution = js.native
  def shutdown(): Unit = js.native
}

