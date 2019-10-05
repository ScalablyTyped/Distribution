package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object core {
  import typings.std.Error

  type ErrorCallback = js.Function1[/* error */ Error, Unit]
}
