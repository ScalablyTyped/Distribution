package typings.color

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.color.anon.Alpha
import typings.color.anon.Dictkey
import typings.color.colorStrings.AA
import typings.color.colorStrings.AAA
import typings.color.colorStrings._empty
import typings.color.colorStrings.ansi16
import typings.color.colorStrings.ansi256
import typings.color.colorStrings.apple
import typings.color.colorStrings.cmyk
import typings.color.colorStrings.gray
import typings.color.colorStrings.hcg
import typings.color.colorStrings.hex
import typings.color.colorStrings.hsl
import typings.color.colorStrings.hsv
import typings.color.colorStrings.hwb
import typings.color.colorStrings.keyword
import typings.color.colorStrings.lab
import typings.color.colorStrings.lch
import typings.color.colorStrings.rgb
import typings.color.colorStrings.xyz
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("color", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("color", JSImport.Namespace)
  @js.native
  class Class[T /* <: ColorParam */] ()
    extends StObject
       with Color[T] {
    def this(obj: T) = this()
    def this(
      obj: T,
      model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
    ) = this()
    def this(
      obj: Unit,
      model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
    ) = this()
  }
  
  @js.native
  trait Color[T /* <: ColorParam */] extends StObject {
    
    def a(): Double = js.native
    def a(`val`: Double): Color[ColorParam] = js.native
    
    def alpha(): Double = js.native
    def alpha(`val`: Double): Color[ColorParam] = js.native
    
    def ansi16(args: Double*): Color[ColorParam] = js.native
    
    def ansi256(args: Double*): Color[ColorParam] = js.native
    
    def apple(args: Double*): Color[ColorParam] = js.native
    
    def array(): js.Array[Double] = js.native
    
    def b(): Double = js.native
    def b(`val`: Double): Color[ColorParam] = js.native
    
    def black(): Double = js.native
    def black(`val`: Double): Color[ColorParam] = js.native
    
    def blacken(ratio: Double): Color[ColorParam] = js.native
    
    def blue(): Double = js.native
    def blue(`val`: Double): Color[ColorParam] = js.native
    
    def chroma(): Double = js.native
    def chroma(`val`: Double): Color[ColorParam] = js.native
    
    def cmyk(args: Double*): Color[ColorParam] = js.native
    
    def contrast(color2: Color[ColorParam]): Double = js.native
    
    def cyan(): Double = js.native
    def cyan(`val`: Double): Color[ColorParam] = js.native
    
    def darken(ratio: Double): Color[ColorParam] = js.native
    
    def desaturate(ratio: Double): Color[ColorParam] = js.native
    
    def fade(ratio: Double): Color[ColorParam] = js.native
    
    def gray(): Double = js.native
    def gray(`val`: Double): Color[ColorParam] = js.native
    
    def grayscale(): Color[ColorParam] = js.native
    
    def green(): Double = js.native
    def green(`val`: Double): Color[ColorParam] = js.native
    
    def hcg(args: Double*): Color[ColorParam] = js.native
    
    def hex(): String = js.native
    def hex[V /* <: String */](`val`: V): Color[V] = js.native
    
    def hsl(args: Double*): Color[ColorParam] = js.native
    
    def hsv(args: Double*): Color[ColorParam] = js.native
    
    def hue(): Double = js.native
    def hue(`val`: Double): Color[ColorParam] = js.native
    
    def hwb(args: Double*): Color[ColorParam] = js.native
    
    def isDark(): Boolean = js.native
    
    def isLight(): Boolean = js.native
    
    def keyword(): String = js.native
    def keyword[V /* <: String */](`val`: V): Color[V] = js.native
    
    def l(): Double = js.native
    def l(`val`: Double): Color[ColorParam] = js.native
    
    def lab(args: Double*): Color[ColorParam] = js.native
    
    def lch(args: Double*): Color[ColorParam] = js.native
    
    def level(color2: Color[ColorParam]): AAA | AA | _empty = js.native
    
    def lighten(ratio: Double): Color[ColorParam] = js.native
    
    def lightness(): Double = js.native
    def lightness(`val`: Double): Color[ColorParam] = js.native
    
    def luminosity(): Double = js.native
    
    def magenta(): Double = js.native
    def magenta(`val`: Double): Color[ColorParam] = js.native
    
    def mix(mixinColor: Color[ColorParam]): Color[ColorParam] = js.native
    def mix(mixinColor: Color[ColorParam], weight: Double): Color[ColorParam] = js.native
    
    def negate(): Color[ColorParam] = js.native
    
    def `object`(): Dictkey = js.native
    
    def opaquer(ratio: Double): Color[ColorParam] = js.native
    
    def percentString(): String = js.native
    def percentString(places: Double): String = js.native
    
    def red(): Double = js.native
    def red(`val`: Double): Color[ColorParam] = js.native
    
    def rgb(args: Double*): Color[ColorParam] = js.native
    
    def rgbNumber(): Double = js.native
    
    def rotate(degrees: Double): Color[ColorParam] = js.native
    
    def round(): Color[ColorParam] = js.native
    def round(places: Double): Color[ColorParam] = js.native
    
    def saturate(ratio: Double): Color[ColorParam] = js.native
    
    def saturationl(): Double = js.native
    def saturationl(`val`: Double): Color[ColorParam] = js.native
    
    def saturationv(): Double = js.native
    def saturationv(`val`: Double): Color[ColorParam] = js.native
    
    def string(): String = js.native
    def string(places: Double): String = js.native
    
    def toJSON(): Color[T] = js.native
    
    def unitArray(): js.Array[Double] = js.native
    
    def unitObject(): Alpha = js.native
    
    def value(): Double = js.native
    def value(`val`: Double): Color[ColorParam] = js.native
    
    def wblack(): Double = js.native
    def wblack(`val`: Double): Color[ColorParam] = js.native
    
    def white(): Double = js.native
    def white(`val`: Double): Color[ColorParam] = js.native
    
    def whiten(ratio: Double): Color[ColorParam] = js.native
    
    def x(): Double = js.native
    def x(`val`: Double): Color[ColorParam] = js.native
    
    def xyz(args: Double*): Color[ColorParam] = js.native
    
    def y(): Double = js.native
    def y(`val`: Double): Color[ColorParam] = js.native
    
    def yellow(): Double = js.native
    def yellow(`val`: Double): Color[ColorParam] = js.native
    
    def z(): Double = js.native
    def z(`val`: Double): Color[ColorParam] = js.native
  }
  
  @js.native
  trait ColorConstructor
    extends StObject
       with Instantiable0[Color[ColorParam]]
       with Instantiable1[/* obj */ ColorParam, Color[ColorParam]]
       with Instantiable2[
          (/* obj */ ColorParam) | (/* obj */ Unit), 
          rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab, 
          Color[ColorParam]
        ] {
    
    def apply[T /* <: ColorParam */](): Color[T] = js.native
    def apply[T /* <: ColorParam */](obj: T): Color[T] = js.native
    def apply[T /* <: ColorParam */](
      obj: T,
      model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
    ): Color[T] = js.native
    def apply[T /* <: ColorParam */](
      obj: Unit,
      model: /* keyof color.anon.Typeofconvert */ rgb | xyz | hcg | ansi256 | ansi16 | hex | lch | cmyk | hsl | keyword | gray | hsv | apple | hwb | lab
    ): Color[T] = js.native
    
    def ansi16(color: ColorParam): Color[ColorParam] = js.native
    def ansi16(`val`: Double*): Color[ColorParam] = js.native
    
    def ansi256(color: ColorParam): Color[ColorParam] = js.native
    def ansi256(`val`: Double*): Color[ColorParam] = js.native
    
    def apple(color: ColorParam): Color[ColorParam] = js.native
    def apple(`val`: Double*): Color[ColorParam] = js.native
    
    def cmyk(color: ColorParam): Color[ColorParam] = js.native
    def cmyk(`val`: Double*): Color[ColorParam] = js.native
    
    def hcg(color: ColorParam): Color[ColorParam] = js.native
    def hcg(`val`: Double*): Color[ColorParam] = js.native
    
    def hsl(color: ColorParam): Color[ColorParam] = js.native
    def hsl(`val`: Double*): Color[ColorParam] = js.native
    
    def hsv(color: ColorParam): Color[ColorParam] = js.native
    def hsv(`val`: Double*): Color[ColorParam] = js.native
    
    def hwb(color: ColorParam): Color[ColorParam] = js.native
    def hwb(`val`: Double*): Color[ColorParam] = js.native
    
    def lab(color: ColorParam): Color[ColorParam] = js.native
    def lab(`val`: Double*): Color[ColorParam] = js.native
    
    def lch(color: ColorParam): Color[ColorParam] = js.native
    def lch(`val`: Double*): Color[ColorParam] = js.native
    
    def rgb(color: ColorParam): Color[ColorParam] = js.native
    def rgb(`val`: Double*): Color[ColorParam] = js.native
    
    def xyz(color: ColorParam): Color[ColorParam] = js.native
    def xyz(`val`: Double*): Color[ColorParam] = js.native
  }
  
  type ColorParam = (Color[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias color.color.ColorParam */ js.Object
  ]) | String | ArrayLike[Double] | Double | StringDictionary[js.Any]
  
  type _To = js.Object & ColorConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & ColorConstructor = ^
}
