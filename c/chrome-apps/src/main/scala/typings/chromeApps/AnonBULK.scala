package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBULK extends js.Object {
  var BULK: bulk_
  var CONTROL: control_
  var INTERRUPT: interrupt_
  var ISOCHRONOUS: isochronous_
}

object AnonBULK {
  @scala.inline
  def apply(BULK: bulk_, CONTROL: control_, INTERRUPT: interrupt_, ISOCHRONOUS: isochronous_): AnonBULK = {
    val __obj = js.Dynamic.literal(BULK = BULK.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], INTERRUPT = INTERRUPT.asInstanceOf[js.Any], ISOCHRONOUS = ISOCHRONOUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBULK]
  }
}

