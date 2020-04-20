package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.out_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIN extends js.Object {
  var IN: in_
  var OUT: out_
}

object AnonIN {
  @scala.inline
  def apply(IN: in_, OUT: out_): AnonIN = {
    val __obj = js.Dynamic.literal(IN = IN.asInstanceOf[js.Any], OUT = OUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIN]
  }
}

