package typings.cosmiconfig.typesMod

import typings.cosmiconfig.mod.TransformSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Required<cosmiconfig.cosmiconfig.OptionsSync> */
@js.native
trait ExplorerOptionsSync extends js.Object {
  var cache: Boolean = js.native
  var ignoreEmptySearchPlaces: Boolean = js.native
  var loaders: LoadersSync = js.native
  var packageProp: String = js.native
  var searchPlaces: js.Array[String] = js.native
  var stopDir: String = js.native
  @JSName("transform")
  var transform_Original: TransformSync = js.native
  def transform(CosmiconfigResult: CosmiconfigResult): CosmiconfigResult = js.native
}

