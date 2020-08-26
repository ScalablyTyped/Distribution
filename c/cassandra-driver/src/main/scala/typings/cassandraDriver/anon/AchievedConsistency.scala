package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.typesMod.types.Uuid
import typings.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AchievedConsistency extends js.Object {
  var achievedConsistency: consistencies = js.native
  var customPayload: js.Any = js.native
  var queriedHost: String = js.native
  var speculativeExecutions: Double = js.native
  var traceId: Uuid = js.native
  var triedHosts: StringDictionary[js.Any] = js.native
  var warnings: js.Array[String] = js.native
}

object AchievedConsistency {
  @scala.inline
  def apply(
    achievedConsistency: consistencies,
    customPayload: js.Any,
    queriedHost: String,
    speculativeExecutions: Double,
    traceId: Uuid,
    triedHosts: StringDictionary[js.Any],
    warnings: js.Array[String]
  ): AchievedConsistency = {
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency.asInstanceOf[js.Any], customPayload = customPayload.asInstanceOf[js.Any], queriedHost = queriedHost.asInstanceOf[js.Any], speculativeExecutions = speculativeExecutions.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], triedHosts = triedHosts.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievedConsistency]
  }
  @scala.inline
  implicit class AchievedConsistencyOps[Self <: AchievedConsistency] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAchievedConsistency(value: consistencies): Self = this.set("achievedConsistency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomPayload(value: js.Any): Self = this.set("customPayload", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueriedHost(value: String): Self = this.set("queriedHost", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeculativeExecutions(value: Double): Self = this.set("speculativeExecutions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraceId(value: Uuid): Self = this.set("traceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriedHosts(value: StringDictionary[js.Any]): Self = this.set("triedHosts", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
  }
  
}

