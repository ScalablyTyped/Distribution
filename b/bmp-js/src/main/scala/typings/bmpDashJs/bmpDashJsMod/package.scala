package typings.bmpDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bmpDashJsMod {
  import typings.node.Buffer

  type Decode = js.Function1[/* bmpData */ Buffer, BmpDecoder]
  type Encode = js.Function2[/* imgData */ ImageData, /* quality */ js.UndefOr[Double], ImageData]
}
