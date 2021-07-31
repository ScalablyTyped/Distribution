package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCountWidget
  extends StObject
     with BaseMixin[DataCountWidget] {
  
  def formatNumber(): Accessor[Double, String] = js.native
  def formatNumber(t: Accessor[Double, String]): DataCountWidget = js.native
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[Double, String], DataCountWidget] = js.native
  
  def html(): DataCountWidgetHTML = js.native
  def html(t: DataCountWidgetHTML): DataCountWidget = js.native
  @JSName("html")
  var html_Original: IGetSet[DataCountWidgetHTML, DataCountWidget] = js.native
}
