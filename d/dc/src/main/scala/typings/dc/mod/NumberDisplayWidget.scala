package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberDisplayWidget extends BaseMixin[NumberDisplayWidget] {
  
  def formatNumber(): Accessor[Double, String] = js.native
  def formatNumber(t: Accessor[Double, String]): NumberDisplayWidget = js.native
  @JSName("formatNumber")
  var formatNumber_Original: IGetSet[Accessor[Double, String], NumberDisplayWidget] = js.native
  
  def html(): NumberDisplayWidgetHTML = js.native
  def html(t: NumberDisplayWidgetHTML): NumberDisplayWidget = js.native
  @JSName("html")
  var html_Original: IGetSet[NumberDisplayWidgetHTML, NumberDisplayWidget] = js.native
  
  def value(): String = js.native
}
