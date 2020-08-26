package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineCommandResult extends js.Object {
  def defineEventStreamsToLoad(cb: defineEventStreamsToLoadHandler): Unit = js.native
}

object DefineCommandResult {
  @scala.inline
  def apply(defineEventStreamsToLoad: defineEventStreamsToLoadHandler => Unit): DefineCommandResult = {
    val __obj = js.Dynamic.literal(defineEventStreamsToLoad = js.Any.fromFunction1(defineEventStreamsToLoad))
    __obj.asInstanceOf[DefineCommandResult]
  }
  @scala.inline
  implicit class DefineCommandResultOps[Self <: DefineCommandResult] (val x: Self) extends AnyVal {
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
    def setDefineEventStreamsToLoad(value: defineEventStreamsToLoadHandler => Unit): Self = this.set("defineEventStreamsToLoad", js.Any.fromFunction1(value))
  }
  
}

