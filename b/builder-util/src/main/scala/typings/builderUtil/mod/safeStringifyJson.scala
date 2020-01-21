package typings.builderUtil.mod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "safeStringifyJson")
@js.native
object safeStringifyJson extends js.Object {
  def apply(data: js.Any): String = js.native
  def apply(data: js.Any, skippedNames: Set[String]): String = js.native
}

