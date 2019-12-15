package typings.cbor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cborMod {
  import typings.std.Error

  type commentCallback = js.Function2[/* error */ js.UndefOr[Error], /* commented */ js.UndefOr[String], Unit]
  type decodeAllCallback = js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[js.Array[js.Any]], Unit]
  type decodeCallback = js.Function2[/* error */ js.UndefOr[Error], /* value */ js.UndefOr[js.Any], Unit]
  type diagnoseCallback = js.Function2[/* error */ js.UndefOr[Error], /* str */ js.UndefOr[String], Unit]
}
