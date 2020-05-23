package typings.cosmiconfig.mod

import typings.cosmiconfig.typesMod.CosmiconfigResult
import typings.cosmiconfig.typesMod.Loaders
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
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptySearchPlaces)) __obj.updateDynamic("ignoreEmptySearchPlaces")(ignoreEmptySearchPlaces.get.asInstanceOf[js.Any])
    if (loaders != null) __obj.updateDynamic("loaders")(loaders.asInstanceOf[js.Any])
    if (packageProp != null) __obj.updateDynamic("packageProp")(packageProp.asInstanceOf[js.Any])
    if (searchPlaces != null) __obj.updateDynamic("searchPlaces")(searchPlaces.asInstanceOf[js.Any])
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Options]
  }
}

