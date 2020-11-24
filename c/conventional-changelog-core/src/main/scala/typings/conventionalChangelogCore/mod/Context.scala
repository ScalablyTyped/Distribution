package typings.conventionalChangelogCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context
  extends typings.conventionalChangelogWriter.mod.Context {
  
  /**
    * @defaults
    * Current semver tag or `'v'` + version if no current tag.
    */
  var currentTag: js.UndefOr[String] = js.native
  
  /**
    * Should link to the page that compares current tag with previous tag?
    *
    * @defaults
    * `true` if `previousTag` and `currentTag` are truthy.
    */
  var linkCompare: js.UndefOr[Boolean] = js.native
  
  /**
    * @defaults
    * Previous semver tag or the first commit hash if no previous tag.
    */
  var previousTag: js.UndefOr[String] = js.native
}
object Context {
  
  @scala.inline
  def apply(commit: String, date: String, issue: String): Context = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setCurrentTag(value: String): Self = this.set("currentTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTag: Self = this.set("currentTag", js.undefined)
    
    @scala.inline
    def setLinkCompare(value: Boolean): Self = this.set("linkCompare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkCompare: Self = this.set("linkCompare", js.undefined)
    
    @scala.inline
    def setPreviousTag(value: String): Self = this.set("previousTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousTag: Self = this.set("previousTag", js.undefined)
  }
}
