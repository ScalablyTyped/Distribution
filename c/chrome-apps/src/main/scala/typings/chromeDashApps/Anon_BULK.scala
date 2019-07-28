package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.bulk
import typings.chromeDashApps.chromeDashAppsStrings.control
import typings.chromeDashApps.chromeDashAppsStrings.interrupt
import typings.chromeDashApps.chromeDashAppsStrings.isochronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BULK extends js.Object {
  var BULK: bulk
  var CONTROL: control
  var INTERRUPT: interrupt
  var ISOCHRONOUS: isochronous
}

object Anon_BULK {
  @scala.inline
  def apply(BULK: bulk, CONTROL: control, INTERRUPT: interrupt, ISOCHRONOUS: isochronous): Anon_BULK = {
    val __obj = js.Dynamic.literal(BULK = BULK, CONTROL = CONTROL, INTERRUPT = INTERRUPT, ISOCHRONOUS = ISOCHRONOUS)
  
    __obj.asInstanceOf[Anon_BULK]
  }
}

