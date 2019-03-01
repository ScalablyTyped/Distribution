package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnloadT extends js.Object {
  var onloadT: chromeDashAppsLib.chromeNs.integer
  var pageT: chromeDashAppsLib.chromeNs.integer
  var startE: chromeDashAppsLib.chromeNs.integer
  var tran: chromeDashAppsLib.chromeNs.integer
}

object Anon_OnloadT {
  @scala.inline
  def apply(
    onloadT: chromeDashAppsLib.chromeNs.integer,
    pageT: chromeDashAppsLib.chromeNs.integer,
    startE: chromeDashAppsLib.chromeNs.integer,
    tran: chromeDashAppsLib.chromeNs.integer
  ): Anon_OnloadT = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onloadT")(onloadT)
    __obj.updateDynamic("pageT")(pageT)
    __obj.updateDynamic("startE")(startE)
    __obj.updateDynamic("tran")(tran)
    __obj.asInstanceOf[Anon_OnloadT]
  }
}

