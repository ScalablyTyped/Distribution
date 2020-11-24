package typings.conventionalRecommendedBump.mod

import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalRecommendedBump.mod.Options.WhatBump
import typings.conventionalRecommendedBump.mod.Options.WhatBump.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `options` is an object with the following properties:
  * * `ignoreReverted`
  * * `preset`
  * * `config`
  * * `whatBump`
  */
@js.native
trait Options_ extends js.Object {
  
  /**
    * This should serve as default values for other arguments of
    * `conventional-recommended-bump` so you don't need to rewrite the same or
    * similar config across your projects.
    *
    * @remarks
    * `config` option will be overwritten by the value loaded by
    * `conventional-changelog-preset-loader` if the `preset` options is set.
    */
  var config: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
  ] = js.native
  
  /**
    * If `true`, reverted commits will be ignored.
    *
    * @default
    * true
    */
  var ignoreReverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the name of a package in a [Lerna](https://lernajs.io/)-managed
    * repository. The package name will be used when fetching all changes to a
    * package since the last time that package was released.
    *
    * For instance if your project contained a package named
    * `conventional-changelog`, you could have only commits that have happened
    * since the last release of `conventional-changelog` was tagged by
    * specifying `--lernaPackage=conventional-changelog` using the CLI, or
    * `conventional-changelog` as the value of the `lernaPackage` option.
    */
  var lernaPackage: js.UndefOr[String] = js.native
  
  /**
    * It's recommended to use a preset so you don't have to define everything
    * yourself.
    *
    * The value is passed to [`conventional-changelog-preset-loader`](https://www.npmjs.com/package/conventional-changelog-preset-loader).
    */
  var preset: js.UndefOr[String] = js.native
  
  /**
    * Specify a prefix for the git tag that will be taken into account during the
    * comparison.
    *
    * For instance if your version tag is prefixed by `version/` instead of `v` you
    * would specifying `--tagPrefix=version/` using the CLI, or `version/` as the
    * value of the `tagPrefix` option.
    */
  var tagPrefix: js.UndefOr[String] = js.native
  
  /**
    * A function that takes parsed commits as an argument.
    *
    * ```
    * whatBump(commits) {};
    * ```
    *
    * `commits` is an array of all commits from last semver tag to `HEAD` as parsed
    * by `conventional-commits-parser`.
    *
    * This should return an object including but not limited to `level` and `reason`.
    * `level` is a `number` indicating what bump it should be and `reason` is the
    * reason of such release.
    */
  var whatBump: js.UndefOr[WhatBump] = js.native
}
object Options_ {
  
  @scala.inline
  def apply(): Options_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_]
  }
  
  @scala.inline
  implicit class Options_Ops[Self <: Options_] (val x: Self) extends AnyVal {
    
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
    def setConfig(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any
    ): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setIgnoreReverted(value: Boolean): Self = this.set("ignoreReverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreReverted: Self = this.set("ignoreReverted", js.undefined)
    
    @scala.inline
    def setLernaPackage(value: String): Self = this.set("lernaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLernaPackage: Self = this.set("lernaPackage", js.undefined)
    
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    
    @scala.inline
    def setTagPrefix(value: String): Self = this.set("tagPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagPrefix: Self = this.set("tagPrefix", js.undefined)
    
    @scala.inline
    def setWhatBump(value: /* commits */ js.Array[Commit[String | Double | js.Symbol]] => Result): Self = this.set("whatBump", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWhatBump: Self = this.set("whatBump", js.undefined)
  }
}
