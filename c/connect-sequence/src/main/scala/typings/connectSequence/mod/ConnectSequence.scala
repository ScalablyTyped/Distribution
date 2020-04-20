package typings.connectSequence.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSequence extends js.Object {
  def append(middleware: (RequestHandler[ParamsDictionary, _, _, Query])*): this.type
  def appendIf(condition: Boolean, middleware: RequestHandler[ParamsDictionary, _, _, Query]): this.type
  def appendList(middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type
  def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): this.type
  def run(): Unit
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
}

