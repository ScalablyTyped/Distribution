package typings.codemirrorCommands

import typings.codemirrorCommands.anon.Close
import typings.codemirrorCommands.codemirrorCommandsStrings.after
import typings.codemirrorCommands.codemirrorCommandsStrings.before
import typings.codemirrorCommands.codemirrorCommandsStrings.full
import typings.codemirrorState.mod.AnnotationType
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.StateCommand
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorState.mod.StateField
import typings.codemirrorState.mod.Transaction
import typings.codemirrorView.mod.Command
import typings.codemirrorView.mod.KeyBinding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@codemirror/commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  Comment the current selection using block comments.
  */
  @JSImport("@codemirror/commands", "blockComment")
  @js.native
  val blockComment: StateCommand = js.native
  
  /**
  Uncomment the current selection using block comments.
  */
  @JSImport("@codemirror/commands", "blockUncomment")
  @js.native
  val blockUncomment: StateCommand = js.native
  
  /**
  Create a copy of the selected lines. Keep the selection in the bottom copy.
  */
  @JSImport("@codemirror/commands", "copyLineDown")
  @js.native
  val copyLineDown: StateCommand = js.native
  
  /**
  Create a copy of the selected lines. Keep the selection in the top copy.
  */
  @JSImport("@codemirror/commands", "copyLineUp")
  @js.native
  val copyLineUp: StateCommand = js.native
  
  /**
  Move the selection one character backward.
  */
  @JSImport("@codemirror/commands", "cursorCharBackward")
  @js.native
  val cursorCharBackward: Command = js.native
  
  /**
  Move the selection one character forward.
  */
  @JSImport("@codemirror/commands", "cursorCharForward")
  @js.native
  val cursorCharForward: Command = js.native
  
  /**
  Move the selection one character to the left (which is backward in
  left-to-right text, forward in right-to-left text).
  */
  @JSImport("@codemirror/commands", "cursorCharLeft")
  @js.native
  val cursorCharLeft: Command = js.native
  
  /**
  Move the selection one character to the right.
  */
  @JSImport("@codemirror/commands", "cursorCharRight")
  @js.native
  val cursorCharRight: Command = js.native
  
  /**
  Move the selection to the end of the document.
  */
  @JSImport("@codemirror/commands", "cursorDocEnd")
  @js.native
  val cursorDocEnd: StateCommand = js.native
  
  /**
  Move the selection to the start of the document.
  */
  @JSImport("@codemirror/commands", "cursorDocStart")
  @js.native
  val cursorDocStart: StateCommand = js.native
  
  /**
  Move the selection one group backward.
  */
  @JSImport("@codemirror/commands", "cursorGroupBackward")
  @js.native
  val cursorGroupBackward: Command = js.native
  
  /**
  Move the selection one group forward.
  */
  @JSImport("@codemirror/commands", "cursorGroupForward")
  @js.native
  val cursorGroupForward: Command = js.native
  
  /**
  Move the selection to the left across one group of word or
  non-word (but also non-space) characters.
  */
  @JSImport("@codemirror/commands", "cursorGroupLeft")
  @js.native
  val cursorGroupLeft: Command = js.native
  
  /**
  Move the selection one group to the right.
  */
  @JSImport("@codemirror/commands", "cursorGroupRight")
  @js.native
  val cursorGroupRight: Command = js.native
  
  /**
  Move the selection to previous line wrap point, or failing that to
  the start of the line. If the line is indented, and the cursor
  isn't already at the end of the indentation, this will move to the
  end of the indentation instead of the start of the line.
  */
  @JSImport("@codemirror/commands", "cursorLineBoundaryBackward")
  @js.native
  val cursorLineBoundaryBackward: Command = js.native
  
  /**
  Move the selection to the next line wrap point, or to the end of
  the line if there isn't one left on this line.
  */
  @JSImport("@codemirror/commands", "cursorLineBoundaryForward")
  @js.native
  val cursorLineBoundaryForward: Command = js.native
  
  /**
  Move the selection one line wrap point to the left.
  */
  @JSImport("@codemirror/commands", "cursorLineBoundaryLeft")
  @js.native
  val cursorLineBoundaryLeft: Command = js.native
  
  /**
  Move the selection one line wrap point to the right.
  */
  @JSImport("@codemirror/commands", "cursorLineBoundaryRight")
  @js.native
  val cursorLineBoundaryRight: Command = js.native
  
  /**
  Move the selection one line down.
  */
  @JSImport("@codemirror/commands", "cursorLineDown")
  @js.native
  val cursorLineDown: Command = js.native
  
  /**
  Move the selection to the end of the line.
  */
  @JSImport("@codemirror/commands", "cursorLineEnd")
  @js.native
  val cursorLineEnd: Command = js.native
  
  /**
  Move the selection to the start of the line.
  */
  @JSImport("@codemirror/commands", "cursorLineStart")
  @js.native
  val cursorLineStart: Command = js.native
  
  /**
  Move the selection one line up.
  */
  @JSImport("@codemirror/commands", "cursorLineUp")
  @js.native
  val cursorLineUp: Command = js.native
  
  /**
  Move the selection to the bracket matching the one it is currently
  on, if any.
  */
  @JSImport("@codemirror/commands", "cursorMatchingBracket")
  @js.native
  val cursorMatchingBracket: StateCommand = js.native
  
  /**
  Move the selection one page down.
  */
  @JSImport("@codemirror/commands", "cursorPageDown")
  @js.native
  val cursorPageDown: Command = js.native
  
  /**
  Move the selection one page up.
  */
  @JSImport("@codemirror/commands", "cursorPageUp")
  @js.native
  val cursorPageUp: Command = js.native
  
  /**
  Move the selection one group or camel-case subword backward.
  */
  @JSImport("@codemirror/commands", "cursorSubwordBackward")
  @js.native
  val cursorSubwordBackward: Command = js.native
  
  /**
  Move the selection one group or camel-case subword forward.
  */
  @JSImport("@codemirror/commands", "cursorSubwordForward")
  @js.native
  val cursorSubwordForward: Command = js.native
  
  /**
  Move the cursor over the next syntactic element to the left.
  */
  @JSImport("@codemirror/commands", "cursorSyntaxLeft")
  @js.native
  val cursorSyntaxLeft: Command = js.native
  
  /**
  Move the cursor over the next syntactic element to the right.
  */
  @JSImport("@codemirror/commands", "cursorSyntaxRight")
  @js.native
  val cursorSyntaxRight: Command = js.native
  
  /**
  The default keymap. Includes all bindings from
  [`standardKeymap`](https://codemirror.net/6/docs/ref/#commands.standardKeymap) plus the following:
  - Alt-ArrowLeft (Ctrl-ArrowLeft on macOS): [`cursorSyntaxLeft`](https://codemirror.net/6/docs/ref/#commands.cursorSyntaxLeft) ([`selectSyntaxLeft`](https://codemirror.net/6/docs/ref/#commands.selectSyntaxLeft) with Shift)
  - Alt-ArrowRight (Ctrl-ArrowRight on macOS): [`cursorSyntaxRight`](https://codemirror.net/6/docs/ref/#commands.cursorSyntaxRight) ([`selectSyntaxRight`](https://codemirror.net/6/docs/ref/#commands.selectSyntaxRight) with Shift)
  - Alt-ArrowUp: [`moveLineUp`](https://codemirror.net/6/docs/ref/#commands.moveLineUp)
  - Alt-ArrowDown: [`moveLineDown`](https://codemirror.net/6/docs/ref/#commands.moveLineDown)
  - Shift-Alt-ArrowUp: [`copyLineUp`](https://codemirror.net/6/docs/ref/#commands.copyLineUp)
  - Shift-Alt-ArrowDown: [`copyLineDown`](https://codemirror.net/6/docs/ref/#commands.copyLineDown)
  - Escape: [`simplifySelection`](https://codemirror.net/6/docs/ref/#commands.simplifySelection)
  - Ctrl-Enter (Comd-Enter on macOS): [`insertBlankLine`](https://codemirror.net/6/docs/ref/#commands.insertBlankLine)
  - Alt-l (Ctrl-l on macOS): [`selectLine`](https://codemirror.net/6/docs/ref/#commands.selectLine)
  - Ctrl-i (Cmd-i on macOS): [`selectParentSyntax`](https://codemirror.net/6/docs/ref/#commands.selectParentSyntax)
  - Ctrl-[ (Cmd-[ on macOS): [`indentLess`](https://codemirror.net/6/docs/ref/#commands.indentLess)
  - Ctrl-] (Cmd-] on macOS): [`indentMore`](https://codemirror.net/6/docs/ref/#commands.indentMore)
  - Ctrl-Alt-\\ (Cmd-Alt-\\ on macOS): [`indentSelection`](https://codemirror.net/6/docs/ref/#commands.indentSelection)
  - Shift-Ctrl-k (Shift-Cmd-k on macOS): [`deleteLine`](https://codemirror.net/6/docs/ref/#commands.deleteLine)
  - Shift-Ctrl-\\ (Shift-Cmd-\\ on macOS): [`cursorMatchingBracket`](https://codemirror.net/6/docs/ref/#commands.cursorMatchingBracket)
  - Ctrl-/ (Cmd-/ on macOS): [`toggleComment`](https://codemirror.net/6/docs/ref/#commands.toggleComment).
  - Shift-Alt-a: [`toggleBlockComment`](https://codemirror.net/6/docs/ref/#commands.toggleBlockComment).
  */
  @JSImport("@codemirror/commands", "defaultKeymap")
  @js.native
  val defaultKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Delete the selection, or, for cursor selections, the character
  before the cursor.
  */
  @JSImport("@codemirror/commands", "deleteCharBackward")
  @js.native
  val deleteCharBackward: Command = js.native
  
  /**
  Delete the selection or the character after the cursor.
  */
  @JSImport("@codemirror/commands", "deleteCharForward")
  @js.native
  val deleteCharForward: Command = js.native
  
  /**
  Delete the selection or backward until the end of the next
  [group](https://codemirror.net/6/docs/ref/#view.EditorView.moveByGroup), only skipping groups of
  whitespace when they consist of a single space.
  */
  @JSImport("@codemirror/commands", "deleteGroupBackward")
  @js.native
  val deleteGroupBackward: StateCommand = js.native
  
  /**
  Delete the selection or forward until the end of the next group.
  */
  @JSImport("@codemirror/commands", "deleteGroupForward")
  @js.native
  val deleteGroupForward: StateCommand = js.native
  
  /**
  Delete selected lines.
  */
  @JSImport("@codemirror/commands", "deleteLine")
  @js.native
  val deleteLine: Command = js.native
  
  /**
  Delete the selection, or, if it is a cursor selection, delete to
  the end of the line. If the cursor is directly at the end of the
  line, delete the line break after it.
  */
  @JSImport("@codemirror/commands", "deleteToLineEnd")
  @js.native
  val deleteToLineEnd: Command = js.native
  
  /**
  Delete the selection, or, if it is a cursor selection, delete to
  the start of the line. If the cursor is directly at the start of the
  line, delete the line break before it.
  */
  @JSImport("@codemirror/commands", "deleteToLineStart")
  @js.native
  val deleteToLineStart: Command = js.native
  
  /**
  Delete all whitespace directly before a line end from the
  document.
  */
  @JSImport("@codemirror/commands", "deleteTrailingWhitespace")
  @js.native
  val deleteTrailingWhitespace: StateCommand = js.native
  
  /**
  Array of key bindings containing the Emacs-style bindings that are
  available on macOS by default.
    - Ctrl-b: [`cursorCharLeft`](https://codemirror.net/6/docs/ref/#commands.cursorCharLeft) ([`selectCharLeft`](https://codemirror.net/6/docs/ref/#commands.selectCharLeft) with Shift)
    - Ctrl-f: [`cursorCharRight`](https://codemirror.net/6/docs/ref/#commands.cursorCharRight) ([`selectCharRight`](https://codemirror.net/6/docs/ref/#commands.selectCharRight) with Shift)
    - Ctrl-p: [`cursorLineUp`](https://codemirror.net/6/docs/ref/#commands.cursorLineUp) ([`selectLineUp`](https://codemirror.net/6/docs/ref/#commands.selectLineUp) with Shift)
    - Ctrl-n: [`cursorLineDown`](https://codemirror.net/6/docs/ref/#commands.cursorLineDown) ([`selectLineDown`](https://codemirror.net/6/docs/ref/#commands.selectLineDown) with Shift)
    - Ctrl-a: [`cursorLineStart`](https://codemirror.net/6/docs/ref/#commands.cursorLineStart) ([`selectLineStart`](https://codemirror.net/6/docs/ref/#commands.selectLineStart) with Shift)
    - Ctrl-e: [`cursorLineEnd`](https://codemirror.net/6/docs/ref/#commands.cursorLineEnd) ([`selectLineEnd`](https://codemirror.net/6/docs/ref/#commands.selectLineEnd) with Shift)
    - Ctrl-d: [`deleteCharForward`](https://codemirror.net/6/docs/ref/#commands.deleteCharForward)
    - Ctrl-h: [`deleteCharBackward`](https://codemirror.net/6/docs/ref/#commands.deleteCharBackward)
    - Ctrl-k: [`deleteToLineEnd`](https://codemirror.net/6/docs/ref/#commands.deleteToLineEnd)
    - Ctrl-Alt-h: [`deleteGroupBackward`](https://codemirror.net/6/docs/ref/#commands.deleteGroupBackward)
    - Ctrl-o: [`splitLine`](https://codemirror.net/6/docs/ref/#commands.splitLine)
    - Ctrl-t: [`transposeChars`](https://codemirror.net/6/docs/ref/#commands.transposeChars)
    - Ctrl-v: [`cursorPageDown`](https://codemirror.net/6/docs/ref/#commands.cursorPageDown)
    - Alt-v: [`cursorPageUp`](https://codemirror.net/6/docs/ref/#commands.cursorPageUp)
  */
  @JSImport("@codemirror/commands", "emacsStyleKeymap")
  @js.native
  val emacsStyleKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Create a history extension with the given configuration.
  */
  inline def history(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("history")().asInstanceOf[Extension]
  inline def history(config: HistoryConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("history")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]
  
  /**
  The state field used to store the history data. Should probably
  only be used when you want to
  [serialize](https://codemirror.net/6/docs/ref/#state.EditorState.toJSON) or
  [deserialize](https://codemirror.net/6/docs/ref/#state.EditorState^fromJSON) state objects in a way
  that preserves history.
  */
  @JSImport("@codemirror/commands", "historyField")
  @js.native
  val historyField: StateField[Any] = js.native
  
  /**
  Default key bindings for the undo history.
  - Mod-z: [`undo`](https://codemirror.net/6/docs/ref/#commands.undo).
  - Mod-y (Mod-Shift-z on macOS) + Ctrl-Shift-z on Linux: [`redo`](https://codemirror.net/6/docs/ref/#commands.redo).
  - Mod-u: [`undoSelection`](https://codemirror.net/6/docs/ref/#commands.undoSelection).
  - Alt-u (Mod-Shift-u on macOS): [`redoSelection`](https://codemirror.net/6/docs/ref/#commands.redoSelection).
  */
  @JSImport("@codemirror/commands", "historyKeymap")
  @js.native
  val historyKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Remove a [unit](https://codemirror.net/6/docs/ref/#language.indentUnit) of indentation from all
  selected lines.
  */
  @JSImport("@codemirror/commands", "indentLess")
  @js.native
  val indentLess: StateCommand = js.native
  
  /**
  Add a [unit](https://codemirror.net/6/docs/ref/#language.indentUnit) of indentation to all selected
  lines.
  */
  @JSImport("@codemirror/commands", "indentMore")
  @js.native
  val indentMore: StateCommand = js.native
  
  /**
  Auto-indent the selected lines. This uses the [indentation service
  facet](https://codemirror.net/6/docs/ref/#language.indentService) as source for auto-indent
  information.
  */
  @JSImport("@codemirror/commands", "indentSelection")
  @js.native
  val indentSelection: StateCommand = js.native
  
  /**
  A binding that binds Tab to [`indentMore`](https://codemirror.net/6/docs/ref/#commands.indentMore) and
  Shift-Tab to [`indentLess`](https://codemirror.net/6/docs/ref/#commands.indentLess).
  Please see the [Tab example](../../examples/tab/) before using
  this.
  */
  @JSImport("@codemirror/commands", "indentWithTab")
  @js.native
  val indentWithTab: KeyBinding = js.native
  
  /**
  Create a blank, indented line below the current line.
  */
  @JSImport("@codemirror/commands", "insertBlankLine")
  @js.native
  val insertBlankLine: StateCommand = js.native
  
  /**
  Replace the selection with a newline.
  */
  @JSImport("@codemirror/commands", "insertNewline")
  @js.native
  val insertNewline: StateCommand = js.native
  
  /**
  Replace the selection with a newline and indent the newly created
  line(s). If the current line consists only of whitespace, this
  will also delete that whitespace. When the cursor is between
  matching brackets, an additional newline will be inserted after
  the cursor.
  */
  @JSImport("@codemirror/commands", "insertNewlineAndIndent")
  @js.native
  val insertNewlineAndIndent: StateCommand = js.native
  
  /**
  Insert a tab character at the cursor or, if something is selected,
  use [`indentMore`](https://codemirror.net/6/docs/ref/#commands.indentMore) to indent the entire
  selection.
  */
  @JSImport("@codemirror/commands", "insertTab")
  @js.native
  val insertTab: StateCommand = js.native
  
  /**
  This facet provides a way to register functions that, given a
  transaction, provide a set of effects that the history should
  store when inverting the transaction. This can be used to
  integrate some kinds of effects in the history, so that they can
  be undone (and redone again).
  */
  @JSImport("@codemirror/commands", "invertedEffects")
  @js.native
  val invertedEffects: Facet[
    js.Function1[/* tr */ Transaction, js.Array[StateEffect[Any]]], 
    js.Array[js.Function1[/* tr */ Transaction, js.Array[StateEffect[Any]]]]
  ] = js.native
  
  /**
  Transaction annotation that will prevent that transaction from
  being combined with other transactions in the undo history. Given
  `"before"`, it'll prevent merging with previous transactions. With
  `"after"`, subsequent transactions won't be combined with this
  one. With `"full"`, the transaction is isolated on both sides.
  */
  @JSImport("@codemirror/commands", "isolateHistory")
  @js.native
  val isolateHistory: AnnotationType[after | before | full] = js.native
  
  /**
  Comment the current selection using line comments.
  */
  @JSImport("@codemirror/commands", "lineComment")
  @js.native
  val lineComment: StateCommand = js.native
  
  /**
  Uncomment the current selection using line comments.
  */
  @JSImport("@codemirror/commands", "lineUncomment")
  @js.native
  val lineUncomment: StateCommand = js.native
  
  /**
  Move the selected lines down one line.
  */
  @JSImport("@codemirror/commands", "moveLineDown")
  @js.native
  val moveLineDown: StateCommand = js.native
  
  /**
  Move the selected lines up one line.
  */
  @JSImport("@codemirror/commands", "moveLineUp")
  @js.native
  val moveLineUp: StateCommand = js.native
  
  /**
  Redo a group of history events. Returns false if no group was
  available.
  */
  @JSImport("@codemirror/commands", "redo")
  @js.native
  val redo: StateCommand = js.native
  
  /**
  The amount of redoable change events available in a given state.
  */
  inline def redoDepth(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("redoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Redo a change or selection change.
  */
  @JSImport("@codemirror/commands", "redoSelection")
  @js.native
  val redoSelection: StateCommand = js.native
  
  /**
  Select the entire document.
  */
  @JSImport("@codemirror/commands", "selectAll")
  @js.native
  val selectAll: StateCommand = js.native
  
  /**
  Move the selection head one character backward.
  */
  @JSImport("@codemirror/commands", "selectCharBackward")
  @js.native
  val selectCharBackward: Command = js.native
  
  /**
  Move the selection head one character forward.
  */
  @JSImport("@codemirror/commands", "selectCharForward")
  @js.native
  val selectCharForward: Command = js.native
  
  /**
  Move the selection head one character to the left, while leaving
  the anchor in place.
  */
  @JSImport("@codemirror/commands", "selectCharLeft")
  @js.native
  val selectCharLeft: Command = js.native
  
  /**
  Move the selection head one character to the right.
  */
  @JSImport("@codemirror/commands", "selectCharRight")
  @js.native
  val selectCharRight: Command = js.native
  
  /**
  Move the selection head to the end of the document.
  */
  @JSImport("@codemirror/commands", "selectDocEnd")
  @js.native
  val selectDocEnd: StateCommand = js.native
  
  /**
  Move the selection head to the start of the document.
  */
  @JSImport("@codemirror/commands", "selectDocStart")
  @js.native
  val selectDocStart: StateCommand = js.native
  
  /**
  Move the selection head one group backward.
  */
  @JSImport("@codemirror/commands", "selectGroupBackward")
  @js.native
  val selectGroupBackward: Command = js.native
  
  /**
  Move the selection head one group forward.
  */
  @JSImport("@codemirror/commands", "selectGroupForward")
  @js.native
  val selectGroupForward: Command = js.native
  
  /**
  Move the selection head one [group](https://codemirror.net/6/docs/ref/#commands.cursorGroupLeft) to
  the left.
  */
  @JSImport("@codemirror/commands", "selectGroupLeft")
  @js.native
  val selectGroupLeft: Command = js.native
  
  /**
  Move the selection head one group to the right.
  */
  @JSImport("@codemirror/commands", "selectGroupRight")
  @js.native
  val selectGroupRight: Command = js.native
  
  /**
  Expand the selection to cover entire lines.
  */
  @JSImport("@codemirror/commands", "selectLine")
  @js.native
  val selectLine: StateCommand = js.native
  
  /**
  Move the selection head to the previous line boundary.
  */
  @JSImport("@codemirror/commands", "selectLineBoundaryBackward")
  @js.native
  val selectLineBoundaryBackward: Command = js.native
  
  /**
  Move the selection head to the next line boundary.
  */
  @JSImport("@codemirror/commands", "selectLineBoundaryForward")
  @js.native
  val selectLineBoundaryForward: Command = js.native
  
  /**
  Move the selection head one line boundary to the left.
  */
  @JSImport("@codemirror/commands", "selectLineBoundaryLeft")
  @js.native
  val selectLineBoundaryLeft: Command = js.native
  
  /**
  Move the selection head one line boundary to the right.
  */
  @JSImport("@codemirror/commands", "selectLineBoundaryRight")
  @js.native
  val selectLineBoundaryRight: Command = js.native
  
  /**
  Move the selection head one line down.
  */
  @JSImport("@codemirror/commands", "selectLineDown")
  @js.native
  val selectLineDown: Command = js.native
  
  /**
  Move the selection head to the end of the line.
  */
  @JSImport("@codemirror/commands", "selectLineEnd")
  @js.native
  val selectLineEnd: Command = js.native
  
  /**
  Move the selection head to the start of the line.
  */
  @JSImport("@codemirror/commands", "selectLineStart")
  @js.native
  val selectLineStart: Command = js.native
  
  /**
  Move the selection head one line up.
  */
  @JSImport("@codemirror/commands", "selectLineUp")
  @js.native
  val selectLineUp: Command = js.native
  
  /**
  Extend the selection to the bracket matching the one the selection
  head is currently on, if any.
  */
  @JSImport("@codemirror/commands", "selectMatchingBracket")
  @js.native
  val selectMatchingBracket: StateCommand = js.native
  
  /**
  Move the selection head one page down.
  */
  @JSImport("@codemirror/commands", "selectPageDown")
  @js.native
  val selectPageDown: Command = js.native
  
  /**
  Move the selection head one page up.
  */
  @JSImport("@codemirror/commands", "selectPageUp")
  @js.native
  val selectPageUp: Command = js.native
  
  /**
  Select the next syntactic construct that is larger than the
  selection. Note that this will only work insofar as the language
  [provider](https://codemirror.net/6/docs/ref/#language.language) you use builds up a full
  syntax tree.
  */
  @JSImport("@codemirror/commands", "selectParentSyntax")
  @js.native
  val selectParentSyntax: StateCommand = js.native
  
  /**
  Move the selection head one group or subword backward.
  */
  @JSImport("@codemirror/commands", "selectSubwordBackward")
  @js.native
  val selectSubwordBackward: Command = js.native
  
  /**
  Move the selection head one group or camel-case subword forward.
  */
  @JSImport("@codemirror/commands", "selectSubwordForward")
  @js.native
  val selectSubwordForward: Command = js.native
  
  /**
  Move the selection head over the next syntactic element to the left.
  */
  @JSImport("@codemirror/commands", "selectSyntaxLeft")
  @js.native
  val selectSyntaxLeft: Command = js.native
  
  /**
  Move the selection head over the next syntactic element to the right.
  */
  @JSImport("@codemirror/commands", "selectSyntaxRight")
  @js.native
  val selectSyntaxRight: Command = js.native
  
  /**
  Simplify the current selection. When multiple ranges are selected,
  reduce it to its main range. Otherwise, if the selection is
  non-empty, convert it to a cursor selection.
  */
  @JSImport("@codemirror/commands", "simplifySelection")
  @js.native
  val simplifySelection: StateCommand = js.native
  
  /**
  Replace each selection range with a line break, leaving the cursor
  on the line before the break.
  */
  @JSImport("@codemirror/commands", "splitLine")
  @js.native
  val splitLine: StateCommand = js.native
  
  /**
  An array of key bindings closely sticking to platform-standard or
  widely used bindings. (This includes the bindings from
  [`emacsStyleKeymap`](https://codemirror.net/6/docs/ref/#commands.emacsStyleKeymap), with their `key`
  property changed to `mac`.)
    - ArrowLeft: [`cursorCharLeft`](https://codemirror.net/6/docs/ref/#commands.cursorCharLeft) ([`selectCharLeft`](https://codemirror.net/6/docs/ref/#commands.selectCharLeft) with Shift)
    - ArrowRight: [`cursorCharRight`](https://codemirror.net/6/docs/ref/#commands.cursorCharRight) ([`selectCharRight`](https://codemirror.net/6/docs/ref/#commands.selectCharRight) with Shift)
    - Ctrl-ArrowLeft (Alt-ArrowLeft on macOS): [`cursorGroupLeft`](https://codemirror.net/6/docs/ref/#commands.cursorGroupLeft) ([`selectGroupLeft`](https://codemirror.net/6/docs/ref/#commands.selectGroupLeft) with Shift)
    - Ctrl-ArrowRight (Alt-ArrowRight on macOS): [`cursorGroupRight`](https://codemirror.net/6/docs/ref/#commands.cursorGroupRight) ([`selectGroupRight`](https://codemirror.net/6/docs/ref/#commands.selectGroupRight) with Shift)
    - Cmd-ArrowLeft (on macOS): [`cursorLineStart`](https://codemirror.net/6/docs/ref/#commands.cursorLineStart) ([`selectLineStart`](https://codemirror.net/6/docs/ref/#commands.selectLineStart) with Shift)
    - Cmd-ArrowRight (on macOS): [`cursorLineEnd`](https://codemirror.net/6/docs/ref/#commands.cursorLineEnd) ([`selectLineEnd`](https://codemirror.net/6/docs/ref/#commands.selectLineEnd) with Shift)
    - ArrowUp: [`cursorLineUp`](https://codemirror.net/6/docs/ref/#commands.cursorLineUp) ([`selectLineUp`](https://codemirror.net/6/docs/ref/#commands.selectLineUp) with Shift)
    - ArrowDown: [`cursorLineDown`](https://codemirror.net/6/docs/ref/#commands.cursorLineDown) ([`selectLineDown`](https://codemirror.net/6/docs/ref/#commands.selectLineDown) with Shift)
    - Cmd-ArrowUp (on macOS): [`cursorDocStart`](https://codemirror.net/6/docs/ref/#commands.cursorDocStart) ([`selectDocStart`](https://codemirror.net/6/docs/ref/#commands.selectDocStart) with Shift)
    - Cmd-ArrowDown (on macOS): [`cursorDocEnd`](https://codemirror.net/6/docs/ref/#commands.cursorDocEnd) ([`selectDocEnd`](https://codemirror.net/6/docs/ref/#commands.selectDocEnd) with Shift)
    - Ctrl-ArrowUp (on macOS): [`cursorPageUp`](https://codemirror.net/6/docs/ref/#commands.cursorPageUp) ([`selectPageUp`](https://codemirror.net/6/docs/ref/#commands.selectPageUp) with Shift)
    - Ctrl-ArrowDown (on macOS): [`cursorPageDown`](https://codemirror.net/6/docs/ref/#commands.cursorPageDown) ([`selectPageDown`](https://codemirror.net/6/docs/ref/#commands.selectPageDown) with Shift)
    - PageUp: [`cursorPageUp`](https://codemirror.net/6/docs/ref/#commands.cursorPageUp) ([`selectPageUp`](https://codemirror.net/6/docs/ref/#commands.selectPageUp) with Shift)
    - PageDown: [`cursorPageDown`](https://codemirror.net/6/docs/ref/#commands.cursorPageDown) ([`selectPageDown`](https://codemirror.net/6/docs/ref/#commands.selectPageDown) with Shift)
    - Home: [`cursorLineBoundaryBackward`](https://codemirror.net/6/docs/ref/#commands.cursorLineBoundaryBackward) ([`selectLineBoundaryBackward`](https://codemirror.net/6/docs/ref/#commands.selectLineBoundaryBackward) with Shift)
    - End: [`cursorLineBoundaryForward`](https://codemirror.net/6/docs/ref/#commands.cursorLineBoundaryForward) ([`selectLineBoundaryForward`](https://codemirror.net/6/docs/ref/#commands.selectLineBoundaryForward) with Shift)
    - Ctrl-Home (Cmd-Home on macOS): [`cursorDocStart`](https://codemirror.net/6/docs/ref/#commands.cursorDocStart) ([`selectDocStart`](https://codemirror.net/6/docs/ref/#commands.selectDocStart) with Shift)
    - Ctrl-End (Cmd-Home on macOS): [`cursorDocEnd`](https://codemirror.net/6/docs/ref/#commands.cursorDocEnd) ([`selectDocEnd`](https://codemirror.net/6/docs/ref/#commands.selectDocEnd) with Shift)
    - Enter: [`insertNewlineAndIndent`](https://codemirror.net/6/docs/ref/#commands.insertNewlineAndIndent)
    - Ctrl-a (Cmd-a on macOS): [`selectAll`](https://codemirror.net/6/docs/ref/#commands.selectAll)
    - Backspace: [`deleteCharBackward`](https://codemirror.net/6/docs/ref/#commands.deleteCharBackward)
    - Delete: [`deleteCharForward`](https://codemirror.net/6/docs/ref/#commands.deleteCharForward)
    - Ctrl-Backspace (Alt-Backspace on macOS): [`deleteGroupBackward`](https://codemirror.net/6/docs/ref/#commands.deleteGroupBackward)
    - Ctrl-Delete (Alt-Delete on macOS): [`deleteGroupForward`](https://codemirror.net/6/docs/ref/#commands.deleteGroupForward)
    - Cmd-Backspace (macOS): [`deleteToLineStart`](https://codemirror.net/6/docs/ref/#commands.deleteToLineStart).
    - Cmd-Delete (macOS): [`deleteToLineEnd`](https://codemirror.net/6/docs/ref/#commands.deleteToLineEnd).
  */
  @JSImport("@codemirror/commands", "standardKeymap")
  @js.native
  val standardKeymap: js.Array[KeyBinding] = js.native
  
  /**
  Comment or uncomment the current selection using block comments.
  The block comment syntax is taken from the
  [`commentTokens`](https://codemirror.net/6/docs/ref/#commands.CommentTokens) [language
  data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt).
  */
  @JSImport("@codemirror/commands", "toggleBlockComment")
  @js.native
  val toggleBlockComment: StateCommand = js.native
  
  /**
  Comment or uncomment the lines around the current selection using
  block comments.
  */
  @JSImport("@codemirror/commands", "toggleBlockCommentByLine")
  @js.native
  val toggleBlockCommentByLine: StateCommand = js.native
  
  /**
  Comment or uncomment the current selection. Will use line comments
  if available, otherwise falling back to block comments.
  */
  @JSImport("@codemirror/commands", "toggleComment")
  @js.native
  val toggleComment: StateCommand = js.native
  
  /**
  Comment or uncomment the current selection using line comments.
  The line comment syntax is taken from the
  [`commentTokens`](https://codemirror.net/6/docs/ref/#commands.CommentTokens) [language
  data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt).
  */
  @JSImport("@codemirror/commands", "toggleLineComment")
  @js.native
  val toggleLineComment: StateCommand = js.native
  
  /**
  Flip the characters before and after the cursor(s).
  */
  @JSImport("@codemirror/commands", "transposeChars")
  @js.native
  val transposeChars: StateCommand = js.native
  
  /**
  Undo a single group of history events. Returns false if no group
  was available.
  */
  @JSImport("@codemirror/commands", "undo")
  @js.native
  val undo: StateCommand = js.native
  
  /**
  The amount of undoable change events available in a given state.
  */
  inline def undoDepth(state: EditorState): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("undoDepth")(state.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
  Undo a change or selection change.
  */
  @JSImport("@codemirror/commands", "undoSelection")
  @js.native
  val undoSelection: StateCommand = js.native
  
  /**
  An object of this type can be provided as [language
  data](https://codemirror.net/6/docs/ref/#state.EditorState.languageDataAt) under a `"commentTokens"`
  property to configure comment syntax for a language.
  */
  trait CommentTokens extends StObject {
    
    /**
      The block comment syntax, if any. For example, for HTML
      you'd provide `{open: "<!--", close: "-->"}`.
      */
    var block: js.UndefOr[Close] = js.undefined
    
    /**
      The line comment syntax. For example `"//"`.
      */
    var line: js.UndefOr[String] = js.undefined
  }
  object CommentTokens {
    
    inline def apply(): CommentTokens = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentTokens]
    }
    
    extension [Self <: CommentTokens](x: Self) {
      
      inline def setBlock(value: Close): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    }
  }
  
  trait HistoryConfig extends StObject {
    
    /**
      The minimum depth (amount of events) to store. Defaults to 100.
      */
    var minDepth: js.UndefOr[Double] = js.undefined
    
    /**
      The maximum time (in milliseconds) that adjacent events can be
      apart and still be grouped together. Defaults to 500.
      */
    var newGroupDelay: js.UndefOr[Double] = js.undefined
  }
  object HistoryConfig {
    
    inline def apply(): HistoryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryConfig]
    }
    
    extension [Self <: HistoryConfig](x: Self) {
      
      inline def setMinDepth(value: Double): Self = StObject.set(x, "minDepth", value.asInstanceOf[js.Any])
      
      inline def setMinDepthUndefined: Self = StObject.set(x, "minDepth", js.undefined)
      
      inline def setNewGroupDelay(value: Double): Self = StObject.set(x, "newGroupDelay", value.asInstanceOf[js.Any])
      
      inline def setNewGroupDelayUndefined: Self = StObject.set(x, "newGroupDelay", js.undefined)
    }
  }
}
