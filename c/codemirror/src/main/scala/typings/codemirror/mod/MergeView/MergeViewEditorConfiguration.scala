package typings.codemirror.mod.MergeView

import typings.codemirror.AnonDelay
import typings.codemirror.mod.AutoCloseBrackets
import typings.codemirror.mod.AutoCloseTags
import typings.codemirror.mod.Editor
import typings.codemirror.mod.EditorConfiguration
import typings.codemirror.mod.HighlightSelectionMatches
import typings.codemirror.mod.InputStyle
import typings.codemirror.mod.KeyMap
import typings.codemirror.mod.LintOptions
import typings.codemirror.mod.MatchBrackets
import typings.codemirror.mod.MatchTags
import typings.codemirror.mod.ShowHintOptions
import typings.codemirror.mod.StyleActiveLine
import typings.codemirror.mod.TextMarker
import typings.std.DragEvent
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to MergeView.
  */
trait MergeViewEditorConfiguration extends EditorConfiguration {
  /**
    * Determines whether the original editor allows editing. Defaults to false.
    */
  var allowEditingOriginals: js.UndefOr[Boolean] = js.undefined
  /**
    * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
    * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
    */
  var collapseIdentical: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
    * the smaller chunk is padded to align with the bigger chunk instead.
    */
  var connect: js.UndefOr[String] = js.undefined
  /**
    * Callback for when stretches of unchanged text are collapsed.
    */
  var onCollapse: js.UndefOr[
    js.Function4[
      /* mergeView */ MergeViewEditor, 
      /* line */ Double, 
      /* size */ Double, 
      /* mark */ TextMarker, 
      Unit
    ]
  ] = js.undefined
  /**
    * Provides original version of the document to be shown on the right of the editor.
    */
  var orig: js.Any
  /**
    * Provides original version of the document to be shown on the left of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origLeft: js.UndefOr[js.Any] = js.undefined
  /**
    * Provides original version of document to be shown on the right of the editor.
    * To create a 2-way (as opposed to 3-way) merge view, provide only one of origLeft and origRight.
    */
  var origRight: js.UndefOr[js.Any] = js.undefined
  /**
    * Determines whether buttons that allow the user to revert changes are shown. Defaults to true.
    */
  var revertButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, changed pieces of text are highlighted. Defaults to true.
    */
  var showDifferences: js.UndefOr[Boolean] = js.undefined
}

