package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: String
  
  /**
    * The connection type used for connecting to an Amazon EC2 environment. CONNECT_SSH is selected by default.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.undefined
  
  /**
    * The description for the environment.
    */
  var description: js.UndefOr[EnvironmentDescription] = js.undefined
  
  /**
    * The ID of the environment.
    */
  var id: js.UndefOr[EnvironmentId] = js.undefined
  
  /**
    * The state of the environment in its creation or deletion lifecycle.
    */
  var lifecycle: js.UndefOr[EnvironmentLifecycle] = js.undefined
  
  /**
    * Describes the status of Amazon Web Services managed temporary credentials for the Cloud9 environment. Available values are:    ENABLED_ON_CREATE     ENABLED_BY_OWNER     DISABLED_BY_DEFAULT     DISABLED_BY_OWNER     DISABLED_BY_COLLABORATOR     PENDING_REMOVAL_BY_COLLABORATOR     PENDING_REMOVAL_BY_OWNER     FAILED_REMOVAL_BY_COLLABORATOR     ENABLED_BY_OWNER     DISABLED_BY_DEFAULT   
    */
  var managedCredentialsStatus: js.UndefOr[ManagedCredentialsStatus] = js.undefined
  
  /**
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the environment owner.
    */
  var ownerArn: String
  
  /**
    * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
    */
  var `type`: EnvironmentType
}
object Environment {
  
  inline def apply(arn: String, ownerArn: String, `type`: EnvironmentType): Environment = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], ownerArn = ownerArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    inline def setDescription(value: EnvironmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: EnvironmentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLifecycle(value: EnvironmentLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setManagedCredentialsStatus(value: ManagedCredentialsStatus): Self = StObject.set(x, "managedCredentialsStatus", value.asInstanceOf[js.Any])
    
    inline def setManagedCredentialsStatusUndefined: Self = StObject.set(x, "managedCredentialsStatus", js.undefined)
    
    inline def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerArn(value: String): Self = StObject.set(x, "ownerArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: EnvironmentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
