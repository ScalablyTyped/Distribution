package typings.cassandraDriver.policiesMod.policies.timestampGeneration

import typings.cassandraDriver.mod.Client
import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.timestampGeneration.MonotonicTimestampGenerator")
@js.native
class MonotonicTimestampGenerator protected () extends TimestampGenerator {
  def this(warningThreshold: Double, minLogInterval: Double) = this()
  def getDate(): Double = js.native
  /* CompleteClass */
  override def next(client: Client): Long | Double = js.native
}

