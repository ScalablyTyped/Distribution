package typings.cassandraDashDriver

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.libTypesMod.types.Uuid
import typings.cassandraDashDriver.libTypesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AchievedConsistency extends js.Object {
  var achievedConsistency: consistencies
  var customPayload: js.Any
  var queriedHost: String
  var speculativeExecutions: Double
  var traceId: Uuid
  var triedHosts: StringDictionary[js.Any]
  var warnings: js.Array[String]
}

object Anon_AchievedConsistency {
  @scala.inline
  def apply(
    achievedConsistency: consistencies,
    customPayload: js.Any,
    queriedHost: String,
    speculativeExecutions: Double,
    traceId: Uuid,
    triedHosts: StringDictionary[js.Any],
    warnings: js.Array[String]
  ): Anon_AchievedConsistency = {
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency, customPayload = customPayload, queriedHost = queriedHost, speculativeExecutions = speculativeExecutions, traceId = traceId, triedHosts = triedHosts, warnings = warnings)
  
    __obj.asInstanceOf[Anon_AchievedConsistency]
  }
}

