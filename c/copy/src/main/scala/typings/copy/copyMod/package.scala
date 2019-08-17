package typings.copy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object copyMod {
  import typings.std.Error
  import typings.vinyl.vinylMod.File

  type Callback = js.Function2[/* error */ Error | Null, /* files */ js.UndefOr[js.Array[File]], Unit]
}
