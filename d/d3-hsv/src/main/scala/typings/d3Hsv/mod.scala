package typings.d3Hsv

import typings.d3Color.mod.ColorCommonInstance
import typings.d3Color.mod.ColorSpaceObject
import typings.d3Color.mod.Color_
import typings.d3Color.mod.RGBColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-hsv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("d3-hsv", "hsv")
  @js.native
  val hsv: HSVColorFactory = js.native
  
  @scala.inline
  def interpolateHsv(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsv(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsv(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsv(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsv")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  @scala.inline
  def interpolateHsvLong(a: String, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsvLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsvLong(a: String, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsvLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsvLong(a: ColorCommonInstance, b: String): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsvLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  @scala.inline
  def interpolateHsvLong(a: ColorCommonInstance, b: ColorCommonInstance): js.Function1[/* t */ Double, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHsvLong")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, String]]
  
  type ColorSpaceObjectWithHSV = ColorSpaceObject | HSVColor
  
  @js.native
  trait HSVColor
    extends StObject
       with Color_ {
    
    /**
      * Returns a brighter copy of this color.
      * @param k Controls how much brighter the returned color should be (defaults to 1).
      */
    def brighter(): this.type = js.native
    def brighter(k: Double): this.type = js.native
    
    /**
      * Returns a darker copy of this color.
      * @param k Controls how much darker the returned color should be (defaults to 1).
      */
    def darker(): this.type = js.native
    def darker(k: Double): this.type = js.native
    
    /**
      * The color hue.
      */
    var h: Double = js.native
    
    /**
      * The color opacity.
      */
    var opacity: Double = js.native
    
    /**
      * Returns the RGB equivalent of this color.
      */
    def rgb(): RGBColor = js.native
    
    /**
      * The color saturation.
      */
    var s: Double = js.native
    
    /**
      * The color value.
      */
    var v: Double = js.native
  }
  
  @js.native
  trait HSVColorFactory
    extends js.Function {
    
    def apply(color: ColorCommonInstance): HSVColor = js.native
    def apply(color: ColorSpaceObject): HSVColor = js.native
    /**
      * Constructs a new HSV color.
      * @param color A color instance, it will be converted to the RGB color space
      * using `color.rgb` and then converted to HSV.
      */
    def apply(color: HSVColor): HSVColor = js.native
    /**
      * Constructs a new HSV color.
      * @param cssColorSpecifier A CSS Color Module Level 3 specifier string,
      * it is parsed and then converted to the HSV color space.
      */
    def apply(cssColorSpecifier: String): HSVColor = js.native
    /**
      * Constructs a new HSV color.
      * @param h The hue of the returned color.
      * @param s The saturation of the returned color.
      * @param v The value of the returned color.
      * @param opacity The opacity of the returned color.
      */
    def apply(h: Double, s: Double, v: Double): HSVColor = js.native
    def apply(h: Double, s: Double, v: Double, opacity: Double): HSVColor = js.native
  }
}
