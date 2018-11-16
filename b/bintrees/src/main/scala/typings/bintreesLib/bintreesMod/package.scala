package typings
package bintreesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bintreesMod {
  type Callback[T] = js.Function1[/* item */ T, scala.Unit]
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
}
