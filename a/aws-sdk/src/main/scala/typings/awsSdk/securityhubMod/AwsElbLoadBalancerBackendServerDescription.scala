package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerBackendServerDescription extends js.Object {
  
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[Integer] = js.native
  
  /**
    * The names of the policies that are enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[StringList] = js.native
}
object AwsElbLoadBalancerBackendServerDescription {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerBackendServerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerBackendServerDescription]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerBackendServerDescriptionOps[Self <: AwsElbLoadBalancerBackendServerDescription] (val x: Self) extends AnyVal {
    
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
    def setInstancePort(value: Integer): Self = this.set("InstancePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstancePort: Self = this.set("InstancePort", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: NonEmptyString*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: StringList): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("PolicyNames", js.undefined)
  }
}
