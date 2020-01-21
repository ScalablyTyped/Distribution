package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type UseStyletronFn[Theme] = js.Function0[
    js.Tuple2[
      js.Function1[/* arg */ typings.styletronStandard.mod.StyleObject, java.lang.String], 
      Theme
    ]
  ]
}
