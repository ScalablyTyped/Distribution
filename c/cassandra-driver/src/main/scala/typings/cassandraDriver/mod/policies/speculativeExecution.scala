package typings.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.speculativeExecution")
@js.native
object speculativeExecution extends js.Object {
  @js.native
  class ConstantSpeculativeExecutionPolicy protected ()
    extends typings.cassandraDriver.policiesMod.policies.speculativeExecution.ConstantSpeculativeExecutionPolicy {
    def this(delay: Double, maxSpeculativeExecutions: Double) = this()
  }
  
  @js.native
  class NoSpeculativeExecutionPolicy ()
    extends typings.cassandraDriver.policiesMod.policies.speculativeExecution.NoSpeculativeExecutionPolicy
  
}

