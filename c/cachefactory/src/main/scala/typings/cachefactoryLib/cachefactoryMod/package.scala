package typings
package cachefactoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cachefactoryMod {
  type OnExpireCallback = js.Function3[
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* done */ js.UndefOr[js.Function], 
    scala.Unit
  ]
}
