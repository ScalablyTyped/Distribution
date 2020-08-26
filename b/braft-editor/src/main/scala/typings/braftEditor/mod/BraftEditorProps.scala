package typings.braftEditor.mod

import typings.braftEditor.anon.Family
import typings.braftEditor.braftEditorStrings.`vi-vn`
import typings.braftEditor.braftEditorStrings.`zh-hant`
import typings.braftEditor.braftEditorStrings.center
import typings.braftEditor.braftEditorStrings.en
import typings.braftEditor.braftEditorStrings.fr
import typings.braftEditor.braftEditorStrings.jpn
import typings.braftEditor.braftEditorStrings.justify
import typings.braftEditor.braftEditorStrings.kr
import typings.braftEditor.braftEditorStrings.left
import typings.braftEditor.braftEditorStrings.pl
import typings.braftEditor.braftEditorStrings.right
import typings.braftEditor.braftEditorStrings.ru
import typings.braftEditor.braftEditorStrings.tr
import typings.braftEditor.braftEditorStrings.zh
import typings.immutable.Immutable.Map
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BraftEditorProps extends js.Object {
  var allowInsertLinkText: js.UndefOr[Boolean] = js.native
  var blockRenderMap: js.UndefOr[(Map[_, _]) | js.Function] = js.native
  var blockRendererFn: js.UndefOr[js.Function] = js.native
  var className: js.UndefOr[String] = js.native
  var colors: js.UndefOr[js.Array[String]] = js.native
  var componentBelowControlBar: js.UndefOr[ReactNode] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var controlBarClassName: js.UndefOr[String] = js.native
  var controlBarStyle: js.UndefOr[CSSProperties] = js.native
  var controls: js.UndefOr[js.Array[ControlType]] = js.native
  var converts: js.UndefOr[js.Object] = js.native
  var defaultLinkTarget: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[EditorState] = js.native
  var draftProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
  ] = js.native
  var editorId: js.UndefOr[String] = js.native
  var emojis: js.UndefOr[js.Array[String]] = js.native
  var excludeControls: js.UndefOr[js.Array[BuiltInControlType]] = js.native
  var extendControls: js.UndefOr[js.Array[ExtendControlType]] = js.native
  var fixPlaceholder: js.UndefOr[Boolean] = js.native
  var fontFamilies: js.UndefOr[js.Array[Family]] = js.native
  var fontSizes: js.UndefOr[js.Array[Double]] = js.native
  var handleBeforeInput: js.UndefOr[js.Function] = js.native
  var handleDroppedFiles: js.UndefOr[js.Function] = js.native
  var handleKeyCommand: js.UndefOr[js.Function] = js.native
  var handlePastedFiles: js.UndefOr[js.Function] = js.native
  var handlePastedText: js.UndefOr[js.Function] = js.native
  var handleReturn: js.UndefOr[js.Function] = js.native
  var headings: js.UndefOr[js.Array[String]] = js.native
  var hooks: js.UndefOr[HooksType] = js.native
  var id: js.UndefOr[String] = js.native
  var imageControls: js.UndefOr[js.Array[ImageControlType]] = js.native
  var imageEqualRatio: js.UndefOr[Boolean] = js.native
  var imageResizable: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[
    zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
  ] = js.native
  var letterSpacings: js.UndefOr[js.Array[Double]] = js.native
  var lineHeights: js.UndefOr[js.Array[Double]] = js.native
  var media: js.UndefOr[MediaType] = js.native
  var onBlur: js.UndefOr[js.Function] = js.native
  var onChange: js.UndefOr[js.Function1[/* editorState */ EditorState, Unit]] = js.native
  var onDelete: js.UndefOr[js.Function] = js.native
  var onFocus: js.UndefOr[js.Function] = js.native
  var onFullscreen: js.UndefOr[js.Function] = js.native
  var onSave: js.UndefOr[js.Function] = js.native
  var onTab: js.UndefOr[js.Function] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var stripPastedStyles: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var textAligns: js.UndefOr[js.Array[left | center | right | justify]] = js.native
  var textBackgroundColor: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[EditorState] = js.native
}

