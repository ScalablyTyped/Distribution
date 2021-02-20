package typings.colorDiff

import org.scalablytyped.runtime.StringDictionary
import typings.colorDiff.colorDiffStrings.closest
import typings.colorDiff.colorDiffStrings.furthest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-diff", "closest")
  @js.native
  def closest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  @JSImport("color-diff", "closest")
  @js.native
  def closest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  
  @JSImport("color-diff", "closest_lab")
  @js.native
  def closestLab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  
  @JSImport("color-diff", "diff")
  @js.native
  def diff(c1: LabColor, c2: LabColor): Double = js.native
  
  @JSImport("color-diff", "furthest")
  @js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = js.native
  @JSImport("color-diff", "furthest")
  @js.native
  def furthest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = js.native
  
  @JSImport("color-diff", "furthest_lab")
  @js.native
  def furthestLab(color: LabColor, palette: js.Array[LabColor]): LabColor = js.native
  
  @JSImport("color-diff", "lab_palette_map_key")
  @js.native
  def labPaletteMapKey(c: LabColor): String = js.native
  
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette(a: js.Array[RGBColor], b: js.Array[RGBColor]): StringDictionary[RGBColor] = js.native
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette(
    a: js.Array[RGBColor],
    b: js.Array[RGBColor],
    `type`: js.UndefOr[scala.Nothing],
    backgroundColor: RGBColor
  ): StringDictionary[RGBColor] = js.native
  
  @JSImport("color-diff", "map_palette_lab")
  @js.native
  def mapPaletteLab(p1: js.Array[LabColor], p2: js.Array[LabColor]): StringDictionary[LabColor] = js.native
  
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest): StringDictionary[RGBColor] = js.native
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest, backgroundColor: RGBColor): StringDictionary[RGBColor] = js.native
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest): StringDictionary[RGBColor] = js.native
  @JSImport("color-diff", "map_palette")
  @js.native
  def mapPalette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest, backgroundColor: RGBColor): StringDictionary[RGBColor] = js.native
  
  @JSImport("color-diff", "match_palette_lab")
  @js.native
  def matchPaletteLab(target_color: LabColor, palette: js.Array[LabColor], find_furthest: Boolean): LabColor = js.native
  
  @JSImport("color-diff", "palette_map_key")
  @js.native
  def paletteMapKey(c: RGBColor): String = js.native
  
  @JSImport("color-diff", "rgb_to_lab")
  @js.native
  def rgbToLab(c: RGBColor): LabColor = js.native
  
  @JSImport("color-diff", "rgba_to_lab")
  @js.native
  def rgbaToLab(c: RGBColor): LabColor = js.native
  @JSImport("color-diff", "rgba_to_lab")
  @js.native
  def rgbaToLab(c: RGBColor, bc: RGBColor): LabColor = js.native
  
  @js.native
  trait LabColor extends StObject {
    
    var L: Double = js.native
    
    var a: Double = js.native
    
    var b: Double = js.native
  }
  object LabColor {
    
    @scala.inline
    def apply(L: Double, a: Double, b: Double): LabColor = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabColor]
    }
    
    @scala.inline
    implicit class LabColorMutableBuilder[Self <: LabColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBColor extends StObject {
    
    var A: js.UndefOr[Double] = js.native
    
    var B: Double = js.native
    
    var G: Double = js.native
    
    var R: Double = js.native
  }
  object RGBColor {
    
    @scala.inline
    def apply(B: Double, G: Double, R: Double): RGBColor = {
      val __obj = js.Dynamic.literal(B = B.asInstanceOf[js.Any], G = G.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    @scala.inline
    implicit class RGBColorMutableBuilder[Self <: RGBColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "A", js.undefined)
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "G", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    }
  }
}
