package typings
package bugsnagDashJsLib.typesBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var metaData: js.Object
  var name: java.lang.String
  var timestamp: java.lang.String
  var `type`: java.lang.String
}

object Breadcrumb {
  @scala.inline
  def apply(metaData: js.Object, name: java.lang.String, timestamp: java.lang.String, `type`: java.lang.String): Breadcrumb = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("metaData")(metaData)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[Breadcrumb]
  }
}

