package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyStatus extends js.Object {
  
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[typings.awsSdk.s3Mod.IsPublic] = js.native
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
