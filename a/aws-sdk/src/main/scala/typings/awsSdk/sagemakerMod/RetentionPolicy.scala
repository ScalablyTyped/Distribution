package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionPolicy extends js.Object {
  /**
    * The default is Retain, which specifies to keep the data stored on the EFS volume. Specify Delete to delete the data stored on the EFS volume.
    */
  var HomeEfsFileSystem: js.UndefOr[RetentionType] = js.native
}

object RetentionPolicy {
  @scala.inline
  def apply(HomeEfsFileSystem: RetentionType = null): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    if (HomeEfsFileSystem != null) __obj.updateDynamic("HomeEfsFileSystem")(HomeEfsFileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionPolicy]
  }
}

