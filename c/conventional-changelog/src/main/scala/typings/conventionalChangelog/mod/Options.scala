package typings.conventionalChangelog.mod

import typings.conventionalChangelogWriter.mod.Context
import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See the [conventional-changelog-core](https://github.com/conventional-changelog/conventional-changelog/tree/master/packages/conventional-changelog-core)
  * docs. The API is the same with the following changes or additions:
  */
@js.native
trait Options[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */]
  extends typings.conventionalChangelogCore.mod.Options[TCommit, TContext] {
  
  /**
    * It's recommended to use a preset so you don't have to define everything
    * yourself. Presets are names of built-in `config`.
    *
    * A scoped preset package such as `@scope/conventional-changelog-custom-preset`
    * can be used by passing `@scope/custom-preset` to this option.
    *
    * @remarks
    * `options.config` will be overwritten by the values of preset. You should use
    * either `preset` or `config`, but not both.
    */
  var preset: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */](): Options[TCommit, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[TCommit, TContext]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: Context */] (val x: Self with (Options[TCommit, TContext])) extends AnyVal {
    
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
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
  }
}
