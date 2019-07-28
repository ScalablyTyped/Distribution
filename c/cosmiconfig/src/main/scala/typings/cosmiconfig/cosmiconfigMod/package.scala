package typings.cosmiconfig

import org.scalablytyped.runtime.StringDictionary
import typings.cosmiconfig.Anon_Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cosmiconfigMod {
  type AsyncLoader = js.Function2[
    /* filepath */ String, 
    /* content */ String, 
    Config | Null | (js.Promise[js.Object | Null])
  ]
  type Config = StringDictionary[js.Any]
  type CosmiconfigResult = Anon_Config | Null
  type Loaders = StringDictionary[LoaderEntry]
  type SyncLoader = js.Function2[/* filepath */ String, /* content */ String, Config | Null]
}
