package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesReplicationRuleMod.ReplicationRule
import typings.awsSdkClientS3Browser.typesReplicationRuleMod.UnmarshalledReplicationRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationConfigurationMod {
  
  trait ReplicationConfiguration extends StObject {
    
    /**
      * <p>Amazon Resource Name (ARN) of an IAM role for Amazon S3 to assume when replicating the objects.</p>
      */
    var Role: String
    
    /**
      * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
      */
    var Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]
  }
  object ReplicationConfiguration {
    
    inline def apply(Role: String, Rules: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]): ReplicationConfiguration = {
      val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationConfiguration]
    }
    
    extension [Self <: ReplicationConfiguration](x: Self) {
      
      inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      inline def setRules(value: js.Array[ReplicationRule] | js.Iterable[ReplicationRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: ReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
  
  trait UnmarshalledReplicationConfiguration
    extends StObject
       with ReplicationConfiguration {
    
    /**
      * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledReplicationConfiguration: js.Array[UnmarshalledReplicationRule]
  }
  object UnmarshalledReplicationConfiguration {
    
    inline def apply(Role: String, Rules: js.Array[UnmarshalledReplicationRule]): UnmarshalledReplicationConfiguration = {
      val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicationConfiguration]
    }
    
    extension [Self <: UnmarshalledReplicationConfiguration](x: Self) {
      
      inline def setRules(value: js.Array[UnmarshalledReplicationRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: UnmarshalledReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
    }
  }
}
