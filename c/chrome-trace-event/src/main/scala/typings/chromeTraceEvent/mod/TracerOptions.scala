package typings.chromeTraceEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracerOptions extends js.Object {
  var fields: js.UndefOr[Fields | Null] = js.native
  var noStream: js.UndefOr[Boolean] = js.native
  var objectMode: js.UndefOr[Boolean | Null] = js.native
  var parent: js.UndefOr[Tracer | Null] = js.native
}

object TracerOptions {
  @scala.inline
  def apply(): TracerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracerOptions]
  }
  @scala.inline
  implicit class TracerOptionsOps[Self <: TracerOptions] (val x: Self) extends AnyVal {
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
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    @scala.inline
    def setNoStream(value: Boolean): Self = this.set("noStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoStream: Self = this.set("noStream", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setObjectModeNull: Self = this.set("objectMode", null)
    @scala.inline
    def setParent(value: Tracer): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

