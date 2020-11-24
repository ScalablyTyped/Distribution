package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.horizontal
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
  
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  
  var borderDash: js.UndefOr[js.Array[Double]] = js.native
  
  var borderDashOffset: js.UndefOr[Double] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var endValue: js.UndefOr[ChartPointValue] = js.native
  
  var label: js.UndefOr[LineAnnotationLabel] = js.native
  
  var mode: horizontal | vertical = js.native
  
  var scaleID: String = js.native
  
  @JSName("type")
  var type_LineAnnotationOptions: line = js.native
  
  var value: ChartPointValue = js.native
}
object LineAnnotationOptions {
  
  @scala.inline
  def apply(mode: horizontal | vertical, scaleID: String, `type`: line, value: ChartPointValue): LineAnnotationOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], scaleID = scaleID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationOptions]
  }
  
  @scala.inline
  implicit class LineAnnotationOptionsOps[Self <: LineAnnotationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMode(value: horizontal | vertical): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleID(value: String): Self = this.set("scaleID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ChartPointValue): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderDashVarargs(value: Double*): Self = this.set("borderDash", js.Array(value :_*))
    
    @scala.inline
    def setBorderDash(value: js.Array[Double]): Self = this.set("borderDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDash: Self = this.set("borderDash", js.undefined)
    
    @scala.inline
    def setBorderDashOffset(value: Double): Self = this.set("borderDashOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderDashOffset: Self = this.set("borderDashOffset", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setEndValue(value: ChartPointValue): Self = this.set("endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("endValue", js.undefined)
    
    @scala.inline
    def setLabel(value: LineAnnotationLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
}
