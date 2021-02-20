package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInfrastructureConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration to delete. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}
object DeleteInfrastructureConfigurationRequest {
  
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): DeleteInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInfrastructureConfigurationRequest]
  }
  
  @scala.inline
  implicit class DeleteInfrastructureConfigurationRequestMutableBuilder[Self <: DeleteInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
  }
}
