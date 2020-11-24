package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentResult extends js.Object {
  
  /**
    * The deployment ID, which can be used with other requests to identify the deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
}
object CreateDeploymentResult {
  
  @scala.inline
  def apply(): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  
  @scala.inline
  implicit class CreateDeploymentResultOps[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeploymentId(value: String): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
  }
}
