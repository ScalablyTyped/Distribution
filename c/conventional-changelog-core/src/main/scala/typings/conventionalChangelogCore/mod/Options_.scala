package typings.conventionalChangelogCore.mod

import typings.conventionalChangelogCore.mod.Options.Config
import typings.conventionalChangelogCore.mod.Options.Logger
import typings.conventionalChangelogCore.mod.Options.Pkg
import typings.conventionalChangelogCore.mod.Options.Transform
import typings.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options_[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] extends js.Object {
  
  /**
    * Should the log be appended to existing data.
    *
    * @default
    * false
    */
  var append: js.UndefOr[Boolean] = js.native
  
  /**
    * This should serve as default values for other arguments of
    * `conventionalChangelogCore` so you don't need to rewrite the same or similar
    * config across your projects. Any value in this could be overwritten. If this
    * is a promise (recommended if async), it should resolve with the config. If
    * this is a function, it expects a node style callback with the config object.
    * If this is an object, it is the config object. The config object should
    * include `context`, `gitRawCommitsOpts`, `parserOpts` and `writerOpts`.
    */
  var config: js.UndefOr[Config[TCommit, TContext]] = js.native
  
  /**
    * A debug function. EG: `console.debug.bind(console)`.
    *
    * @default
    * function () {}
    */
  var debug: js.UndefOr[Logger] = js.native
  
  /**
    * Specify a package in lerna-style monorepo that the CHANGELOG should be
    * generated for.
    *
    * Lerna tags releases in the format `foo-package@1.0.0` and assumes that
    * packages are stored in the directory structure `./packages/foo-package`.
    *
    * @default
    * null
    */
  var lernaPackage: js.UndefOr[String | Null] = js.native
  
  /**
    * If this value is `true` and `context.version` equals last release then
    * `context.version` will be changed to `'Unreleased'`.
    *
    * @remarks
    * You may want to combine this option with `releaseCount` set to `0` to always
    * overwrite the whole CHANGELOG. `conventional-changelog` only outputs a
    * CHANGELOG but doesn't read any existing one.
    *
    * @defaults
    * `true` if a different version than last release is given. Otherwise `false`.
    */
  var outputUnreleased: js.UndefOr[Boolean] = js.native
  
  var pkg: js.UndefOr[Pkg] = js.native
  
  /**
    * How many releases of changelog you want to generate. It counts from the
    * upcoming release. Useful when you forgot to generate any previous changelog.
    * Set to `0` to regenerate all.
    *
    * @default
    * 1
    */
  var releaseCount: js.UndefOr[Double] = js.native
  
  /**
    * Specify a prefix for the git tag that will be taken into account during the
    * comparison. For instance if your version tag is prefixed by `version/`
    * instead of `v` you would specify `--tagPrefix=version/`.
    */
  var tagPrefix: js.UndefOr[String] = js.native
  
  /**
    * A transform function that applies after the parser and before the writer.
    *
    * This is the place to modify the parsed commits.
    */
  var transform: js.UndefOr[Transform[TCommit]] = js.native
  
  /**
    * A warn function. EG: `grunt.verbose.writeln`.
    *
    * @default
    * options.debug
    */
  var warn: js.UndefOr[Logger] = js.native
}
object Options_ {
  
  @scala.inline
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */](): Options_[TCommit, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_[TCommit, TContext]]
  }
  
  @scala.inline
  implicit class Options_Ops[Self <: Options_[_, _], TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typings.conventionalChangelogWriter.mod.Context */] (val x: Self with (Options_[TCommit, TContext])) extends AnyVal {
    
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
    def setAppend(value: Boolean): Self = this.set("append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppend: Self = this.set("append", js.undefined)
    
    @scala.inline
    def setConfig(value: Config[TCommit, TContext]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDebug(value: /* message */ js.UndefOr[js.Any] => Unit): Self = this.set("debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setLernaPackage(value: String): Self = this.set("lernaPackage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLernaPackage: Self = this.set("lernaPackage", js.undefined)
    
    @scala.inline
    def setLernaPackageNull: Self = this.set("lernaPackage", null)
    
    @scala.inline
    def setOutputUnreleased(value: Boolean): Self = this.set("outputUnreleased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUnreleased: Self = this.set("outputUnreleased", js.undefined)
    
    @scala.inline
    def setPkg(value: Pkg): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setReleaseCount(value: Double): Self = this.set("releaseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseCount: Self = this.set("releaseCount", js.undefined)
    
    @scala.inline
    def setTagPrefix(value: String): Self = this.set("tagPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagPrefix: Self = this.set("tagPrefix", js.undefined)
    
    @scala.inline
    def setTransform(value: Transform[TCommit]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setWarn(value: /* message */ js.UndefOr[js.Any] => Unit): Self = this.set("warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}
