package typings
package dayzedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Calendars extends js.Object {
  var calendars: js.Array[dayzedLib.dayzedMod.Calendar]
  var offset: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Calendars {
  @scala.inline
  def apply(calendars: js.Array[dayzedLib.dayzedMod.Calendar], offset: scala.Int | scala.Double = null): Anon_Calendars = {
    val __obj = js.Dynamic.literal(calendars = calendars)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Calendars]
  }
}

