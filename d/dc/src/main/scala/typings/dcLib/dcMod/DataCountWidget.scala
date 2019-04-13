package typings
package dcLib.dcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCountWidget extends BaseMixin[DataCountWidget] {
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[scala.Double, java.lang.String], DataCountWidget] = js.native
  @JSName("html")
  var html_Original: IGetSet[DataCountWidgetHTML, DataCountWidget] = js.native
  def formatNumber(): Accessor[scala.Double, java.lang.String] = js.native
  def formatNumber(t: Accessor[scala.Double, java.lang.String]): DataCountWidget = js.native
  def html(): DataCountWidgetHTML = js.native
  def html(t: DataCountWidgetHTML): DataCountWidget = js.native
}

