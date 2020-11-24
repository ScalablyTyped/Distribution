package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStatus extends js.Object {
  
  /**
    * 
    */
  var IsPublic: js.UndefOr[typings.awsSdk.s3controlMod.IsPublic] = js.native
}
object PolicyStatus {
  
  @scala.inline
  def apply(): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyStatus]
  }
  
  @scala.inline
  implicit class PolicyStatusOps[Self <: PolicyStatus] (val x: Self) extends AnyVal {
    
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
    def setIsPublic(value: IsPublic): Self = this.set("IsPublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPublic: Self = this.set("IsPublic", js.undefined)
  }
}
