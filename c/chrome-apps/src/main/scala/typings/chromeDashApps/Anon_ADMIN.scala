package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.admin
import typings.chromeDashApps.chromeDashAppsStrings.development
import typings.chromeDashApps.chromeDashAppsStrings.normal
import typings.chromeDashApps.chromeDashAppsStrings.other
import typings.chromeDashApps.chromeDashAppsStrings.sideload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: admin
  var DEVELOPMENT: development
  var NORMAL: normal
  var OTHER: other
  var SIDELOAD: sideload
}

object Anon_ADMIN {
  @scala.inline
  def apply(ADMIN: admin, DEVELOPMENT: development, NORMAL: normal, OTHER: other, SIDELOAD: sideload): Anon_ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN, DEVELOPMENT = DEVELOPMENT, NORMAL = NORMAL, OTHER = OTHER, SIDELOAD = SIDELOAD)
  
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

