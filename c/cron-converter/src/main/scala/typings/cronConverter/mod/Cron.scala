package typings.cronConverter.mod

import typings.moment.mod.Moment
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cron extends js.Object {
  
  /**
    * Parses a 2-dimensional array of integers as a cron schedule.
    * @param cronArr The array to parse.
    */
  def fromArray(cronArr: CronArray): Cron = js.native
  
  /**
    * Parses a cron string.
    * @param str The string to parse.
    */
  def fromString(str: String): Cron = js.native
  
  /**
    * Returns the time the schedule would run next.
    * @param now A Date or Moment object.
    */
  def schedule(): Seeker = js.native
  def schedule(now: Moment): Seeker = js.native
  def schedule(now: Date): Seeker = js.native
  
  /**
    * Returns the cron schedule as a 2-dimensional array of integers.
    */
  def toArray(): CronArray = js.native
}
