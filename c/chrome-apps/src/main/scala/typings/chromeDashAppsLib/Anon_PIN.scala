package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PIN extends js.Object {
  var PIN: chromeDashAppsLib.chromeDashAppsLibStrings.PIN
  var PUK: chromeDashAppsLib.chromeDashAppsLibStrings.PUK
}

object Anon_PIN {
  @scala.inline
  def apply(
    PIN: chromeDashAppsLib.chromeDashAppsLibStrings.PIN,
    PUK: chromeDashAppsLib.chromeDashAppsLibStrings.PUK
  ): Anon_PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN, PUK = PUK)
  
    __obj.asInstanceOf[Anon_PIN]
  }
}

