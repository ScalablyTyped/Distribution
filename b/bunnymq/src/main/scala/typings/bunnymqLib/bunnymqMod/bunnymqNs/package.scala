package typings
package bunnymqLib.bunnymqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bunnymqNs {
  type ConsumerCallback[T] = js.Function1[/* repeated */js.Any, T]
  type LoggerOutput = js.Function2[/* format */ js.Any, /* repeated */js.Any, scala.Unit]
}
