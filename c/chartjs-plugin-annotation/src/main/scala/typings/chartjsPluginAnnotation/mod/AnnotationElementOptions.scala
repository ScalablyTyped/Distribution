package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationElementOptions[T /* <: AnnotationOptions */] extends js.Object {
  var chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any = js.native
  var id: String = js.native
  var options: T = js.native
}

object AnnotationElementOptions {
  @scala.inline
  def apply[/* <: typings.chartjsPluginAnnotation.mod.AnnotationOptions */ T](
    chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any,
    id: String,
    options: T
  ): AnnotationElementOptions[T] = {
    val __obj = js.Dynamic.literal(chartInstance = chartInstance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationElementOptions[T]]
  }
  @scala.inline
  implicit class AnnotationElementOptionsOps[Self <: AnnotationElementOptions[_], /* <: typings.chartjsPluginAnnotation.mod.AnnotationOptions */ T] (val x: Self with AnnotationElementOptions[T]) extends AnyVal {
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
    def setChartInstance(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any
    ): Self = this.set("chartInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: T): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

