package typings
package crpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crpcMod {
  type Client = js.Function3[
    /* path */ java.lang.String, 
    /* body */ js.Any, 
    /* options */ js.UndefOr[js.Object | scala.Null], 
    js.Promise[js.Any]
  ]
}
