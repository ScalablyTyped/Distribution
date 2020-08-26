package typings.babelTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitNodeObject[S, P] extends js.Object {
  var enter: js.UndefOr[VisitNodeFunction[S, P]] = js.native
  var exit: js.UndefOr[VisitNodeFunction[S, P]] = js.native
}

object VisitNodeObject {
  @scala.inline
  def apply[S, P](): VisitNodeObject[S, P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitNodeObject[S, P]]
  }
  @scala.inline
  implicit class VisitNodeObjectOps[Self <: VisitNodeObject[_, _], S, P] (val x: Self with (VisitNodeObject[S, P])) extends AnyVal {
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
    def setEnter(value: VisitNodeFunction[S, P]): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setExit(value: VisitNodeFunction[S, P]): Self = this.set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
  }
  
}

