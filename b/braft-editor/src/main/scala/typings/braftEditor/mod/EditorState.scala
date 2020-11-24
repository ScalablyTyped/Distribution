package typings.braftEditor.mod

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Decorators.DraftDecoratorType
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typings.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import typings.draftJs.mod.Draft.Model.ImmutableData.EditorChangeType
import typings.draftJs.mod.Draft.Model.ImmutableData.SelectionState
import typings.immutable.Immutable.List
import typings.immutable.Immutable.OrderedMap
import typings.immutable.Immutable.Stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined draft-js.draft-js.EditorState & {[key: string] : any, setConvertOptions (option : std.Object | undefined): void, toHTML (option : std.Object | undefined): string, toRAW (noStringify : boolean | undefined): draft-js.draft-js.RawDraftContentState | string, toText (): string, isEmpty (): boolean} */
@js.native
trait EditorState
  extends /* key */ StringDictionary[js.Any] {
  
  def getAllowUndo(): Boolean = js.native
  
  def getBlockTree(blockKey: String): List[_] = js.native
  
  def getCurrentContent(): ContentState = js.native
  
  /**
    * Get the appropriate inline style for the editor state. If an
    * override is in place, use it. Otherwise, the current style is
    * based on the location of the selection state.
    */
  def getCurrentInlineStyle(): DraftInlineStyle = js.native
  
  def getDecorator(): DraftDecoratorType = js.native
  
  def getDirectionMap(): OrderedMap[_, _] = js.native
  
  /**
    * While editing, the user may apply inline style commands with a collapsed
    * cursor, intending to type text that adopts the specified style. In this
    * case, we track the specified style as an "override" that takes precedence
    * over the inline style of the text adjacent to the cursor.
    *
    * If null, there is no override in place.
    */
  def getInlineStyleOverride(): DraftInlineStyle = js.native
  
  def getLastChangeType(): EditorChangeType = js.native
  
  def getNativelyRenderedContent(): ContentState = js.native
  
  def getRedoStack(): Stack[ContentState] = js.native
  
  def getSelection(): SelectionState = js.native
  
  def getUndoStack(): Stack[ContentState] = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isInCompositionMode(): Boolean = js.native
  
  def isSelectionAtEndOfContent(): Boolean = js.native
  
  def isSelectionAtStartOfContent(): Boolean = js.native
  
  def mustForceSelection(): Boolean = js.native
  
  def setConvertOptions(): Unit = js.native
  def setConvertOptions(option: js.Object): Unit = js.native
  
  def toHTML(): String = js.native
  def toHTML(option: js.Object): String = js.native
  
  def toJS(): js.Object = js.native
  
  def toRAW(): RawDraftContentState | String = js.native
  def toRAW(noStringify: Boolean): RawDraftContentState | String = js.native
  
  def toText(): String = js.native
}
