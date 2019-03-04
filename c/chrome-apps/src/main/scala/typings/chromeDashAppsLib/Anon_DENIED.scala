package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DENIED extends js.Object {
  var DENIED: chromeDashAppsLib.chromeDashAppsLibStrings.denied
  var GRANTED: chromeDashAppsLib.chromeDashAppsLibStrings.granted
}

object Anon_DENIED {
  @scala.inline
  def apply(
    DENIED: chromeDashAppsLib.chromeDashAppsLibStrings.denied,
    GRANTED: chromeDashAppsLib.chromeDashAppsLibStrings.granted
  ): Anon_DENIED = {
    val __obj = js.Dynamic.literal(DENIED = DENIED, GRANTED = GRANTED)
  
    __obj.asInstanceOf[Anon_DENIED]
  }
}

