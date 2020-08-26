package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofpower extends js.Object {
  def releaseKeepAwake(): Unit = js.native
  def requestKeepAwake(level: String): Unit = js.native
}

object Typeofpower {
  @scala.inline
  def apply(releaseKeepAwake: () => Unit, requestKeepAwake: String => Unit): Typeofpower = {
    val __obj = js.Dynamic.literal(releaseKeepAwake = js.Any.fromFunction0(releaseKeepAwake), requestKeepAwake = js.Any.fromFunction1(requestKeepAwake))
    __obj.asInstanceOf[Typeofpower]
  }
  @scala.inline
  implicit class TypeofpowerOps[Self <: Typeofpower] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReleaseKeepAwake(value: () => Unit): Self = this.set("releaseKeepAwake", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestKeepAwake(value: String => Unit): Self = this.set("requestKeepAwake", js.Any.fromFunction1(value))
  }
  
}

