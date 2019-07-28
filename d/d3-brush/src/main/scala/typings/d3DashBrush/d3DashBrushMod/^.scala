package typings.d3DashBrush.d3DashBrushMod

import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-brush", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def brush[Datum](): BrushBehavior[Datum] = js.native
  def brushSelection(node: SVGGElement): BrushSelection | Null = js.native
  def brushX[Datum](): BrushBehavior[Datum] = js.native
  def brushY[Datum](): BrushBehavior[Datum] = js.native
}

