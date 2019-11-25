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
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency.asInstanceOf[js.Any], customPayload = customPayload.asInstanceOf[js.Any], queriedHost = queriedHost.asInstanceOf[js.Any], speculativeExecutions = speculativeExecutions.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], triedHosts = triedHosts.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AchievedConsistency]
  }
}

