package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlListConfiguration extends js.Object {
  /**
    * Path to the AWS S3 bucket that contains the ACL files.
    */
  var KeyPath: js.UndefOr[S3ObjectKey] = js.native
}

object AccessControlListConfiguration {
  @scala.inline
  def apply(): AccessControlListConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessControlListConfiguration]
  }
  @scala.inline
  implicit class AccessControlListConfigurationOps[Self <: AccessControlListConfiguration] (val x: Self) extends AnyVal {
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
    def setKeyPath(value: S3ObjectKey): Self = this.set("KeyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPath: Self = this.set("KeyPath", js.undefined)
  }
  
}

