package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendServerDescription extends js.Object {
  
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[typings.awsSdk.elbMod.InstancePort] = js.native
  
  /**
    * The names of the policies enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.native
}
object BackendServerDescription {
  
  @scala.inline
  def apply(): BackendServerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServerDescription]
  }
  
  @scala.inline
  implicit class BackendServerDescriptionOps[Self <: BackendServerDescription] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: InstancePort): Self = this.set("InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePort: Self = this.set("InstancePort", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("PolicyNames", js.undefined)
  }
}
