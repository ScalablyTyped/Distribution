package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typings.cosmiconfig.mod.Loader
import typings.cosmiconfig.mod.LoaderSync
import typings.cosmiconfig.mod.Options
import typings.cosmiconfig.mod.OptionsSync
import typings.std.Map
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  type Cache = Map[String, CosmiconfigResult]
  type Config = js.Any
  type CosmiconfigResult = AnonConfig | Null
  type ExplorerOptions = Required[Options]
  type ExplorerOptionsSync = Required[OptionsSync]
  type LoadedFileContent = js.UndefOr[Config | Null]
  type Loaders = StringDictionary[Loader]
  type LoadersSync = StringDictionary[LoaderSync]
}

