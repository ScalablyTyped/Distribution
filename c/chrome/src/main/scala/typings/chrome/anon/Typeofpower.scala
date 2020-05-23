package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpower extends js.Object {
  def releaseKeepAwake(): Unit
  def requestKeepAwake(level: String): Unit
}

object Typeofpower {
  @scala.inline
  def apply(releaseKeepAwake: () => Unit, requestKeepAwake: String => Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
}

