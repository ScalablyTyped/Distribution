package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationElementOptions[T /* <: AnnotationOptions */] extends js.Object {
  var chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any
  var id: String
  var options: T
}

object AnnotationElementOptions {
  @scala.inline
  def apply[T](
    chartInstance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Chart */ js.Any,
    id: String,
    options: T
  ): AnnotationElementOptions[T] = {
    val __obj = js.Dynamic.literal(chartInstance = chartInstance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationElementOptions[T]]
  }
}

