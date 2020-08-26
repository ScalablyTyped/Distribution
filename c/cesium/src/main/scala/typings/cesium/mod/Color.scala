package typings.cesium.mod

import typings.cesium.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Color")
@js.native
class Color () extends Packable {
  def this(red: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double
  ) = this()
  def this(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: Double, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  var alpha: Double = js.native
  var blue: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
  def brighten(magnitude: Double, result: Color): Color = js.native
  def clone(result: Color): Color = js.native
  def darken(magnitude: Double, result: Color): Color = js.native
  def equals(other: Color): Boolean = js.native
  def equalsEpsilon(other: Color): Boolean = js.native
  def equalsEpsilon(other: Color, epsilon: Double): Boolean = js.native
  def toBytes(): js.Array[Double] = js.native
  def toBytes(result: js.Array[Double]): js.Array[Double] = js.native
  def toCssColorString(): String = js.native
  def toRgba(): Double = js.native
  def withAlpha(alpha: Double): Color = js.native
  def withAlpha(alpha: Double, result: Color): Color = js.native
}

/* static members */
@JSImport("cesium", "Color")
@js.native
object Color extends js.Object {
  var ALICEBLUE: Color = js.native
  var ANTIQUEWHITE: Color = js.native
  var AQUA: Color = js.native
  var AQUAMARINE: Color = js.native
  var AZURE: Color = js.native
  var BEIGE: Color = js.native
  var BISQUE: Color = js.native
  var BLACK: Color = js.native
  var BLANCHEDALMOND: Color = js.native
  var BLUE: Color = js.native
  var BLUEVIOLET: Color = js.native
  var BROWN: Color = js.native
  var BURLYWOOD: Color = js.native
  var CADETBLUE: Color = js.native
  var CHARTREUSE: Color = js.native
  var CHOCOLATE: Color = js.native
  var CORAL: Color = js.native
  var CORNFLOWERBLUE: Color = js.native
  var CORNSILK: Color = js.native
  var CRIMSON: Color = js.native
  var CYAN: Color = js.native
  var DARKBLUE: Color = js.native
  var DARKCYAN: Color = js.native
  var DARKGOLDENROD: Color = js.native
  var DARKGRAY: Color = js.native
  var DARKGREEN: Color = js.native
  var DARKGREY: Color = js.native
  var DARKKHAKI: Color = js.native
  var DARKMAGENTA: Color = js.native
  var DARKOLIVEGREEN: Color = js.native
  var DARKORANGE: Color = js.native
  var DARKORCHID: Color = js.native
  var DARKRED: Color = js.native
  var DARKSALMON: Color = js.native
  var DARKSEAGREEN: Color = js.native
  var DARKSLATEBLUE: Color = js.native
  var DARKSLATEGRAY: Color = js.native
  var DARKSLATEGREY: Color = js.native
  var DARKTURQUOISE: Color = js.native
  var DARKVIOLET: Color = js.native
  var DEEPPINK: Color = js.native
  var DEEPSKYBLUE: Color = js.native
  var DIMGRAY: Color = js.native
  var DIMGREY: Color = js.native
  var DODGERBLUE: Color = js.native
  var FIREBRICK: Color = js.native
  var FLORALWHITE: Color = js.native
  var FORESTGREEN: Color = js.native
  var FUSCHIA: Color = js.native
  var GAINSBORO: Color = js.native
  var GHOSTWHITE: Color = js.native
  var GOLD: Color = js.native
  var GOLDENROD: Color = js.native
  var GRAY: Color = js.native
  var GREEN: Color = js.native
  var GREENYELLOW: Color = js.native
  var GREY: Color = js.native
  var HONEYDEW: Color = js.native
  var HOTPINK: Color = js.native
  var INDIANRED: Color = js.native
  var INDIGO: Color = js.native
  var IVORY: Color = js.native
  var KHAKI: Color = js.native
  var LAVENDAR_BLUSH: Color = js.native
  var LAVENDER: Color = js.native
  var LAWNGREEN: Color = js.native
  var LEMONCHIFFON: Color = js.native
  var LIGHTBLUE: Color = js.native
  var LIGHTCORAL: Color = js.native
  var LIGHTCYAN: Color = js.native
  var LIGHTGOLDENRODYELLOW: Color = js.native
  var LIGHTGRAY: Color = js.native
  var LIGHTGREEN: Color = js.native
  var LIGHTGREY: Color = js.native
  var LIGHTPINK: Color = js.native
  var LIGHTSEAGREEN: Color = js.native
  var LIGHTSKYBLUE: Color = js.native
  var LIGHTSLATEGRAY: Color = js.native
  var LIGHTSLATEGREY: Color = js.native
  var LIGHTSTEELBLUE: Color = js.native
  var LIGHTYELLOW: Color = js.native
  var LIME: Color = js.native
  var LIMEGREEN: Color = js.native
  var LINEN: Color = js.native
  var MAGENTA: Color = js.native
  var MAROON: Color = js.native
  var MEDIUMAQUAMARINE: Color = js.native
  var MEDIUMBLUE: Color = js.native
  var MEDIUMORCHID: Color = js.native
  var MEDIUMPURPLE: Color = js.native
  var MEDIUMSEAGREEN: Color = js.native
  var MEDIUMSLATEBLUE: Color = js.native
  var MEDIUMSPRINGGREEN: Color = js.native
  var MEDIUMTURQUOISE: Color = js.native
  var MEDIUMVIOLETRED: Color = js.native
  var MIDNIGHTBLUE: Color = js.native
  var MINTCREAM: Color = js.native
  var MISTYROSE: Color = js.native
  var MOCCASIN: Color = js.native
  var NAVAJOWHITE: Color = js.native
  var NAVY: Color = js.native
  var OLDLACE: Color = js.native
  var OLIVE: Color = js.native
  var OLIVEDRAB: Color = js.native
  var ORANGE: Color = js.native
  var ORANGERED: Color = js.native
  var ORCHID: Color = js.native
  var PALEGOLDENROD: Color = js.native
  var PALEGREEN: Color = js.native
  var PALETURQUOISE: Color = js.native
  var PALEVIOLETRED: Color = js.native
  var PAPAYAWHIP: Color = js.native
  var PEACHPUFF: Color = js.native
  var PERU: Color = js.native
  var PINK: Color = js.native
  var PLUM: Color = js.native
  var POWDERBLUE: Color = js.native
  var PURPLE: Color = js.native
  var RED: Color = js.native
  var ROSYBROWN: Color = js.native
  var ROYALBLUE: Color = js.native
  var SADDLEBROWN: Color = js.native
  var SALMON: Color = js.native
  var SANDYBROWN: Color = js.native
  var SEAGREEN: Color = js.native
  var SEASHELL: Color = js.native
  var SIENNA: Color = js.native
  var SILVER: Color = js.native
  var SKYBLUE: Color = js.native
  var SLATEBLUE: Color = js.native
  var SLATEGRAY: Color = js.native
  var SLATEGREY: Color = js.native
  var SNOW: Color = js.native
  var SPRINGGREEN: Color = js.native
  var STEELBLUE: Color = js.native
  var TAN: Color = js.native
  var TEAL: Color = js.native
  var THISTLE: Color = js.native
  var TOMATO: Color = js.native
  var TRANSPARENT: Color = js.native
  var TURQUOISE: Color = js.native
  var VIOLET: Color = js.native
  var WHEAT: Color = js.native
  var WHITE: Color = js.native
  var WHITESMOKE: Color = js.native
  var YELLOW: Color = js.native
  var YELLOWGREEN: Color = js.native
  def add(left: Color, right: Color): Color = js.native
  def add(left: Color, right: Color, result: Color): Color = js.native
  def byteToFloat(number: Double): Double = js.native
  def clone(color: Color): Color = js.native
  def clone(color: Color, result: Color): Color = js.native
  def divide(left: Color, right: Color): Color = js.native
  def divide(left: Color, right: Color, result: Color): Color = js.native
  def divideByScalar(color: Color, scalar: Double): Color = js.native
  def divideByScalar(color: Color, scalar: Double, result: Color): Color = js.native
  def equals(left: Color, right: Color): Boolean = js.native
  def floatToByte(number: Double): Double = js.native
  def fromAlpha(color: Color, alpha: Double): Color = js.native
  def fromAlpha(color: Color, alpha: Double, result: Color): Color = js.native
  def fromBytes(): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double
  ): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double,
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: Double,
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: js.UndefOr[scala.Nothing],
    blue: Double,
    alpha: Double,
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: Double): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: Double,
    blue: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: Double,
    blue: js.UndefOr[scala.Nothing],
    alpha: Double,
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: Double, blue: Double): Color = js.native
  def fromBytes(
    red: js.UndefOr[scala.Nothing],
    green: Double,
    blue: Double,
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double): Color = js.native
  def fromBytes(red: js.UndefOr[scala.Nothing], green: Double, blue: Double, alpha: Double, result: Color): Color = js.native
  def fromBytes(red: Double): Color = js.native
  def fromBytes(
    red: Double,
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: Double, green: js.UndefOr[scala.Nothing], blue: js.UndefOr[scala.Nothing], alpha: Double): Color = js.native
  def fromBytes(
    red: Double,
    green: js.UndefOr[scala.Nothing],
    blue: js.UndefOr[scala.Nothing],
    alpha: Double,
    result: Color
  ): Color = js.native
  def fromBytes(red: Double, green: js.UndefOr[scala.Nothing], blue: Double): Color = js.native
  def fromBytes(
    red: Double,
    green: js.UndefOr[scala.Nothing],
    blue: Double,
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: Double, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double): Color = js.native
  def fromBytes(red: Double, green: js.UndefOr[scala.Nothing], blue: Double, alpha: Double, result: Color): Color = js.native
  def fromBytes(red: Double, green: Double): Color = js.native
  def fromBytes(
    red: Double,
    green: Double,
    blue: js.UndefOr[scala.Nothing],
    alpha: js.UndefOr[scala.Nothing],
    result: Color
  ): Color = js.native
  def fromBytes(red: Double, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double): Color = js.native
  def fromBytes(red: Double, green: Double, blue: js.UndefOr[scala.Nothing], alpha: Double, result: Color): Color = js.native
  def fromBytes(red: Double, green: Double, blue: Double): Color = js.native
  def fromBytes(red: Double, green: Double, blue: Double, alpha: js.UndefOr[scala.Nothing], result: Color): Color = js.native
  def fromBytes(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
  def fromBytes(red: Double, green: Double, blue: Double, alpha: Double, result: Color): Color = js.native
  def fromCartesian4(cartesian: Cartesian4): Color = js.native
  def fromCartesian4(cartesian: Cartesian4, result: Color): Color = js.native
  def fromCssColorString(color: String): Color = js.native
  def fromHsl(): Color = js.native
  def fromHsl(
    hue: js.UndefOr[scala.Nothing],
    saturation: js.UndefOr[scala.Nothing],
    lightness: js.UndefOr[scala.Nothing],
    alpha: Double
  ): Color = js.native
  def fromHsl(hue: js.UndefOr[scala.Nothing], saturation: js.UndefOr[scala.Nothing], lightness: Double): Color = js.native
  def fromHsl(
    hue: js.UndefOr[scala.Nothing],
    saturation: js.UndefOr[scala.Nothing],
    lightness: Double,
    alpha: Double
  ): Color = js.native
  def fromHsl(hue: js.UndefOr[scala.Nothing], saturation: Double): Color = js.native
  def fromHsl(
    hue: js.UndefOr[scala.Nothing],
    saturation: Double,
    lightness: js.UndefOr[scala.Nothing],
    alpha: Double
  ): Color = js.native
  def fromHsl(hue: js.UndefOr[scala.Nothing], saturation: Double, lightness: Double): Color = js.native
  def fromHsl(hue: js.UndefOr[scala.Nothing], saturation: Double, lightness: Double, alpha: Double): Color = js.native
  def fromHsl(hue: Double): Color = js.native
  def fromHsl(
    hue: Double,
    saturation: js.UndefOr[scala.Nothing],
    lightness: js.UndefOr[scala.Nothing],
    alpha: Double
  ): Color = js.native
  def fromHsl(hue: Double, saturation: js.UndefOr[scala.Nothing], lightness: Double): Color = js.native
  def fromHsl(hue: Double, saturation: js.UndefOr[scala.Nothing], lightness: Double, alpha: Double): Color = js.native
  def fromHsl(hue: Double, saturation: Double): Color = js.native
  def fromHsl(hue: Double, saturation: Double, lightness: js.UndefOr[scala.Nothing], alpha: Double): Color = js.native
  def fromHsl(hue: Double, saturation: Double, lightness: Double): Color = js.native
  def fromHsl(hue: Double, saturation: Double, lightness: Double, alpha: Double): Color = js.native
  def fromRandom(): Color = js.native
  def fromRandom(options: js.UndefOr[scala.Nothing], result: Color): Color = js.native
  def fromRandom(options: Alpha): Color = js.native
  def fromRandom(options: Alpha, result: Color): Color = js.native
  def fromRgba(rgba: Double): Color = js.native
  /**
    * Computes the linear interpolation or extrapolation at t between the provided colors.
    */
  def lerp(start: Color, end: Color, t: Double, result: Color): Color = js.native
  def mod(left: Color, right: Color): Color = js.native
  def mod(left: Color, right: Color, result: Color): Color = js.native
  def multiply(left: Color, right: Color): Color = js.native
  def multiply(left: Color, right: Color, result: Color): Color = js.native
  def multiplyByScalar(color: Color, scalar: Double): Color = js.native
  def multiplyByScalar(color: Color, scalar: Double, result: Color): Color = js.native
  def pack(value: Color, array: js.Array[Double]): js.Array[Double] = js.native
  def pack(value: Color, array: js.Array[Double], startingIndex: Double): js.Array[Double] = js.native
  def subtract(left: Color, right: Color): Color = js.native
  def subtract(left: Color, right: Color, result: Color): Color = js.native
  def unpack(array: js.Array[Double]): Color = js.native
  def unpack(array: js.Array[Double], startingIndex: js.UndefOr[scala.Nothing], result: Color): Color = js.native
  def unpack(array: js.Array[Double], startingIndex: Double): Color = js.native
  def unpack(array: js.Array[Double], startingIndex: Double, result: Color): Color = js.native
}

