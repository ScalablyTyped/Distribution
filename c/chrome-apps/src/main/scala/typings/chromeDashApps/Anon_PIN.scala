package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.PIN
import typings.chromeDashApps.chromeDashAppsStrings.PUK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PIN extends js.Object {
  var PIN: typings.chromeDashApps.chromeDashAppsStrings.PIN
  var PUK: typings.chromeDashApps.chromeDashAppsStrings.PUK
}

object Anon_PIN {
  @scala.inline
  def apply(PIN: PIN, PUK: PUK): Anon_PIN = {
    val __obj = js.Dynamic.literal(PIN = PIN, PUK = PUK)
  
    __obj.asInstanceOf[Anon_PIN]
  }
}

