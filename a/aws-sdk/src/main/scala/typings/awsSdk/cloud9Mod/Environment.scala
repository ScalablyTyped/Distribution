package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The connection type used for connecting to an Amazon EC2 environment.
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
    * The name of the environment.
    */
  var name: js.UndefOr[EnvironmentName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the environment owner.
    */
  var ownerArn: js.UndefOr[String] = js.undefined
  
  /**
    * The type of environment. Valid values include the following:    ec2: An Amazon Elastic Compute Cloud (Amazon EC2) instance connects to the environment.    ssh: Your own server connects to the environment.  
    */
  var `type`: js.UndefOr[EnvironmentType] = js.undefined
}
object Environment {
  
  @scala.inline
  def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  @scala.inline
  implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
    
    @scala.inline
    def setDescription(value: EnvironmentDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: EnvironmentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLifecycle(value: EnvironmentLifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setName(value: EnvironmentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwnerArn(value: String): Self = StObject.set(x, "ownerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerArnUndefined: Self = StObject.set(x, "ownerArn", js.undefined)
    
    @scala.inline
    def setType(value: EnvironmentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
