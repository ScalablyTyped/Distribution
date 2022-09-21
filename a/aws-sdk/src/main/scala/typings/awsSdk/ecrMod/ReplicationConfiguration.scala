package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfiguration extends StObject {
  
  /**
    * An array of objects representing the replication destinations and repository filters for a replication configuration.
    */
  var rules: ReplicationRuleList
}
object ReplicationConfiguration {
  
  inline def apply(rules: ReplicationRuleList): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  
  extension [Self <: ReplicationConfiguration](x: Self) {
    
    inline def setRules(value: ReplicationRuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ReplicationRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
