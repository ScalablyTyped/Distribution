package typings.braftDashEditor.braftDashEditorMod

import typings.braftDashEditor.Anon_Family
import typings.braftDashEditor.braftDashEditorStrings.`zh-hant`
import typings.braftDashEditor.braftDashEditorStrings.center
import typings.braftDashEditor.braftDashEditorStrings.en
import typings.braftDashEditor.braftDashEditorStrings.fr
import typings.braftDashEditor.braftDashEditorStrings.jpn
import typings.braftDashEditor.braftDashEditorStrings.justify
import typings.braftDashEditor.braftDashEditorStrings.kr
import typings.braftDashEditor.braftDashEditorStrings.left
import typings.braftDashEditor.braftDashEditorStrings.pl
import typings.braftDashEditor.braftDashEditorStrings.right
import typings.braftDashEditor.braftDashEditorStrings.ru
import typings.braftDashEditor.braftDashEditorStrings.tr
import typings.braftDashEditor.braftDashEditorStrings.zh
import typings.immutable.immutableMod.Map
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BraftEditorProps extends js.Object {
  var allowInsertLinkText: js.UndefOr[Boolean] = js.undefined
  var blockRenderMap: js.UndefOr[(Map[_, _]) | js.Function] = js.undefined
  var blockRendererFn: js.UndefOr[js.Function] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colors: js.UndefOr[js.Array[String]] = js.undefined
  var componentBelowControlBar: js.UndefOr[ReactNode] = js.undefined
  var contentClassName: js.UndefOr[String] = js.undefined
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  var controlBarClassName: js.UndefOr[String] = js.undefined
  var controlBarStyle: js.UndefOr[CSSProperties] = js.undefined
  var controls: js.UndefOr[js.Array[ControlType]] = js.undefined
  var converts: js.UndefOr[js.Object] = js.undefined
  var defaultLinkTarget: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[EditorState] = js.undefined
  var draftProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
  ] = js.undefined
  var editorId: js.UndefOr[String] = js.undefined
  var emojis: js.UndefOr[js.Array[String]] = js.undefined
  var excludeControls: js.UndefOr[js.Array[BuiltInControlType]] = js.undefined
  var extendControls: js.UndefOr[js.Array[ExtendControlType]] = js.undefined
  var fixPlaceholder: js.UndefOr[Boolean] = js.undefined
  var fontFamilies: js.UndefOr[js.Array[Anon_Family]] = js.undefined
  var fontSizes: js.UndefOr[js.Array[Double]] = js.undefined
  var handleBeforeInput: js.UndefOr[js.Function] = js.undefined
  var handleDroppedFiles: js.UndefOr[js.Function] = js.undefined
  var handleKeyCommand: js.UndefOr[js.Function] = js.undefined
  var handlePastedFiles: js.UndefOr[js.Function] = js.undefined
  var handlePastedText: js.UndefOr[js.Function] = js.undefined
  var handleReturn: js.UndefOr[js.Function] = js.undefined
  var headings: js.UndefOr[js.Array[String]] = js.undefined
  var hooks: js.UndefOr[HooksType] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var imageControls: js.UndefOr[js.Array[ImageControlType]] = js.undefined
  var imageResizable: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[
    zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
  ] = js.undefined
  var letterSpacings: js.UndefOr[js.Array[Double]] = js.undefined
  var lineHeights: js.UndefOr[js.Array[Double]] = js.undefined
  var media: js.UndefOr[MediaType] = js.undefined
  var onBlur: js.UndefOr[js.Function] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.undefined
  var onDelete: js.UndefOr[js.Function] = js.undefined
  var onFocus: js.UndefOr[js.Function] = js.undefined
  var onFullscreen: js.UndefOr[js.Function] = js.undefined
  var onSave: js.UndefOr[js.Function] = js.undefined
  var onTab: js.UndefOr[js.Function] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var stripPastedStyles: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var textAligns: js.UndefOr[js.Array[left | center | right | justify]] = js.undefined
  var textBackgroundColor: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[EditorState] = js.undefined
}

