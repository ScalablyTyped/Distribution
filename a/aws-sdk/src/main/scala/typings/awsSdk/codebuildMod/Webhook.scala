package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Webhook extends StObject {
  
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
  implicit class WebhookMutableBuilder[Self <: Webhook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchFilter(value: String): Self = StObject.set(x, "branchFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchFilterUndefined: Self = StObject.set(x, "branchFilter", js.undefined)
    
    @scala.inline
    def setBuildType(value: WebhookBuildType): Self = StObject.set(x, "buildType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildTypeUndefined: Self = StObject.set(x, "buildType", js.undefined)
    
    @scala.inline
    def setFilterGroups(value: FilterGroups): Self = StObject.set(x, "filterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterGroupsUndefined: Self = StObject.set(x, "filterGroups", js.undefined)
    
    @scala.inline
    def setFilterGroupsVarargs(value: FilterGroup*): Self = StObject.set(x, "filterGroups", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedSecret(value: Timestamp): Self = StObject.set(x, "lastModifiedSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedSecretUndefined: Self = StObject.set(x, "lastModifiedSecret", js.undefined)
    
    @scala.inline
    def setPayloadUrl(value: NonEmptyString): Self = StObject.set(x, "payloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUrlUndefined: Self = StObject.set(x, "payloadUrl", js.undefined)
    
    @scala.inline
    def setSecret(value: NonEmptyString): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    @scala.inline
    def setUrl(value: NonEmptyString): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
