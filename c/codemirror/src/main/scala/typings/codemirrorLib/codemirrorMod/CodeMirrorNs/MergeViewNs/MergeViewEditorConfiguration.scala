package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options available to MergeView.
  */
trait MergeViewEditorConfiguration
  extends codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration {
  /**
    * Determines whether the original editor allows editing. Defaults to false.
    */
  var allowEditingOriginals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true stretches of unchanged text will be collapsed. When a number is given, this indicates the amount
    * of lines to leave visible around such stretches (which defaults to 2). Defaults to false.
    */
  var collapseIdentical: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  /**
    * Sets the style used to connect changed chunks of code. By default, connectors are drawn. When this is set to "align",
    * the smaller chunk is padded to align with the bigger chunk instead.
    */
  var connect: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback for when stretches of unchanged text are collapsed.
    */
  var onCollapse: js.UndefOr[
    js.Function4[
      /* mergeView */ MergeViewEditor, 
      /* line */ scala.Double, 
      /* size */ scala.Double, 
      /* mark */ codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker, 
      scala.Unit
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
  var revertButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When true, changed pieces of text are highlighted. Defaults to true.
    */
  var showDifferences: js.UndefOr[scala.Boolean] = js.undefined
}

object MergeViewEditorConfiguration {
  @scala.inline
  def apply(
    orig: js.Any,
    allowEditingOriginals: js.UndefOr[scala.Boolean] = js.undefined,
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    collapseIdentical: scala.Boolean | scala.Double = null,
    connect: java.lang.String = null,
    cursorBlinkRate: scala.Int | scala.Double = null,
    cursorHeight: scala.Int | scala.Double = null,
    dragDrop: js.UndefOr[scala.Boolean] = js.undefined,
    electricChars: js.UndefOr[scala.Boolean] = js.undefined,
    extraKeys: java.lang.String | codemirrorLib.codemirrorMod.CodeMirrorNs.KeyMap = null,
    firstLineNumber: scala.Int | scala.Double = null,
    fixedGutter: js.UndefOr[scala.Boolean] = js.undefined,
    flattenSpans: js.UndefOr[scala.Boolean] = js.undefined,
    foldGutter: js.UndefOr[scala.Boolean] = js.undefined,
    gutters: js.Array[java.lang.String] = null,
    hintOptions: codemirrorLib.codemirrorMod.CodeMirrorNs.ShowHintOptions = null,
    historyEventDelay: scala.Int | scala.Double = null,
    indentUnit: scala.Int | scala.Double = null,
    indentWithTabs: js.UndefOr[scala.Boolean] = js.undefined,
    keyMap: java.lang.String = null,
    lineNumberFormatter: /* line */ scala.Double => java.lang.String = null,
    lineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    lineWrapping: js.UndefOr[scala.Boolean] = js.undefined,
    lint: scala.Boolean | codemirrorLib.codemirrorMod.CodeMirrorNs.LintOptions = null,
    matchBrackets: js.UndefOr[scala.Boolean] = js.undefined,
    maxHighlightLength: scala.Int | scala.Double = null,
    mode: js.Any = null,
    onCollapse: (/* mergeView */ MergeViewEditor, /* line */ scala.Double, /* size */ scala.Double, /* mark */ codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker) => scala.Unit = null,
    onDragEvent: (/* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, /* event */ stdLib.Event) => scala.Boolean = null,
    onKeyEvent: (/* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, /* event */ stdLib.Event) => scala.Boolean = null,
    origLeft: js.Any = null,
    origRight: js.Any = null,
    placeholder: java.lang.String = null,
    pollInterval: scala.Int | scala.Double = null,
    readOnly: js.Any = null,
    revertButtons: js.UndefOr[scala.Boolean] = js.undefined,
    rtlMoveVisually: js.UndefOr[scala.Boolean] = js.undefined,
    scrollbarStyle: java.lang.String = null,
    showCursorWhenSelecting: js.UndefOr[scala.Boolean] = js.undefined,
    showDifferences: js.UndefOr[scala.Boolean] = js.undefined,
    showHint: js.UndefOr[scala.Boolean] = js.undefined,
    smartIndent: js.UndefOr[scala.Boolean] = js.undefined,
    tabSize: scala.Int | scala.Double = null,
    tabindex: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    undoDepth: scala.Int | scala.Double = null,
    value: js.Any = null,
    viewportMargin: scala.Int | scala.Double = null,
    workDelay: scala.Int | scala.Double = null,
    workTime: scala.Int | scala.Double = null
  ): MergeViewEditorConfiguration = {
    val __obj = js.Dynamic.literal(orig = orig)
    if (!js.isUndefined(allowEditingOriginals)) __obj.updateDynamic("allowEditingOriginals")(allowEditingOriginals)
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (collapseIdentical != null) __obj.updateDynamic("collapseIdentical")(collapseIdentical.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect)
    if (cursorBlinkRate != null) __obj.updateDynamic("cursorBlinkRate")(cursorBlinkRate.asInstanceOf[js.Any])
    if (cursorHeight != null) __obj.updateDynamic("cursorHeight")(cursorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop)
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars)
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter)
    if (!js.isUndefined(flattenSpans)) __obj.updateDynamic("flattenSpans")(flattenSpans)
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (hintOptions != null) __obj.updateDynamic("hintOptions")(hintOptions)
    if (historyEventDelay != null) __obj.updateDynamic("historyEventDelay")(historyEventDelay.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWithTabs)) __obj.updateDynamic("indentWithTabs")(indentWithTabs)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (lineNumberFormatter != null) __obj.updateDynamic("lineNumberFormatter")(js.Any.fromFunction1(lineNumberFormatter))
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (!js.isUndefined(lineWrapping)) __obj.updateDynamic("lineWrapping")(lineWrapping)
    if (lint != null) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets)
    if (maxHighlightLength != null) __obj.updateDynamic("maxHighlightLength")(maxHighlightLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction4(onCollapse))
    if (onDragEvent != null) __obj.updateDynamic("onDragEvent")(js.Any.fromFunction2(onDragEvent))
    if (onKeyEvent != null) __obj.updateDynamic("onKeyEvent")(js.Any.fromFunction2(onKeyEvent))
    if (origLeft != null) __obj.updateDynamic("origLeft")(origLeft)
    if (origRight != null) __obj.updateDynamic("origRight")(origRight)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(revertButtons)) __obj.updateDynamic("revertButtons")(revertButtons)
    if (!js.isUndefined(rtlMoveVisually)) __obj.updateDynamic("rtlMoveVisually")(rtlMoveVisually)
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle)
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting)
    if (!js.isUndefined(showDifferences)) __obj.updateDynamic("showDifferences")(showDifferences)
    if (!js.isUndefined(showHint)) __obj.updateDynamic("showHint")(showHint)
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (undoDepth != null) __obj.updateDynamic("undoDepth")(undoDepth.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (workDelay != null) __obj.updateDynamic("workDelay")(workDelay.asInstanceOf[js.Any])
    if (workTime != null) __obj.updateDynamic("workTime")(workTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeViewEditorConfiguration]
  }
}

