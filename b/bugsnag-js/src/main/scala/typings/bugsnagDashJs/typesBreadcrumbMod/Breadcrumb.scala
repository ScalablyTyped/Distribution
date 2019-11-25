package typings.bugsnagDashJs.typesBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breadcrumb extends js.Object {
  var metaData: js.Object
  var name: String
  var timestamp: String
  var `type`: String
}

object Breadcrumb {
  @scala.inline
  def apply(metaData: js.Object, name: String, timestamp: String, `type`: String): Breadcrumb = {
    val __obj = js.Dynamic.literal(metaData = metaData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
}

