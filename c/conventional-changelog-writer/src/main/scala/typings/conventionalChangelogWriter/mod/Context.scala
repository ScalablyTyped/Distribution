package typings.conventionalChangelogWriter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  /**
    * Commit keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'commits'
    */
  var commit: String = js.native
  
  /**
    * Default to formatted (`'yyyy-mm-dd'`) today's date. [dateformat](https://github.com/felixge/node-dateformat)
    * is used for formatting the date. If `version` is found in the last commit,
    * `committerDate` will overwrite this.
    *
    * @default
    * dateFormat(new Date(), 'yyyy-mm-dd', true)
    */
  var date: String = js.native
  
  /**
    * The hosting website. Eg: `'https://github.com'` or `'https://bitbucket.org'`.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * By default, this value is true if `version`'s patch is `0`.
    *
    * @default
    * semver.patch(context.version) !== 0
    */
  var isPatch: js.UndefOr[Boolean] = js.native
  
  /**
    * Issue or pull request keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'issues'
    */
  var issue: String = js.native
  
  /**
    * Should all references be linked?
    *
    * @defaults
    * `true` if (`context.repository` or `context.repoUrl`), `context.commit` and
    * `context.issue` are truthy.
    */
  var linkReferences: js.UndefOr[Boolean] = js.native
  
  /**
    * The owner of the repository. Eg: `'stevemao'`.
    */
  var owner: js.UndefOr[String] = js.native
  
  /**
    * The whole repository url. Eg: `'https://github.com/conventional-changelog/conventional-changelog-writer'`.
    * The should be used as a fallback when `context.repository` doesn't exist.
    */
  var repoUrl: js.UndefOr[String] = js.native
  
  /**
    * The repository name on `host`. Eg: `'conventional-changelog-writer'`.
    */
  var repository: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  /**
    * Version number of the up-coming release. If `version` is found in the last
    * commit before generating logs, it will be overwritten.
    */
  var version: js.UndefOr[String] = js.native
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
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssue(value: String): Self = this.set("issue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIsPatch(value: Boolean): Self = this.set("isPatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPatch: Self = this.set("isPatch", js.undefined)
    
    @scala.inline
    def setLinkReferences(value: Boolean): Self = this.set("linkReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkReferences: Self = this.set("linkReferences", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setRepoUrl(value: String): Self = this.set("repoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepoUrl: Self = this.set("repoUrl", js.undefined)
    
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