object BraftEditorProps {
  @scala.inline
  def apply(
    allowInsertLinkText: js.UndefOr[Boolean] = js.undefined,
    blockRenderMap: (Map[_, _]) | js.Function = null,
    blockRendererFn: js.Function = null,
    className: String = null,
    colors: js.Array[String] = null,
    componentBelowControlBar: ReactNode = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    controlBarClassName: String = null,
    controlBarStyle: CSSProperties = null,
    controls: js.Array[ControlType] = null,
    converts: js.Object = null,
    defaultLinkTarget: String = null,
    defaultValue: EditorState = null,
    draftProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any = null,
    editorId: String = null,
    emojis: js.Array[String] = null,
    excludeControls: js.Array[BuiltInControlType] = null,
    extendControls: js.Array[ExtendControlType] = null,
    fixPlaceholder: js.UndefOr[Boolean] = js.undefined,
    fontFamilies: js.Array[Anon_Family] = null,
    fontSizes: js.Array[Double] = null,
    handleBeforeInput: js.Function = null,
    handleDroppedFiles: js.Function = null,
    handleKeyCommand: js.Function = null,
    handlePastedFiles: js.Function = null,
    handlePastedText: js.Function = null,
    handleReturn: js.Function = null,
    headings: js.Array[String] = null,
    hooks: HooksType = null,
    id: String = null,
    imageControls: js.Array[ImageControlType] = null,
    imageResizable: js.UndefOr[Boolean] = js.undefined,
    language: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _]) = null,
    letterSpacings: js.Array[Double] = null,
    lineHeights: js.Array[Double] = null,
    media: MediaType = null,
    onBlur: js.Function = null,
    onChange: /* editorState */ EditorState => Unit = null,
    onDelete: js.Function = null,
    onFocus: js.Function = null,
    onFullscreen: js.Function = null,
    onSave: js.Function = null,
    onTab: js.Function = null,
    placeholder: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    stripPastedStyles: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    textAligns: js.Array[left | center | right | justify] = null,
    textBackgroundColor: js.UndefOr[Boolean] = js.undefined,
    value: EditorState = null
  ): BraftEditorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowInsertLinkText)) __obj.updateDynamic("allowInsertLinkText")(allowInsertLinkText)
    if (blockRenderMap != null) __obj.updateDynamic("blockRenderMap")(blockRenderMap.asInstanceOf[js.Any])
    if (blockRendererFn != null) __obj.updateDynamic("blockRendererFn")(blockRendererFn)
    if (className != null) __obj.updateDynamic("className")(className)
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (componentBelowControlBar != null) __obj.updateDynamic("componentBelowControlBar")(componentBelowControlBar.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName)
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (controlBarClassName != null) __obj.updateDynamic("controlBarClassName")(controlBarClassName)
    if (controlBarStyle != null) __obj.updateDynamic("controlBarStyle")(controlBarStyle)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (converts != null) __obj.updateDynamic("converts")(converts)
    if (defaultLinkTarget != null) __obj.updateDynamic("defaultLinkTarget")(defaultLinkTarget)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (draftProps != null) __obj.updateDynamic("draftProps")(draftProps)
    if (editorId != null) __obj.updateDynamic("editorId")(editorId)
    if (emojis != null) __obj.updateDynamic("emojis")(emojis)
    if (excludeControls != null) __obj.updateDynamic("excludeControls")(excludeControls)
    if (extendControls != null) __obj.updateDynamic("extendControls")(extendControls)
    if (!js.isUndefined(fixPlaceholder)) __obj.updateDynamic("fixPlaceholder")(fixPlaceholder)
    if (fontFamilies != null) __obj.updateDynamic("fontFamilies")(fontFamilies)
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes)
    if (handleBeforeInput != null) __obj.updateDynamic("handleBeforeInput")(handleBeforeInput)
    if (handleDroppedFiles != null) __obj.updateDynamic("handleDroppedFiles")(handleDroppedFiles)
    if (handleKeyCommand != null) __obj.updateDynamic("handleKeyCommand")(handleKeyCommand)
    if (handlePastedFiles != null) __obj.updateDynamic("handlePastedFiles")(handlePastedFiles)
    if (handlePastedText != null) __obj.updateDynamic("handlePastedText")(handlePastedText)
    if (handleReturn != null) __obj.updateDynamic("handleReturn")(handleReturn)
    if (headings != null) __obj.updateDynamic("headings")(headings)
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageControls != null) __obj.updateDynamic("imageControls")(imageControls)
    if (!js.isUndefined(imageResizable)) __obj.updateDynamic("imageResizable")(imageResizable)
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings)
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights)
    if (media != null) __obj.updateDynamic("media")(media)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onFullscreen != null) __obj.updateDynamic("onFullscreen")(onFullscreen)
    if (onSave != null) __obj.updateDynamic("onSave")(onSave)
    if (onTab != null) __obj.updateDynamic("onTab")(onTab)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(stripPastedStyles)) __obj.updateDynamic("stripPastedStyles")(stripPastedStyles)
    if (style != null) __obj.updateDynamic("style")(style)
    if (textAligns != null) __obj.updateDynamic("textAligns")(textAligns)
    if (!js.isUndefined(textBackgroundColor)) __obj.updateDynamic("textBackgroundColor")(textBackgroundColor)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BraftEditorProps]
  }
}

