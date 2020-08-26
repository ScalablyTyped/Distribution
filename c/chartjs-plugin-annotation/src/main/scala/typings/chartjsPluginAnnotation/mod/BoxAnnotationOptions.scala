package typings.chartjsPluginAnnotation.mod

import typings.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
   // value or label
  var xMax: Double | String = js.native
  var xMin: Double | String = js.native
  var xScaleID: js.UndefOr[String] = js.native
  var yMax: Double | String = js.native
  var yMin: Double | String = js.native
  var yScaleID: js.UndefOr[String] = js.native
}

object BoxAnnotationOptions {
  @scala.inline
  def apply(
    `type`: box,
    xMax: Double | String,
    xMin: Double | String,
    yMax: Double | String,
    yMin: Double | String
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
    def setXMax(value: Double | String): Self = this.set("xMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setXMin(value: Double | String): Self = this.set("xMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setYMax(value: Double | String): Self = this.set("yMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setYMin(value: Double | String): Self = this.set("yMin", value.asInstanceOf[js.Any])
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

