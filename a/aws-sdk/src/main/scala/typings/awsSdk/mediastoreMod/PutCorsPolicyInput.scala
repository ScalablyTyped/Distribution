package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutCorsPolicyInput extends js.Object {
  
  /**
    * The name of the container that you want to assign the CORS policy to.
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
  
  /**
    * The CORS policy to apply to the container. 
    */
  var CorsPolicy: typings.awsSdk.mediastoreMod.CorsPolicy = js.native
}
object PutCorsPolicyInput {
  
  @scala.inline
  def apply(ContainerName: ContainerName, CorsPolicy: CorsPolicy): PutCorsPolicyInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any], CorsPolicy = CorsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCorsPolicyInput]
  }
  
  @scala.inline
  implicit class PutCorsPolicyInputOps[Self <: PutCorsPolicyInput] (val x: Self) extends AnyVal {
    
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
    def setContainerName(value: ContainerName): Self = this.set("ContainerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsPolicyVarargs(value: CorsRule*): Self = this.set("CorsPolicy", js.Array(value :_*))
    
    @scala.inline
    def setCorsPolicy(value: CorsPolicy): Self = this.set("CorsPolicy", value.asInstanceOf[js.Any])
  }
}
