package typings.chartJs.mod

import typings.chartJs.anon.After
import typings.chartJs.typesBasicMod.AnyObject
import typings.chartJs.typesColorMod.Color
import typings.chartJs.typesElementMod.Element
import typings.chartJs.typesGeometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipModel[TType /* <: ChartType */]
  extends StObject
     with Element[AnyObject, TooltipOptions[TType]] {
  
  // line of text that appear after the body and before the footer
  var afterBody: js.Array[String] = js.native
  
  // lines of text that appear after the title but before the body
  var beforeBody: js.Array[String] = js.native
  
  // Body
  // The body lines that need to be rendered
  // Each object contains 3 parameters
  // before: string[] // lines of text before the line with the color square
  // lines: string[]; // lines of text to render as the main item with color square
  // after: string[]; // lines of text to render after the main lines
  var body: js.Array[After] = js.native
  
  // Where the tooltip points to
  var caretX: Double = js.native
  
  var caretY: Double = js.native
  
  val chart: Chart[TType, DefaultDataPoint[TType], Any] = js.native
  
  // The items that we are rendering in the tooltip. See Tooltip Item Interface section
  var dataPoints: js.Array[TooltipItem[TType]] = js.native
  
  // Footer
  // lines of text that form the footer
  var footer: js.Array[String] = js.native
  
  def getActiveElements(): js.Array[ActiveElement] = js.native
  
  var height: Double = js.native
  
  // Styles to render for each item in body[]. This is the styling of the squares in the tooltip
  var labelColors: js.Array[TooltipLabelStyle] = js.native
  
  var labelPointStyles: js.Array[typings.chartJs.anon.PointStyle] = js.native
  
  var labelTextColors: js.Array[Color] = js.native
  
  // 0 opacity is a hidden tooltip
  var opacity: Double = js.native
  
  def setActiveElements(active: js.Array[ActiveDataPoint], eventPosition: Point): Unit = js.native
  
  // Title
  // lines of text that form the title
  var title: js.Array[String] = js.native
  
  var width: Double = js.native
  
  // Positioning
  var xAlign: TooltipXAlignment = js.native
  
  var yAlign: TooltipYAlignment = js.native
}
