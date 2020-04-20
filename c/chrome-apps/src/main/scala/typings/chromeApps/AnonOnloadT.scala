package typings.chromeApps

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnloadT extends js.Object {
  var onloadT: integer
  var pageT: integer
  var startE: integer
  var tran: integer
}

object AnonOnloadT {
  @scala.inline
  def apply(onloadT: integer, pageT: integer, startE: integer, tran: integer): AnonOnloadT = {
    val __obj = js.Dynamic.literal(onloadT = onloadT.asInstanceOf[js.Any], pageT = pageT.asInstanceOf[js.Any], startE = startE.asInstanceOf[js.Any], tran = tran.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnloadT]
  }
}

