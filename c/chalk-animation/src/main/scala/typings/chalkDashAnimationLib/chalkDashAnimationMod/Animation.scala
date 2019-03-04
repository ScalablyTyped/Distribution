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
    frame: js.Function0[java.lang.String],
    render: js.Function0[scala.Unit],
    replace: js.Function1[java.lang.String, scala.Unit],
    start: js.Function0[scala.Unit],
    stop: js.Function0[scala.Unit]
  ): Animation = {
    val __obj = js.Dynamic.literal(frame = frame, render = render, replace = replace, start = start, stop = stop)
  
    __obj.asInstanceOf[Animation]
  }
}

