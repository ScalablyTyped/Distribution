package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.denied
import typings.chromeDashApps.chromeDashAppsStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DENIED extends js.Object {
  var DENIED: denied
  var GRANTED: granted
}

object Anon_DENIED {
  @scala.inline
  def apply(DENIED: denied, GRANTED: granted): Anon_DENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED, GRANTED = GRANTED)
  
    __obj.asInstanceOf[Anon_DENIED]
  }
}

