package typings.braftDashEditor.braftDashEditorMod

import org.scalablytyped.runtime.StringDictionary
import typings.braftDashEditor.Anon_Name
import typings.braftDashEditor.braftDashEditorStrings.Empty
import typings.braftDashEditor.braftDashEditorStrings.html
import typings.braftDashEditor.braftDashEditorStrings.raw
import typings.braftDashEditor.braftDashEditorStrings.text
import typings.draftDashJs.draftDashJsMod.DraftNs.ModelNs.EncodingNs.RawDraftContentState
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editorProps extends js.Object {
  var allowSetTextBackgroundColor: js.UndefOr[Boolean] = js.undefined
  var blur: js.UndefOr[js.Function0[_]] = js.undefined
  var clear: js.UndefOr[js.Function0[_]] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var contentFormat: js.UndefOr[raw | html] = js.undefined
  var contentId: js.UndefOr[String | Double] = js.undefined
  var controls: js.UndefOr[js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var editorState: js.UndefOr[js.Any] = js.undefined
  var emojis: js.UndefOr[js.Array[String]] = js.undefined
  var excludeControls: js.UndefOr[js.Array[String]] = js.undefined
  var extendAtomics: js.UndefOr[js.Array[_]] = js.undefined
  var extendControls: js.UndefOr[js.Array[_]] = js.undefined
  var focus: js.UndefOr[js.Function0[_]] = js.undefined
  var fontFamilies: js.UndefOr[js.Array[fontFamiliesRange]] = js.undefined
  var fontSizes: js.UndefOr[js.Array[Double]] = js.undefined
  var forceNewLine: js.UndefOr[Boolean] = js.undefined
  var forceRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getContent: js.UndefOr[js.Function1[/* format */ js.UndefOr[String], RawDraftContentState]] = js.undefined
  var getDraftInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getEditorState: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getMediaLibraryInstance: js.UndefOr[js.Function0[_]] = js.undefined
  var getSelectionBlockType: js.UndefOr[js.Function0[String]] = js.undefined
  var getSelectionInlineStyle: js.UndefOr[js.Function0[_]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var imageControls: js.UndefOr[js.Any] = js.undefined
  var indents: js.UndefOr[js.Array[Double]] = js.undefined
  var initialContent: js.UndefOr[String | Null] = js.undefined
  var insertHTML: js.UndefOr[js.Function1[/* htmlString */ String, _]] = js.undefined
  var insertMedias: js.UndefOr[js.Function1[/* medias */ js.Array[Anon_Name], _]] = js.undefined
  var insertText: js.UndefOr[js.Function2[/* text */ String, /* replace */ js.UndefOr[Boolean], _]] = js.undefined
  var isEmpty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var letterSpacings: js.UndefOr[js.Array[Double]] = js.undefined
  var lineHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var media: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* content */ RawDraftContentState, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHTMLChange: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.undefined
  var onRawChange: js.UndefOr[js.Function1[/* content */ RawDraftContentState, Unit]] = js.undefined
  var onSave: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onTab: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
  var pasteMode: js.UndefOr[text | Empty] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var redo: js.UndefOr[js.Function0[_]] = js.undefined
  var selectionCollapsed: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var selectionHasInlineStyle: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var setContent: js.UndefOr[
    js.Function2[/* content */ RawDraftContentState, /* format */ js.UndefOr[String], Unit]
  ] = js.undefined
  var tabIndents: js.UndefOr[Double] = js.undefined
  var textAlignOptions: js.UndefOr[js.Array[String]] = js.undefined
  var toggleSelectionAlignment: js.UndefOr[js.Function1[/* alignment */ String, _]] = js.undefined
  var toggleSelectionBackgroundColor: js.UndefOr[js.Function1[/* hexColor */ String, Unit]] = js.undefined
  var toggleSelectionBlockType: js.UndefOr[js.Function1[/* blockquote */ String, _]] = js.undefined
  var toggleSelectionColor: js.UndefOr[js.Function1[/* hexColor */ String, Unit]] = js.undefined
  var toggleSelectionFontFamily: js.UndefOr[js.Function1[/* fontFamily */ String, Unit]] = js.undefined
  var toggleSelectionFontSize: js.UndefOr[js.Function1[/* fontSize */ Double, Unit]] = js.undefined
  var toggleSelectionInlineStyle: js.UndefOr[
    js.Function2[/* style */ String, /* stylesToBeRemoved */ js.UndefOr[js.Array[String]], _]
  ] = js.undefined
  var toggleSelectionLink: js.UndefOr[js.Function2[/* href */ String, /* target */ String, Unit]] = js.undefined
  var undo: js.UndefOr[js.Function0[_]] = js.undefined
  var viewWrapper: js.UndefOr[String] = js.undefined
}

object editorProps {
  @scala.inline
  def apply(
    allowSetTextBackgroundColor: js.UndefOr[Boolean] = js.undefined,
    blur: () => _ = null,
    clear: () => _ = null,
    colors: js.Array[String] = null,
    contentFormat: raw | html = null,
    contentId: String | Double = null,
    controls: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editorState: js.Any = null,
    emojis: js.Array[String] = null,
    excludeControls: js.Array[String] = null,
    extendAtomics: js.Array[_] = null,
    extendControls: js.Array[_] = null,
    focus: () => _ = null,
    fontFamilies: js.Array[fontFamiliesRange] = null,
    fontSizes: js.Array[Double] = null,
    forceNewLine: js.UndefOr[Boolean] = js.undefined,
    forceRender: () => Unit = null,
    getContent: /* format */ js.UndefOr[String] => RawDraftContentState = null,
    getDraftInstance: () => _ = null,
    getEditorState: () => Unit = null,
    getMediaLibraryInstance: () => _ = null,
    getSelectionBlockType: () => String = null,
    getSelectionInlineStyle: () => _ = null,
    height: Int | Double = null,
    imageControls: js.Any = null,
    indents: js.Array[Double] = null,
    initialContent: String = null,
    insertHTML: /* htmlString */ String => _ = null,
    insertMedias: /* medias */ js.Array[Anon_Name] => _ = null,
    insertText: (/* text */ String, /* replace */ js.UndefOr[Boolean]) => _ = null,
    isEmpty: () => Boolean = null,
    language: String = null,
    letterSpacings: js.Array[Double] = null,
    lineHeights: js.Array[Double] = null,
    media: StringDictionary[js.Any] = null,
    onBlur: () => Unit = null,
    onChange: /* content */ RawDraftContentState => Unit = null,
    onFocus: () => Unit = null,
    onHTMLChange: /* content */ String => Unit = null,
    onRawChange: /* content */ RawDraftContentState => Unit = null,
    onSave: () => Unit = null,
    onTab: /* event */ Event => Unit = null,
    pasteMode: text | Empty = null,
    placeholder: String = null,
    redo: () => _ = null,
    selectionCollapsed: () => Boolean = null,
    selectionHasInlineStyle: () => Boolean = null,
    setContent: (/* content */ RawDraftContentState, /* format */ js.UndefOr[String]) => Unit = null,
    tabIndents: Int | Double = null,
    textAlignOptions: js.Array[String] = null,
    toggleSelectionAlignment: /* alignment */ String => _ = null,
    toggleSelectionBackgroundColor: /* hexColor */ String => Unit = null,
    toggleSelectionBlockType: /* blockquote */ String => _ = null,
    toggleSelectionColor: /* hexColor */ String => Unit = null,
    toggleSelectionFontFamily: /* fontFamily */ String => Unit = null,
    toggleSelectionFontSize: /* fontSize */ Double => Unit = null,
    toggleSelectionInlineStyle: (/* style */ String, /* stylesToBeRemoved */ js.UndefOr[js.Array[String]]) => _ = null,
    toggleSelectionLink: (/* href */ String, /* target */ String) => Unit = null,
    undo: () => _ = null,
    viewWrapper: String = null
  ): editorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSetTextBackgroundColor)) __obj.updateDynamic("allowSetTextBackgroundColor")(allowSetTextBackgroundColor)
    if (blur != null) __obj.updateDynamic("blur")(js.Any.fromFunction0(blur))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
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
    if (focus != null) __obj.updateDynamic("focus")(js.Any.fromFunction0(focus))
    if (fontFamilies != null) __obj.updateDynamic("fontFamilies")(fontFamilies)
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (!js.isUndefined(forceNewLine)) __obj.updateDynamic("forceNewLine")(forceNewLine)
    if (forceRender != null) __obj.updateDynamic("forceRender")(js.Any.fromFunction0(forceRender))
    if (getContent != null) __obj.updateDynamic("getContent")(js.Any.fromFunction1(getContent))
    if (getDraftInstance != null) __obj.updateDynamic("getDraftInstance")(js.Any.fromFunction0(getDraftInstance))
    if (getEditorState != null) __obj.updateDynamic("getEditorState")(js.Any.fromFunction0(getEditorState))
    if (getMediaLibraryInstance != null) __obj.updateDynamic("getMediaLibraryInstance")(js.Any.fromFunction0(getMediaLibraryInstance))
    if (getSelectionBlockType != null) __obj.updateDynamic("getSelectionBlockType")(js.Any.fromFunction0(getSelectionBlockType))
    if (getSelectionInlineStyle != null) __obj.updateDynamic("getSelectionInlineStyle")(js.Any.fromFunction0(getSelectionInlineStyle))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageControls != null) __obj.updateDynamic("imageControls")(imageControls)
    if (indents != null) __obj.updateDynamic("indents")(indents)
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent)
    if (insertHTML != null) __obj.updateDynamic("insertHTML")(js.Any.fromFunction1(insertHTML))
    if (insertMedias != null) __obj.updateDynamic("insertMedias")(js.Any.fromFunction1(insertMedias))
    if (insertText != null) __obj.updateDynamic("insertText")(js.Any.fromFunction2(insertText))
    if (isEmpty != null) __obj.updateDynamic("isEmpty")(js.Any.fromFunction0(isEmpty))
    if (language != null) __obj.updateDynamic("language")(language)
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings)
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights)
    if (media != null) __obj.updateDynamic("media")(media)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onHTMLChange != null) __obj.updateDynamic("onHTMLChange")(js.Any.fromFunction1(onHTMLChange))
    if (onRawChange != null) __obj.updateDynamic("onRawChange")(js.Any.fromFunction1(onRawChange))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction0(onSave))
    if (onTab != null) __obj.updateDynamic("onTab")(js.Any.fromFunction1(onTab))
    if (pasteMode != null) __obj.updateDynamic("pasteMode")(pasteMode.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (redo != null) __obj.updateDynamic("redo")(js.Any.fromFunction0(redo))
    if (selectionCollapsed != null) __obj.updateDynamic("selectionCollapsed")(js.Any.fromFunction0(selectionCollapsed))
    if (selectionHasInlineStyle != null) __obj.updateDynamic("selectionHasInlineStyle")(js.Any.fromFunction0(selectionHasInlineStyle))
    if (setContent != null) __obj.updateDynamic("setContent")(js.Any.fromFunction2(setContent))
    if (tabIndents != null) __obj.updateDynamic("tabIndents")(tabIndents.asInstanceOf[js.Any])
    if (textAlignOptions != null) __obj.updateDynamic("textAlignOptions")(textAlignOptions)
    if (toggleSelectionAlignment != null) __obj.updateDynamic("toggleSelectionAlignment")(js.Any.fromFunction1(toggleSelectionAlignment))
    if (toggleSelectionBackgroundColor != null) __obj.updateDynamic("toggleSelectionBackgroundColor")(js.Any.fromFunction1(toggleSelectionBackgroundColor))
    if (toggleSelectionBlockType != null) __obj.updateDynamic("toggleSelectionBlockType")(js.Any.fromFunction1(toggleSelectionBlockType))
    if (toggleSelectionColor != null) __obj.updateDynamic("toggleSelectionColor")(js.Any.fromFunction1(toggleSelectionColor))
    if (toggleSelectionFontFamily != null) __obj.updateDynamic("toggleSelectionFontFamily")(js.Any.fromFunction1(toggleSelectionFontFamily))
    if (toggleSelectionFontSize != null) __obj.updateDynamic("toggleSelectionFontSize")(js.Any.fromFunction1(toggleSelectionFontSize))
    if (toggleSelectionInlineStyle != null) __obj.updateDynamic("toggleSelectionInlineStyle")(js.Any.fromFunction2(toggleSelectionInlineStyle))
    if (toggleSelectionLink != null) __obj.updateDynamic("toggleSelectionLink")(js.Any.fromFunction2(toggleSelectionLink))
    if (undo != null) __obj.updateDynamic("undo")(js.Any.fromFunction0(undo))
    if (viewWrapper != null) __obj.updateDynamic("viewWrapper")(viewWrapper)
    __obj.asInstanceOf[editorProps]
  }
}

