package typings.cliColor.mod

import typings.cliColor.columnsMod.Data
import typings.cliColor.eraseMod.Erase
import typings.cliColor.moveMod.Move
import typings.cliColor.throbberMod.Throbber
import typings.cliColor.windowSizeMod.WindowSize
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color
  extends typings.cliColor.bareMod.Format {
  val beep: String = js.native
  val erase: Erase = js.native
  @JSName("move")
  val move_Original: Move = js.native
  val reset: String = js.native
  val windowSize: WindowSize = js.native
  def art(text: String, styleConf: Record[String, String]): String = js.native
  def columns(data: js.Array[js.Array[_]]): String = js.native
  def columns(data: js.Array[js.Array[_]], options: typings.cliColor.columnsMod.ColumnsOptions): String = js.native
  def columns(data: Data): String = js.native
  def columns(data: Data, options: typings.cliColor.columnsMod.ColumnsOptions): String = js.native
  def getStrippedLength(str: String): Double = js.native
  /**
    * Move cursor x columns and y rows away. Values can be positive or negative
    */
  def move(): String = js.native
  def move(x: js.UndefOr[scala.Nothing], y: Double): String = js.native
  def move(x: Double): String = js.native
  def move(x: Double, y: Double): String = js.native
  def slice(str: String): String = js.native
  def slice(str: String, begin: js.UndefOr[scala.Nothing], end: Double): String = js.native
  def slice(str: String, begin: Double): String = js.native
  def slice(str: String, begin: Double, end: Double): String = js.native
  def strip(str: String): String = js.native
  def throbber(write: js.Function1[/* str */ String, Unit], interval: Double): Throbber = js.native
  def throbber(
    write: js.Function1[/* str */ String, Unit],
    interval: Double,
    format: js.Function1[/* throbber */ String, String]
  ): Throbber = js.native
}

