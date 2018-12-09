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

