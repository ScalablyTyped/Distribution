package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.bulk
import typings.chromeApps.chromeAppsStrings.control
import typings.chromeApps.chromeAppsStrings.interrupt
import typings.chromeApps.chromeAppsStrings.isochronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBULK extends js.Object {
  var BULK: bulk
  var CONTROL: control
  var INTERRUPT: interrupt
  var ISOCHRONOUS: isochronous
}

object AnonBULK {
  @scala.inline
  def apply(BULK: bulk, CONTROL: control, INTERRUPT: interrupt, ISOCHRONOUS: isochronous): AnonBULK = {
    val __obj = js.Dynamic.literal(BULK = BULK.asInstanceOf[js.Any], CONTROL = CONTROL.asInstanceOf[js.Any], INTERRUPT = INTERRUPT.asInstanceOf[js.Any], ISOCHRONOUS = ISOCHRONOUS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBULK]
  }
}

