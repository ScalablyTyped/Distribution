package typings.conventionalChangelogConfigSpec.schemaJsonMod

import typings.conventionalChangelogConfigSpec.schemaJsonMod.Config.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the configuration options supported by conventional-config for
  * upstream tooling.
  */
@js.native
trait Config_ extends js.Object {
  
  /**
    * A URL representing a specific commit at a hash.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/commit/{{hash}}"
    */
  var commitUrlFormat: js.UndefOr[String] = js.native
  
  /**
    * A URL representing the comparison between two git SHAs.
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/compare/{{previousTag}}...{{currentTag}}"
    */
  var compareUrlFormat: js.UndefOr[String] = js.native
  
  /**
    * A URL representing the issue format (allowing a different URL format to be
    * swapped in for Gitlab, Bitbucket, etc).
    *
    * @default
    * "{{host}}/{{owner}}/{{repository}}/issues/{{id}}"
    */
  var issueUrlFormat: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether or not the action being run (generating CHANGELOG,
    * recommendedBump, etc.) is being performed for a pre-major release (<1.0.0).
    *
    * This config setting will generally be set by tooling and not a user.
    *
    * @default
    * false
    */
  var preMajor: js.UndefOr[Boolean] = js.native
  
  /**
    * A string to be used to format the auto-generated release commit message.
    *
    * @default
    * "chore(release): {{currentTag}}"
    */
  var releaseCommitMessageFormat: js.UndefOr[String] = js.native
  
  /**
    * An array of `type` objects representing the explicitly supported commit
    * message types, and whether they should show up in generated `CHANGELOG`s.
    *
    * @default
    * [
    *     { "type": "feat", "section": "Features" },
    *     { "type": "fix", "section": "Bug Fixes" },
    *     { "type": "test", "section": "Tests" },
    *     { "type": "build", "section": "Build System" },
    *     { "type": "ci", "hidden": true }
    * ]
    */
  var types: js.UndefOr[js.Array[Type]] = js.native
  
  /**
    * A URL representing the a user's profile URL on GitHub, Gitlab, etc. This URL
    * is used for substituting @bcoe with https://github.com/bcoe in commit
    * messages.
    *
    * @default
    * "{{host}}/{{user}}"
    */
  var userUrlFormat: js.UndefOr[String] = js.native
}
object Config_ {
  
  @scala.inline
  def apply(): Config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config_]
  }
  
  @scala.inline
  implicit class Config_Ops[Self <: Config_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommitUrlFormat(value: String): Self = this.set("commitUrlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitUrlFormat: Self = this.set("commitUrlFormat", js.undefined)
    
    @scala.inline
    def setCompareUrlFormat(value: String): Self = this.set("compareUrlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareUrlFormat: Self = this.set("compareUrlFormat", js.undefined)
    
    @scala.inline
    def setIssueUrlFormat(value: String): Self = this.set("issueUrlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueUrlFormat: Self = this.set("issueUrlFormat", js.undefined)
    
    @scala.inline
    def setPreMajor(value: Boolean): Self = this.set("preMajor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreMajor: Self = this.set("preMajor", js.undefined)
    
    @scala.inline
    def setReleaseCommitMessageFormat(value: String): Self = this.set("releaseCommitMessageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseCommitMessageFormat: Self = this.set("releaseCommitMessageFormat", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: Type*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    
    @scala.inline
    def setUserUrlFormat(value: String): Self = this.set("userUrlFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserUrlFormat: Self = this.set("userUrlFormat", js.undefined)
  }
}
