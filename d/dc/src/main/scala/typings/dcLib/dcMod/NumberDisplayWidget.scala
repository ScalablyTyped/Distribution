package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberDisplayWidget extends BaseMixin[NumberDisplayWidget] {
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[scala.Double, java.lang.String], NumberDisplayWidget] = js.native
  @JSName("html")
  var html_Original: IGetSet[NumberDisplayWidgetHTML, NumberDisplayWidget] = js.native
  def formatNumber(): Accessor[scala.Double, java.lang.String] = js.native
  def formatNumber(t: Accessor[scala.Double, java.lang.String]): NumberDisplayWidget = js.native
  def html(): NumberDisplayWidgetHTML = js.native
  def html(t: NumberDisplayWidgetHTML): NumberDisplayWidget = js.native
  def value(): java.lang.String = js.native
}

