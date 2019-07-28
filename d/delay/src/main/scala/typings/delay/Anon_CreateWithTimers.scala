package typings.delay

import typings.delay.delayMod.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateWithTimers extends js.Object {
  def createWithTimers(timers: Anon_ClearTimeoutSetTimeout): Delay
}

object Anon_CreateWithTimers {
  @scala.inline
  def apply(createWithTimers: Anon_ClearTimeoutSetTimeout => Delay): Anon_CreateWithTimers = {
    val __obj = js.Dynamic.literal(createWithTimers = js.Any.fromFunction1(createWithTimers))
  
    __obj.asInstanceOf[Anon_CreateWithTimers]
  }
}

