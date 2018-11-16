package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dcNs {
  type Accessor[T, V] = js.Function2[/* datum */ T, /* index */ js.UndefOr[scala.Double], V]
  type UnitFunction = js.Function3[
    /* start */ scala.Double | stdLib.Date, 
    /* end */ scala.Double | stdLib.Date, 
    /* domain */ js.UndefOr[scala.Double | js.Array[java.lang.String]], 
    scala.Double | (js.Array[scala.Double | stdLib.Date | java.lang.String])
  ]
}
