package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in the associated environment account. It determines the scope of infrastructure that a component can provision in the account. The environment account connection must have a componentRoleArn to allow directly defined components to be associated with any environments running in the account. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the environment account connection to update.
    */
  var id: EnvironmentAccountConnectionId
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that's associated with the environment account connection to update.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
}
object UpdateEnvironmentAccountConnectionInput {
  
  inline def apply(id: EnvironmentAccountConnectionId): UpdateEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: UpdateEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
