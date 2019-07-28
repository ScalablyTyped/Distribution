package typings.csso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssoMod {
  type AfterCompressFn = js.Function2[/* compressResult */ String, /* options */ CompressOptions, Unit]
  type BeforeCompressFn = js.Function2[/* ast */ js.Object, /* options */ CompressOptions, Unit]
}
