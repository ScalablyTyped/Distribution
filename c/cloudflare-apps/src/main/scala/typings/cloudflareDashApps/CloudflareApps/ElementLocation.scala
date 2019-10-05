package typings.cloudflareDashApps.CloudflareApps

import typings.cloudflareDashApps.cloudflareDashAppsStrings.after
import typings.cloudflareDashApps.cloudflareDashAppsStrings.append
import typings.cloudflareDashApps.cloudflareDashAppsStrings.before
import typings.cloudflareDashApps.cloudflareDashAppsStrings.prepend
import typings.cloudflareDashApps.cloudflareDashAppsStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementLocation extends js.Object {
  var method: before | prepend | append | after | replace
  var selector: String
}

object ElementLocation {
  @scala.inline
  def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector)
  
    __obj.asInstanceOf[ElementLocation]
  }
}

