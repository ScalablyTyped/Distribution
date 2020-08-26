package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyVersion extends js.Object {
  /**
    * The date and time the policy was created.
    */
  var createDate: js.UndefOr[DateType] = js.native
  /**
    * Specifies whether the policy version is the default.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The policy version ID.
    */
  var versionId: js.UndefOr[PolicyVersionId] = js.native
}

object PolicyVersion {
  @scala.inline
  def apply(): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersion]
  }
  @scala.inline
  implicit class PolicyVersionOps[Self <: PolicyVersion] (val x: Self) extends AnyVal {
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
    def setCreateDate(value: DateType): Self = this.set("createDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("createDate", js.undefined)
    @scala.inline
    def setIsDefaultVersion(value: IsDefaultVersion): Self = this.set("isDefaultVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultVersion: Self = this.set("isDefaultVersion", js.undefined)
    @scala.inline
    def setVersionId(value: PolicyVersionId): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