object BraftEditorProps {
  @scala.inline
  def apply(): BraftEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BraftEditorProps]
  }
  @scala.inline
  implicit class BraftEditorPropsOps[Self <: BraftEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowInsertLinkText(value: Boolean): Self = this.set("allowInsertLinkText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInsertLinkText: Self = this.set("allowInsertLinkText", js.undefined)
    @scala.inline
    def setBlockRenderMap(value: (Map[_, _]) | js.Function): Self = this.set("blockRenderMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockRenderMap: Self = this.set("blockRenderMap", js.undefined)
    @scala.inline
    def setBlockRendererFn(value: js.Function): Self = this.set("blockRendererFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockRendererFn: Self = this.set("blockRendererFn", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setColorsVarargs(value: String*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setComponentBelowControlBar(value: ReactNode): Self = this.set("componentBelowControlBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentBelowControlBar: Self = this.set("componentBelowControlBar", js.undefined)
    @scala.inline
    def setContentClassName(value: String): Self = this.set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClassName: Self = this.set("contentClassName", js.undefined)
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    @scala.inline
    def setControlBarClassName(value: String): Self = this.set("controlBarClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlBarClassName: Self = this.set("controlBarClassName", js.undefined)
    @scala.inline
    def setControlBarStyle(value: CSSProperties): Self = this.set("controlBarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlBarStyle: Self = this.set("controlBarStyle", js.undefined)
    @scala.inline
    def setControlsVarargs(value: ControlType*): Self = this.set("controls", js.Array(value :_*))
    @scala.inline
    def setControls(value: js.Array[ControlType]): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setConverts(value: js.Object): Self = this.set("converts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConverts: Self = this.set("converts", js.undefined)
    @scala.inline
    def setDefaultLinkTarget(value: String): Self = this.set("defaultLinkTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultLinkTarget: Self = this.set("defaultLinkTarget", js.undefined)
    @scala.inline
    def setDefaultValue(value: EditorState): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDraftProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ js.Any
    ): Self = this.set("draftProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraftProps: Self = this.set("draftProps", js.undefined)
    @scala.inline
    def setEditorId(value: String): Self = this.set("editorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditorId: Self = this.set("editorId", js.undefined)
    @scala.inline
    def setEmojisVarargs(value: String*): Self = this.set("emojis", js.Array(value :_*))
    @scala.inline
    def setEmojis(value: js.Array[String]): Self = this.set("emojis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmojis: Self = this.set("emojis", js.undefined)
    @scala.inline
    def setExcludeControlsVarargs(value: BuiltInControlType*): Self = this.set("excludeControls", js.Array(value :_*))
    @scala.inline
    def setExcludeControls(value: js.Array[BuiltInControlType]): Self = this.set("excludeControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeControls: Self = this.set("excludeControls", js.undefined)
    @scala.inline
    def setExtendControlsVarargs(value: ExtendControlType*): Self = this.set("extendControls", js.Array(value :_*))
    @scala.inline
    def setExtendControls(value: js.Array[ExtendControlType]): Self = this.set("extendControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendControls: Self = this.set("extendControls", js.undefined)
    @scala.inline
    def setFixPlaceholder(value: Boolean): Self = this.set("fixPlaceholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixPlaceholder: Self = this.set("fixPlaceholder", js.undefined)
    @scala.inline
    def setFontFamiliesVarargs(value: Family*): Self = this.set("fontFamilies", js.Array(value :_*))
    @scala.inline
    def setFontFamilies(value: js.Array[Family]): Self = this.set("fontFamilies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamilies: Self = this.set("fontFamilies", js.undefined)
    @scala.inline
    def setFontSizesVarargs(value: Double*): Self = this.set("fontSizes", js.Array(value :_*))
    @scala.inline
    def setFontSizes(value: js.Array[Double]): Self = this.set("fontSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizes: Self = this.set("fontSizes", js.undefined)
    @scala.inline
    def setHandleBeforeInput(value: js.Function): Self = this.set("handleBeforeInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleBeforeInput: Self = this.set("handleBeforeInput", js.undefined)
    @scala.inline
    def setHandleDroppedFiles(value: js.Function): Self = this.set("handleDroppedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleDroppedFiles: Self = this.set("handleDroppedFiles", js.undefined)
    @scala.inline
    def setHandleKeyCommand(value: js.Function): Self = this.set("handleKeyCommand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleKeyCommand: Self = this.set("handleKeyCommand", js.undefined)
    @scala.inline
    def setHandlePastedFiles(value: js.Function): Self = this.set("handlePastedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlePastedFiles: Self = this.set("handlePastedFiles", js.undefined)
    @scala.inline
    def setHandlePastedText(value: js.Function): Self = this.set("handlePastedText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlePastedText: Self = this.set("handlePastedText", js.undefined)
    @scala.inline
    def setHandleReturn(value: js.Function): Self = this.set("handleReturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandleReturn: Self = this.set("handleReturn", js.undefined)
    @scala.inline
    def setHeadingsVarargs(value: String*): Self = this.set("headings", js.Array(value :_*))
    @scala.inline
    def setHeadings(value: js.Array[String]): Self = this.set("headings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadings: Self = this.set("headings", js.undefined)
    @scala.inline
    def setHooks(value: HooksType): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageControlsVarargs(value: ImageControlType*): Self = this.set("imageControls", js.Array(value :_*))
    @scala.inline
    def setImageControls(value: js.Array[ImageControlType]): Self = this.set("imageControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageControls: Self = this.set("imageControls", js.undefined)
    @scala.inline
    def setImageEqualRatio(value: Boolean): Self = this.set("imageEqualRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageEqualRatio: Self = this.set("imageEqualRatio", js.undefined)
    @scala.inline
    def setImageResizable(value: Boolean): Self = this.set("imageResizable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageResizable: Self = this.set("imageResizable", js.undefined)
    @scala.inline
    def setLanguageFunction2(value: (/* languages */ js.Any, /* context */ js.Any) => _): Self = this.set("language", js.Any.fromFunction2(value))
    @scala.inline
    def setLanguage(
      value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ js.Any, /* context */ js.Any, _])
    ): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLetterSpacingsVarargs(value: Double*): Self = this.set("letterSpacings", js.Array(value :_*))
    @scala.inline
    def setLetterSpacings(value: js.Array[Double]): Self = this.set("letterSpacings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacings: Self = this.set("letterSpacings", js.undefined)
    @scala.inline
    def setLineHeightsVarargs(value: Double*): Self = this.set("lineHeights", js.Array(value :_*))
    @scala.inline
    def setLineHeights(value: js.Array[Double]): Self = this.set("lineHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeights: Self = this.set("lineHeights", js.undefined)
    @scala.inline
    def setMedia(value: MediaType): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setOnBlur(value: js.Function): Self = this.set("onBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnChange(value: /* editorState */ EditorState => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDelete(value: js.Function): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    @scala.inline
    def setOnFocus(value: js.Function): Self = this.set("onFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnFullscreen(value: js.Function): Self = this.set("onFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFullscreen: Self = this.set("onFullscreen", js.undefined)
    @scala.inline
    def setOnSave(value: js.Function): Self = this.set("onSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSave: Self = this.set("onSave", js.undefined)
    @scala.inline
    def setOnTab(value: js.Function): Self = this.set("onTab", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTab: Self = this.set("onTab", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStripPastedStyles(value: Boolean): Self = this.set("stripPastedStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripPastedStyles: Self = this.set("stripPastedStyles", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTextAlignsVarargs(value: (left | center | right | justify)*): Self = this.set("textAligns", js.Array(value :_*))
    @scala.inline
    def setTextAligns(value: js.Array[left | center | right | justify]): Self = this.set("textAligns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAligns: Self = this.set("textAligns", js.undefined)
    @scala.inline
    def setTextBackgroundColor(value: Boolean): Self = this.set("textBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBackgroundColor: Self = this.set("textBackgroundColor", js.undefined)
    @scala.inline
    def setValue(value: EditorState): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

