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

