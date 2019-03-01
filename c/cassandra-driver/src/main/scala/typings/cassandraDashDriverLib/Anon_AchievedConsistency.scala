package typings
package cassandraDashDriverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AchievedConsistency extends js.Object {
  var achievedConsistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies
  var customPayload: js.Any
  var queriedHost: cassandraDashDriverLib.cassandraDashDriverMod.Host
  var speculativeExecutions: scala.Double
  var traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid
  var triedHosts: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var warnings: js.Array[java.lang.String]
}

object Anon_AchievedConsistency {
  @scala.inline
  def apply(
    achievedConsistency: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.consistencies,
    customPayload: js.Any,
    queriedHost: cassandraDashDriverLib.cassandraDashDriverMod.Host,
    speculativeExecutions: scala.Double,
    traceId: cassandraDashDriverLib.cassandraDashDriverMod.typesNs.Uuid,
    triedHosts: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    warnings: js.Array[java.lang.String]
  ): Anon_AchievedConsistency = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("achievedConsistency")(achievedConsistency)
    __obj.updateDynamic("customPayload")(customPayload)
    __obj.updateDynamic("queriedHost")(queriedHost)
    __obj.updateDynamic("speculativeExecutions")(speculativeExecutions)
    __obj.updateDynamic("traceId")(traceId)
    __obj.updateDynamic("triedHosts")(triedHosts)
    __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Anon_AchievedConsistency]
  }
}

