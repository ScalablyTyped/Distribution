package typings.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cradleMod {
  type Callback = js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  type ErrorCallback = js.Function1[/* error */ js.Any, Unit]
}
