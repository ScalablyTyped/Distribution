package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDescription extends js.Object {
  
  /**
    * The listener.
    */
  var Listener: js.UndefOr[typings.awsSdk.elbMod.Listener] = js.native
  
  /**
    * The policies. If there are no policies enabled, the list is empty.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.native
}
object ListenerDescription {
  
  @scala.inline
  def apply(): ListenerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerDescription]
  }
  
  @scala.inline
  implicit class ListenerDescriptionOps[Self <: ListenerDescription] (val x: Self) extends AnyVal {
    
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
    def setListener(value: Listener): Self = this.set("Listener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListener: Self = this.set("Listener", js.undefined)
    
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = this.set("PolicyNames", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNames: Self = this.set("PolicyNames", js.undefined)
  }
}
