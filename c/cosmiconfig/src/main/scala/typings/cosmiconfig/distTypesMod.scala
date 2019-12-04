package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typings.cosmiconfig.cosmiconfigMod.Loader
import typings.cosmiconfig.cosmiconfigMod.LoaderSync
import typings.cosmiconfig.cosmiconfigMod.Options
import typings.cosmiconfig.cosmiconfigMod.OptionsSync
import typings.cosmiconfig.distTypesMod.Config
import typings.cosmiconfig.distTypesMod.CosmiconfigResult
import typings.std.Map
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cosmiconfig/dist/types", JSImport.Namespace)
@js.native
object distTypesMod extends js.Object {
  type Cache = Map[String, CosmiconfigResult]
  type Config = js.Any
  type CosmiconfigResult = Anon_Config | Null
  type ExplorerOptions = Required[Options]
  type ExplorerOptionsSync = Required[OptionsSync]
  type LoadedFileContent = js.UndefOr[Config | Null]
  type Loaders = StringDictionary[Loader]
  type LoadersSync = StringDictionary[LoaderSync]
}

