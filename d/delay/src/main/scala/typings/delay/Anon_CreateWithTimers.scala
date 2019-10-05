package typings.delay

import typings.delay.delayMod.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreateWithTimers extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any
  def createWithTimers(timers: Anon_ClearTimeout): Delay
}

object Anon_CreateWithTimers {
  @scala.inline
  def apply(
    createWithTimers: Anon_ClearTimeout => Delay,
    default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any
  ): Anon_CreateWithTimers = {
    val __obj = js.Dynamic.literal(createWithTimers = js.Any.fromFunction1(createWithTimers), default = default)
  
    __obj.asInstanceOf[Anon_CreateWithTimers]
  }
}