object MergeViewEditorConfiguration {
  @scala.inline
  def apply(
    orig: js.Any,
    addModeClass: js.UndefOr[Boolean] = js.undefined,
    allowDropFileTypes: js.Array[String] = null,
    allowEditingOriginals: js.UndefOr[Boolean] = js.undefined,
    autoCloseBrackets: AutoCloseBrackets | Boolean | String = null,
    autoCloseTags: AutoCloseTags | Boolean = null,
    autoRefresh: Boolean | AnonDelay = null,
    autocapitalize: js.UndefOr[Boolean] = js.undefined,
    autocorrect: js.UndefOr[Boolean] = js.undefined,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    collapseIdentical: Boolean | Double = null,
    connect: String = null,
    coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined,
    cursorBlinkRate: Int | Double = null,
    cursorHeight: Int | Double = null,
    cursorScrollMargin: Int | Double = null,
    dragDrop: js.UndefOr[Boolean] = js.undefined,
    electricChars: js.UndefOr[Boolean] = js.undefined,
    extraKeys: String | KeyMap = null,
    firstLineNumber: Int | Double = null,
    fixedGutter: js.UndefOr[Boolean] = js.undefined,
    flattenSpans: js.UndefOr[Boolean] = js.undefined,
    foldGutter: js.UndefOr[Boolean] = js.undefined,
    gutters: js.Array[String] = null,
    highlightSelectionMatches: HighlightSelectionMatches | Boolean = null,
    hintOptions: ShowHintOptions = null,
    historyEventDelay: Int | Double = null,
    indentUnit: Int | Double = null,
    indentWithTabs: js.UndefOr[Boolean] = js.undefined,
    inputStyle: InputStyle = null,
    keyMap: String = null,
    lineNumberFormatter: /* line */ Double => String = null,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined,
    lineWrapping: js.UndefOr[Boolean] = js.undefined,
    lint: Boolean | LintOptions = null,
    matchBrackets: MatchBrackets | Boolean = null,
    matchTags: MatchTags | Boolean = null,
    maxHighlightLength: Int | Double = null,
    mode: js.Any = null,
    onCollapse: (/* mergeView */ MergeViewEditor, /* line */ Double, /* size */ Double, /* mark */ TextMarker) => Unit = null,
    onDragEvent: (/* instance */ Editor, /* event */ DragEvent) => Boolean = null,
    onKeyEvent: (/* instance */ Editor, /* event */ KeyboardEvent) => Boolean = null,
    origLeft: js.Any = null,
    origRight: js.Any = null,
    placeholder: String = null,
    pollInterval: Int | Double = null,
    readOnly: js.Any = null,
    resetSelectionOnContextMenu: js.UndefOr[Boolean] = js.undefined,
    revertButtons: js.UndefOr[Boolean] = js.undefined,
    rtlMoveVisually: js.UndefOr[Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollbarStyle: String = null,
    showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined,
    showDifferences: js.UndefOr[Boolean] = js.undefined,
    showHint: js.UndefOr[Boolean] = js.undefined,
    smartIndent: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined,
    styleActiveLine: StyleActiveLine | Boolean = null,
    tabSize: Int | Double = null,
    tabindex: Int | Double = null,
    theme: String = null,
    undoDepth: Int | Double = null,
    value: js.Any = null,
    viewportMargin: Int | Double = null,
    workDelay: Int | Double = null,
    workTime: Int | Double = null
  ): MergeViewEditorConfiguration = {
    val __obj = js.Dynamic.literal(orig = orig.asInstanceOf[js.Any])
    if (!js.isUndefined(addModeClass)) __obj.updateDynamic("addModeClass")(addModeClass.asInstanceOf[js.Any])
    if (allowDropFileTypes != null) __obj.updateDynamic("allowDropFileTypes")(allowDropFileTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditingOriginals)) __obj.updateDynamic("allowEditingOriginals")(allowEditingOriginals.asInstanceOf[js.Any])
    if (autoCloseBrackets != null) __obj.updateDynamic("autoCloseBrackets")(autoCloseBrackets.asInstanceOf[js.Any])
    if (autoCloseTags != null) __obj.updateDynamic("autoCloseTags")(autoCloseTags.asInstanceOf[js.Any])
    if (autoRefresh != null) __obj.updateDynamic("autoRefresh")(autoRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(autocapitalize)) __obj.updateDynamic("autocapitalize")(autocapitalize.asInstanceOf[js.Any])
    if (!js.isUndefined(autocorrect)) __obj.updateDynamic("autocorrect")(autocorrect.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus.asInstanceOf[js.Any])
    if (collapseIdentical != null) __obj.updateDynamic("collapseIdentical")(collapseIdentical.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (!js.isUndefined(coverGutterNextToScrollbar)) __obj.updateDynamic("coverGutterNextToScrollbar")(coverGutterNextToScrollbar.asInstanceOf[js.Any])
    if (cursorBlinkRate != null) __obj.updateDynamic("cursorBlinkRate")(cursorBlinkRate.asInstanceOf[js.Any])
    if (cursorHeight != null) __obj.updateDynamic("cursorHeight")(cursorHeight.asInstanceOf[js.Any])
    if (cursorScrollMargin != null) __obj.updateDynamic("cursorScrollMargin")(cursorScrollMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars.asInstanceOf[js.Any])
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter.asInstanceOf[js.Any])
    if (!js.isUndefined(flattenSpans)) __obj.updateDynamic("flattenSpans")(flattenSpans.asInstanceOf[js.Any])
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter.asInstanceOf[js.Any])
    if (gutters != null) __obj.updateDynamic("gutters")(gutters.asInstanceOf[js.Any])
    if (highlightSelectionMatches != null) __obj.updateDynamic("highlightSelectionMatches")(highlightSelectionMatches.asInstanceOf[js.Any])
    if (hintOptions != null) __obj.updateDynamic("hintOptions")(hintOptions.asInstanceOf[js.Any])
    if (historyEventDelay != null) __obj.updateDynamic("historyEventDelay")(historyEventDelay.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWithTabs)) __obj.updateDynamic("indentWithTabs")(indentWithTabs.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap.asInstanceOf[js.Any])
    if (lineNumberFormatter != null) __obj.updateDynamic("lineNumberFormatter")(js.Any.fromFunction1(lineNumberFormatter))
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWiseCopyCut)) __obj.updateDynamic("lineWiseCopyCut")(lineWiseCopyCut.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWrapping)) __obj.updateDynamic("lineWrapping")(lineWrapping.asInstanceOf[js.Any])
    if (lint != null) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (matchBrackets != null) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (matchTags != null) __obj.updateDynamic("matchTags")(matchTags.asInstanceOf[js.Any])
    if (maxHighlightLength != null) __obj.updateDynamic("maxHighlightLength")(maxHighlightLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction4(onCollapse))
    if (onDragEvent != null) __obj.updateDynamic("onDragEvent")(js.Any.fromFunction2(onDragEvent))
    if (onKeyEvent != null) __obj.updateDynamic("onKeyEvent")(js.Any.fromFunction2(onKeyEvent))
    if (origLeft != null) __obj.updateDynamic("origLeft")(origLeft.asInstanceOf[js.Any])
    if (origRight != null) __obj.updateDynamic("origRight")(origRight.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(resetSelectionOnContextMenu)) __obj.updateDynamic("resetSelectionOnContextMenu")(resetSelectionOnContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(revertButtons)) __obj.updateDynamic("revertButtons")(revertButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlMoveVisually)) __obj.updateDynamic("rtlMoveVisually")(rtlMoveVisually.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd.asInstanceOf[js.Any])
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting.asInstanceOf[js.Any])
    if (!js.isUndefined(showDifferences)) __obj.updateDynamic("showDifferences")(showDifferences.asInstanceOf[js.Any])
    if (!js.isUndefined(showHint)) __obj.updateDynamic("showHint")(showHint.asInstanceOf[js.Any])
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    if (styleActiveLine != null) __obj.updateDynamic("styleActiveLine")(styleActiveLine.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (undoDepth != null) __obj.updateDynamic("undoDepth")(undoDepth.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (workDelay != null) __obj.updateDynamic("workDelay")(workDelay.asInstanceOf[js.Any])
    if (workTime != null) __obj.updateDynamic("workTime")(workTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewEditorConfiguration]
  }
}

