package typings.deglob

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object deglobMod {
  type Callback = js.Function2[/* err */ Error | Null, /* files */ js.Array[String], Unit]
}
