package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.in
import typings.chromeApps.chromeAppsStrings.out
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIN extends js.Object {
  var IN: in
  var OUT: out
}

object AnonIN {
  @scala.inline
  def apply(IN: in, OUT: out): AnonIN = {
    val __obj = js.Dynamic.literal(IN = IN.asInstanceOf[js.Any], OUT = OUT.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIN]
  }
}

