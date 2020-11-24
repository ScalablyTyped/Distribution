package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlList extends js.Object {
  
  /**
    * Specifies whether the ACL grants the general public with read access permissions for the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.native
  
  /**
    * Specifies whether the ACL grants the general public with write access permissions for the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.native
}
object AccessControlList {
  
  @scala.inline
  def apply(): AccessControlList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlList]
  }
  
  @scala.inline
  implicit class AccessControlListOps[Self <: AccessControlList] (val x: Self) extends AnyVal {
    
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
    def setAllowsPublicReadAccess(value: boolean): Self = this.set("allowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicReadAccess: Self = this.set("allowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: boolean): Self = this.set("allowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicWriteAccess: Self = this.set("allowsPublicWriteAccess", js.undefined)
  }
}
