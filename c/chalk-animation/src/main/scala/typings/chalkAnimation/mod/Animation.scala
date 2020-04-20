package typings.chalkAnimation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def frame(): String
  def render(): Unit
  def replace(text: String): Unit
  def start(): Unit
  def stop(): Unit
}

object Animation {
  @scala.inline
  def apply(
    frame: () => String,
    render: () => Unit,
    replace: String => Unit,
    start: () => Unit,
    stop: () => Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(frame = js.Any.fromFunction0(frame), render = js.Any.fromFunction0(render), replace = js.Any.fromFunction1(replace), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Animation]
  }
}

