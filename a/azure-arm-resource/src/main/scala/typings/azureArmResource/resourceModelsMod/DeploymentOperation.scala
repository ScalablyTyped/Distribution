package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentOperation extends js.Object {
  
  /**
    * Full deployment operation ID.
    */
  val id: js.UndefOr[String] = js.native
  
  /**
    * Deployment operation ID.
    */
  val operationId: js.UndefOr[String] = js.native
  
  /**
    * Deployment properties.
    */
  var properties: js.UndefOr[DeploymentOperationProperties] = js.native
}
object DeploymentOperation {
  
  @scala.inline
  def apply(): DeploymentOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentOperation]
  }
  
  @scala.inline
  implicit class DeploymentOperationOps[Self <: DeploymentOperation] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setProperties(value: DeploymentOperationProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
