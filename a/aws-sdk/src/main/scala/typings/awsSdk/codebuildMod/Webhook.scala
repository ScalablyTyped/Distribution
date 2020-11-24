package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webhook extends js.Object {
  
  /**
    * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.  It is recommended that you use filterGroups instead of branchFilter.  
    */
  var branchFilter: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of build this webhook will trigger.
    */
  var buildType: js.UndefOr[WebhookBuildType] = js.native
  
  /**
    * An array of arrays of WebhookFilter objects used to determine which webhooks are triggered. At least one WebhookFilter in the array must specify EVENT as its type.  For a build to be triggered, at least one filter group in the filterGroups array must pass. For a filter group to pass, each of its filters must pass. 
    */
  var filterGroups: js.UndefOr[FilterGroups] = js.native
  
  /**
    * A timestamp that indicates the last time a repository's secret token was modified. 
    */
  var lastModifiedSecret: js.UndefOr[Timestamp] = js.native
  
  /**
    * The AWS CodeBuild endpoint where webhook events are sent.
    */
  var payloadUrl: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The secret token of the associated repository.   A Bitbucket webhook does not support secret.  
    */
  var secret: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The URL to the webhook.
    */
  var url: js.UndefOr[NonEmptyString] = js.native
}
object Webhook {
  
  @scala.inline
  def apply(): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Webhook]
  }
  
  @scala.inline
  implicit class WebhookOps[Self <: Webhook] (val x: Self) extends AnyVal {
    
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
    def setBranchFilter(value: String): Self = this.set("branchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchFilter: Self = this.set("branchFilter", js.undefined)
    
    @scala.inline
    def setBuildType(value: WebhookBuildType): Self = this.set("buildType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildType: Self = this.set("buildType", js.undefined)
    
    @scala.inline
    def setFilterGroupsVarargs(value: FilterGroup*): Self = this.set("filterGroups", js.Array(value :_*))
    
    @scala.inline
    def setFilterGroups(value: FilterGroups): Self = this.set("filterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterGroups: Self = this.set("filterGroups", js.undefined)
    
    @scala.inline
    def setLastModifiedSecret(value: Timestamp): Self = this.set("lastModifiedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedSecret: Self = this.set("lastModifiedSecret", js.undefined)
    
    @scala.inline
    def setPayloadUrl(value: NonEmptyString): Self = this.set("payloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadUrl: Self = this.set("payloadUrl", js.undefined)
    
    @scala.inline
    def setSecret(value: NonEmptyString): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    
    @scala.inline
    def setUrl(value: NonEmptyString): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
