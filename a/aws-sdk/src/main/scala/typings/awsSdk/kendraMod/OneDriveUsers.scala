package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(OneDriveUserList: OneDriveUserList = null, OneDriveUserS3Path: S3Path = null): OneDriveUsers = {
    val __obj = js.Dynamic.literal()
    if (OneDriveUserList != null) __obj.updateDynamic("OneDriveUserList")(OneDriveUserList.asInstanceOf[js.Any])
    if (OneDriveUserS3Path != null) __obj.updateDynamic("OneDriveUserS3Path")(OneDriveUserS3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneDriveUsers]
  }
}

