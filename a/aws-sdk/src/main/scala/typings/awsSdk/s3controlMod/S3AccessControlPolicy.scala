package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3AccessControlPolicy extends js.Object {
  
  /**
    * 
    */
  var AccessControlList: js.UndefOr[S3AccessControlList] = js.native
  
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.native
}
object S3AccessControlPolicy {
  
  @scala.inline
  def apply(): S3AccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3AccessControlPolicy]
  }
  
  @scala.inline
  implicit class S3AccessControlPolicyOps[Self <: S3AccessControlPolicy] (val x: Self) extends AnyVal {
    
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
    def setAccessControlList(value: S3AccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessControlList: Self = this.set("AccessControlList", js.undefined)
    
    @scala.inline
    def setCannedAccessControlList(value: S3CannedAccessControlList): Self = this.set("CannedAccessControlList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCannedAccessControlList: Self = this.set("CannedAccessControlList", js.undefined)
  }
}
