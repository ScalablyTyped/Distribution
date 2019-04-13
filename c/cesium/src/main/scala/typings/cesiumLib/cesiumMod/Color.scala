package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "Color")
@js.native
class Color () extends Packable {
  def this(red: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double) = this()
  def this(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double) = this()
  var alpha: scala.Double = js.native
  var blue: scala.Double = js.native
  var green: scala.Double = js.native
  var red: scala.Double = js.native
  def brighten(magnitude: scala.Double, result: Color): Color = js.native
  def clone(result: Color): Color = js.native
  def darken(magnitude: scala.Double, result: Color): Color = js.native
  def equals(other: Color): scala.Boolean = js.native
  def equalsEpsilon(other: Color): scala.Boolean = js.native
  def equalsEpsilon(other: Color, epsilon: scala.Double): scala.Boolean = js.native
  def toBytes(): js.Array[scala.Double] = js.native
  def toBytes(result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toCssColorString(): java.lang.String = js.native
  def toRgba(): scala.Double = js.native
  def withAlpha(alpha: scala.Double): Color = js.native
  def withAlpha(alpha: scala.Double, result: Color): Color = js.native
}

/* static members */
@JSImport("cesium", "Color")
@js.native
object Color extends js.Object {
  var ALICEBLUE: cesiumLib.cesiumMod.Color = js.native
  var ANTIQUEWHITE: cesiumLib.cesiumMod.Color = js.native
  var AQUA: cesiumLib.cesiumMod.Color = js.native
  var AQUAMARINE: cesiumLib.cesiumMod.Color = js.native
  var AZURE: cesiumLib.cesiumMod.Color = js.native
  var BEIGE: cesiumLib.cesiumMod.Color = js.native
  var BISQUE: cesiumLib.cesiumMod.Color = js.native
  var BLACK: cesiumLib.cesiumMod.Color = js.native
  var BLANCHEDALMOND: cesiumLib.cesiumMod.Color = js.native
  var BLUE: cesiumLib.cesiumMod.Color = js.native
  var BLUEVIOLET: cesiumLib.cesiumMod.Color = js.native
  var BROWN: cesiumLib.cesiumMod.Color = js.native
  var BURLYWOOD: cesiumLib.cesiumMod.Color = js.native
  var CADETBLUE: cesiumLib.cesiumMod.Color = js.native
  var CHARTREUSE: cesiumLib.cesiumMod.Color = js.native
  var CHOCOLATE: cesiumLib.cesiumMod.Color = js.native
  var CORAL: cesiumLib.cesiumMod.Color = js.native
  var CORNFLOWERBLUE: cesiumLib.cesiumMod.Color = js.native
  var CORNSILK: cesiumLib.cesiumMod.Color = js.native
  var CRIMSON: cesiumLib.cesiumMod.Color = js.native
  var CYAN: cesiumLib.cesiumMod.Color = js.native
  var DARKBLUE: cesiumLib.cesiumMod.Color = js.native
  var DARKCYAN: cesiumLib.cesiumMod.Color = js.native
  var DARKGOLDENROD: cesiumLib.cesiumMod.Color = js.native
  var DARKGRAY: cesiumLib.cesiumMod.Color = js.native
  var DARKGREEN: cesiumLib.cesiumMod.Color = js.native
  var DARKGREY: cesiumLib.cesiumMod.Color = js.native
  var DARKKHAKI: cesiumLib.cesiumMod.Color = js.native
  var DARKMAGENTA: cesiumLib.cesiumMod.Color = js.native
  var DARKOLIVEGREEN: cesiumLib.cesiumMod.Color = js.native
  var DARKORANGE: cesiumLib.cesiumMod.Color = js.native
  var DARKORCHID: cesiumLib.cesiumMod.Color = js.native
  var DARKRED: cesiumLib.cesiumMod.Color = js.native
  var DARKSALMON: cesiumLib.cesiumMod.Color = js.native
  var DARKSEAGREEN: cesiumLib.cesiumMod.Color = js.native
  var DARKSLATEBLUE: cesiumLib.cesiumMod.Color = js.native
  var DARKSLATEGRAY: cesiumLib.cesiumMod.Color = js.native
  var DARKSLATEGREY: cesiumLib.cesiumMod.Color = js.native
  var DARKTURQUOISE: cesiumLib.cesiumMod.Color = js.native
  var DARKVIOLET: cesiumLib.cesiumMod.Color = js.native
  var DEEPPINK: cesiumLib.cesiumMod.Color = js.native
  var DEEPSKYBLUE: cesiumLib.cesiumMod.Color = js.native
  var DIMGRAY: cesiumLib.cesiumMod.Color = js.native
  var DIMGREY: cesiumLib.cesiumMod.Color = js.native
  var DODGERBLUE: cesiumLib.cesiumMod.Color = js.native
  var FIREBRICK: cesiumLib.cesiumMod.Color = js.native
  var FLORALWHITE: cesiumLib.cesiumMod.Color = js.native
  var FORESTGREEN: cesiumLib.cesiumMod.Color = js.native
  var FUSCHIA: cesiumLib.cesiumMod.Color = js.native
  var GAINSBORO: cesiumLib.cesiumMod.Color = js.native
  var GHOSTWHITE: cesiumLib.cesiumMod.Color = js.native
  var GOLD: cesiumLib.cesiumMod.Color = js.native
  var GOLDENROD: cesiumLib.cesiumMod.Color = js.native
  var GRAY: cesiumLib.cesiumMod.Color = js.native
  var GREEN: cesiumLib.cesiumMod.Color = js.native
  var GREENYELLOW: cesiumLib.cesiumMod.Color = js.native
  var GREY: cesiumLib.cesiumMod.Color = js.native
  var HONEYDEW: cesiumLib.cesiumMod.Color = js.native
  var HOTPINK: cesiumLib.cesiumMod.Color = js.native
  var INDIANRED: cesiumLib.cesiumMod.Color = js.native
  var INDIGO: cesiumLib.cesiumMod.Color = js.native
  var IVORY: cesiumLib.cesiumMod.Color = js.native
  var KHAKI: cesiumLib.cesiumMod.Color = js.native
  var LAVENDAR_BLUSH: cesiumLib.cesiumMod.Color = js.native
  var LAVENDER: cesiumLib.cesiumMod.Color = js.native
  var LAWNGREEN: cesiumLib.cesiumMod.Color = js.native
  var LEMONCHIFFON: cesiumLib.cesiumMod.Color = js.native
  var LIGHTBLUE: cesiumLib.cesiumMod.Color = js.native
  var LIGHTCORAL: cesiumLib.cesiumMod.Color = js.native
  var LIGHTCYAN: cesiumLib.cesiumMod.Color = js.native
  var LIGHTGOLDENRODYELLOW: cesiumLib.cesiumMod.Color = js.native
  var LIGHTGRAY: cesiumLib.cesiumMod.Color = js.native
  var LIGHTGREEN: cesiumLib.cesiumMod.Color = js.native
  var LIGHTGREY: cesiumLib.cesiumMod.Color = js.native
  var LIGHTPINK: cesiumLib.cesiumMod.Color = js.native
  var LIGHTSEAGREEN: cesiumLib.cesiumMod.Color = js.native
  var LIGHTSKYBLUE: cesiumLib.cesiumMod.Color = js.native
  var LIGHTSLATEGRAY: cesiumLib.cesiumMod.Color = js.native
  var LIGHTSLATEGREY: cesiumLib.cesiumMod.Color = js.native
  var LIGHTSTEELBLUE: cesiumLib.cesiumMod.Color = js.native
  var LIGHTYELLOW: cesiumLib.cesiumMod.Color = js.native
  var LIME: cesiumLib.cesiumMod.Color = js.native
  var LIMEGREEN: cesiumLib.cesiumMod.Color = js.native
  var LINEN: cesiumLib.cesiumMod.Color = js.native
  var MAGENTA: cesiumLib.cesiumMod.Color = js.native
  var MAROON: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMAQUAMARINE: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMBLUE: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMORCHID: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMPURPLE: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMSEAGREEN: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMSLATEBLUE: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMSPRINGGREEN: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMTURQUOISE: cesiumLib.cesiumMod.Color = js.native
  var MEDIUMVIOLETRED: cesiumLib.cesiumMod.Color = js.native
  var MIDNIGHTBLUE: cesiumLib.cesiumMod.Color = js.native
  var MINTCREAM: cesiumLib.cesiumMod.Color = js.native
  var MISTYROSE: cesiumLib.cesiumMod.Color = js.native
  var MOCCASIN: cesiumLib.cesiumMod.Color = js.native
  var NAVAJOWHITE: cesiumLib.cesiumMod.Color = js.native
  var NAVY: cesiumLib.cesiumMod.Color = js.native
  var OLDLACE: cesiumLib.cesiumMod.Color = js.native
  var OLIVE: cesiumLib.cesiumMod.Color = js.native
  var OLIVEDRAB: cesiumLib.cesiumMod.Color = js.native
  var ORANGE: cesiumLib.cesiumMod.Color = js.native
  var ORANGERED: cesiumLib.cesiumMod.Color = js.native
  var ORCHID: cesiumLib.cesiumMod.Color = js.native
  var PALEGOLDENROD: cesiumLib.cesiumMod.Color = js.native
  var PALEGREEN: cesiumLib.cesiumMod.Color = js.native
  var PALETURQUOISE: cesiumLib.cesiumMod.Color = js.native
  var PALEVIOLETRED: cesiumLib.cesiumMod.Color = js.native
  var PAPAYAWHIP: cesiumLib.cesiumMod.Color = js.native
  var PEACHPUFF: cesiumLib.cesiumMod.Color = js.native
  var PERU: cesiumLib.cesiumMod.Color = js.native
  var PINK: cesiumLib.cesiumMod.Color = js.native
  var PLUM: cesiumLib.cesiumMod.Color = js.native
  var POWDERBLUE: cesiumLib.cesiumMod.Color = js.native
  var PURPLE: cesiumLib.cesiumMod.Color = js.native
  var RED: cesiumLib.cesiumMod.Color = js.native
  var ROSYBROWN: cesiumLib.cesiumMod.Color = js.native
  var ROYALBLUE: cesiumLib.cesiumMod.Color = js.native
  var SADDLEBROWN: cesiumLib.cesiumMod.Color = js.native
  var SALMON: cesiumLib.cesiumMod.Color = js.native
  var SANDYBROWN: cesiumLib.cesiumMod.Color = js.native
  var SEAGREEN: cesiumLib.cesiumMod.Color = js.native
  var SEASHELL: cesiumLib.cesiumMod.Color = js.native
  var SIENNA: cesiumLib.cesiumMod.Color = js.native
  var SILVER: cesiumLib.cesiumMod.Color = js.native
  var SKYBLUE: cesiumLib.cesiumMod.Color = js.native
  var SLATEBLUE: cesiumLib.cesiumMod.Color = js.native
  var SLATEGRAY: cesiumLib.cesiumMod.Color = js.native
  var SLATEGREY: cesiumLib.cesiumMod.Color = js.native
  var SNOW: cesiumLib.cesiumMod.Color = js.native
  var SPRINGGREEN: cesiumLib.cesiumMod.Color = js.native
  var STEELBLUE: cesiumLib.cesiumMod.Color = js.native
  var TAN: cesiumLib.cesiumMod.Color = js.native
  var TEAL: cesiumLib.cesiumMod.Color = js.native
  var THISTLE: cesiumLib.cesiumMod.Color = js.native
  var TOMATO: cesiumLib.cesiumMod.Color = js.native
  var TRANSPARENT: cesiumLib.cesiumMod.Color = js.native
  var TURQUOISE: cesiumLib.cesiumMod.Color = js.native
  var VIOLET: cesiumLib.cesiumMod.Color = js.native
  var WHEAT: cesiumLib.cesiumMod.Color = js.native
  var WHITE: cesiumLib.cesiumMod.Color = js.native
  var WHITESMOKE: cesiumLib.cesiumMod.Color = js.native
  var YELLOW: cesiumLib.cesiumMod.Color = js.native
  var YELLOWGREEN: cesiumLib.cesiumMod.Color = js.native
  def add(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def add(
    left: cesiumLib.cesiumMod.Color,
    right: cesiumLib.cesiumMod.Color,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def byteToFloat(number: scala.Double): scala.Double = js.native
  def clone(color: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def clone(color: cesiumLib.cesiumMod.Color, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def divide(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def divide(
    left: cesiumLib.cesiumMod.Color,
    right: cesiumLib.cesiumMod.Color,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def divideByScalar(color: cesiumLib.cesiumMod.Color, scalar: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def divideByScalar(color: cesiumLib.cesiumMod.Color, scalar: scala.Double, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def equals(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): scala.Boolean = js.native
  def floatToByte(number: scala.Double): scala.Double = js.native
  def fromAlpha(color: cesiumLib.cesiumMod.Color, alpha: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromAlpha(color: cesiumLib.cesiumMod.Color, alpha: scala.Double, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(red: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(red: scala.Double, green: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(red: scala.Double, green: scala.Double, blue: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(red: scala.Double, green: scala.Double, blue: scala.Double, alpha: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromBytes(
    red: scala.Double,
    green: scala.Double,
    blue: scala.Double,
    alpha: scala.Double,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4): cesiumLib.cesiumMod.Color = js.native
  def fromCartesian4(cartesian: cesiumLib.cesiumMod.Cartesian4, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def fromCssColorString(color: java.lang.String): cesiumLib.cesiumMod.Color = js.native
  def fromHsl(): cesiumLib.cesiumMod.Color = js.native
  def fromHsl(hue: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromHsl(hue: scala.Double, saturation: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromHsl(hue: scala.Double, saturation: scala.Double, lightness: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromHsl(hue: scala.Double, saturation: scala.Double, lightness: scala.Double, alpha: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def fromRandom(): cesiumLib.cesiumMod.Color = js.native
  def fromRandom(options: cesiumLib.Anon_Alpha): cesiumLib.cesiumMod.Color = js.native
  def fromRandom(options: cesiumLib.Anon_Alpha, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def fromRgba(rgba: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def mod(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def mod(
    left: cesiumLib.cesiumMod.Color,
    right: cesiumLib.cesiumMod.Color,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def multiply(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def multiply(
    left: cesiumLib.cesiumMod.Color,
    right: cesiumLib.cesiumMod.Color,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def multiplyByScalar(color: cesiumLib.cesiumMod.Color, scalar: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def multiplyByScalar(color: cesiumLib.cesiumMod.Color, scalar: scala.Double, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def pack(value: cesiumLib.cesiumMod.Color, array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def pack(value: cesiumLib.cesiumMod.Color, array: js.Array[scala.Double], startingIndex: scala.Double): js.Array[scala.Double] = js.native
  def subtract(left: cesiumLib.cesiumMod.Color, right: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
  def subtract(
    left: cesiumLib.cesiumMod.Color,
    right: cesiumLib.cesiumMod.Color,
    result: cesiumLib.cesiumMod.Color
  ): cesiumLib.cesiumMod.Color = js.native
  def unpack(array: js.Array[scala.Double]): cesiumLib.cesiumMod.Color = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double): cesiumLib.cesiumMod.Color = js.native
  def unpack(array: js.Array[scala.Double], startingIndex: scala.Double, result: cesiumLib.cesiumMod.Color): cesiumLib.cesiumMod.Color = js.native
}

