package typings.connectDashSequence.connectDashSequenceMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSequence extends js.Object {
  def append(middleware: RequestHandler*): this.type
  def appendIf(condition: Boolean, middleware: RequestHandler): this.type
  def appendList(middleware: js.Array[RequestHandler]): this.type
  def appendListIf(condition: Boolean, middleware: js.Array[RequestHandler]): this.type
  def run(): Unit
}

object ConnectSequence {
  @scala.inline
  def apply(
    append: /* repeated */ RequestHandler => ConnectSequence,
    appendIf: (Boolean, RequestHandler) => ConnectSequence,
    appendList: js.Array[RequestHandler] => ConnectSequence,
    appendListIf: (Boolean, js.Array[RequestHandler]) => ConnectSequence,
    run: () => Unit
  ): ConnectSequence = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendIf = js.Any.fromFunction2(appendIf), appendList = js.Any.fromFunction1(appendList), appendListIf = js.Any.fromFunction2(appendListIf), run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[ConnectSequence]
  }
}

