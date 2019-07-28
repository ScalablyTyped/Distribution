package typings.copy

import typings.std.Error
import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyMod {
  type Callback = js.Function2[/* error */ Error | Null, /* files */ js.UndefOr[js.Array[File]], Unit]
}
