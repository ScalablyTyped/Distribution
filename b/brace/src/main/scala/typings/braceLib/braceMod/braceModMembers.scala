package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", JSImport.Namespace)
@js.native
object braceModMembers extends js.Object {
  var Anchor: braceLib.Anon_Column = js.native
  var BackgroundTokenizer: braceLib.Anon_Editor = js.native
  var Document: braceLib.Anon_Text = js.native
  var EditSession: braceLib.Anon_Content = js.native
  var Editor: braceLib.Anon_Renderer = js.native
  var PlaceHolder: braceLib.Anon_Length = js.native
  /**
    * Creates a new `Range` object with the given starting and ending row and column points.
    * @param startRow The starting row
    * @param startColumn The starting column
    * @param endRow The ending row
    * @param endColumn The ending column
    **/
  var Range: braceLib.Anon_EndColumn = js.native
  var RangeList: braceLib.Anon_IRangeList = js.native
  var RenderLoop: braceLib.Anon_RenderLoop = js.native
  var ScrollBar: braceLib.Anon_Parent = js.native
  var Search: braceLib.Anon_Search = js.native
  var Selection: braceLib.Anon_Session = js.native
  var Split: braceLib.Anon_Split = js.native
  var TokenIterator: braceLib.Anon_InitialColumn = js.native
  var Tokenizer: braceLib.Anon_Flag = js.native
  var UndoManager: braceLib.Anon_UndoManager = js.native
  var VirtualRenderer: braceLib.Anon_Container = js.native
  def acequire(moduleName: java.lang.String): js.Any = js.native
  def createEditSession(text: braceLib.braceMod.AceAjaxNs.Document, mode: braceLib.braceMod.AceAjaxNs.TextMode): braceLib.braceMod.AceAjaxNs.IEditSession = js.native
  def createEditSession(text: java.lang.String, mode: braceLib.braceMod.AceAjaxNs.TextMode): braceLib.braceMod.AceAjaxNs.IEditSession = js.native
  def edit(el: java.lang.String): braceLib.braceMod.AceAjaxNs.Editor = js.native
  def edit(el: stdLib.HTMLElement): braceLib.braceMod.AceAjaxNs.Editor = js.native
}

