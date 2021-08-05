package typings.cesium.mod

import typings.cesium.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Color")
@js.native
class Color () extends Packable {
  def this(red: Double) = this()
  def this(red: Double, green: Double) = this()
  def this(red: Unit, green: Double) = this()
  def this(red: Double, green: Double, blue: Double) = this()
  def this(red: Double, green: Unit, blue: Double) = this()
  def this(red: Unit, green: Double, blue: Double) = this()
  def this(red: Unit, green: Unit, blue: Double) = this()
  def this(red: Double, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Double, green: Unit, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Double, blue: Unit, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Double, alpha: Double) = this()
  def this(red: Unit, green: Unit, blue: Unit, alpha: Double) = this()
  
  var alpha: Double = js.native
  
  var blue: Double = js.native
  
  def brighten(magnitude: Double, result: Color): Color = js.native
  
  def clone(result: Color): Color = js.native
  
  def darken(magnitude: Double, result: Color): Color = js.native
  
  def equals(other: Color): Boolean = js.native
  
  def equalsEpsilon(other: Color): Boolean = js.native
  def equalsEpsilon(other: Color, epsilon: Double): Boolean = js.native
  
  var green: Double = js.native
  
  var red: Double = js.native
  
  def toBytes(): js.Array[Double] = js.native
  def toBytes(result: js.Array[Double]): js.Array[Double] = js.native
  
  def toCssColorString(): String = js.native
  
  def toRgba(): Double = js.native
  
  def withAlpha(alpha: Double): Color = js.native
  def withAlpha(alpha: Double, result: Color): Color = js.native
}
object Color {
  
