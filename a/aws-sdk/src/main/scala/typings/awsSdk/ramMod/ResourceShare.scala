package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShare extends js.Object {
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.native
  /**
    * The time when the resource share was created.
    */
  var creationTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates how the resource share was created. Possible values include:    CREATED_FROM_POLICY - Indicates that the resource share was created from an AWS Identity and Access Management (AWS IAM) policy attached to a resource. These resource shares are visible only to the AWS account that created it. They cannot be modified in AWS RAM.    PROMOTING_TO_STANDARD - The resource share is in the process of being promoted. For more information, see PromoteResourceShareCreatedFromPolicy.    STANDARD - Indicates that the resource share was created in AWS RAM using the console or APIs. These resource shares are visible to all principals. They can be modified in AWS RAM.  
    */
  var featureSet: js.UndefOr[ResourceShareFeatureSet] = js.native
  /**
    * The time when the resource share was last updated.
    */
  var lastUpdatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name of the resource share.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the resource share.
    */
  var owningAccountId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: js.UndefOr[String] = js.native
  /**
    * The status of the resource share.
    */
  var status: js.UndefOr[ResourceShareStatus] = js.native
  /**
    * A message about the status of the resource share.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The tags for the resource share.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object ResourceShare {
  @scala.inline
  def apply(): ResourceShare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShare]
  }
  @scala.inline
  implicit class ResourceShareOps[Self <: ResourceShare] (val x: Self) extends AnyVal {
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
    def setAllowExternalPrincipals(value: Boolean): Self = this.set("allowExternalPrincipals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExternalPrincipals: Self = this.set("allowExternalPrincipals", js.undefined)
    @scala.inline
    def setCreationTime(value: DateTime): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setFeatureSet(value: ResourceShareFeatureSet): Self = this.set("featureSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureSet: Self = this.set("featureSet", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: DateTime): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwningAccountId(value: String): Self = this.set("owningAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwningAccountId: Self = this.set("owningAccountId", js.undefined)
    @scala.inline
    def setResourceShareArn(value: String): Self = this.set("resourceShareArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceShareArn: Self = this.set("resourceShareArn", js.undefined)
    @scala.inline
    def setStatus(value: ResourceShareStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

