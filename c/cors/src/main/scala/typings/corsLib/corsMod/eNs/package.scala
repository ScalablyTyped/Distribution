package typings
package corsLib.corsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eNs {
  type CorsOptionsDelegate = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* callback */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* options */ js.UndefOr[CorsOptions], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
