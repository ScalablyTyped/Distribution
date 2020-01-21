package typings.conventionalChangelogWriter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /**
    * Commit keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'commits'
    */
  var commit: String
  /**
    * Default to formatted (`'yyyy-mm-dd'`) today's date. [dateformat](https://github.com/felixge/node-dateformat)
    * is used for formatting the date. If `version` is found in the last commit,
    * `committerDate` will overwrite this.
    *
    * @default
    * dateFormat(new Date(), 'yyyy-mm-dd', true)
    */
  var date: String
  /**
    * The hosting website. Eg: `'https://github.com'` or `'https://bitbucket.org'`.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * By default, this value is true if `version`'s patch is `0`.
    *
    * @default
    * semver.patch(context.version) !== 0
    */
  var isPatch: js.UndefOr[Boolean] = js.undefined
  /**
    * Issue or pull request keyword in the url if `context.linkReferences === true`.
    *
    * @default
    * 'issues'
    */
  var issue: String
  /**
    * Should all references be linked?
    *
    * @defaults
    * `true` if (`context.repository` or `context.repoUrl`), `context.commit` and
    * `context.issue` are truthy.
    */
  var linkReferences: js.UndefOr[Boolean] = js.undefined
  /**
    * The owner of the repository. Eg: `'stevemao'`.
    */
  var owner: js.UndefOr[String] = js.undefined
  /**
    * The whole repository url. Eg: `'https://github.com/conventional-changelog/conventional-changelog-writer'`.
    * The should be used as a fallback when `context.repository` doesn't exist.
    */
  var repoUrl: js.UndefOr[String] = js.undefined
  /**
    * The repository name on `host`. Eg: `'conventional-changelog-writer'`.
    */
  var repository: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  /**
    * Version number of the up-coming release. If `version` is found in the last
    * commit before generating logs, it will be overwritten.
    */
  var version: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(
    commit: String,
    date: String,
    issue: String,
    host: String = null,
    isPatch: js.UndefOr[Boolean] = js.undefined,
    linkReferences: js.UndefOr[Boolean] = js.undefined,
    owner: String = null,
    repoUrl: String = null,
    repository: String = null,
    title: String = null,
    version: String = null
  ): Context = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(isPatch)) __obj.updateDynamic("isPatch")(isPatch.asInstanceOf[js.Any])
    if (!js.isUndefined(linkReferences)) __obj.updateDynamic("linkReferences")(linkReferences.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (repoUrl != null) __obj.updateDynamic("repoUrl")(repoUrl.asInstanceOf[js.Any])
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

