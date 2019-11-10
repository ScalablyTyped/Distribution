package typings.cassandraDashDriver.libPoliciesMod.policies

import typings.cassandraDashDriver.Anon_NextExecution
import typings.cassandraDashDriver.cassandraDashDriverMod.Client
import typings.cassandraDashDriver.libPoliciesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution")
@js.native
object speculativeExecution extends js.Object {
  @js.native
  class ConstantSpeculativeExecutionPolicy protected () extends SpeculativeExecutionPolicy {
    def this(delay: Double, maxSpeculativeExecutions: Double) = this()
  }
  
  @js.native
  class NoSpeculativeExecutionPolicy () extends SpeculativeExecutionPolicy
  
  @js.native
  trait SpeculativeExecutionPolicy extends js.Object {
    def getOptions(): Map[String, js.Object] = js.native
    def init(client: Client): Unit = js.native
    def newPlan(keyspace: String, queryInfo: String): Anon_NextExecution = js.native
    def newPlan(keyspace: String, queryInfo: js.Array[js.Object]): Anon_NextExecution = js.native
    def shutdown(): Unit = js.native
  }
  
}

