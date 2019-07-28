package typings.crpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crpcMod {
  type Client = js.Function3[
    /* path */ String, 
    /* body */ js.Any, 
    /* options */ js.UndefOr[js.Object | Null], 
    js.Promise[js.Any]
  ]
}
