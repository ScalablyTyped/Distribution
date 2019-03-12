package typings
package chalkDashAnimationLib.chalkDashAnimationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  def frame(): java.lang.String
  def render(): scala.Unit
  def replace(text: java.lang.String): scala.Unit
  def start(): scala.Unit
  def stop(): scala.Unit
}

object Animation {
  @scala.inline
  def apply(
    frame: () => java.lang.String,
    render: () => scala.Unit,
    replace: java.lang.String => scala.Unit,
    start: () => scala.Unit,
    stop: () => scala.Unit
  ): Animation = {
    val __obj = js.Dynamic.literal(frame = js.Any.fromFunction0(frame), render = js.Any.fromFunction0(render), replace = js.Any.fromFunction1(replace), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[Animation]
  }
}

