package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CasperSelector extends js.Object {
  var path: java.lang.String
  var `type`: js.UndefOr[casperjsLib.casperjsLibStrings.xpath | casperjsLib.casperjsLibStrings.css] = js.undefined
}

object CasperSelector {
  @scala.inline
  def apply(
    path: java.lang.String,
    `type`: casperjsLib.casperjsLibStrings.xpath | casperjsLib.casperjsLibStrings.css = null
  ): CasperSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CasperSelector]
  }
}

