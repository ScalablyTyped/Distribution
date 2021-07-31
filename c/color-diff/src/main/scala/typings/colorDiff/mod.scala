package typings.colorDiff

import org.scalablytyped.runtime.StringDictionary
import typings.colorDiff.colorDiffStrings.closest
import typings.colorDiff.colorDiffStrings.furthest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("color-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def closest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[RGBColor]
  @scala.inline
  def closest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[RGBColor]
  
  @scala.inline
  def closestLab(color: LabColor, palette: js.Array[LabColor]): LabColor = (^.asInstanceOf[js.Dynamic].applyDynamic("closest_lab")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[LabColor]
  
  @scala.inline
  def diff(c1: LabColor, c2: LabColor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def furthest(color: RGBColor, palette: js.Array[RGBColor]): RGBColor = (^.asInstanceOf[js.Dynamic].applyDynamic("furthest")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[RGBColor]
  @scala.inline
  def furthest(color: RGBColor, palette: js.Array[RGBColor], backgroundColor: RGBColor): RGBColor = (^.asInstanceOf[js.Dynamic].applyDynamic("furthest")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[RGBColor]
  
  @scala.inline
  def furthestLab(color: LabColor, palette: js.Array[LabColor]): LabColor = (^.asInstanceOf[js.Dynamic].applyDynamic("furthest_lab")(color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[LabColor]
  
  @scala.inline
  def labPaletteMapKey(c: LabColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lab_palette_map_key")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def mapPalette(a: js.Array[RGBColor], b: js.Array[RGBColor]): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  @scala.inline
  def mapPalette(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: Unit, backgroundColor: RGBColor): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  
  @scala.inline
  def mapPaletteLab(p1: js.Array[LabColor], p2: js.Array[LabColor]): StringDictionary[LabColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette_lab")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[LabColor]]
  
  @scala.inline
  def mapPalette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  @scala.inline
  def mapPalette_closest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: closest, backgroundColor: RGBColor): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  
  @scala.inline
  def mapPalette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  @scala.inline
  def mapPalette_furthest(a: js.Array[RGBColor], b: js.Array[RGBColor], `type`: furthest, backgroundColor: RGBColor): StringDictionary[RGBColor] = (^.asInstanceOf[js.Dynamic].applyDynamic("map_palette")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], backgroundColor.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[RGBColor]]
  
  @scala.inline
  def matchPaletteLab(target_color: LabColor, palette: js.Array[LabColor], find_furthest: Boolean): LabColor = (^.asInstanceOf[js.Dynamic].applyDynamic("match_palette_lab")(target_color.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], find_furthest.asInstanceOf[js.Any])).asInstanceOf[LabColor]
  
  @scala.inline
  def paletteMapKey(c: RGBColor): String = ^.asInstanceOf[js.Dynamic].applyDynamic("palette_map_key")(c.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def rgbToLab(c: RGBColor): LabColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb_to_lab")(c.asInstanceOf[js.Any]).asInstanceOf[LabColor]
  
  @scala.inline
  def rgbaToLab(c: RGBColor): LabColor = ^.asInstanceOf[js.Dynamic].applyDynamic("rgba_to_lab")(c.asInstanceOf[js.Any]).asInstanceOf[LabColor]
  @scala.inline
  def rgbaToLab(c: RGBColor, bc: RGBColor): LabColor = (^.asInstanceOf[js.Dynamic].applyDynamic("rgba_to_lab")(c.asInstanceOf[js.Any], bc.asInstanceOf[js.Any])).asInstanceOf[LabColor]
  
  trait LabColor extends StObject {
    
    var L: Double
    
    var a: Double
    
    var b: Double
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
  
  trait RGBColor extends StObject {
    
    var A: js.UndefOr[Double] = js.undefined
    
    var B: Double
    
    var G: Double
    
    var R: Double
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
