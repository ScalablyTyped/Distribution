package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxAnnotationOptions
  extends CommonAnnotationOptions
     with AnnotationOptions {
  
  var backgroundColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  
  var borderColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_BoxAnnotationOptions: box = js.native
  
  var xMax: ChartPointValue = js.native
  
  var xMin: ChartPointValue = js.native
  
  var xScaleID: js.UndefOr[String] = js.native
  
  var yMax: ChartPointValue = js.native
  
  var yMin: ChartPointValue = js.native
  
  var yScaleID: js.UndefOr[String] = js.native
}
object BoxAnnotationOptions {
  
  @scala.inline
  def apply(
    `type`: box,
    xMax: ChartPointValue,
    xMin: ChartPointValue,
    yMax: ChartPointValue,
    yMin: ChartPointValue
  ): BoxAnnotationOptions = {
    val __obj = js.Dynamic.literal(xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxAnnotationOptions]
  }
  
  @scala.inline
  implicit class BoxAnnotationOptionsOps[Self <: BoxAnnotationOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: box): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMax(value: ChartPointValue): Self = this.set("xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: ChartPointValue): Self = this.set("xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: ChartPointValue): Self = this.set("yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: ChartPointValue): Self = this.set("yMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setXScaleID(value: String): Self = this.set("xScaleID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXScaleID: Self = this.set("xScaleID", js.undefined)
    
    @scala.inline
    def setYScaleID(value: String): Self = this.set("yScaleID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYScaleID: Self = this.set("yScaleID", js.undefined)
  }
}
