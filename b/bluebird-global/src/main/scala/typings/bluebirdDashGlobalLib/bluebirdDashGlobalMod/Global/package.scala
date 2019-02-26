package typings
package bluebirdDashGlobalLib.bluebirdDashGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Global {
  type IterateFunction[T, R] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* arrayLength */ scala.Double, 
    R | js.Thenable[R]
  ]
}
