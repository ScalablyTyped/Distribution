package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesReplicationRuleMod.ReplicationRule
import typings.awsSdkClientS3Browser.typesReplicationRuleMod.UnmarshalledReplicationRule
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReplicationConfigurationMod {
  
  @js.native
  trait ReplicationConfiguration extends StObject {
    
    /**
      * <p>Amazon Resource Name (ARN) of an IAM role for Amazon S3 to assume when replicating the objects.</p>
      */
    var Role: String = js.native
    
    /**
      * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
      */
    var Rules: js.Array[ReplicationRule] | Iterable[ReplicationRule] = js.native
  }
  object ReplicationConfiguration {
    
    @scala.inline
    def apply(Role: String, Rules: js.Array[ReplicationRule] | Iterable[ReplicationRule]): ReplicationConfiguration = {
      val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplicationConfiguration]
    }
    
    @scala.inline
    implicit class ReplicationConfigurationMutableBuilder[Self <: ReplicationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRules(value: js.Array[ReplicationRule] | Iterable[ReplicationRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: ReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledReplicationConfiguration extends ReplicationConfiguration {
    
    /**
      * <p>Container for one or more replication rules. Replication configuration must have at least one rule and can contain up to 1,000 rules. </p>
      */
    @JSName("Rules")
    var Rules_UnmarshalledReplicationConfiguration: js.Array[UnmarshalledReplicationRule] = js.native
  }
  object UnmarshalledReplicationConfiguration {
    
    @scala.inline
    def apply(Role: String, Rules: js.Array[UnmarshalledReplicationRule]): UnmarshalledReplicationConfiguration = {
      val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledReplicationConfiguration]
    }
    
    @scala.inline
    implicit class UnmarshalledReplicationConfigurationMutableBuilder[Self <: UnmarshalledReplicationConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRules(value: js.Array[UnmarshalledReplicationRule]): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulesVarargs(value: UnmarshalledReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
    }
  }
}
