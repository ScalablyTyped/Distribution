package typings.contentDashType.contentDashTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("content-type", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def format(obj: MediaType): String = js.native
  def parse(input: String): ParsedMediaType = js.native
  def parse(input: RequestLike): ParsedMediaType = js.native
  def parse(input: ResponseLike): ParsedMediaType = js.native
}

