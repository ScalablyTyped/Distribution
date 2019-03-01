package typings
package ckeditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[ckeditorLib.CKEDITORNs.filter] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(filter: ckeditorLib.CKEDITORNs.filter = null): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[Anon_Filter]
  }
}