  @JSImport("cesium", "Color")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "Color.ALICEBLUE")
  @js.native
  def ALICEBLUE: Color = js.native
  inline def ALICEBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALICEBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.ANTIQUEWHITE")
  @js.native
  def ANTIQUEWHITE: Color = js.native
  inline def ANTIQUEWHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANTIQUEWHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.AQUA")
  @js.native
  def AQUA: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.AQUAMARINE")
  @js.native
  def AQUAMARINE: Color = js.native
  inline def AQUAMARINE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AQUAMARINE")(x.asInstanceOf[js.Any])
  
  inline def AQUA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AQUA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.AZURE")
  @js.native
  def AZURE: Color = js.native
  inline def AZURE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AZURE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BEIGE")
  @js.native
  def BEIGE: Color = js.native
  inline def BEIGE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BEIGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BISQUE")
  @js.native
  def BISQUE: Color = js.native
  inline def BISQUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BISQUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BLACK")
  @js.native
  def BLACK: Color = js.native
  inline def BLACK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLACK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BLANCHEDALMOND")
  @js.native
  def BLANCHEDALMOND: Color = js.native
  inline def BLANCHEDALMOND_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLANCHEDALMOND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BLUE")
  @js.native
  def BLUE: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.BLUEVIOLET")
  @js.native
  def BLUEVIOLET: Color = js.native
  inline def BLUEVIOLET_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUEVIOLET")(x.asInstanceOf[js.Any])
  
  inline def BLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BROWN")
  @js.native
  def BROWN: Color = js.native
  inline def BROWN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BROWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.BURLYWOOD")
  @js.native
  def BURLYWOOD: Color = js.native
  inline def BURLYWOOD_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BURLYWOOD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CADETBLUE")
  @js.native
  def CADETBLUE: Color = js.native
  inline def CADETBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CADETBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CHARTREUSE")
  @js.native
  def CHARTREUSE: Color = js.native
  inline def CHARTREUSE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHARTREUSE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CHOCOLATE")
  @js.native
  def CHOCOLATE: Color = js.native
  inline def CHOCOLATE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHOCOLATE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CORAL")
  @js.native
  def CORAL: Color = js.native
  inline def CORAL_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CORNFLOWERBLUE")
  @js.native
  def CORNFLOWERBLUE: Color = js.native
  inline def CORNFLOWERBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORNFLOWERBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CORNSILK")
  @js.native
  def CORNSILK: Color = js.native
  inline def CORNSILK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CORNSILK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CRIMSON")
  @js.native
  def CRIMSON: Color = js.native
  inline def CRIMSON_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CRIMSON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.CYAN")
  @js.native
  def CYAN: Color = js.native
  inline def CYAN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CYAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKBLUE")
  @js.native
  def DARKBLUE: Color = js.native
  inline def DARKBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKCYAN")
  @js.native
  def DARKCYAN: Color = js.native
  inline def DARKCYAN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKCYAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKGOLDENROD")
  @js.native
  def DARKGOLDENROD: Color = js.native
  inline def DARKGOLDENROD_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKGOLDENROD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKGRAY")
  @js.native
  def DARKGRAY: Color = js.native
  inline def DARKGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKGREEN")
  @js.native
  def DARKGREEN: Color = js.native
  inline def DARKGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKGREY")
  @js.native
  def DARKGREY: Color = js.native
  inline def DARKGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKKHAKI")
  @js.native
  def DARKKHAKI: Color = js.native
  inline def DARKKHAKI_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKKHAKI")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKMAGENTA")
  @js.native
  def DARKMAGENTA: Color = js.native
  inline def DARKMAGENTA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKMAGENTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKOLIVEGREEN")
  @js.native
  def DARKOLIVEGREEN: Color = js.native
  inline def DARKOLIVEGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKOLIVEGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKORANGE")
  @js.native
  def DARKORANGE: Color = js.native
  inline def DARKORANGE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKORANGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKORCHID")
  @js.native
  def DARKORCHID: Color = js.native
  inline def DARKORCHID_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKORCHID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKRED")
  @js.native
  def DARKRED: Color = js.native
  inline def DARKRED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKSALMON")
  @js.native
  def DARKSALMON: Color = js.native
  inline def DARKSALMON_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKSALMON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKSEAGREEN")
  @js.native
  def DARKSEAGREEN: Color = js.native
  inline def DARKSEAGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKSEAGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKSLATEBLUE")
  @js.native
  def DARKSLATEBLUE: Color = js.native
  inline def DARKSLATEBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKSLATEBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKSLATEGRAY")
  @js.native
  def DARKSLATEGRAY: Color = js.native
  inline def DARKSLATEGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKSLATEGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKSLATEGREY")
  @js.native
  def DARKSLATEGREY: Color = js.native
  inline def DARKSLATEGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKSLATEGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKTURQUOISE")
  @js.native
  def DARKTURQUOISE: Color = js.native
  inline def DARKTURQUOISE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKTURQUOISE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DARKVIOLET")
  @js.native
  def DARKVIOLET: Color = js.native
  inline def DARKVIOLET_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARKVIOLET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DEEPPINK")
  @js.native
  def DEEPPINK: Color = js.native
  inline def DEEPPINK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEEPPINK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DEEPSKYBLUE")
  @js.native
  def DEEPSKYBLUE: Color = js.native
  inline def DEEPSKYBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEEPSKYBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DIMGRAY")
  @js.native
  def DIMGRAY: Color = js.native
  inline def DIMGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIMGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DIMGREY")
  @js.native
  def DIMGREY: Color = js.native
  inline def DIMGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIMGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.DODGERBLUE")
  @js.native
  def DODGERBLUE: Color = js.native
  inline def DODGERBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DODGERBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.FIREBRICK")
  @js.native
  def FIREBRICK: Color = js.native
  inline def FIREBRICK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIREBRICK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.FLORALWHITE")
  @js.native
  def FLORALWHITE: Color = js.native
  inline def FLORALWHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLORALWHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.FORESTGREEN")
  @js.native
  def FORESTGREEN: Color = js.native
  inline def FORESTGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORESTGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.FUSCHIA")
  @js.native
  def FUSCHIA: Color = js.native
  inline def FUSCHIA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FUSCHIA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GAINSBORO")
  @js.native
  def GAINSBORO: Color = js.native
  inline def GAINSBORO_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GAINSBORO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GHOSTWHITE")
  @js.native
  def GHOSTWHITE: Color = js.native
  inline def GHOSTWHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GHOSTWHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GOLD")
  @js.native
  def GOLD: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.GOLDENROD")
  @js.native
  def GOLDENROD: Color = js.native
  inline def GOLDENROD_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLDENROD")(x.asInstanceOf[js.Any])
  
  inline def GOLD_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GOLD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GRAY")
  @js.native
  def GRAY: Color = js.native
  inline def GRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GREEN")
  @js.native
  def GREEN: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.GREENYELLOW")
  @js.native
  def GREENYELLOW: Color = js.native
  inline def GREENYELLOW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREENYELLOW")(x.asInstanceOf[js.Any])
  
  inline def GREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.GREY")
  @js.native
  def GREY: Color = js.native
  inline def GREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.HONEYDEW")
  @js.native
  def HONEYDEW: Color = js.native
  inline def HONEYDEW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HONEYDEW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.HOTPINK")
  @js.native
  def HOTPINK: Color = js.native
  inline def HOTPINK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOTPINK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.INDIANRED")
  @js.native
  def INDIANRED: Color = js.native
  inline def INDIANRED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIANRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.INDIGO")
  @js.native
  def INDIGO: Color = js.native
  inline def INDIGO_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDIGO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.IVORY")
  @js.native
  def IVORY: Color = js.native
  inline def IVORY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IVORY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.KHAKI")
  @js.native
  def KHAKI: Color = js.native
  inline def KHAKI_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KHAKI")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LAVENDAR_BLUSH")
  @js.native
  def LAVENDAR_BLUSH: Color = js.native
  inline def LAVENDAR_BLUSH_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAVENDAR_BLUSH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LAVENDER")
  @js.native
  def LAVENDER: Color = js.native
  inline def LAVENDER_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAVENDER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LAWNGREEN")
  @js.native
  def LAWNGREEN: Color = js.native
  inline def LAWNGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAWNGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LEMONCHIFFON")
  @js.native
  def LEMONCHIFFON: Color = js.native
  inline def LEMONCHIFFON_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEMONCHIFFON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTBLUE")
  @js.native
  def LIGHTBLUE: Color = js.native
  inline def LIGHTBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTCORAL")
  @js.native
  def LIGHTCORAL: Color = js.native
  inline def LIGHTCORAL_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTCORAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTCYAN")
  @js.native
  def LIGHTCYAN: Color = js.native
  inline def LIGHTCYAN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTCYAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTGOLDENRODYELLOW")
  @js.native
  def LIGHTGOLDENRODYELLOW: Color = js.native
  inline def LIGHTGOLDENRODYELLOW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTGOLDENRODYELLOW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTGRAY")
  @js.native
  def LIGHTGRAY: Color = js.native
  inline def LIGHTGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTGREEN")
  @js.native
  def LIGHTGREEN: Color = js.native
  inline def LIGHTGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTGREY")
  @js.native
  def LIGHTGREY: Color = js.native
  inline def LIGHTGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTPINK")
  @js.native
  def LIGHTPINK: Color = js.native
  inline def LIGHTPINK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTPINK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTSEAGREEN")
  @js.native
  def LIGHTSEAGREEN: Color = js.native
  inline def LIGHTSEAGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTSEAGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTSKYBLUE")
  @js.native
  def LIGHTSKYBLUE: Color = js.native
  inline def LIGHTSKYBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTSKYBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTSLATEGRAY")
  @js.native
  def LIGHTSLATEGRAY: Color = js.native
  inline def LIGHTSLATEGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTSLATEGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTSLATEGREY")
  @js.native
  def LIGHTSLATEGREY: Color = js.native
  inline def LIGHTSLATEGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTSLATEGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTSTEELBLUE")
  @js.native
  def LIGHTSTEELBLUE: Color = js.native
  inline def LIGHTSTEELBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTSTEELBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIGHTYELLOW")
  @js.native
  def LIGHTYELLOW: Color = js.native
  inline def LIGHTYELLOW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIGHTYELLOW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LIME")
  @js.native
  def LIME: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.LIMEGREEN")
  @js.native
  def LIMEGREEN: Color = js.native
  inline def LIMEGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIMEGREEN")(x.asInstanceOf[js.Any])
  
  inline def LIME_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.LINEN")
  @js.native
  def LINEN: Color = js.native
  inline def LINEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MAGENTA")
  @js.native
  def MAGENTA: Color = js.native
  inline def MAGENTA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAGENTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MAROON")
  @js.native
  def MAROON: Color = js.native
  inline def MAROON_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAROON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMAQUAMARINE")
  @js.native
  def MEDIUMAQUAMARINE: Color = js.native
  inline def MEDIUMAQUAMARINE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMAQUAMARINE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMBLUE")
  @js.native
  def MEDIUMBLUE: Color = js.native
  inline def MEDIUMBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMORCHID")
  @js.native
  def MEDIUMORCHID: Color = js.native
  inline def MEDIUMORCHID_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMORCHID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMPURPLE")
  @js.native
  def MEDIUMPURPLE: Color = js.native
  inline def MEDIUMPURPLE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMPURPLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMSEAGREEN")
  @js.native
  def MEDIUMSEAGREEN: Color = js.native
  inline def MEDIUMSEAGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMSEAGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMSLATEBLUE")
  @js.native
  def MEDIUMSLATEBLUE: Color = js.native
  inline def MEDIUMSLATEBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMSLATEBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMSPRINGGREEN")
  @js.native
  def MEDIUMSPRINGGREEN: Color = js.native
  inline def MEDIUMSPRINGGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMSPRINGGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMTURQUOISE")
  @js.native
  def MEDIUMTURQUOISE: Color = js.native
  inline def MEDIUMTURQUOISE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMTURQUOISE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MEDIUMVIOLETRED")
  @js.native
  def MEDIUMVIOLETRED: Color = js.native
  inline def MEDIUMVIOLETRED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIUMVIOLETRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MIDNIGHTBLUE")
  @js.native
  def MIDNIGHTBLUE: Color = js.native
  inline def MIDNIGHTBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIDNIGHTBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MINTCREAM")
  @js.native
  def MINTCREAM: Color = js.native
  inline def MINTCREAM_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINTCREAM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MISTYROSE")
  @js.native
  def MISTYROSE: Color = js.native
  inline def MISTYROSE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISTYROSE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.MOCCASIN")
  @js.native
  def MOCCASIN: Color = js.native
  inline def MOCCASIN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOCCASIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.NAVAJOWHITE")
  @js.native
  def NAVAJOWHITE: Color = js.native
  inline def NAVAJOWHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVAJOWHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.NAVY")
  @js.native
  def NAVY: Color = js.native
  inline def NAVY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.OLDLACE")
  @js.native
  def OLDLACE: Color = js.native
  inline def OLDLACE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OLDLACE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.OLIVE")
  @js.native
  def OLIVE: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.OLIVEDRAB")
  @js.native
  def OLIVEDRAB: Color = js.native
  inline def OLIVEDRAB_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OLIVEDRAB")(x.asInstanceOf[js.Any])
  
  inline def OLIVE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OLIVE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.ORANGE")
  @js.native
  def ORANGE: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.ORANGERED")
  @js.native
  def ORANGERED: Color = js.native
  inline def ORANGERED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGERED")(x.asInstanceOf[js.Any])
  
  inline def ORANGE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORANGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.ORCHID")
  @js.native
  def ORCHID: Color = js.native
  inline def ORCHID_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORCHID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PALEGOLDENROD")
  @js.native
  def PALEGOLDENROD: Color = js.native
  inline def PALEGOLDENROD_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PALEGOLDENROD")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PALEGREEN")
  @js.native
  def PALEGREEN: Color = js.native
  inline def PALEGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PALEGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PALETURQUOISE")
  @js.native
  def PALETURQUOISE: Color = js.native
  inline def PALETURQUOISE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PALETURQUOISE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PALEVIOLETRED")
  @js.native
  def PALEVIOLETRED: Color = js.native
  inline def PALEVIOLETRED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PALEVIOLETRED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PAPAYAWHIP")
  @js.native
  def PAPAYAWHIP: Color = js.native
  inline def PAPAYAWHIP_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAPAYAWHIP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PEACHPUFF")
  @js.native
  def PEACHPUFF: Color = js.native
  inline def PEACHPUFF_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PEACHPUFF")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PERU")
  @js.native
  def PERU: Color = js.native
  inline def PERU_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERU")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PINK")
  @js.native
  def PINK: Color = js.native
  inline def PINK_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PINK")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PLUM")
  @js.native
  def PLUM: Color = js.native
  inline def PLUM_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLUM")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.POWDERBLUE")
  @js.native
  def POWDERBLUE: Color = js.native
  inline def POWDERBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POWDERBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.PURPLE")
  @js.native
  def PURPLE: Color = js.native
  inline def PURPLE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PURPLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.RED")
  @js.native
  def RED: Color = js.native
  inline def RED_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.ROSYBROWN")
  @js.native
  def ROSYBROWN: Color = js.native
  inline def ROSYBROWN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROSYBROWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.ROYALBLUE")
  @js.native
  def ROYALBLUE: Color = js.native
  inline def ROYALBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROYALBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SADDLEBROWN")
  @js.native
  def SADDLEBROWN: Color = js.native
  inline def SADDLEBROWN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SADDLEBROWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SALMON")
  @js.native
  def SALMON: Color = js.native
  inline def SALMON_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SALMON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SANDYBROWN")
  @js.native
  def SANDYBROWN: Color = js.native
  inline def SANDYBROWN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SANDYBROWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SEAGREEN")
  @js.native
  def SEAGREEN: Color = js.native
  inline def SEAGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEAGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SEASHELL")
  @js.native
  def SEASHELL: Color = js.native
  inline def SEASHELL_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEASHELL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SIENNA")
  @js.native
  def SIENNA: Color = js.native
  inline def SIENNA_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIENNA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SILVER")
  @js.native
  def SILVER: Color = js.native
  inline def SILVER_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SILVER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SKYBLUE")
  @js.native
  def SKYBLUE: Color = js.native
  inline def SKYBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SKYBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SLATEBLUE")
  @js.native
  def SLATEBLUE: Color = js.native
  inline def SLATEBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLATEBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SLATEGRAY")
  @js.native
  def SLATEGRAY: Color = js.native
  inline def SLATEGRAY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLATEGRAY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SLATEGREY")
  @js.native
  def SLATEGREY: Color = js.native
  inline def SLATEGREY_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SLATEGREY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SNOW")
  @js.native
  def SNOW: Color = js.native
  inline def SNOW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SNOW")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.SPRINGGREEN")
  @js.native
  def SPRINGGREEN: Color = js.native
  inline def SPRINGGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPRINGGREEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.STEELBLUE")
  @js.native
  def STEELBLUE: Color = js.native
  inline def STEELBLUE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STEELBLUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.TAN")
  @js.native
  def TAN: Color = js.native
  inline def TAN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.TEAL")
  @js.native
  def TEAL: Color = js.native
  inline def TEAL_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEAL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.THISTLE")
  @js.native
  def THISTLE: Color = js.native
  inline def THISTLE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THISTLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.TOMATO")
  @js.native
  def TOMATO: Color = js.native
  inline def TOMATO_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOMATO")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.TRANSPARENT")
  @js.native
  def TRANSPARENT: Color = js.native
  inline def TRANSPARENT_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSPARENT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.TURQUOISE")
  @js.native
  def TURQUOISE: Color = js.native
  inline def TURQUOISE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TURQUOISE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.VIOLET")
  @js.native
  def VIOLET: Color = js.native
  inline def VIOLET_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIOLET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.WHEAT")
  @js.native
  def WHEAT: Color = js.native
  inline def WHEAT_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHEAT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.WHITE")
  @js.native
  def WHITE: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.WHITESMOKE")
  @js.native
  def WHITESMOKE: Color = js.native
  inline def WHITESMOKE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITESMOKE")(x.asInstanceOf[js.Any])
  
  inline def WHITE_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "Color.YELLOW")
  @js.native
  def YELLOW: Color = js.native
  
  /* static member */
  @JSImport("cesium", "Color.YELLOWGREEN")
  @js.native
  def YELLOWGREEN: Color = js.native
  inline def YELLOWGREEN_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YELLOWGREEN")(x.asInstanceOf[js.Any])
  
  inline def YELLOW_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YELLOW")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def add(left: Color, right: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def add(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def byteToFloat(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteToFloat")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def clone_(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def clone_(color: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(color.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def divide(left: Color, right: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def divide(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def divideByScalar(color: Color, scalar: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def divideByScalar(color: Color, scalar: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("divideByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def equals_(left: Color, right: Color): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def floatToByte(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floatToByte")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /* static member */
  inline def fromAlpha(color: Color, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlpha")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromAlpha(color: Color, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromAlpha")(color.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def fromBytes(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")().asInstanceOf[Color]
  inline def fromBytes(red: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Double, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Double, green: Unit, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Double, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Double, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromBytes(red: Unit, green: Unit, blue: Unit, alpha: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def fromCartesian4(cartesian: Cartesian4): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromCartesian4(cartesian: Cartesian4, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian4")(cartesian.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def fromCssColorString(color: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCssColorString")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /* static member */
  inline def fromHsl(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")().asInstanceOf[Color]
  inline def fromHsl(hue: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Double, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Double, saturation: Unit, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Double, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Double, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromHsl(hue: Unit, saturation: Unit, lightness: Unit, alpha: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromHsl")(hue.asInstanceOf[js.Any], saturation.asInstanceOf[js.Any], lightness.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def fromRandom(): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")().asInstanceOf[Color]
  inline def fromRandom(options: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def fromRandom(options: Alpha): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def fromRandom(options: Alpha, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRandom")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def fromRgba(rgba: Double): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRgba")(rgba.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  /**
    * Computes the linear interpolation or extrapolation at t between the provided colors.
    */
  /* static member */
  inline def lerp(start: Color, end: Color, t: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], t.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def mod(left: Color, right: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def mod(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("mod")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def multiply(left: Color, right: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def multiply(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def multiplyByScalar(color: Color, scalar: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def multiplyByScalar(color: Color, scalar: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyByScalar")(color.asInstanceOf[js.Any], scalar.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def pack(value: Color, array: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def pack(value: Color, array: js.Array[Double], startingIndex: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("pack")(value.asInstanceOf[js.Any], array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /* static member */
  inline def subtract(left: Color, right: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def subtract(left: Color, right: Color, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  /* static member */
  inline def unpack(array: js.Array[Double]): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any]).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Double, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
  inline def unpack(array: js.Array[Double], startingIndex: Unit, result: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("unpack")(array.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Color]
}
