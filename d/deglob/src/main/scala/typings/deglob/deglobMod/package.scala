package typings.deglob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deglobMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ Error | Null, /* files */ js.Array[String], Unit]
}
