package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerServiceDeploymentsResult extends js.Object {
  
  /**
    * An array of objects that describe deployments for a container service.
    */
  var deployments: js.UndefOr[ContainerServiceDeploymentList] = js.native
}
object GetContainerServiceDeploymentsResult {
  
  @scala.inline
  def apply(): GetContainerServiceDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServiceDeploymentsResult]
  }
  
  @scala.inline
  implicit class GetContainerServiceDeploymentsResultOps[Self <: GetContainerServiceDeploymentsResult] (val x: Self) extends AnyVal {
    
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
    def setDeploymentsVarargs(value: ContainerServiceDeployment*): Self = this.set("deployments", js.Array(value :_*))
    
    @scala.inline
    def setDeployments(value: ContainerServiceDeploymentList): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployments: Self = this.set("deployments", js.undefined)
  }
}
