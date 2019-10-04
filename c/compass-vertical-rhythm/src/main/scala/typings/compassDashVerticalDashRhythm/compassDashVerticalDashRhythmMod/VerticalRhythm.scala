package typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmMod

import typings.compassDashVerticalDashRhythm.compassDashVerticalDashRhythmStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerticalRhythm extends js.Object {
  def adjustFontSizeTo(toSize: String): VerticalRhythmStyles = js.native
  def adjustFontSizeTo(toSize: String, lines: Double): VerticalRhythmStyles = js.native
  def adjustFontSizeTo(toSize: String, lines: Double, fromSize: String): VerticalRhythmStyles = js.native
  def adjustFontSizeTo(toSize: String, lines: Null, fromSize: String): VerticalRhythmStyles = js.native
  @JSName("adjustFontSizeTo")
  def adjustFontSizeTo_auto(toSize: String, lines: auto): VerticalRhythmStyles = js.native
  @JSName("adjustFontSizeTo")
  def adjustFontSizeTo_auto(toSize: String, lines: auto, fromSize: String): VerticalRhythmStyles = js.native
  def establishBaseline(): VerticalRhythmStyles = js.native
  def linesForFontSize(fontSize: String): Double = js.native
  def rhythm(): Double = js.native
  def rhythm(lines: Double): Double = js.native
  def rhythm(lines: Double, fontSize: String): Double = js.native
  def rhythm(lines: Double, fontSize: String, offset: Double): Double = js.native
}

