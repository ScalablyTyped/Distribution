package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyToPath extends js.Object {
  
  /**
    * The path that is referenced from the root.
    */
  var Path: js.UndefOr[PathString] = js.native
  
  /**
    * List of policy objects.
    */
  var Policies: js.UndefOr[PolicyAttachmentList] = js.native
}
object PolicyToPath {
  
  @scala.inline
  def apply(): PolicyToPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyToPath]
  }
  
  @scala.inline
  implicit class PolicyToPathOps[Self <: PolicyToPath] (val x: Self) extends AnyVal {
    
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
    def setPath(value: PathString): Self = this.set("Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("Path", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: PolicyAttachment*): Self = this.set("Policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: PolicyAttachmentList): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
  }
}
