package typings.dateFns.esmMod

import typings.dateFns.anon.IncludeSeconds
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("date-fns/esm", "formatDistanceToNow")
@js.native
object formatDistanceToNow extends js.Object {
  
  def apply(date: Double): String = js.native
  def apply(date: Double, options: IncludeSeconds): String = js.native
  def apply(date: Date): String = js.native
  def apply(date: Date, options: IncludeSeconds): String = js.native
}
