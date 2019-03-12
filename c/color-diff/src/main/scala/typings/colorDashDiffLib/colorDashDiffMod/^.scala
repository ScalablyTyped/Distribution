package typings
package colorDashDiffLib.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  def closest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  def closest_lab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  def diff(c1: LabColor, c2: LabColor): scala.Double = js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  def furthest_lab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  def lab_palette_map_key(c: LabColor): java.lang.String = js.native
  def map_palette(a: js.Array[RGBColor], b: js.Array[RGBColor]): org.scalablytyped.runtime.StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(
    a: js.Array[RGBColor],
    b: js.Array[RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.closest
  ): org.scalablytyped.runtime.StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(
    a: js.Array[RGBColor],
    b: js.Array[RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.closest,
    backgroundColor: RGBColor
  ): org.scalablytyped.runtime.StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(
    a: js.Array[RGBColor],
    b: js.Array[RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.furthest
  ): org.scalablytyped.runtime.StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(
    a: js.Array[RGBColor],
    b: js.Array[RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.furthest,
    backgroundColor: RGBColor
  ): org.scalablytyped.runtime.StringDictionary[RGBColor] = js.native
  def map_palette_lab(p1: js.Array[LabColor], p2: js.Array[LabColor]): org.scalablytyped.runtime.StringDictionary[LabColor] = js.native
  def match_palette_lab(target_color: LabColor, palette: js.Array[LabColor], find_furthest: scala.Boolean): LabColor = js.native
  def palette_map_key(c: RGBColor): java.lang.String = js.native
  def rgb_to_lab(c: RGBColor): LabColor = js.native
  def rgba_to_lab(c: RGBColor): LabColor = js.native
  def rgba_to_lab(c: RGBColor, bc: RGBColor): LabColor = js.native
}

