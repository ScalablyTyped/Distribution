package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that Amazon S3 assumes when replicating objects. For more information, see How to Set Up Replication in the Amazon S3 User Guide.
    */
  var Role: typings.awsSdk2Types.clientsS3Mod.Role
  
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and can contain a maximum of 1,000 rules. 
    */
  var Rules: ReplicationRules
}
object ReplicationConfiguration {
  
  inline def apply(Role: Role, Rules: ReplicationRules): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRules(value: ReplicationRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
