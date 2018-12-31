package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", JSImport.Namespace)
@js.native
object braceModMembers extends js.Object {
  var Anchor: braceLib.Anon_Doc = js.native
  var BackgroundTokenizer: braceLib.Anon_Tokenizer = js.native
  var Document: braceLib.Anon_TextDocument = js.native
  var EditSession: braceLib.Anon_Text = js.native
  var Editor: braceLib.Anon_Renderer = js.native
  var PlaceHolder: braceLib.Anon_SessionLength = js.native
  /**
    * Creates a new `Range` object with the given starting and ending row and column points.
    * @param startRow The starting row
    * @param startColumn The starting column
    * @param endRow The ending row
    * @param endColumn The ending column
    **/
  var Range: braceLib.Anon_StartRow = js.native
  var RangeList: braceLib.Anon_IRangeList = js.native
  var RenderLoop: braceLib.Anon_RenderLoop = js.native
  var ScrollBar: braceLib.Anon_Parent = js.native
  var Search: braceLib.Anon_Search = js.native
  var Selection: braceLib.Anon_SessionIEditSession = js.native
  var Split: braceLib.Anon_Split = js.native
  var TokenIterator: braceLib.Anon_Session = js.native
  var Tokenizer: braceLib.Anon_Rules = js.native
  var UndoManager: braceLib.Anon_UndoManager = js.native
  var VirtualRenderer: braceLib.Anon_Container = js.native
  def acequire(moduleName: java.lang.String): js.Any = js.native
  def createEditSession(text: braceLib.braceMod.AceAjaxNs.Document, mode: braceLib.braceMod.AceAjaxNs.TextMode): braceLib.braceMod.AceAjaxNs.IEditSession = js.native
  def createEditSession(text: java.lang.String, mode: braceLib.braceMod.AceAjaxNs.TextMode): braceLib.braceMod.AceAjaxNs.IEditSession = js.native
  def edit(el: java.lang.String): braceLib.braceMod.AceAjaxNs.Editor = js.native
  def edit(el: stdLib.HTMLElement): braceLib.braceMod.AceAjaxNs.Editor = js.native
}

