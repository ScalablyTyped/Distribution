package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlList extends js.Object {
  
  /**
    * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.native
  
  /**
    * A value that indicates whether public write access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.native
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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowsPublicReadAccess(value: Boolean): Self = this.set("AllowsPublicReadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicReadAccess: Self = this.set("AllowsPublicReadAccess", js.undefined)
    
    @scala.inline
    def setAllowsPublicWriteAccess(value: Boolean): Self = this.set("AllowsPublicWriteAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowsPublicWriteAccess: Self = this.set("AllowsPublicWriteAccess", js.undefined)
  }
}
