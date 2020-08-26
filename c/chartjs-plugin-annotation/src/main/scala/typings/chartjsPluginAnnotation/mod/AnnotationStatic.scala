package typings.chartjsPluginAnnotation.mod

import org.scalablytyped.runtime.Instantiable0
import typings.chartjsPluginAnnotation.anon.Box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationStatic extends js.Object {
  var Element: Instantiable0[AnnotationElement] = js.native
  var defaults: AnnotationConfig = js.native
  var drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any = js.native
  var labelDefaults: LineAnnotationLabel = js.native
  var types: Box = js.native
}

object AnnotationStatic {
  @scala.inline
  def apply(
    Element: Instantiable0[AnnotationElement],
    defaults: AnnotationConfig,
    drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any,
    labelDefaults: LineAnnotationLabel,
    types: Box
  ): AnnotationStatic = {
    val __obj = js.Dynamic.literal(Element = Element.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], drawTimeOptions = drawTimeOptions.asInstanceOf[js.Any], labelDefaults = labelDefaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationStatic]
  }
  @scala.inline
  implicit class AnnotationStaticOps[Self <: AnnotationStatic] (val x: Self) extends AnyVal {
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
    def setElement(value: Instantiable0[AnnotationElement]): Self = this.set("Element", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaults(value: AnnotationConfig): Self = this.set("defaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawTimeOptions(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any
    ): Self = this.set("drawTimeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelDefaults(value: LineAnnotationLabel): Self = this.set("labelDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: Box): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

