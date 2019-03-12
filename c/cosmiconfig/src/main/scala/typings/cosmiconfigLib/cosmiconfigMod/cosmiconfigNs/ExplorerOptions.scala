package typings
package cosmiconfigLib.cosmiconfigMod.cosmiconfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// These are the user options with defaults applied.
trait ExplorerOptions extends js.Object {
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreEmptySearchPlaces: js.UndefOr[scala.Boolean] = js.undefined
  var loaders: js.UndefOr[Loaders] = js.undefined
  var packageProp: js.UndefOr[java.lang.String] = js.undefined
  var searchPlaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var stopDir: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[
    js.Function1[/* result */ CosmiconfigResult, js.Promise[CosmiconfigResult] | CosmiconfigResult]
  ] = js.undefined
}

object ExplorerOptions {
  @scala.inline
  def apply(
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreEmptySearchPlaces: js.UndefOr[scala.Boolean] = js.undefined,
    loaders: Loaders = null,
    packageProp: java.lang.String = null,
    searchPlaces: js.Array[java.lang.String] = null,
    stopDir: java.lang.String = null,
    transform: /* result */ CosmiconfigResult => js.Promise[CosmiconfigResult] | CosmiconfigResult = null
  ): ExplorerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(ignoreEmptySearchPlaces)) __obj.updateDynamic("ignoreEmptySearchPlaces")(ignoreEmptySearchPlaces)
    if (loaders != null) __obj.updateDynamic("loaders")(loaders)
    if (packageProp != null) __obj.updateDynamic("packageProp")(packageProp)
    if (searchPlaces != null) __obj.updateDynamic("searchPlaces")(searchPlaces)
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir)
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[ExplorerOptions]
  }
}

