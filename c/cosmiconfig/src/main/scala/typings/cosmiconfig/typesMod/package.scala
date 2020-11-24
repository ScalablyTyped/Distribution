package typings.cosmiconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Cache = typings.std.Map[java.lang.String, typings.cosmiconfig.typesMod.CosmiconfigResult]
  
  type Config = js.Any
  
  type CosmiconfigResult = typings.cosmiconfig.anon.Config | scala.Null
  
  type LoadedFileContent = js.UndefOr[typings.cosmiconfig.typesMod.Config | scala.Null]
  
  type Loaders = org.scalablytyped.runtime.StringDictionary[typings.cosmiconfig.mod.Loader]
  
  type LoadersSync = org.scalablytyped.runtime.StringDictionary[typings.cosmiconfig.mod.LoaderSync]
}
