package typings.conventionalRecommendedBump.mod

import typings.conventionalCommitsParser.mod.Commit
import typings.conventionalRecommendedBump.mod.Options.WhatBump
import typings.conventionalRecommendedBump.mod.Options.WhatBump.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `options` is an object with the following properties:
  * * `ignoreReverted`
  * * `preset`
  * * `config`
  * * `whatBump`
  */
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
  ] = js.undefined
  /**
    * If `true`, reverted commits will be ignored.
    *
    * @default
    * true
    */
  var ignoreReverted: js.UndefOr[Boolean] = js.undefined
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
  var lernaPackage: js.UndefOr[String] = js.undefined
  /**
    * It's recommended to use a preset so you don't have to define everything
    * yourself.
    *
    * The value is passed to [`conventional-changelog-preset-loader`](https://www.npmjs.com/package/conventional-changelog-preset-loader).
    */
  var preset: js.UndefOr[String] = js.undefined
  /**
    * Specify a prefix for the git tag that will be taken into account during the
    * comparison.
    *
    * For instance if your version tag is prefixed by `version/` instead of `v` you
    * would specifying `--tagPrefix=version/` using the CLI, or `version/` as the
    * value of the `tagPrefix` option.
    */
  var tagPrefix: js.UndefOr[String] = js.undefined
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
  var whatBump: js.UndefOr[WhatBump] = js.undefined
}

object Options_ {
  @scala.inline
  def apply(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CoreOptions.Config<Commit, WriterContext> */ js.Any = null,
    ignoreReverted: js.UndefOr[Boolean] = js.undefined,
    lernaPackage: String = null,
    preset: String = null,
    tagPrefix: String = null,
    whatBump: /* commits */ js.Array[Commit[String | Double | js.Symbol]] => Result = null
  ): Options_ = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreReverted)) __obj.updateDynamic("ignoreReverted")(ignoreReverted.asInstanceOf[js.Any])
    if (lernaPackage != null) __obj.updateDynamic("lernaPackage")(lernaPackage.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (tagPrefix != null) __obj.updateDynamic("tagPrefix")(tagPrefix.asInstanceOf[js.Any])
    if (whatBump != null) __obj.updateDynamic("whatBump")(js.Any.fromFunction1(whatBump))
    __obj.asInstanceOf[Options_]
  }
}

