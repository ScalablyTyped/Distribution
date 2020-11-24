package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInfrastructureConfigurationRequest extends js.Object {
  
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
  implicit class DeleteInfrastructureConfigurationRequestOps[Self <: DeleteInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = this.set("infrastructureConfigurationArn", value.asInstanceOf[js.Any])
  }
}
