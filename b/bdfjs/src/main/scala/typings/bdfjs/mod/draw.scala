package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bdfjs", "draw")
@js.native
object draw extends js.Object {
  def apply(font: Font, text: String): js.UndefOr[Bitmap] = js.native
  def apply(font: Font, text: String, options: DrawOptions): js.UndefOr[Bitmap] = js.native
}

