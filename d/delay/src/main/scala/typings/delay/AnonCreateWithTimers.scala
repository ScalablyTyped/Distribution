package typings.delay

import typings.delay.mod.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateWithTimers extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any
  def createWithTimers(timers: AnonClearTimeout): Delay
}

object AnonCreateWithTimers {
  @scala.inline
  def apply(
    createWithTimers: AnonClearTimeout => Delay,
    default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any
  ): AnonCreateWithTimers = {
    val __obj = js.Dynamic.literal(createWithTimers = js.Any.fromFunction1(createWithTimers), default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreateWithTimers]
  }
}

