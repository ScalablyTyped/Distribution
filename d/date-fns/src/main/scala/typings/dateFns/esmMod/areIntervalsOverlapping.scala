package typings.dateFns.esmMod

import typings.dateFns.Interval
import typings.dateFns.anon.Inclusive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "areIntervalsOverlapping")
@js.native
object areIntervalsOverlapping extends js.Object {
  
  def apply(intervalLeft: Interval, intervalRight: Interval): Boolean = js.native
  def apply(intervalLeft: Interval, intervalRight: Interval, options: Inclusive): Boolean = js.native
}
