package typings.coffeeify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coffeeifyMod {
  type Callback = js.Function2[/* error */ ParseError, /* compiled */ String, Unit]
}
