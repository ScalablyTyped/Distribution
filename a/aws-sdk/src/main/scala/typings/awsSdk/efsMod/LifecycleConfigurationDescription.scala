package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LifecycleConfigurationDescription extends js.Object {
  
  /**
    * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typings.awsSdk.efsMod.LifecyclePolicies] = js.native
}
object LifecycleConfigurationDescription {
  
  @scala.inline
  def apply(): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
  
  @scala.inline
  implicit class LifecycleConfigurationDescriptionOps[Self <: LifecycleConfigurationDescription] (val x: Self) extends AnyVal {
    
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
    def setLifecyclePoliciesVarargs(value: LifecyclePolicy*): Self = this.set("LifecyclePolicies", js.Array(value :_*))
    
    @scala.inline
    def setLifecyclePolicies(value: LifecyclePolicies): Self = this.set("LifecyclePolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifecyclePolicies: Self = this.set("LifecyclePolicies", js.undefined)
  }
}
