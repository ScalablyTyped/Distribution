package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMode extends js.Object {
  def autoOutdent(state: js.Any, doc: js.Any, row: js.Any): scala.Unit
  def checkOutdent(state: js.Any, line: js.Any, input: js.Any): scala.Boolean
  def createModeDelegates(mapping: js.Any): scala.Unit
  def createWorker(session: js.Any): js.Any
  def getNextLineIndent(state: js.Any, line: js.Any, tab: js.Any): java.lang.String
  def getTokenizer(): js.Any
  def toggleCommentLines(state: js.Any, doc: js.Any, startRow: js.Any, endRow: js.Any): scala.Unit
  def transformAction(state: js.Any, action: js.Any, editor: js.Any, session: js.Any, param: js.Any): js.Any
}

