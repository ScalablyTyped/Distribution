package typings.cassandraDashDriver.cassandraDashDriverMod.policies.timestampGeneration

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonotonicTimestampGenerator extends TimestampGenerator {
  def getDate(): Double
}

@JSImport("cassandra-driver", "policies.timestampGeneration.MonotonicTimestampGenerator")
@js.native
object MonotonicTimestampGenerator extends TopLevel[MonotonicTimestampGeneratorStatic]

