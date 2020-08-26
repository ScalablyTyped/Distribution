package typings.chartjsPluginAnnotation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationConfig extends js.Object {
  var annotations: js.Array[AnnotationOptions] = js.native
  var dblClickSpeed: js.UndefOr[Double] = js.native
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.native
  var events: js.UndefOr[js.Array[String]] = js.native
}

object AnnotationConfig {
  @scala.inline
  def apply(annotations: js.Array[AnnotationOptions]): AnnotationConfig = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationConfig]
  }
  @scala.inline
  implicit class AnnotationConfigOps[Self <: AnnotationConfig] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: AnnotationOptions*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: js.Array[AnnotationOptions]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblClickSpeed(value: Double): Self = this.set("dblClickSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDblClickSpeed: Self = this.set("dblClickSpeed", js.undefined)
    @scala.inline
    def setDrawTime(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
    ): Self = this.set("drawTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawTime: Self = this.set("drawTime", js.undefined)
    @scala.inline
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
  }
  
}

