package typings.braftEditor

import typings.braftEditor.anon.Audio
import typings.braftEditor.anon.Embed
import typings.braftEditor.anon.Error
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
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftContentState
import typings.immutable.mod.Map
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.File
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("braft-editor", JSImport.Default)
  @js.native
  open class default () extends BraftEditor
  /* static members */
  object default {
    
    @JSImport("braft-editor", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createEditorState(content: String): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any]).asInstanceOf[EditorState]
    inline def createEditorState(content: String, options: js.Object): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorState]
    inline def createEditorState(content: Any): EditorState = ^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any]).asInstanceOf[EditorState]
    inline def createEditorState(content: Any, options: js.Object): EditorState = (^.asInstanceOf[js.Dynamic].applyDynamic("createEditorState")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorState]
    
    inline def use(`extension`: js.Array[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def use(`extension`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  trait BraftEditor
    extends Component[BraftEditorProps, js.Object, Any] {
    
    def clearEditorContent(): Unit = js.native
    
    def forceRender(): Unit = js.native
    
    def getDraftInstance(): Any = js.native
    
    def getFinderInstance(): Any = js.native
    
    def getValue(): EditorState = js.native
    
    def redo(): Unit = js.native
    
    def setValue(editorState: EditorState): Unit = js.native
    
    def undo(): Unit = js.native
  }
  
  trait BraftEditorProps extends StObject {
    
    var allowInsertLinkText: js.UndefOr[Boolean] = js.undefined
    
    var blockRenderMap: js.UndefOr[(Map[Any, Any]) | js.Function] = js.undefined
    
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
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ Any
      ] = js.undefined
    
    var editorId: js.UndefOr[String] = js.undefined
    
    var emojis: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeControls: js.UndefOr[js.Array[BuiltInControlType]] = js.undefined
    
    var extendControls: js.UndefOr[js.Array[ExtendControlType]] = js.undefined
    
    var fixPlaceholder: js.UndefOr[Boolean] = js.undefined
    
    var fontFamilies: js.UndefOr[js.Array[Family]] = js.undefined
    
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
    
    var imageEqualRatio: js.UndefOr[Boolean] = js.undefined
    
    var imageResizable: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[
        zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ Any, /* context */ Any, Any])
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
    
    inline def apply(): BraftEditorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BraftEditorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BraftEditorProps] (val x: Self) extends AnyVal {
      
      inline def setAllowInsertLinkText(value: Boolean): Self = StObject.set(x, "allowInsertLinkText", value.asInstanceOf[js.Any])
      
      inline def setAllowInsertLinkTextUndefined: Self = StObject.set(x, "allowInsertLinkText", js.undefined)
      
      inline def setBlockRenderMap(value: (Map[Any, Any]) | js.Function): Self = StObject.set(x, "blockRenderMap", value.asInstanceOf[js.Any])
      
      inline def setBlockRenderMapUndefined: Self = StObject.set(x, "blockRenderMap", js.undefined)
      
      inline def setBlockRendererFn(value: js.Function): Self = StObject.set(x, "blockRendererFn", value.asInstanceOf[js.Any])
      
      inline def setBlockRendererFnUndefined: Self = StObject.set(x, "blockRendererFn", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setComponentBelowControlBar(value: ReactNode): Self = StObject.set(x, "componentBelowControlBar", value.asInstanceOf[js.Any])
      
      inline def setComponentBelowControlBarUndefined: Self = StObject.set(x, "componentBelowControlBar", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      inline def setControlBarClassName(value: String): Self = StObject.set(x, "controlBarClassName", value.asInstanceOf[js.Any])
      
      inline def setControlBarClassNameUndefined: Self = StObject.set(x, "controlBarClassName", js.undefined)
      
      inline def setControlBarStyle(value: CSSProperties): Self = StObject.set(x, "controlBarStyle", value.asInstanceOf[js.Any])
      
      inline def setControlBarStyleUndefined: Self = StObject.set(x, "controlBarStyle", js.undefined)
      
      inline def setControls(value: js.Array[ControlType]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setControlsVarargs(value: ControlType*): Self = StObject.set(x, "controls", js.Array(value*))
      
      inline def setConverts(value: js.Object): Self = StObject.set(x, "converts", value.asInstanceOf[js.Any])
      
      inline def setConvertsUndefined: Self = StObject.set(x, "converts", js.undefined)
      
      inline def setDefaultLinkTarget(value: String): Self = StObject.set(x, "defaultLinkTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultLinkTargetUndefined: Self = StObject.set(x, "defaultLinkTarget", js.undefined)
      
      inline def setDefaultValue(value: EditorState): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDraftProps(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DraftEditorProps */ Any
      ): Self = StObject.set(x, "draftProps", value.asInstanceOf[js.Any])
      
      inline def setDraftPropsUndefined: Self = StObject.set(x, "draftProps", js.undefined)
      
      inline def setEditorId(value: String): Self = StObject.set(x, "editorId", value.asInstanceOf[js.Any])
      
      inline def setEditorIdUndefined: Self = StObject.set(x, "editorId", js.undefined)
      
      inline def setEmojis(value: js.Array[String]): Self = StObject.set(x, "emojis", value.asInstanceOf[js.Any])
      
      inline def setEmojisUndefined: Self = StObject.set(x, "emojis", js.undefined)
      
      inline def setEmojisVarargs(value: String*): Self = StObject.set(x, "emojis", js.Array(value*))
      
      inline def setExcludeControls(value: js.Array[BuiltInControlType]): Self = StObject.set(x, "excludeControls", value.asInstanceOf[js.Any])
      
      inline def setExcludeControlsUndefined: Self = StObject.set(x, "excludeControls", js.undefined)
      
      inline def setExcludeControlsVarargs(value: BuiltInControlType*): Self = StObject.set(x, "excludeControls", js.Array(value*))
      
      inline def setExtendControls(value: js.Array[ExtendControlType]): Self = StObject.set(x, "extendControls", value.asInstanceOf[js.Any])
      
      inline def setExtendControlsUndefined: Self = StObject.set(x, "extendControls", js.undefined)
      
      inline def setExtendControlsVarargs(value: ExtendControlType*): Self = StObject.set(x, "extendControls", js.Array(value*))
      
      inline def setFixPlaceholder(value: Boolean): Self = StObject.set(x, "fixPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setFixPlaceholderUndefined: Self = StObject.set(x, "fixPlaceholder", js.undefined)
      
      inline def setFontFamilies(value: js.Array[Family]): Self = StObject.set(x, "fontFamilies", value.asInstanceOf[js.Any])
      
      inline def setFontFamiliesUndefined: Self = StObject.set(x, "fontFamilies", js.undefined)
      
      inline def setFontFamiliesVarargs(value: Family*): Self = StObject.set(x, "fontFamilies", js.Array(value*))
      
      inline def setFontSizes(value: js.Array[Double]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      inline def setFontSizesVarargs(value: Double*): Self = StObject.set(x, "fontSizes", js.Array(value*))
      
      inline def setHandleBeforeInput(value: js.Function): Self = StObject.set(x, "handleBeforeInput", value.asInstanceOf[js.Any])
      
      inline def setHandleBeforeInputUndefined: Self = StObject.set(x, "handleBeforeInput", js.undefined)
      
      inline def setHandleDroppedFiles(value: js.Function): Self = StObject.set(x, "handleDroppedFiles", value.asInstanceOf[js.Any])
      
      inline def setHandleDroppedFilesUndefined: Self = StObject.set(x, "handleDroppedFiles", js.undefined)
      
      inline def setHandleKeyCommand(value: js.Function): Self = StObject.set(x, "handleKeyCommand", value.asInstanceOf[js.Any])
      
      inline def setHandleKeyCommandUndefined: Self = StObject.set(x, "handleKeyCommand", js.undefined)
      
      inline def setHandlePastedFiles(value: js.Function): Self = StObject.set(x, "handlePastedFiles", value.asInstanceOf[js.Any])
      
      inline def setHandlePastedFilesUndefined: Self = StObject.set(x, "handlePastedFiles", js.undefined)
      
      inline def setHandlePastedText(value: js.Function): Self = StObject.set(x, "handlePastedText", value.asInstanceOf[js.Any])
      
      inline def setHandlePastedTextUndefined: Self = StObject.set(x, "handlePastedText", js.undefined)
      
      inline def setHandleReturn(value: js.Function): Self = StObject.set(x, "handleReturn", value.asInstanceOf[js.Any])
      
      inline def setHandleReturnUndefined: Self = StObject.set(x, "handleReturn", js.undefined)
      
      inline def setHeadings(value: js.Array[String]): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
      
      inline def setHeadingsUndefined: Self = StObject.set(x, "headings", js.undefined)
      
      inline def setHeadingsVarargs(value: String*): Self = StObject.set(x, "headings", js.Array(value*))
      
      inline def setHooks(value: HooksType): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setImageControls(value: js.Array[ImageControlType]): Self = StObject.set(x, "imageControls", value.asInstanceOf[js.Any])
      
      inline def setImageControlsUndefined: Self = StObject.set(x, "imageControls", js.undefined)
      
      inline def setImageControlsVarargs(value: ImageControlType*): Self = StObject.set(x, "imageControls", js.Array(value*))
      
      inline def setImageEqualRatio(value: Boolean): Self = StObject.set(x, "imageEqualRatio", value.asInstanceOf[js.Any])
      
      inline def setImageEqualRatioUndefined: Self = StObject.set(x, "imageEqualRatio", js.undefined)
      
      inline def setImageResizable(value: Boolean): Self = StObject.set(x, "imageResizable", value.asInstanceOf[js.Any])
      
      inline def setImageResizableUndefined: Self = StObject.set(x, "imageResizable", js.undefined)
      
      inline def setLanguage(
        value: zh | `zh-hant` | en | tr | ru | jpn | kr | pl | fr | `vi-vn` | (js.Function2[/* languages */ Any, /* context */ Any, Any])
      ): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageFunction2(value: (/* languages */ Any, /* context */ Any) => Any): Self = StObject.set(x, "language", js.Any.fromFunction2(value))
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLetterSpacings(value: js.Array[Double]): Self = StObject.set(x, "letterSpacings", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingsUndefined: Self = StObject.set(x, "letterSpacings", js.undefined)
      
      inline def setLetterSpacingsVarargs(value: Double*): Self = StObject.set(x, "letterSpacings", js.Array(value*))
      
      inline def setLineHeights(value: js.Array[Double]): Self = StObject.set(x, "lineHeights", value.asInstanceOf[js.Any])
      
      inline def setLineHeightsUndefined: Self = StObject.set(x, "lineHeights", js.undefined)
      
      inline def setLineHeightsVarargs(value: Double*): Self = StObject.set(x, "lineHeights", js.Array(value*))
      
      inline def setMedia(value: MediaType): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setOnBlur(value: js.Function): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* editorState */ EditorState => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDelete(value: js.Function): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnFocus(value: js.Function): Self = StObject.set(x, "onFocus", value.asInstanceOf[js.Any])
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFullscreen(value: js.Function): Self = StObject.set(x, "onFullscreen", value.asInstanceOf[js.Any])
      
      inline def setOnFullscreenUndefined: Self = StObject.set(x, "onFullscreen", js.undefined)
      
      inline def setOnSave(value: js.Function): Self = StObject.set(x, "onSave", value.asInstanceOf[js.Any])
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setOnTab(value: js.Function): Self = StObject.set(x, "onTab", value.asInstanceOf[js.Any])
      
      inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setStripPastedStyles(value: Boolean): Self = StObject.set(x, "stripPastedStyles", value.asInstanceOf[js.Any])
      
      inline def setStripPastedStylesUndefined: Self = StObject.set(x, "stripPastedStyles", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTextAligns(value: js.Array[left | center | right | justify]): Self = StObject.set(x, "textAligns", value.asInstanceOf[js.Any])
      
      inline def setTextAlignsUndefined: Self = StObject.set(x, "textAligns", js.undefined)
      
      inline def setTextAlignsVarargs(value: (left | center | right | justify)*): Self = StObject.set(x, "textAligns", js.Array(value*))
      
      inline def setTextBackgroundColor(value: Boolean): Self = StObject.set(x, "textBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setTextBackgroundColorUndefined: Self = StObject.set(x, "textBackgroundColor", js.undefined)
      
      inline def setValue(value: EditorState): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braftEditor.braftEditorStrings.blockquote
    - typings.braftEditor.braftEditorStrings.bold
    - typings.braftEditor.braftEditorStrings.code
    - typings.braftEditor.braftEditorStrings.clear
    - typings.braftEditor.braftEditorStrings.emoji
    - typings.braftEditor.braftEditorStrings.`font-family`
    - typings.braftEditor.braftEditorStrings.`font-size`
    - typings.braftEditor.braftEditorStrings.fullscreen
    - typings.braftEditor.braftEditorStrings.headings
    - typings.braftEditor.braftEditorStrings.hr
    - typings.braftEditor.braftEditorStrings.italic
    - typings.braftEditor.braftEditorStrings.`letter-spacing`
    - typings.braftEditor.braftEditorStrings.`line-height`
    - typings.braftEditor.braftEditorStrings.link
    - typings.braftEditor.braftEditorStrings.`list-ol`
    - typings.braftEditor.braftEditorStrings.`list-ul`
    - typings.braftEditor.braftEditorStrings.media
    - typings.braftEditor.braftEditorStrings.redo
    - typings.braftEditor.braftEditorStrings.`remove-styles`
    - typings.braftEditor.braftEditorStrings.separator
    - typings.braftEditor.braftEditorStrings.`strike-through`
    - typings.braftEditor.braftEditorStrings.superscript
    - typings.braftEditor.braftEditorStrings.subscript
    - typings.braftEditor.braftEditorStrings.`text-align`
    - typings.braftEditor.braftEditorStrings.`text-color`
    - typings.braftEditor.braftEditorStrings.`text-indent`
    - typings.braftEditor.braftEditorStrings.underline
    - typings.braftEditor.braftEditorStrings.undo
    - typings.braftEditor.braftEditorStrings.table
  */
  trait BuiltInControlType
    extends StObject
       with ControlType
  object BuiltInControlType {
    
    inline def blockquote: typings.braftEditor.braftEditorStrings.blockquote = "blockquote".asInstanceOf[typings.braftEditor.braftEditorStrings.blockquote]
    
    inline def bold: typings.braftEditor.braftEditorStrings.bold = "bold".asInstanceOf[typings.braftEditor.braftEditorStrings.bold]
    
    inline def clear: typings.braftEditor.braftEditorStrings.clear = "clear".asInstanceOf[typings.braftEditor.braftEditorStrings.clear]
    
    inline def code: typings.braftEditor.braftEditorStrings.code = "code".asInstanceOf[typings.braftEditor.braftEditorStrings.code]
    
    inline def emoji: typings.braftEditor.braftEditorStrings.emoji = "emoji".asInstanceOf[typings.braftEditor.braftEditorStrings.emoji]
    
    inline def `font-family`: typings.braftEditor.braftEditorStrings.`font-family` = "font-family".asInstanceOf[typings.braftEditor.braftEditorStrings.`font-family`]
    
    inline def `font-size`: typings.braftEditor.braftEditorStrings.`font-size` = "font-size".asInstanceOf[typings.braftEditor.braftEditorStrings.`font-size`]
    
    inline def fullscreen: typings.braftEditor.braftEditorStrings.fullscreen = "fullscreen".asInstanceOf[typings.braftEditor.braftEditorStrings.fullscreen]
    
    inline def headings: typings.braftEditor.braftEditorStrings.headings = "headings".asInstanceOf[typings.braftEditor.braftEditorStrings.headings]
    
    inline def hr: typings.braftEditor.braftEditorStrings.hr = "hr".asInstanceOf[typings.braftEditor.braftEditorStrings.hr]
    
    inline def italic: typings.braftEditor.braftEditorStrings.italic = "italic".asInstanceOf[typings.braftEditor.braftEditorStrings.italic]
    
    inline def `letter-spacing`: typings.braftEditor.braftEditorStrings.`letter-spacing` = "letter-spacing".asInstanceOf[typings.braftEditor.braftEditorStrings.`letter-spacing`]
    
    inline def `line-height`: typings.braftEditor.braftEditorStrings.`line-height` = "line-height".asInstanceOf[typings.braftEditor.braftEditorStrings.`line-height`]
    
    inline def link: typings.braftEditor.braftEditorStrings.link = "link".asInstanceOf[typings.braftEditor.braftEditorStrings.link]
    
    inline def `list-ol`: typings.braftEditor.braftEditorStrings.`list-ol` = "list-ol".asInstanceOf[typings.braftEditor.braftEditorStrings.`list-ol`]
    
    inline def `list-ul`: typings.braftEditor.braftEditorStrings.`list-ul` = "list-ul".asInstanceOf[typings.braftEditor.braftEditorStrings.`list-ul`]
    
    inline def media: typings.braftEditor.braftEditorStrings.media = "media".asInstanceOf[typings.braftEditor.braftEditorStrings.media]
    
    inline def redo: typings.braftEditor.braftEditorStrings.redo = "redo".asInstanceOf[typings.braftEditor.braftEditorStrings.redo]
    
    inline def `remove-styles`: typings.braftEditor.braftEditorStrings.`remove-styles` = "remove-styles".asInstanceOf[typings.braftEditor.braftEditorStrings.`remove-styles`]
    
    inline def separator: typings.braftEditor.braftEditorStrings.separator = "separator".asInstanceOf[typings.braftEditor.braftEditorStrings.separator]
    
    inline def `strike-through`: typings.braftEditor.braftEditorStrings.`strike-through` = "strike-through".asInstanceOf[typings.braftEditor.braftEditorStrings.`strike-through`]
    
    inline def subscript: typings.braftEditor.braftEditorStrings.subscript = "subscript".asInstanceOf[typings.braftEditor.braftEditorStrings.subscript]
    
    inline def superscript: typings.braftEditor.braftEditorStrings.superscript = "superscript".asInstanceOf[typings.braftEditor.braftEditorStrings.superscript]
    
    inline def table: typings.braftEditor.braftEditorStrings.table = "table".asInstanceOf[typings.braftEditor.braftEditorStrings.table]
    
    inline def `text-align`: typings.braftEditor.braftEditorStrings.`text-align` = "text-align".asInstanceOf[typings.braftEditor.braftEditorStrings.`text-align`]
    
    inline def `text-color`: typings.braftEditor.braftEditorStrings.`text-color` = "text-color".asInstanceOf[typings.braftEditor.braftEditorStrings.`text-color`]
    
    inline def `text-indent`: typings.braftEditor.braftEditorStrings.`text-indent` = "text-indent".asInstanceOf[typings.braftEditor.braftEditorStrings.`text-indent`]
    
    inline def underline: typings.braftEditor.braftEditorStrings.underline = "underline".asInstanceOf[typings.braftEditor.braftEditorStrings.underline]
    
    inline def undo: typings.braftEditor.braftEditorStrings.undo = "undo".asInstanceOf[typings.braftEditor.braftEditorStrings.undo]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braftEditor.mod.BuiltInControlType
    - typings.braftEditor.anon.Key
    - typings.braftEditor.mod.ExtendControlType
  */
  trait ControlType extends StObject
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait EditorState
    extends typings.draftJs.mod.EditorState {
    
    def isEmpty(): Boolean = js.native
    
    def setConvertOptions(): Unit = js.native
    def setConvertOptions(option: js.Object): Unit = js.native
    
    def toHTML(): String = js.native
    def toHTML(option: js.Object): String = js.native
    
    def toRAW(): RawDraftContentState | String = js.native
    def toRAW(noStringify: Boolean): RawDraftContentState | String = js.native
    
    def toText(): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braftEditor.braftEditorStrings.separator
    - typings.braftEditor.anon.ClassName
    - typings.braftEditor.anon.ArrowActive
    - typings.braftEditor.anon.Disabled
    - typings.braftEditor.anon.Component
  */
  trait ExtendControlType
    extends StObject
       with ControlType
  
  type HookFunc = js.Function1[/* any */ Any, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.braftEditor.braftEditorStrings.`toggle-link`
    - typings.braftEditor.braftEditorStrings.`open-braft-finder`
    - typings.braftEditor.braftEditorStrings.`toggle-inline-style`
    - typings.braftEditor.braftEditorStrings.`change-block-type`
    - typings.braftEditor.braftEditorStrings.`exec-editor-command`
    - typings.braftEditor.braftEditorStrings.`insert-emoji`
    - typings.braftEditor.braftEditorStrings.`toggle-font-family`
    - typings.braftEditor.braftEditorStrings.`toggle-font-size`
    - typings.braftEditor.braftEditorStrings.`toggle-letter-spacing`
    - typings.braftEditor.braftEditorStrings.`toggle-line-height`
    - typings.braftEditor.braftEditorStrings.`toggle-text-alignment`
    - typings.braftEditor.braftEditorStrings.`toggle-text-color`
    - typings.braftEditor.braftEditorStrings.`toggle-text-background-color`
    - typings.braftEditor.braftEditorStrings.`select-medias`
    - typings.braftEditor.braftEditorStrings.`deselect-medias`
    - typings.braftEditor.braftEditorStrings.`remove-medias`
    - typings.braftEditor.braftEditorStrings.`insert-medias`
    - typings.braftEditor.braftEditorStrings.`select-files`
  */
  trait HookType extends StObject
  object HookType {
    
    inline def `change-block-type`: typings.braftEditor.braftEditorStrings.`change-block-type` = "change-block-type".asInstanceOf[typings.braftEditor.braftEditorStrings.`change-block-type`]
    
    inline def `deselect-medias`: typings.braftEditor.braftEditorStrings.`deselect-medias` = "deselect-medias".asInstanceOf[typings.braftEditor.braftEditorStrings.`deselect-medias`]
    
    inline def `exec-editor-command`: typings.braftEditor.braftEditorStrings.`exec-editor-command` = "exec-editor-command".asInstanceOf[typings.braftEditor.braftEditorStrings.`exec-editor-command`]
    
    inline def `insert-emoji`: typings.braftEditor.braftEditorStrings.`insert-emoji` = "insert-emoji".asInstanceOf[typings.braftEditor.braftEditorStrings.`insert-emoji`]
    
    inline def `insert-medias`: typings.braftEditor.braftEditorStrings.`insert-medias` = "insert-medias".asInstanceOf[typings.braftEditor.braftEditorStrings.`insert-medias`]
    
    inline def `open-braft-finder`: typings.braftEditor.braftEditorStrings.`open-braft-finder` = "open-braft-finder".asInstanceOf[typings.braftEditor.braftEditorStrings.`open-braft-finder`]
    
    inline def `remove-medias`: typings.braftEditor.braftEditorStrings.`remove-medias` = "remove-medias".asInstanceOf[typings.braftEditor.braftEditorStrings.`remove-medias`]
    
    inline def `select-files`: typings.braftEditor.braftEditorStrings.`select-files` = "select-files".asInstanceOf[typings.braftEditor.braftEditorStrings.`select-files`]
    
    inline def `select-medias`: typings.braftEditor.braftEditorStrings.`select-medias` = "select-medias".asInstanceOf[typings.braftEditor.braftEditorStrings.`select-medias`]
    
    inline def `toggle-font-family`: typings.braftEditor.braftEditorStrings.`toggle-font-family` = "toggle-font-family".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-font-family`]
    
    inline def `toggle-font-size`: typings.braftEditor.braftEditorStrings.`toggle-font-size` = "toggle-font-size".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-font-size`]
    
    inline def `toggle-inline-style`: typings.braftEditor.braftEditorStrings.`toggle-inline-style` = "toggle-inline-style".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-inline-style`]
    
    inline def `toggle-letter-spacing`: typings.braftEditor.braftEditorStrings.`toggle-letter-spacing` = "toggle-letter-spacing".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-letter-spacing`]
    
    inline def `toggle-line-height`: typings.braftEditor.braftEditorStrings.`toggle-line-height` = "toggle-line-height".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-line-height`]
    
    inline def `toggle-link`: typings.braftEditor.braftEditorStrings.`toggle-link` = "toggle-link".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-link`]
    
    inline def `toggle-text-alignment`: typings.braftEditor.braftEditorStrings.`toggle-text-alignment` = "toggle-text-alignment".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-text-alignment`]
    
    inline def `toggle-text-background-color`: typings.braftEditor.braftEditorStrings.`toggle-text-background-color` = "toggle-text-background-color".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-text-background-color`]
    
    inline def `toggle-text-color`: typings.braftEditor.braftEditorStrings.`toggle-text-color` = "toggle-text-color".asInstanceOf[typings.braftEditor.braftEditorStrings.`toggle-text-color`]
  }
  
  trait HooksType extends StObject {
    
    var `change-block-type`: js.UndefOr[HookFunc] = js.undefined
    
    var `deselect-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `exec-editor-command`: js.UndefOr[HookFunc] = js.undefined
    
    var `insert-emoji`: js.UndefOr[HookFunc] = js.undefined
    
    var `insert-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `open-braft-finder`: js.UndefOr[HookFunc] = js.undefined
    
    var `remove-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `select-files`: js.UndefOr[HookFunc] = js.undefined
    
    var `select-medias`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-alignment`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-float`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-link`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-link-target`: js.UndefOr[HookFunc] = js.undefined
    
    var `set-image-size`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-font-family`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-font-size`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-inline-style`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-letter-spacing`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-line-height`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-link`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-alignment`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-background-color`: js.UndefOr[HookFunc] = js.undefined
    
    var `toggle-text-color`: js.UndefOr[HookFunc] = js.undefined
  }
  object HooksType {
    
    inline def apply(): HooksType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HooksType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HooksType] (val x: Self) extends AnyVal {
      
      inline def `setChange-block-type`(value: /* any */ Any => Any): Self = StObject.set(x, "change-block-type", js.Any.fromFunction1(value))
      
      inline def `setChange-block-typeUndefined`: Self = StObject.set(x, "change-block-type", js.undefined)
      
      inline def `setDeselect-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "deselect-medias", js.Any.fromFunction1(value))
      
      inline def `setDeselect-mediasUndefined`: Self = StObject.set(x, "deselect-medias", js.undefined)
      
      inline def `setExec-editor-command`(value: /* any */ Any => Any): Self = StObject.set(x, "exec-editor-command", js.Any.fromFunction1(value))
      
      inline def `setExec-editor-commandUndefined`: Self = StObject.set(x, "exec-editor-command", js.undefined)
      
      inline def `setInsert-emoji`(value: /* any */ Any => Any): Self = StObject.set(x, "insert-emoji", js.Any.fromFunction1(value))
      
      inline def `setInsert-emojiUndefined`: Self = StObject.set(x, "insert-emoji", js.undefined)
      
      inline def `setInsert-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "insert-medias", js.Any.fromFunction1(value))
      
      inline def `setInsert-mediasUndefined`: Self = StObject.set(x, "insert-medias", js.undefined)
      
      inline def `setOpen-braft-finder`(value: /* any */ Any => Any): Self = StObject.set(x, "open-braft-finder", js.Any.fromFunction1(value))
      
      inline def `setOpen-braft-finderUndefined`: Self = StObject.set(x, "open-braft-finder", js.undefined)
      
      inline def `setRemove-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "remove-medias", js.Any.fromFunction1(value))
      
      inline def `setRemove-mediasUndefined`: Self = StObject.set(x, "remove-medias", js.undefined)
      
      inline def `setSelect-files`(value: /* any */ Any => Any): Self = StObject.set(x, "select-files", js.Any.fromFunction1(value))
      
      inline def `setSelect-filesUndefined`: Self = StObject.set(x, "select-files", js.undefined)
      
      inline def `setSelect-medias`(value: /* any */ Any => Any): Self = StObject.set(x, "select-medias", js.Any.fromFunction1(value))
      
      inline def `setSelect-mediasUndefined`: Self = StObject.set(x, "select-medias", js.undefined)
      
      inline def `setSet-image-alignment`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-alignment", js.Any.fromFunction1(value))
      
      inline def `setSet-image-alignmentUndefined`: Self = StObject.set(x, "set-image-alignment", js.undefined)
      
      inline def `setSet-image-float`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-float", js.Any.fromFunction1(value))
      
      inline def `setSet-image-floatUndefined`: Self = StObject.set(x, "set-image-float", js.undefined)
      
      inline def `setSet-image-link`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-link", js.Any.fromFunction1(value))
      
      inline def `setSet-image-link-target`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-link-target", js.Any.fromFunction1(value))
      
      inline def `setSet-image-link-targetUndefined`: Self = StObject.set(x, "set-image-link-target", js.undefined)
      
      inline def `setSet-image-linkUndefined`: Self = StObject.set(x, "set-image-link", js.undefined)
      
      inline def `setSet-image-size`(value: /* any */ Any => Any): Self = StObject.set(x, "set-image-size", js.Any.fromFunction1(value))
      
      inline def `setSet-image-sizeUndefined`: Self = StObject.set(x, "set-image-size", js.undefined)
      
      inline def `setToggle-font-family`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-font-family", js.Any.fromFunction1(value))
      
      inline def `setToggle-font-familyUndefined`: Self = StObject.set(x, "toggle-font-family", js.undefined)
      
      inline def `setToggle-font-size`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-font-size", js.Any.fromFunction1(value))
      
      inline def `setToggle-font-sizeUndefined`: Self = StObject.set(x, "toggle-font-size", js.undefined)
      
      inline def `setToggle-inline-style`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-inline-style", js.Any.fromFunction1(value))
      
      inline def `setToggle-inline-styleUndefined`: Self = StObject.set(x, "toggle-inline-style", js.undefined)
      
      inline def `setToggle-letter-spacing`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-letter-spacing", js.Any.fromFunction1(value))
      
      inline def `setToggle-letter-spacingUndefined`: Self = StObject.set(x, "toggle-letter-spacing", js.undefined)
      
      inline def `setToggle-line-height`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-line-height", js.Any.fromFunction1(value))
      
      inline def `setToggle-line-heightUndefined`: Self = StObject.set(x, "toggle-line-height", js.undefined)
      
      inline def `setToggle-link`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-link", js.Any.fromFunction1(value))
      
      inline def `setToggle-linkUndefined`: Self = StObject.set(x, "toggle-link", js.undefined)
      
      inline def `setToggle-text-alignment`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-alignment", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-alignmentUndefined`: Self = StObject.set(x, "toggle-text-alignment", js.undefined)
      
      inline def `setToggle-text-background-color`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-background-color", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-background-colorUndefined`: Self = StObject.set(x, "toggle-text-background-color", js.undefined)
      
      inline def `setToggle-text-color`(value: /* any */ Any => Any): Self = StObject.set(x, "toggle-text-color", js.Any.fromFunction1(value))
      
      inline def `setToggle-text-colorUndefined`: Self = StObject.set(x, "toggle-text-color", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braftEditor.braftEditorStrings.`float-left`
    - typings.braftEditor.braftEditorStrings.`float-right`
    - typings.braftEditor.braftEditorStrings.`align-left`
    - typings.braftEditor.braftEditorStrings.`align-center`
    - typings.braftEditor.braftEditorStrings.`align-right`
    - typings.braftEditor.braftEditorStrings.link
    - typings.braftEditor.braftEditorStrings.size
    - typings.braftEditor.braftEditorStrings.remove
    - typings.braftEditor.anon.OnClick
  */
  trait ImageControlType extends StObject
  
  trait MediaType extends StObject {
    
    var accepts: js.UndefOr[Audio] = js.undefined
    
    var externals: js.UndefOr[Embed] = js.undefined
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onChange: js.UndefOr[js.Function] = js.undefined
    
    var onInsert: js.UndefOr[js.Function] = js.undefined
    
    var pasteImage: js.UndefOr[Boolean] = js.undefined
    
    var uploadFn: js.UndefOr[js.Function1[/* params */ Error, Unit]] = js.undefined
    
    var validateFn: js.UndefOr[js.Function1[/* file */ File, Boolean | PromiseLike[Any]]] = js.undefined
  }
  object MediaType {
    
    inline def apply(): MediaType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaType] (val x: Self) extends AnyVal {
      
      inline def setAccepts(value: Audio): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      inline def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      inline def setExternals(value: Embed): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
      
      inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInsert(value: js.Function): Self = StObject.set(x, "onInsert", value.asInstanceOf[js.Any])
      
      inline def setOnInsertUndefined: Self = StObject.set(x, "onInsert", js.undefined)
      
      inline def setPasteImage(value: Boolean): Self = StObject.set(x, "pasteImage", value.asInstanceOf[js.Any])
      
      inline def setPasteImageUndefined: Self = StObject.set(x, "pasteImage", js.undefined)
      
      inline def setUploadFn(value: /* params */ Error => Unit): Self = StObject.set(x, "uploadFn", js.Any.fromFunction1(value))
      
      inline def setUploadFnUndefined: Self = StObject.set(x, "uploadFn", js.undefined)
      
      inline def setValidateFn(value: /* file */ File => Boolean | PromiseLike[Any]): Self = StObject.set(x, "validateFn", js.Any.fromFunction1(value))
      
      inline def setValidateFnUndefined: Self = StObject.set(x, "validateFn", js.undefined)
    }
  }
}
