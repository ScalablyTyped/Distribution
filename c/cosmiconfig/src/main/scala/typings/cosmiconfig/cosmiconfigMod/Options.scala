package typings.cosmiconfig.cosmiconfigMod

import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.cosmiconfig.distTypesMod.Loaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends OptionsBase {
  var loaders: js.UndefOr[Loaders] = js.undefined
  var transform: js.UndefOr[Transform] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined,
    loaders: Loaders = null,
    packageProp: String = null,
    searchPlaces: js.Array[String] = null,
    stopDir: String = null,
    transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(ignoreEmptySearchPlaces)) __obj.updateDynamic("ignoreEmptySearchPlaces")(ignoreEmptySearchPlaces)
    if (loaders != null) __obj.updateDynamic("loaders")(loaders)
    if (packageProp != null) __obj.updateDynamic("packageProp")(packageProp)
    if (searchPlaces != null) __obj.updateDynamic("searchPlaces")(searchPlaces)
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Options]
  }
}

