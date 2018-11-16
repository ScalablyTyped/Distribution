package typings
package chalkLib.chalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chalk extends js.Object {
  val bgBlack: this.type = js.native
  val bgBlackBright: this.type = js.native
  val bgBlue: this.type = js.native
  val bgBlueBright: this.type = js.native
  val bgCyan: this.type = js.native
  val bgCyanBright: this.type = js.native
  val bgGreen: this.type = js.native
  val bgGreenBright: this.type = js.native
  val bgMagenta: this.type = js.native
  val bgMagentaBright: this.type = js.native
  val bgRed: this.type = js.native
  val bgRedBright: this.type = js.native
  val bgWhite: this.type = js.native
  val bgWhiteBright: this.type = js.native
  val bgYellow: this.type = js.native
  val bgYellowBright: this.type = js.native
  val black: this.type = js.native
  val blackBright: this.type = js.native
  val blue: this.type = js.native
  val blueBright: this.type = js.native
  val bold: this.type = js.native
  @JSName("constructor")
  var constructor_Original: ChalkConstructor = js.native
  val cyan: this.type = js.native
  val cyanBright: this.type = js.native
  val dim: this.type = js.native
  var enabled: scala.Boolean = js.native
  val gray: this.type = js.native
  val green: this.type = js.native
  val greenBright: this.type = js.native
  val grey: this.type = js.native
  val hidden: this.type = js.native
  val inverse: this.type = js.native
  val italic: this.type = js.native
  var level: Level = js.native
  val magenta: this.type = js.native
  val magentaBright: this.type = js.native
  val red: this.type = js.native
  val redBright: this.type = js.native
  val reset: this.type = js.native
  val strikethrough: this.type = js.native
  val underline: this.type = js.native
  val visible: this.type = js.native
  val white: this.type = js.native
  val whiteBright: this.type = js.native
  val yellow: this.type = js.native
  val yellowBright: this.type = js.native
  def apply(text: java.lang.String*): java.lang.String = js.native
  def apply(text: stdLib.TemplateStringsArray, placeholders: java.lang.String*): java.lang.String = js.native
  def bgHex(color: java.lang.String): this.type = js.native
  def bgHsl(h: scala.Double, s: scala.Double, l: scala.Double): this.type = js.native
  def bgHsv(h: scala.Double, s: scala.Double, v: scala.Double): this.type = js.native
  def bgHwb(h: scala.Double, w: scala.Double, b: scala.Double): this.type = js.native
  def bgKeyword(color: java.lang.String): this.type = js.native
  def bgRgb(r: scala.Double, g: scala.Double, b: scala.Double): this.type = js.native
  def hex(color: java.lang.String): this.type = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): this.type = js.native
  def hsv(h: scala.Double, s: scala.Double, v: scala.Double): this.type = js.native
  def hwb(h: scala.Double, w: scala.Double, b: scala.Double): this.type = js.native
  def keyword(color: java.lang.String): this.type = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): this.type = js.native
}

