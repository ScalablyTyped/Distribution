package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.bottom
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.center
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.left
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.right
import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineAnnotationLabel extends js.Object {
  
  var backgroundColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var cornerRadius: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var fontColor: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
  ] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var position: js.UndefOr[top | bottom | left | right | center] = js.native
  
  var xAdjust: js.UndefOr[Double] = js.native
  
  var xPadding: js.UndefOr[Double] = js.native
  
  var yAdjust: js.UndefOr[Double] = js.native
  
  var yPadding: js.UndefOr[Double] = js.native
}
object LineAnnotationLabel {
  
  @scala.inline
  def apply(): LineAnnotationLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineAnnotationLabel]
  }
  
  @scala.inline
  implicit class LineAnnotationLabelOps[Self <: LineAnnotationLabel] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCornerRadius(value: Double): Self = this.set("cornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCornerRadius: Self = this.set("cornerRadius", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFontColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart.ChartColor */ js.Any
    ): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setPosition(value: top | bottom | left | right | center): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setXAdjust(value: Double): Self = this.set("xAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAdjust: Self = this.set("xAdjust", js.undefined)
    
    @scala.inline
    def setXPadding(value: Double): Self = this.set("xPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPadding: Self = this.set("xPadding", js.undefined)
    
    @scala.inline
    def setYAdjust(value: Double): Self = this.set("yAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAdjust: Self = this.set("yAdjust", js.undefined)
    
    @scala.inline
    def setYPadding(value: Double): Self = this.set("yPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPadding: Self = this.set("yPadding", js.undefined)
  }
}
