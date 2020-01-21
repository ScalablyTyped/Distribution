package typings.bluebirdGlobal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object _Global_ {
  type IterateFunction[T, R] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* arrayLength */ scala.Double, 
    R | js.Thenable[R]
  ]
}
