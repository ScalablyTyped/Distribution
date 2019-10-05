package typings.cassandraDashDriver.cassandraDashDriverMod.types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "types.ResultSet")
@js.native
class ResultSetCls protected () extends ResultSet {
  def this(
    response: js.Any,
    host: String,
    triedHost: StringDictionary[js.Any],
    speculativeExecutions: Double,
    consistency: consistencies
  ) = this()
}

