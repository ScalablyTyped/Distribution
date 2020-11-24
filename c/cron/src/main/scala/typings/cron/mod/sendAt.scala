package typings.cron.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cron", "sendAt")
@js.native
object sendAt extends js.Object {
  
  def apply(cronTime: String): Moment = js.native
  def apply(cronTime: Moment): Moment = js.native
  def apply(cronTime: Date): Moment = js.native
}
