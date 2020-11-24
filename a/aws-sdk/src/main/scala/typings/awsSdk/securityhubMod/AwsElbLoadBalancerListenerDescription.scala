package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElbLoadBalancerListenerDescription extends js.Object {
  
  /**
    * Information about the listener.
    */
  var Listener: js.UndefOr[AwsElbLoadBalancerListener] = js.native
  
  /**
    * The policies enabled for the listener.
    */
  var PolicyNames: js.UndefOr[StringList] = js.native
}
object AwsElbLoadBalancerListenerDescription {
  
  @scala.inline
  def apply(): AwsElbLoadBalancerListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElbLoadBalancerListenerDescription]
  }
  
  @scala.inline
  implicit class AwsElbLoadBalancerListenerDescriptionOps[Self <: AwsElbLoadBalancerListenerDescription] (val x: Self) extends AnyVal {
    
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
    def setListener(value: AwsElbLoadBalancerListener): Self = this.set("Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListener: Self = this.set("Listener", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: NonEmptyString*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: StringList): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("PolicyNames", js.undefined)
  }
}
