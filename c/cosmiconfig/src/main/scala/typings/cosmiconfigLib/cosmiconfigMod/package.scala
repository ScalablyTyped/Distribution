package typings
package cosmiconfigLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cosmiconfigMod {
  type AsyncLoader = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    Config | scala.Null | (js.Promise[js.Object | scala.Null])
  ]
  type Config = org.scalablytyped.runtime.StringDictionary[js.Any]
  type CosmiconfigResult = cosmiconfigLib.Anon_Config | scala.Null
  type Loaders = org.scalablytyped.runtime.StringDictionary[LoaderEntry]
  type SyncLoader = js.Function2[/* filepath */ java.lang.String, /* content */ java.lang.String, Config | scala.Null]
}
