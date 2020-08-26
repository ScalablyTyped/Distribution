package typings.chrome.anon

import typings.chrome.chrome.system.memory.MemoryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofmemory extends js.Object {
  def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
}

object Typeofmemory {
  @scala.inline
  def apply(getInfo: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Typeofmemory = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction1(getInfo))
    __obj.asInstanceOf[Typeofmemory]
  }
  @scala.inline
  implicit class TypeofmemoryOps[Self <: Typeofmemory] (val x: Self) extends AnyVal {
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
    def setGetInfo(value: js.Function1[/* info */ MemoryInfo, Unit] => Unit): Self = this.set("getInfo", js.Any.fromFunction1(value))
  }
  
}

