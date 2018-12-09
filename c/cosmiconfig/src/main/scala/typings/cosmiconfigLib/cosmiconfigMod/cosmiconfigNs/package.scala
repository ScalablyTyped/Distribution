package typings
package cosmiconfigLib.cosmiconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cosmiconfigNs {
  type AsyncLoader = js.Function2[
    /* filepath */ java.lang.String, 
    /* content */ java.lang.String, 
    Config | scala.Null | (js.Promise[js.Object | scala.Null])
  ]
  type CosmiconfigResult = cosmiconfigLib.Anon_Config | scala.Null
  type SyncLoader = js.Function2[/* filepath */ java.lang.String, /* content */ java.lang.String, Config | scala.Null]
}
