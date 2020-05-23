package typings.chartjsPluginAnnotation.mod

import org.scalablytyped.runtime.Instantiable0
import typings.chartjsPluginAnnotation.anon.Box
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationStatic extends js.Object {
  var Element: Instantiable0[AnnotationElement]
  var defaults: AnnotationConfig
  var drawTimeOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions */ js.Any
  var labelDefaults: LineAnnotationLabel
  var types: Box
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
}

