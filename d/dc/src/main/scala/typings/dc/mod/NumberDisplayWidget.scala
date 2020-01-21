package typings.dc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberDisplayWidget extends BaseMixin[NumberDisplayWidget] {
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[Double, String], NumberDisplayWidget] = js.native
  @JSName("html")
  var html_Original: IGetSet[NumberDisplayWidgetHTML, NumberDisplayWidget] = js.native
  def formatNumber(): Accessor[Double, String] = js.native
  def formatNumber(t: Accessor[Double, String]): NumberDisplayWidget = js.native
  def html(): NumberDisplayWidgetHTML = js.native
  def html(t: NumberDisplayWidgetHTML): NumberDisplayWidget = js.native
  def value(): String = js.native
}

