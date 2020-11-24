package typings.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "policies.timestampGeneration")
@js.native
object timestampGeneration extends js.Object {
  
  @js.native
  class MonotonicTimestampGenerator protected ()
    extends typings.cassandraDriver.policiesMod.policies.timestampGeneration.MonotonicTimestampGenerator {
    def this(warningThreshold: Double, minLogInterval: Double) = this()
  }
}
