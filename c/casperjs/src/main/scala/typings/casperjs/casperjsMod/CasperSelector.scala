package typings.casperjs.casperjsMod

import typings.casperjs.casperjsStrings.css
import typings.casperjs.casperjsStrings.xpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CasperSelector extends js.Object {
  var path: String
  var `type`: js.UndefOr[xpath | css] = js.undefined
}

object CasperSelector {
  @scala.inline
  def apply(path: String, `type`: xpath | css = null): CasperSelector = {
    val __obj = js.Dynamic.literal(path = path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CasperSelector]
  }
}

