package typings.connectSequence.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectSequence extends js.Object {
  def append(middleware: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type = js.native
  def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, _, _, Query]): this.type = js.native
  def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type = js.native
  def run(): Unit = js.native
}

object ConnectSequence {
  @scala.inline
  def apply(
    append: /* repeated */ RequestHandler[ParamsDictionary, _, _, Query] => ConnectSequence,
    appendIf: (Boolean, RequestHandler[ParamsDictionary, _, _, Query]) => ConnectSequence,
    appendList: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] => ConnectSequence,
    appendListIf: (Boolean, js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) => ConnectSequence,
    run: () => Unit
  ): ConnectSequence = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendIf = js.Any.fromFunction2(appendIf), appendList = js.Any.fromFunction1(appendList), appendListIf = js.Any.fromFunction2(appendListIf), run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[ConnectSequence]
  }
  @scala.inline
  implicit class ConnectSequenceOps[Self <: ConnectSequence] (val x: Self) extends AnyVal {
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
    def setAppend(value: /* repeated */ RequestHandler[ParamsDictionary, _, _, Query] => ConnectSequence): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendIf(value: (Boolean, RequestHandler[ParamsDictionary, _, _, Query]) => ConnectSequence): Self = this.set("appendIf", js.Any.fromFunction2(value))
    @scala.inline
    def setAppendList(value: js.Array[RequestHandler[ParamsDictionary, _, _, Query]] => ConnectSequence): Self = this.set("appendList", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendListIf(value: (Boolean, js.Array[RequestHandler[ParamsDictionary, _, _, Query]]) => ConnectSequence): Self = this.set("appendListIf", js.Any.fromFunction2(value))
    @scala.inline
    def setRun(value: () => Unit): Self = this.set("run", js.Any.fromFunction0(value))
  }
  
}

