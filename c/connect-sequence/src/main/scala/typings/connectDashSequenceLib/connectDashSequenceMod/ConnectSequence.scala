package typings
package connectDashSequenceLib.connectDashSequenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSequence extends js.Object {
  def append(middleware: expressLib.expressMod.RequestHandler*): this.type
  def appendIf(condition: scala.Boolean, middleware: expressLib.expressMod.RequestHandler): this.type
  def appendList(middleware: js.Array[expressLib.expressMod.RequestHandler]): this.type
  def appendListIf(condition: scala.Boolean, middleware: js.Array[expressLib.expressMod.RequestHandler]): this.type
  def run(): scala.Unit
}

object ConnectSequence {
  @scala.inline
  def apply(
    append: /* repeated */ expressLib.expressMod.RequestHandler => ConnectSequence,
    appendIf: (scala.Boolean, expressLib.expressMod.RequestHandler) => ConnectSequence,
    appendList: js.Array[expressLib.expressMod.RequestHandler] => ConnectSequence,
    appendListIf: (scala.Boolean, js.Array[expressLib.expressMod.RequestHandler]) => ConnectSequence,
    run: () => scala.Unit
  ): ConnectSequence = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendIf = js.Any.fromFunction2(appendIf), appendList = js.Any.fromFunction1(appendList), appendListIf = js.Any.fromFunction2(appendListIf), run = js.Any.fromFunction0(run))
  
    __obj.asInstanceOf[ConnectSequence]
  }
}

