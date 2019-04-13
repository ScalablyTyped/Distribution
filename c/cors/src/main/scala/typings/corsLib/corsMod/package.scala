package typings
package corsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object corsMod {
  type CorsOptionsDelegate = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* callback */ js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* options */ js.UndefOr[CorsOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
