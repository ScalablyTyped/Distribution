package typings.chartjsPluginAnnotation.mod.chartJsAugmentingMod

import typings.chartjsPluginAnnotation.mod.AnnotationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  // This is deprecated on master (not released yet)
  var annotation: js.UndefOr[AnnotationConfig] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(annotation: AnnotationConfig = null): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (annotation != null) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

