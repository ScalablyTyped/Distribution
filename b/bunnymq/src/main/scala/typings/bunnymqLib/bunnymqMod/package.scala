package typings
package bunnymqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bunnymqMod {
  type ConsumerCallback[T] = js.Function1[/* repeated */ js.Any, T]
  type LoggerOutput = js.Function2[/* format */ js.Any, /* repeated */ js.Any, scala.Unit]
}
