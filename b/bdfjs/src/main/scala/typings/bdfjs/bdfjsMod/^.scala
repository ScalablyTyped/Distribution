package typings.bdfjs.bdfjsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bdfjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def draw(font: Font, text: String): js.UndefOr[Bitmap] = js.native
  def draw(font: Font, text: String, options: DrawOptions): js.UndefOr[Bitmap] = js.native
  def parse(text: String): Font = js.native
  def parse(text: String, options: ParseOptions): Font = js.native
  def parse(text: Buffer): Font = js.native
  def parse(text: Buffer, options: ParseOptions): Font = js.native
  def trim(bitmap: Bitmap): Bitmap = js.native
}

