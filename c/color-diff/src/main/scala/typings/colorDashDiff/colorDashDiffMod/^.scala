package typings.colorDashDiff.colorDashDiffMod

import org.scalablytyped.runtime.StringDictionary
import typings.colorDashDiff.colorDashDiffStrings.closest
import typings.colorDashDiff.colorDashDiffStrings.furthest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  def closest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  def closest_lab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  def diff(c1: LabColor, c2: LabColor): Double = js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  def furthest_lab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  def lab_palette_map_key(c: LabColor): String = js.native
  def map_palette(a: js.Array[RGBColor], b: js.Array[RGBColor]): StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest): StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest, backgroundColor: RGBColor): StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest): StringDictionary[RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest, backgroundColor: RGBColor): StringDictionary[RGBColor] = js.native
  def map_palette_lab(p1: js.Array[LabColor], p2: js.Array[LabColor]): StringDictionary[LabColor] = js.native
  def match_palette_lab(target_color: LabColor, palette: js.Array[LabColor], find_furthest: Boolean): LabColor = js.native
  def palette_map_key(c: RGBColor): String = js.native
  def rgb_to_lab(c: RGBColor): LabColor = js.native
  def rgba_to_lab(c: RGBColor): LabColor = js.native
  def rgba_to_lab(c: RGBColor, bc: RGBColor): LabColor = js.native
}

