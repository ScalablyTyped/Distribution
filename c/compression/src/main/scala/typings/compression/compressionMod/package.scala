package typings.compression

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object compressionMod {
  type CompressionFilter = js.Function2[/* req */ Request, /* res */ Response, Boolean]
}
