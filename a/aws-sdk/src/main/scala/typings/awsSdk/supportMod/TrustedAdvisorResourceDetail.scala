package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrustedAdvisorResourceDetail extends js.Object {
  /**
    * Specifies whether the AWS resource was ignored by Trusted Advisor because it was marked as suppressed by the user.
    */
  var isSuppressed: js.UndefOr[Boolean] = js.native
  /**
    * Additional information about the identified resource. The exact metadata and its order can be obtained by inspecting the TrustedAdvisorCheckDescription object returned by the call to DescribeTrustedAdvisorChecks. Metadata contains all the data that is shown in the Excel download, even in those cases where the UI shows just summary data.
    */
  var metadata: StringList = js.native
  /**
    * The AWS region in which the identified resource is located.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * The unique identifier for the identified resource.
    */
  var resourceId: String = js.native
  /**
    * The status code for the resource identified in the Trusted Advisor check.
    */
  var status: String = js.native
}

object TrustedAdvisorResourceDetail {
  @scala.inline
  def apply(metadata: StringList, resourceId: String, status: String): TrustedAdvisorResourceDetail = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedAdvisorResourceDetail]
  }
  @scala.inline
  implicit class TrustedAdvisorResourceDetailOps[Self <: TrustedAdvisorResourceDetail] (val x: Self) extends AnyVal {
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
    def setMetadataVarargs(value: String*): Self = this.set("metadata", js.Array(value :_*))
    @scala.inline
    def setMetadata(value: StringList): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSuppressed(value: Boolean): Self = this.set("isSuppressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSuppressed: Self = this.set("isSuppressed", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

