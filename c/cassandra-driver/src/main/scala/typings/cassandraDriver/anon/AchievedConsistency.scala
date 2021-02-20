package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.typesMod.types.Uuid
import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AchievedConsistency extends StObject {
  
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
  implicit class AchievedConsistencyMutableBuilder[Self <: AchievedConsistency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievedConsistency(value: consistencies): Self = StObject.set(x, "achievedConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPayload(value: js.Any): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriedHost(value: String): Self = StObject.set(x, "queriedHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeculativeExecutions(value: Double): Self = StObject.set(x, "speculativeExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceId(value: Uuid): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriedHosts(value: StringDictionary[js.Any]): Self = StObject.set(x, "triedHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
