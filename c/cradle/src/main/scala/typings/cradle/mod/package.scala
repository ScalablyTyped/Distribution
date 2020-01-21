package typings.cradle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  type ErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
}
