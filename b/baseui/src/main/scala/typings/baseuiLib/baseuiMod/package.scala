package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseuiMod {
  type UseStyletronFn[Theme] = js.Function0[
    js.Tuple2[
      js.Function1[
        /* arg */ styletronDashStandardLib.styletronDashStandardMod.StyleObject, 
        java.lang.String
      ], 
      Theme
    ]
  ]
}
