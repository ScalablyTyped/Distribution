package typings.conventionalChangelogCore.mod

import typings.gitRawCommits.mod.GitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Please check the available options at http://git-scm.com/docs/git-log.
  *
  * There are some defaults:
  *
  * @remarks
  * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
  *
  * @remarks
  * For `<revision range>` we can also use `<from>..<to>` pattern, and this
  * module has the following extra options for shortcut of this pattern:
  *
  * * `from`
  * * `to`
  *
  * This module also have the following additions:
  *
  * * `format`
  * * `debug`
  * * `path`
  */
@js.native
trait GitRawCommitsOptions extends GitOptions {
  
  /**
    * @defaults
    * `true` if `options.append` is truthy.
    */
  var reverse: js.UndefOr[Boolean] = js.native
}
object GitRawCommitsOptions {
  
  @scala.inline
  def apply(): GitRawCommitsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GitRawCommitsOptions]
  }
  
  @scala.inline
  implicit class GitRawCommitsOptionsOps[Self <: GitRawCommitsOptions] (val x: Self) extends AnyVal {
    
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
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
