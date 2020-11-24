package typings.dateFns.esmMod

import typings.dateFns.Interval
import typings.dateFns.anon.Step
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "eachDayOfInterval")
@js.native
object eachDayOfInterval extends js.Object {
  
  def apply(interval: Interval): js.Array[Date] = js.native
  def apply(interval: Interval, options: Step): js.Array[Date] = js.native
}
