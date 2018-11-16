package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bdfjs", JSImport.Namespace)
@js.native
object bdfjsModMembers extends js.Object {
  def draw(font: Font, text: java.lang.String): js.UndefOr[Bitmap] = js.native
  def draw(font: Font, text: java.lang.String, options: DrawOptions): js.UndefOr[Bitmap] = js.native
  def parse(text: java.lang.String): Font = js.native
  def parse(text: java.lang.String, options: ParseOptions): Font = js.native
  def parse(text: nodeLib.Buffer): Font = js.native
  def parse(text: nodeLib.Buffer, options: ParseOptions): Font = js.native
  def trim(bitmap: Bitmap): Bitmap = js.native
}

