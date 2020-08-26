package typings.bugsnagJs.breadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb extends js.Object {
  var metaData: js.Object = js.native
  var name: String = js.native
  var timestamp: String = js.native
  var `type`: String = js.native
}

object Breadcrumb {
  @scala.inline
  def apply(metaData: js.Object, name: String, timestamp: String, `type`: String): Breadcrumb = {
    val __obj = js.Dynamic.literal(metaData = metaData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  @scala.inline
  implicit class BreadcrumbOps[Self <: Breadcrumb] (val x: Self) extends AnyVal {
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
    def setMetaData(value: js.Object): Self = this.set("metaData", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

