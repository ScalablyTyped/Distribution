package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chartjsPluginAnnotation.mod.LineAnnotationOptions
  - typings.chartjsPluginAnnotation.mod.BoxAnnotationOptions
*/
trait AnnotationOptions extends js.Object
object AnnotationOptions {
  
  @scala.inline
  def LineAnnotationOptions(mode: horizontal | vertical, scaleID: String, `type`: line, value: ChartPointValue): AnnotationOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOptions]
  }
  
  @scala.inline
  def BoxAnnotationOptions(
    `type`: box,
    xMax: ChartPointValue,
    xMin: ChartPointValue,
    yMax: ChartPointValue,
    yMin: ChartPointValue
  ): AnnotationOptions = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationOptions]
  }
}
