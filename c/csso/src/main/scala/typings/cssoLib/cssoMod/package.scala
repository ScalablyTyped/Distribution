package typings
package cssoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssoMod {
  type AfterCompressFn = js.Function2[/* compressResult */ java.lang.String, /* options */ CompressOptions, scala.Unit]
  type BeforeCompressFn = js.Function2[/* ast */ js.Object, /* options */ CompressOptions, scala.Unit]
}
