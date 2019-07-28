package typings.dc.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCountWidget extends BaseMixin[DataCountWidget] {
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[Double, String], DataCountWidget] = js.native
  @JSName("html")
  var html_Original: IGetSet[DataCountWidgetHTML, DataCountWidget] = js.native
  def formatNumber(): Accessor[Double, String] = js.native
  def formatNumber(t: Accessor[Double, String]): DataCountWidget = js.native
  def html(): DataCountWidgetHTML = js.native
  def html(t: DataCountWidgetHTML): DataCountWidget = js.native
}

