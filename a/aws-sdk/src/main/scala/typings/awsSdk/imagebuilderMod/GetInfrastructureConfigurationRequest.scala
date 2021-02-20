package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInfrastructureConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to retrieve. 
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn = js.native
}
object GetInfrastructureConfigurationRequest {
  
  @scala.inline
  def apply(infrastructureConfigurationArn: InfrastructureConfigurationArn): GetInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInfrastructureConfigurationRequest]
  }
  
  @scala.inline
  implicit class GetInfrastructureConfigurationRequestMutableBuilder[Self <: GetInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
  }
}
