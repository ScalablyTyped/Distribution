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
  def apply(): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPolicy]
  }
  @scala.inline
  implicit class RetentionPolicyOps[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
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
    def setHomeEfsFileSystem(value: RetentionType): Self = this.set("HomeEfsFileSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomeEfsFileSystem: Self = this.set("HomeEfsFileSystem", js.undefined)
  }
  
}

