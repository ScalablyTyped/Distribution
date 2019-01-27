package typings
package colorDashDiffLib.colorDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def closest(
    color: colorDashDiffLib.colorDashDiffMod.RGBColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor]
  ): colorDashDiffLib.colorDashDiffMod.RGBColor = js.native
  def closest(
    color: colorDashDiffLib.colorDashDiffMod.RGBColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    backgroundColor: colorDashDiffLib.colorDashDiffMod.RGBColor
  ): colorDashDiffLib.colorDashDiffMod.RGBColor = js.native
  def closest_lab(
    color: colorDashDiffLib.colorDashDiffMod.LabColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.LabColor]
  ): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
  def diff(c1: colorDashDiffLib.colorDashDiffMod.LabColor, c2: colorDashDiffLib.colorDashDiffMod.LabColor): scala.Double = js.native
  def furthest(
    color: colorDashDiffLib.colorDashDiffMod.RGBColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor]
  ): colorDashDiffLib.colorDashDiffMod.RGBColor = js.native
  def furthest(
    color: colorDashDiffLib.colorDashDiffMod.RGBColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    backgroundColor: colorDashDiffLib.colorDashDiffMod.RGBColor
  ): colorDashDiffLib.colorDashDiffMod.RGBColor = js.native
  def furthest_lab(
    color: colorDashDiffLib.colorDashDiffMod.LabColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.LabColor]
  ): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
  def lab_palette_map_key(c: colorDashDiffLib.colorDashDiffMod.LabColor): java.lang.String = js.native
  def map_palette(
    a: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    b: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor]
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(
    a: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    b: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.closest
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_closest(
    a: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    b: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.closest,
    backgroundColor: colorDashDiffLib.colorDashDiffMod.RGBColor
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(
    a: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    b: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.furthest
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.RGBColor] = js.native
  @JSName("map_palette")
  def map_palette_furthest(
    a: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    b: js.Array[colorDashDiffLib.colorDashDiffMod.RGBColor],
    `type`: colorDashDiffLib.colorDashDiffLibStrings.furthest,
    backgroundColor: colorDashDiffLib.colorDashDiffMod.RGBColor
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.RGBColor] = js.native
  def map_palette_lab(
    p1: js.Array[colorDashDiffLib.colorDashDiffMod.LabColor],
    p2: js.Array[colorDashDiffLib.colorDashDiffMod.LabColor]
  ): org.scalablytyped.runtime.StringDictionary[colorDashDiffLib.colorDashDiffMod.LabColor] = js.native
  def match_palette_lab(
    target_color: colorDashDiffLib.colorDashDiffMod.LabColor,
    palette: js.Array[colorDashDiffLib.colorDashDiffMod.LabColor],
    find_furthest: scala.Boolean
  ): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
  def palette_map_key(c: colorDashDiffLib.colorDashDiffMod.RGBColor): java.lang.String = js.native
  def rgb_to_lab(c: colorDashDiffLib.colorDashDiffMod.RGBColor): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
  def rgba_to_lab(c: colorDashDiffLib.colorDashDiffMod.RGBColor): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
  def rgba_to_lab(c: colorDashDiffLib.colorDashDiffMod.RGBColor, bc: colorDashDiffLib.colorDashDiffMod.RGBColor): colorDashDiffLib.colorDashDiffMod.LabColor = js.native
}

