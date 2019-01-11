package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bdfjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def draw(font: bdfjsLib.bdfjsMod.Font, text: java.lang.String): js.UndefOr[bdfjsLib.bdfjsMod.Bitmap] = js.native
  def draw(font: bdfjsLib.bdfjsMod.Font, text: java.lang.String, options: bdfjsLib.bdfjsMod.DrawOptions): js.UndefOr[bdfjsLib.bdfjsMod.Bitmap] = js.native
  def parse(text: java.lang.String): bdfjsLib.bdfjsMod.Font = js.native
  def parse(text: java.lang.String, options: bdfjsLib.bdfjsMod.ParseOptions): bdfjsLib.bdfjsMod.Font = js.native
  def parse(text: nodeLib.Buffer): bdfjsLib.bdfjsMod.Font = js.native
  def parse(text: nodeLib.Buffer, options: bdfjsLib.bdfjsMod.ParseOptions): bdfjsLib.bdfjsMod.Font = js.native
  def trim(bitmap: bdfjsLib.bdfjsMod.Bitmap): bdfjsLib.bdfjsMod.Bitmap = js.native
}

