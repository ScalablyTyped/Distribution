package typings
package braftDashEditorLib.braftDashEditorMod.BraftEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editorProps extends js.Object {
  var allowSetTextBackgroundColor: js.UndefOr[scala.Boolean] = js.undefined
  var blur: js.UndefOr[js.Function0[_]] = js.undefined
  var clear: js.UndefOr[js.Function0[_]] = js.undefined
  var colors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var contentFormat: js.UndefOr[
    braftDashEditorLib.braftDashEditorLibStrings.raw | braftDashEditorLib.braftDashEditorLibStrings.html
  ] = js.undefined
  var contentId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var controls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editorState: js.UndefOr[js.Any] = js.undefined
  var emojis: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var excludeControls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var extendAtomics: js.UndefOr[js.Array[_]] = js.undefined
  var extendControls: js.UndefOr[js.Array[_]] = js.undefined
  var focus: js.UndefOr[js.Function0[_]] = js.undefined
  var fontFamilies: js.UndefOr[js.Array[fontFamiliesRange]] = js.undefined
  var fontSizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var forceNewLine: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getContent: js.UndefOr[
    js.Function1[
      /* format */ js.UndefOr[java.lang.String], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState
    ]
  ] = js.undefined
  var getDraftInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getEditorState: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var getMediaLibraryInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getSelectionBlockType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var getSelectionInlineStyle: js.UndefOr[js.Function0[_]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var imageControls: js.UndefOr[js.Any] = js.undefined
  var indents: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var initialContent: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var insertHTML: js.UndefOr[js.Function1[/* htmlString */ java.lang.String, _]] = js.undefined
  var insertMedias: js.UndefOr[js.Function1[/* medias */ js.Array[braftDashEditorLib.Anon_Name], _]] = js.undefined
  var insertText: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* replace */ js.UndefOr[scala.Boolean], _]
  ] = js.undefined
  var isEmpty: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var letterSpacings: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var lineHeights: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var media: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHTMLChange: js.UndefOr[js.Function1[/* content */ java.lang.String, scala.Unit]] = js.undefined
  var onRawChange: js.UndefOr[
    js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ]
  ] = js.undefined
  var onSave: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ reactLib.Event, scala.Unit]] = js.undefined
  var pasteMode: js.UndefOr[
    braftDashEditorLib.braftDashEditorLibStrings.text | braftDashEditorLib.braftDashEditorLibStrings.Empty
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var redo: js.UndefOr[js.Function0[_]] = js.undefined
  var selectionCollapsed: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var selectionHasInlineStyle: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var setContent: js.UndefOr[
    js.Function2[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      /* format */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var tabIndents: js.UndefOr[scala.Double] = js.undefined
  var textAlignOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var toggleSelectionAlignment: js.UndefOr[js.Function1[/* alignment */ java.lang.String, _]] = js.undefined
  var toggleSelectionBackgroundColor: js.UndefOr[js.Function1[/* hexColor */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionBlockType: js.UndefOr[js.Function1[/* blockquote */ java.lang.String, _]] = js.undefined
  var toggleSelectionColor: js.UndefOr[js.Function1[/* hexColor */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionFontFamily: js.UndefOr[js.Function1[/* fontFamily */ java.lang.String, scala.Unit]] = js.undefined
  var toggleSelectionFontSize: js.UndefOr[js.Function1[/* fontSize */ scala.Double, scala.Unit]] = js.undefined
  var toggleSelectionInlineStyle: js.UndefOr[
    js.Function2[
      /* style */ java.lang.String, 
      /* stylesToBeRemoved */ js.UndefOr[js.Array[java.lang.String]], 
      _
    ]
  ] = js.undefined
  var toggleSelectionLink: js.UndefOr[
    js.Function2[/* href */ java.lang.String, /* target */ java.lang.String, scala.Unit]
  ] = js.undefined
  var undo: js.UndefOr[js.Function0[_]] = js.undefined
  var viewWrapper: js.UndefOr[java.lang.String] = js.undefined
}

object editorProps {
  @scala.inline
  def apply(
    allowSetTextBackgroundColor: js.UndefOr[scala.Boolean] = js.undefined,
    blur: js.Function0[_] = null,
    clear: js.Function0[_] = null,
    colors: js.Array[java.lang.String] = null,
    contentFormat: braftDashEditorLib.braftDashEditorLibStrings.raw | braftDashEditorLib.braftDashEditorLibStrings.html = null,
    contentId: java.lang.String | scala.Double = null,
    controls: js.Array[java.lang.String] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editorState: js.Any = null,
    emojis: js.Array[java.lang.String] = null,
    excludeControls: js.Array[java.lang.String] = null,
    extendAtomics: js.Array[_] = null,
    extendControls: js.Array[_] = null,
    focus: js.Function0[_] = null,
    fontFamilies: js.Array[fontFamiliesRange] = null,
    fontSizes: js.Array[scala.Double] = null,
    forceNewLine: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.Function0[scala.Unit] = null,
    getContent: js.Function1[
      /* format */ js.UndefOr[java.lang.String], 
      draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState
    ] = null,
    getDraftInstance: js.Function0[_] = null,
    getEditorState: js.Function0[scala.Unit] = null,
    getMediaLibraryInstance: js.Function0[_] = null,
    getSelectionBlockType: js.Function0[java.lang.String] = null,
    getSelectionInlineStyle: js.Function0[_] = null,
    height: scala.Int | scala.Double = null,
    imageControls: js.Any = null,
    indents: js.Array[scala.Double] = null,
    initialContent: java.lang.String = null,
    insertHTML: js.Function1[/* htmlString */ java.lang.String, _] = null,
    insertMedias: js.Function1[/* medias */ js.Array[braftDashEditorLib.Anon_Name], _] = null,
    insertText: js.Function2[/* text */ java.lang.String, /* replace */ js.UndefOr[scala.Boolean], _] = null,
    isEmpty: js.Function0[scala.Boolean] = null,
    language: java.lang.String = null,
    letterSpacings: js.Array[scala.Double] = null,
    lineHeights: js.Array[scala.Double] = null,
    media: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onBlur: js.Function0[scala.Unit] = null,
    onChange: js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ] = null,
    onFocus: js.Function0[scala.Unit] = null,
    onHTMLChange: js.Function1[/* content */ java.lang.String, scala.Unit] = null,
    onRawChange: js.Function1[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      scala.Unit
    ] = null,
    onSave: js.Function0[scala.Unit] = null,
    onTab: js.Function1[/* event */ reactLib.Event, scala.Unit] = null,
    pasteMode: braftDashEditorLib.braftDashEditorLibStrings.text | braftDashEditorLib.braftDashEditorLibStrings.Empty = null,
    placeholder: java.lang.String = null,
    redo: js.Function0[_] = null,
    selectionCollapsed: js.Function0[scala.Boolean] = null,
    selectionHasInlineStyle: js.Function0[scala.Boolean] = null,
    setContent: js.Function2[
      /* content */ draftDashJsLib.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState, 
      /* format */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    tabIndents: scala.Int | scala.Double = null,
    textAlignOptions: js.Array[java.lang.String] = null,
    toggleSelectionAlignment: js.Function1[/* alignment */ java.lang.String, _] = null,
    toggleSelectionBackgroundColor: js.Function1[/* hexColor */ java.lang.String, scala.Unit] = null,
    toggleSelectionBlockType: js.Function1[/* blockquote */ java.lang.String, _] = null,
    toggleSelectionColor: js.Function1[/* hexColor */ java.lang.String, scala.Unit] = null,
    toggleSelectionFontFamily: js.Function1[/* fontFamily */ java.lang.String, scala.Unit] = null,
    toggleSelectionFontSize: js.Function1[/* fontSize */ scala.Double, scala.Unit] = null,
    toggleSelectionInlineStyle: js.Function2[
      /* style */ java.lang.String, 
      /* stylesToBeRemoved */ js.UndefOr[js.Array[java.lang.String]], 
      _
    ] = null,
    toggleSelectionLink: js.Function2[/* href */ java.lang.String, /* target */ java.lang.String, scala.Unit] = null,
    undo: js.Function0[_] = null,
    viewWrapper: java.lang.String = null
  ): editorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSetTextBackgroundColor)) __obj.updateDynamic("allowSetTextBackgroundColor")(allowSetTextBackgroundColor)
    if (blur != null) __obj.updateDynamic("blur")(blur)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (contentFormat != null) __obj.updateDynamic("contentFormat")(contentFormat.asInstanceOf[js.Any])
    if (contentId != null) __obj.updateDynamic("contentId")(contentId.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (editorState != null) __obj.updateDynamic("editorState")(editorState)
    if (emojis != null) __obj.updateDynamic("emojis")(emojis)
    if (excludeControls != null) __obj.updateDynamic("excludeControls")(excludeControls)
    if (extendAtomics != null) __obj.updateDynamic("extendAtomics")(extendAtomics)
    if (extendControls != null) __obj.updateDynamic("extendControls")(extendControls)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (fontFamilies != null) __obj.updateDynamic("fontFamilies")(fontFamilies)
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (!js.isUndefined(forceNewLine)) __obj.updateDynamic("forceNewLine")(forceNewLine)
    if (forceRender != null) __obj.updateDynamic("forceRender")(forceRender)
    if (getContent != null) __obj.updateDynamic("getContent")(getContent)
    if (getDraftInstance != null) __obj.updateDynamic("getDraftInstance")(getDraftInstance)
    if (getEditorState != null) __obj.updateDynamic("getEditorState")(getEditorState)
    if (getMediaLibraryInstance != null) __obj.updateDynamic("getMediaLibraryInstance")(getMediaLibraryInstance)
    if (getSelectionBlockType != null) __obj.updateDynamic("getSelectionBlockType")(getSelectionBlockType)
    if (getSelectionInlineStyle != null) __obj.updateDynamic("getSelectionInlineStyle")(getSelectionInlineStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageControls != null) __obj.updateDynamic("imageControls")(imageControls)
    if (indents != null) __obj.updateDynamic("indents")(indents)
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent)
    if (insertHTML != null) __obj.updateDynamic("insertHTML")(insertHTML)
    if (insertMedias != null) __obj.updateDynamic("insertMedias")(insertMedias)
    if (insertText != null) __obj.updateDynamic("insertText")(insertText)
    if (isEmpty != null) __obj.updateDynamic("isEmpty")(isEmpty)
    if (language != null) __obj.updateDynamic("language")(language)
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings)
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights)
    if (media != null) __obj.updateDynamic("media")(media)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onHTMLChange != null) __obj.updateDynamic("onHTMLChange")(onHTMLChange)
    if (onRawChange != null) __obj.updateDynamic("onRawChange")(onRawChange)
    if (onSave != null) __obj.updateDynamic("onSave")(onSave)
    if (onTab != null) __obj.updateDynamic("onTab")(onTab)
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (redo != null) __obj.updateDynamic("redo")(redo)
    if (selectionCollapsed != null) __obj.updateDynamic("selectionCollapsed")(selectionCollapsed)
    if (selectionHasInlineStyle != null) __obj.updateDynamic("selectionHasInlineStyle")(selectionHasInlineStyle)
    if (setContent != null) __obj.updateDynamic("setContent")(setContent)
    if (tabIndents != null) __obj.updateDynamic("tabIndents")(tabIndents.asInstanceOf[js.Any])
    if (textAlignOptions != null) __obj.updateDynamic("textAlignOptions")(textAlignOptions)
    if (toggleSelectionAlignment != null) __obj.updateDynamic("toggleSelectionAlignment")(toggleSelectionAlignment)
    if (toggleSelectionBackgroundColor != null) __obj.updateDynamic("toggleSelectionBackgroundColor")(toggleSelectionBackgroundColor)
    if (toggleSelectionBlockType != null) __obj.updateDynamic("toggleSelectionBlockType")(toggleSelectionBlockType)
    if (toggleSelectionColor != null) __obj.updateDynamic("toggleSelectionColor")(toggleSelectionColor)
    if (toggleSelectionFontFamily != null) __obj.updateDynamic("toggleSelectionFontFamily")(toggleSelectionFontFamily)
    if (toggleSelectionFontSize != null) __obj.updateDynamic("toggleSelectionFontSize")(toggleSelectionFontSize)
    if (toggleSelectionInlineStyle != null) __obj.updateDynamic("toggleSelectionInlineStyle")(toggleSelectionInlineStyle)
    if (toggleSelectionLink != null) __obj.updateDynamic("toggleSelectionLink")(toggleSelectionLink)
    if (undo != null) __obj.updateDynamic("undo")(undo)
    if (viewWrapper != null) __obj.updateDynamic("viewWrapper")(viewWrapper)
    __obj.asInstanceOf[editorProps]
  }
}

