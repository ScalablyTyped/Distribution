package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneDriveUsers extends js.Object {
  
  /**
    * A list of users whose documents should be indexed. Specify the user names in email format, for example, username@tenantdomain. If you need to index the documents of more than 100 users, use the OneDriveUserS3Path field to specify the location of a file containing a list of users.
    */
  var OneDriveUserList: js.UndefOr[typings.awsSdk.kendraMod.OneDriveUserList] = js.native
  
  /**
    * The S3 bucket location of a file containing a list of users whose documents should be indexed.
    */
  var OneDriveUserS3Path: js.UndefOr[S3Path] = js.native
}
object OneDriveUsers {
  
  @scala.inline
  def apply(): OneDriveUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OneDriveUsers]
  }
  
  @scala.inline
  implicit class OneDriveUsersOps[Self <: OneDriveUsers] (val x: Self) extends AnyVal {
    
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
    def setOneDriveUserListVarargs(value: OneDriveUser*): Self = this.set("OneDriveUserList", js.Array(value :_*))
    
    @scala.inline
    def setOneDriveUserList(value: OneDriveUserList): Self = this.set("OneDriveUserList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveUserList: Self = this.set("OneDriveUserList", js.undefined)
    
    @scala.inline
    def setOneDriveUserS3Path(value: S3Path): Self = this.set("OneDriveUserS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDriveUserS3Path: Self = this.set("OneDriveUserS3Path", js.undefined)
  }
}
