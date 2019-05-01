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
  type CustomOrigin = js.Function2[
    /* requestOrigin */ js.UndefOr[java.lang.String], 
    /* callback */ js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* allow */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
