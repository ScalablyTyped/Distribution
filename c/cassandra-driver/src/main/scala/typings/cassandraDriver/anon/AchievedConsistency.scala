package typings.cassandraDriver.anon

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.libTypesMod.types.Uuid
import typings.cassandraDriver.libTypesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AchievedConsistency extends StObject {
  
  var achievedConsistency: consistencies
  
  var customPayload: Any
  
  var queriedHost: String
  
  var speculativeExecutions: Double
  
  var traceId: Uuid
  
  var triedHosts: StringDictionary[Any]
  
  var warnings: js.Array[String]
}
object AchievedConsistency {
  
  inline def apply(
    achievedConsistency: consistencies,
    customPayload: Any,
    queriedHost: String,
    speculativeExecutions: Double,
    traceId: Uuid,
    triedHosts: StringDictionary[Any],
    warnings: js.Array[String]
  ): AchievedConsistency = {
    val __obj = js.Dynamic.literal(achievedConsistency = achievedConsistency.asInstanceOf[js.Any], customPayload = customPayload.asInstanceOf[js.Any], queriedHost = queriedHost.asInstanceOf[js.Any], speculativeExecutions = speculativeExecutions.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any], triedHosts = triedHosts.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AchievedConsistency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AchievedConsistency] (val x: Self) extends AnyVal {
    
    inline def setAchievedConsistency(value: consistencies): Self = StObject.set(x, "achievedConsistency", value.asInstanceOf[js.Any])
    
    inline def setCustomPayload(value: Any): Self = StObject.set(x, "customPayload", value.asInstanceOf[js.Any])
    
    inline def setQueriedHost(value: String): Self = StObject.set(x, "queriedHost", value.asInstanceOf[js.Any])
    
    inline def setSpeculativeExecutions(value: Double): Self = StObject.set(x, "speculativeExecutions", value.asInstanceOf[js.Any])
    
    inline def setTraceId(value: Uuid): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    
    inline def setTriedHosts(value: StringDictionary[Any]): Self = StObject.set(x, "triedHosts", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
