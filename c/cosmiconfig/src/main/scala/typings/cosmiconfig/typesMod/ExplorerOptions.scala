package typings.cosmiconfig.typesMod

import typings.cosmiconfig.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<cosmiconfig.cosmiconfig.Options> */
trait ExplorerOptions extends js.Object {
  var cache: Boolean
  var ignoreEmptySearchPlaces: Boolean
  var loaders: Loaders
  var packageProp: String
  var searchPlaces: js.Array[String]
  var stopDir: String
  var transform: Transform
}

object ExplorerOptions {
  @scala.inline
  def apply(
    cache: Boolean,
    ignoreEmptySearchPlaces: Boolean,
    loaders: Loaders,
    packageProp: String,
    searchPlaces: js.Array[String],
    stopDir: String,
    transform: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult | js.Promise[CosmiconfigResult]
  ): ExplorerOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], ignoreEmptySearchPlaces = ignoreEmptySearchPlaces.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], packageProp = packageProp.asInstanceOf[js.Any], searchPlaces = searchPlaces.asInstanceOf[js.Any], stopDir = stopDir.asInstanceOf[js.Any], transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[ExplorerOptions]
  }
}

