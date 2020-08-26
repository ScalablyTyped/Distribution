package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilter extends js.Object {
  /**
    *  Used to indicate that the pattern determines which webhook events do not trigger a build. If true, then a webhook event that does not match the pattern triggers a build. If false, then a webhook event that matches the pattern triggers a build. 
    */
  var excludeMatchedPattern: js.UndefOr[WrapperBoolean] = js.native
  /**
    *  For a WebHookFilter that uses EVENT type, a comma-separated string that specifies one or more events. For example, the webhook filter PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED allows all push, pull request created, and pull request updated events to trigger a build.   For a WebHookFilter that uses any of the other filter types, a regular expression pattern. For example, a WebHookFilter that uses HEAD_REF for its type and the pattern ^refs/heads/ triggers a build when the head reference is a branch with a reference name refs/heads/branch-name. 
    */
  var pattern: String = js.native
  /**
    *  The type of webhook filter. There are six webhook filter types: EVENT, ACTOR_ACCOUNT_ID, HEAD_REF, BASE_REF, FILE_PATH, and COMMIT_MESSAGE.    EVENT    A webhook event triggers a build when the provided pattern matches one of five event types: PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED, PULL_REQUEST_REOPENED, and PULL_REQUEST_MERGED. The EVENT patterns are specified as a comma-separated string. For example, PUSH, PULL_REQUEST_CREATED, PULL_REQUEST_UPDATED filters all push, pull request created, and pull request updated events.    The PULL_REQUEST_REOPENED works with GitHub and GitHub Enterprise only.     ACTOR_ACCOUNT_ID    A webhook event triggers a build when a GitHub, GitHub Enterprise, or Bitbucket account ID matches the regular expression pattern.    HEAD_REF    A webhook event triggers a build when the head reference matches the regular expression pattern. For example, refs/heads/branch-name and refs/tags/tag-name.   Works with GitHub and GitHub Enterprise push, GitHub and GitHub Enterprise pull request, Bitbucket push, and Bitbucket pull request events.    BASE_REF    A webhook event triggers a build when the base reference matches the regular expression pattern. For example, refs/heads/branch-name.    Works with pull request events only.     FILE_PATH    A webhook triggers a build when the path of a changed file matches the regular expression pattern.    Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.    COMMIT_MESSAGE  A webhook triggers a build when the head commit message matches the regular expression pattern.   Works with GitHub and Bitbucket events push and pull requests events. Also works with GitHub Enterprise push events, but does not work with GitHub Enterprise pull request events.    
    */
  var `type`: WebhookFilterType = js.native
}

object WebhookFilter {
  @scala.inline
  def apply(pattern: String, `type`: WebhookFilterType): WebhookFilter = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
  @scala.inline
  implicit class WebhookFilterOps[Self <: WebhookFilter] (val x: Self) extends AnyVal {
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
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WebhookFilterType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcludeMatchedPattern(value: WrapperBoolean): Self = this.set("excludeMatchedPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeMatchedPattern: Self = this.set("excludeMatchedPattern", js.undefined)
  }
  
}

