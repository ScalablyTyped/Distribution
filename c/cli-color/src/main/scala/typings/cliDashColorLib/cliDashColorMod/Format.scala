package typings
package cliDashColorLib.cliDashColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var beep: java.lang.String = js.native
  @JSName("bgBlackBright")
  var bgBlackBright_Original: Format = js.native
  @JSName("bgBlack")
  var bgBlack_Original: Format = js.native
  @JSName("bgBlueBright")
  var bgBlueBright_Original: Format = js.native
  @JSName("bgBlue")
  var bgBlue_Original: Format = js.native
  @JSName("bgCyanBright")
  var bgCyanBright_Original: Format = js.native
  @JSName("bgCyan")
  var bgCyan_Original: Format = js.native
  @JSName("bgGreenBright")
  var bgGreenBright_Original: Format = js.native
  @JSName("bgGreen")
  var bgGreen_Original: Format = js.native
  @JSName("bgMagentaBright")
  var bgMagentaBright_Original: Format = js.native
  @JSName("bgMagenta")
  var bgMagenta_Original: Format = js.native
  @JSName("bgRedBright")
  var bgRedBright_Original: Format = js.native
  @JSName("bgRed")
  var bgRed_Original: Format = js.native
  @JSName("bgWhiteBright")
  var bgWhiteBright_Original: Format = js.native
  @JSName("bgWhite")
  var bgWhite_Original: Format = js.native
  @JSName("bgYellowBright")
  var bgYellowBright_Original: Format = js.native
  @JSName("bgYellow")
  var bgYellow_Original: Format = js.native
  @JSName("blackBright")
  var blackBright_Original: Format = js.native
  @JSName("black")
  var black_Original: Format = js.native
  @JSName("blink")
  var blink_Original: Format = js.native
  @JSName("blueBright")
  var blueBright_Original: Format = js.native
  @JSName("blue")
  var blue_Original: Format = js.native
  @JSName("bold")
  var bold_Original: Format = js.native
  @JSName("cyanBright")
  var cyanBright_Original: Format = js.native
  @JSName("cyan")
  var cyan_Original: Format = js.native
  @JSName("greenBright")
  var greenBright_Original: Format = js.native
  @JSName("green")
  var green_Original: Format = js.native
  var height: scala.Double = js.native
  @JSName("inverse")
  var inverse_Original: Format = js.native
  @JSName("italic")
  var italic_Original: Format = js.native
  @JSName("magentaBright")
  var magentaBright_Original: Format = js.native
  @JSName("magenta")
  var magenta_Original: Format = js.native
  @JSName("redBright")
  var redBright_Original: Format = js.native
  @JSName("red")
  var red_Original: Format = js.native
  var reset: java.lang.String = js.native
  @JSName("strike")
  var strike_Original: Format = js.native
  @JSName("underline")
  var underline_Original: Format = js.native
  @JSName("whiteBright")
  var whiteBright_Original: Format = js.native
  @JSName("white")
  var white_Original: Format = js.native
  var width: scala.Double = js.native
  var xtermSupported: scala.Boolean = js.native
  @JSName("yellowBright")
  var yellowBright_Original: Format = js.native
  @JSName("yellow")
  var yellow_Original: Format = js.native
  def apply(text: js.Any*): java.lang.String = js.native
  def bgBlack(text: js.Any*): java.lang.String = js.native
  def bgBlackBright(text: js.Any*): java.lang.String = js.native
  def bgBlue(text: js.Any*): java.lang.String = js.native
  def bgBlueBright(text: js.Any*): java.lang.String = js.native
  def bgCyan(text: js.Any*): java.lang.String = js.native
  def bgCyanBright(text: js.Any*): java.lang.String = js.native
  def bgGreen(text: js.Any*): java.lang.String = js.native
  def bgGreenBright(text: js.Any*): java.lang.String = js.native
  def bgMagenta(text: js.Any*): java.lang.String = js.native
  def bgMagentaBright(text: js.Any*): java.lang.String = js.native
  def bgRed(text: js.Any*): java.lang.String = js.native
  def bgRedBright(text: js.Any*): java.lang.String = js.native
  def bgWhite(text: js.Any*): java.lang.String = js.native
  def bgWhiteBright(text: js.Any*): java.lang.String = js.native
  def bgXterm(color: scala.Double): Format = js.native
  def bgYellow(text: js.Any*): java.lang.String = js.native
  def bgYellowBright(text: js.Any*): java.lang.String = js.native
  def black(text: js.Any*): java.lang.String = js.native
  def blackBright(text: js.Any*): java.lang.String = js.native
  def blink(text: js.Any*): java.lang.String = js.native
  def blue(text: js.Any*): java.lang.String = js.native
  def blueBright(text: js.Any*): java.lang.String = js.native
  def bol(): java.lang.String = js.native
  def bol(n: scala.Double): java.lang.String = js.native
  def bol(n: scala.Double, erase: scala.Boolean): java.lang.String = js.native
  def bold(text: js.Any*): java.lang.String = js.native
  def cyan(text: js.Any*): java.lang.String = js.native
  def cyanBright(text: js.Any*): java.lang.String = js.native
  def down(n: scala.Double): java.lang.String = js.native
  def green(text: js.Any*): java.lang.String = js.native
  def greenBright(text: js.Any*): java.lang.String = js.native
  def inverse(text: js.Any*): java.lang.String = js.native
  def italic(text: js.Any*): java.lang.String = js.native
  def left(n: scala.Double): java.lang.String = js.native
  def magenta(text: js.Any*): java.lang.String = js.native
  def magentaBright(text: js.Any*): java.lang.String = js.native
  def move(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def moveTo(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def red(text: js.Any*): java.lang.String = js.native
  def redBright(text: js.Any*): java.lang.String = js.native
  def right(n: scala.Double): java.lang.String = js.native
  def strike(text: js.Any*): java.lang.String = js.native
  def underline(text: js.Any*): java.lang.String = js.native
  def up(n: scala.Double): java.lang.String = js.native
  def white(text: js.Any*): java.lang.String = js.native
  def whiteBright(text: js.Any*): java.lang.String = js.native
  def xterm(color: scala.Double): Format = js.native
  def yellow(text: js.Any*): java.lang.String = js.native
  def yellowBright(text: js.Any*): java.lang.String = js.native
}

