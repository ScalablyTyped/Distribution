package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationConfig extends js.Object {
  var annotations: js.Array[AnnotationOptions]
  var dblClickSpeed: js.UndefOr[Double] = js.undefined
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.undefined
  var events: js.UndefOr[js.Array[String]] = js.undefined
}

object AnnotationConfig {
  @scala.inline
  def apply(
    annotations: js.Array[AnnotationOptions],
    dblClickSpeed: js.UndefOr[Double] = js.undefined,
    drawTime: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String = null,
    events: js.Array[String] = null
  ): AnnotationConfig = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    if (!js.isUndefined(dblClickSpeed)) __obj.updateDynamic("dblClickSpeed")(dblClickSpeed.get.asInstanceOf[js.Any])
    if (drawTime != null) __obj.updateDynamic("drawTime")(drawTime.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationConfig]
  }
}

