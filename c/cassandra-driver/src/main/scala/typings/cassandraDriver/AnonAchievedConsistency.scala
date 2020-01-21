package typings.cassandraDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.typesMod.types.Uuid
import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAchievedConsistency extends js.Object {
  var achievedConsistency: consistencies
  var customPayload: js.Any
  var queriedHost: String
  var speculativeExecutions: Double
  var traceId: Uuid
  var triedHosts: StringDictionary[js.Any]
  var warnings: js.Array[String]
}

object AnonAchievedConsistency {
  @scala.inline
  def apply(
    achievedConsistency: consistencies,
    customPayload: js.Any,
    queriedHost: String,
    speculativeExecutions: Double,
    traceId: Uuid,
    triedHosts: StringDictionary[js.Any],
    warnings: js.Array[String]
  ): AnonAchievedConsistency = {
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency.asInstanceOf[js.Any], customPayload = customPayload.asInstanceOf[js.Any], queriedHost = queriedHost.asInstanceOf[js.Any], speculativeExecutions = speculativeExecutions.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], triedHosts = triedHosts.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAchievedConsistency]
  }
}

