package typings.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  type CompressionFilter = js.Function2[/* req */ Request, /* res */ Response, Boolean]
}
