package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.admin
import typings.chromeDashApps.chromeDashAppsStrings.development
import typings.chromeDashApps.chromeDashAppsStrings.normal
import typings.chromeDashApps.chromeDashAppsStrings.other_
import typings.chromeDashApps.chromeDashAppsStrings.sideload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: admin
  var DEVELOPMENT: development
  var NORMAL: normal
  var OTHER: other_
  var SIDELOAD: sideload
}

object Anon_ADMIN {
  @scala.inline
  def apply(ADMIN: admin, DEVELOPMENT: development, NORMAL: normal, OTHER: other_, SIDELOAD: sideload): Anon_ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], SIDELOAD = SIDELOAD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

