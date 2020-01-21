package typings.contentType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("content-type", "parse")
@js.native
object parse extends js.Object {
  def apply(input: String): ParsedMediaType = js.native
  def apply(input: RequestLike): ParsedMediaType = js.native
  def apply(input: ResponseLike): ParsedMediaType = js.native
}

