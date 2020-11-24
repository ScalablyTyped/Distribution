package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.config.styleObject
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor.eventObject
import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import typings.ckeditor.anon.Groups
import typings.ckeditor.ckeditorStrings.html
import typings.ckeditor.ckeditorStrings.text
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
@js.native
trait config_ extends js.Object {
  
  var allowedContent: js.UndefOr[Boolean | allowedContentRules] = js.native
  
  var autoEmbed_widget: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.native
  
  var autoGrow_bottomSpace: js.UndefOr[Double] = js.native
  
  var autoGrow_maxHeight: js.UndefOr[Double] = js.native
  
  var autoGrow_minHeight: js.UndefOr[Double] = js.native
  
  var autoGrow_onStartup: js.UndefOr[Boolean] = js.native
  
  var autoUpdateElement: js.UndefOr[Boolean] = js.native
  
  var baseFloatZIndex: js.UndefOr[Double] = js.native
  
  var baseHref: js.UndefOr[String] = js.native
  
  var basicEntities: js.UndefOr[Boolean] = js.native
  
  var blockedKeystrokes: js.UndefOr[js.Array[Double]] = js.native
  
  var bodyClass: js.UndefOr[String] = js.native
  
  var bodyId: js.UndefOr[String] = js.native
  
  var browserContextMenuOnCtrl: js.UndefOr[Boolean] = js.native
  
  var clipboard_defaultContentType: js.UndefOr[html | text] = js.native
  
  var clipboard_notificationDuration: js.UndefOr[Double] = js.native
  
  var cloudServices_tokenUrl: js.UndefOr[String] = js.native
  
  var cloudServices_uploadUrl: js.UndefOr[String] = js.native
  
  var coceSnippet_theme: js.UndefOr[String] = js.native
  
  var codeSnippetGeshi_url: js.UndefOr[String] = js.native
  
  var codeSnippet_codeClass: js.UndefOr[String] = js.native
  
  var codeSnippet_languages: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var colorButton_backStyle: js.UndefOr[styleObject] = js.native
  
  var colorButton_colors: js.UndefOr[String] = js.native
  
  var colorButton_colorsPerRow: js.UndefOr[Double] = js.native
  
  var colorButton_enableAutomatic: js.UndefOr[Boolean] = js.native
  
  var colorButton_enableMore: js.UndefOr[Boolean] = js.native
  
  var colorButton_foreStyle: js.UndefOr[styleObject] = js.native
  
  var colorButton_normalizeBackground: js.UndefOr[Boolean] = js.native
  
  var contentsCss: js.UndefOr[String | js.Array[String]] = js.native
  
  var contentsLangDirection: js.UndefOr[String] = js.native
  
  var contentsLanguage: js.UndefOr[String] = js.native
  
  var copyFormatting_allowRules: js.UndefOr[String] = js.native
  
  var copyFormatting_allowedContexts: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var copyFormatting_keystrokeCopy: js.UndefOr[Double] = js.native
  
  var copyFormatting_keystrokePaste: js.UndefOr[Double] = js.native
  
  var copyFormatting_outerCursor: js.UndefOr[Boolean] = js.native
  
  var coreStyles_bold: js.UndefOr[styleObject] = js.native
  
  var coreStyles_italic: js.UndefOr[styleObject] = js.native
  
  var coreStyles_strike: js.UndefOr[styleObject] = js.native
  
  var coreStyles_subscript: js.UndefOr[styleObject] = js.native
  
  var coreStyles_superscript: js.UndefOr[styleObject] = js.native
  
  var coreStyles_underline: js.UndefOr[styleObject] = js.native
  
  var customConfig: js.UndefOr[String] = js.native
  
  var dataIndentationChars: js.UndefOr[String] = js.native
  
  var defaultLanguage: js.UndefOr[String] = js.native
  
  var devtools_styles: js.UndefOr[String] = js.native
  
  var devtools_textCallback: js.UndefOr[
    js.Function4[
      /* editor */ editor, 
      /* dialog */ dialog, 
      /* element */ element, 
      /* tabName */ String, 
      String
    ]
  ] = js.native
  
  var dialog_backgroundCoverColor: js.UndefOr[String] = js.native
  
  var dialog_backgroundCoverOpacity: js.UndefOr[Double] = js.native
  
  var dialog_buttonsOrder: js.UndefOr[String] = js.native
  
  var dialog_magnetDistance: js.UndefOr[Double] = js.native
  
  var dialog_noConfirmCancel: js.UndefOr[Boolean] = js.native
  
  var dialog_startupFocusTab: js.UndefOr[Boolean] = js.native
  
  var disableNativeObjectResizing: js.UndefOr[Boolean] = js.native
  
  var disableNativeReadonlyStyling: js.UndefOr[Boolean] = js.native
  
  var disableNativeSpellChecker: js.UndefOr[Boolean] = js.native
  
  var disableNativeTableHandles: js.UndefOr[Boolean] = js.native
  
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.native
  
  var div_wrapTable: js.UndefOr[Boolean] = js.native
  
  var docType: js.UndefOr[String] = js.native
  
  var easyimage_class: js.UndefOr[String] = js.native
  
  var easyimage_defaultStyle: js.UndefOr[String] = js.native
  
  var easyimage_styles: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var easyimage_toolbar: js.UndefOr[js.Array[String] | String] = js.native
  
  var emailProtection: js.UndefOr[String] = js.native
  
  var embed_provider: js.UndefOr[String] = js.native
  
  var emoji_emojiListUrl: js.UndefOr[String] = js.native
  
  var emoji_minChars: js.UndefOr[Double] = js.native
  
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  
  var enableTabKeyTools: js.UndefOr[Boolean] = js.native
  
  var enterMode: js.UndefOr[Double] = js.native
  
  var entities: js.UndefOr[Boolean] = js.native
  
  var entities_additional: js.UndefOr[String] = js.native
  
  var entities_greek: js.UndefOr[Boolean] = js.native
  
  var entities_latin: js.UndefOr[Boolean] = js.native
  
  var entities_processNumerical: js.UndefOr[Boolean | String] = js.native
  
  var extraAllowedContent: js.UndefOr[allowedContentRules] = js.native
  
  var extraPlugins: js.UndefOr[String] = js.native
  
  var fileTools_defaultFileName: js.UndefOr[String] = js.native
  
  var fileTools_requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var filebrowserBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserFlashBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserFlashUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageBrowseLinkUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageBrowseUrl: js.UndefOr[String] = js.native
  
  var filebrowserImageUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserUploadMethod: js.UndefOr[String] = js.native
  
  var filebrowserUploadUrl: js.UndefOr[String] = js.native
  
  var filebrowserWindowFeatures: js.UndefOr[String] = js.native
  
  var filebrowserWindowHeight: js.UndefOr[Double | String] = js.native
  
  var filebrowserWindowWidth: js.UndefOr[Double | String] = js.native
  
  var fillEmptyBlocks: js.UndefOr[
    Boolean | (js.Function1[/* element */ typings.ckeditor.CKEDITOR.htmlParser.element, Boolean])
  ] = js.native
  
  var find_highlight: js.UndefOr[styleObject] = js.native
  
  var flashAddEmbedTag: js.UndefOr[Boolean] = js.native
  
  var flashConvertOnEdit: js.UndefOr[Boolean] = js.native
  
  var flashEmbedTagOnly: js.UndefOr[Boolean] = js.native
  
  var floatSpaceDockedOffsetX: js.UndefOr[Double] = js.native
  
  var floatSpaceDockedOffsetY: js.UndefOr[Double] = js.native
  
  var floatSpacePinnedOffsetX: js.UndefOr[Double] = js.native
  
  var floatSpacePinnedOffsetY: js.UndefOr[Double] = js.native
  
  var floatSpacePreferRight: js.UndefOr[Boolean] = js.native
  
  var fontSize_defaultLabel: js.UndefOr[String] = js.native
  
  var fontSize_sizes: js.UndefOr[String] = js.native
  
  var fontSize_style: js.UndefOr[styleObject] = js.native
  
  var font_defaultLabel: js.UndefOr[String] = js.native
  
  var font_names: js.UndefOr[String] = js.native
  
  var font_style: js.UndefOr[styleObject] = js.native
  
  var forceEnterMode: js.UndefOr[Boolean] = js.native
  
  var forcePasteAsPlainText: js.UndefOr[Boolean] = js.native
  
  var forceSimpleAmpersand: js.UndefOr[Boolean] = js.native
  
  var format_address: js.UndefOr[styleObject] = js.native
  
  var format_div: js.UndefOr[styleObject] = js.native
  
  var format_h1: js.UndefOr[styleObject] = js.native
  
  var format_h2: js.UndefOr[styleObject] = js.native
  
  var format_h3: js.UndefOr[styleObject] = js.native
  
  var format_h4: js.UndefOr[styleObject] = js.native
  
  var format_h5: js.UndefOr[styleObject] = js.native
  
  var format_h6: js.UndefOr[styleObject] = js.native
  
  var format_p: js.UndefOr[styleObject] = js.native
  
  var format_pre: js.UndefOr[styleObject] = js.native
  
  var format_tags: js.UndefOr[String] = js.native
  
  var fullPage: js.UndefOr[Boolean] = js.native
  
  var grayt_autoStartup: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var htmlEncodeOutput: js.UndefOr[Boolean] = js.native
  
  var ignoreEmptyParagraph: js.UndefOr[Boolean] = js.native
  
  var image2_alignClasses: js.UndefOr[js.Array[String]] = js.native
  
  var image2_altRequired: js.UndefOr[Boolean] = js.native
  
  var image2_captionedClass: js.UndefOr[String] = js.native
  
  var image2_disableResizer: js.UndefOr[Boolean] = js.native
  
  var image2_prefillDimensions: js.UndefOr[Boolean] = js.native
  
  var imageUploadUrl: js.UndefOr[String] = js.native
  
  var image_prefillDimensions: js.UndefOr[Boolean] = js.native
  
  var image_previewText: js.UndefOr[String] = js.native
  
  var image_removeLinkByEmptyUrl: js.UndefOr[Boolean] = js.native
  
  var indentClasses: js.UndefOr[js.Array[String]] = js.native
  
  var indentOffset: js.UndefOr[Double] = js.native
  
  var indentUnit: js.UndefOr[String] = js.native
  
  var jqueryOverrideVal: js.UndefOr[Boolean] = js.native
  
  var justifyClasses: js.UndefOr[js.Array[String]] = js.native
  
  var keystrokes: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var language_list: js.UndefOr[js.Array[String]] = js.native
  
  var linkJavaScriptLinksAllowed: js.UndefOr[Boolean] = js.native
  
  var linkShowAdvancedTab: js.UndefOr[Boolean] = js.native
  
  var linkShowTargetTab: js.UndefOr[Boolean] = js.native
  
  var magicline_color: js.UndefOr[String] = js.native
  
  var magicline_everywhere: js.UndefOr[Boolean] = js.native
  
  var magicline_holdDistance: js.UndefOr[Double] = js.native
  
  var magicline_keystrokeNext: js.UndefOr[Double] = js.native
  
  var magicline_keystrokePrevious: js.UndefOr[Double] = js.native
  
  var magicline_tabuList: js.UndefOr[js.Array[String]] = js.native
  
  var magicline_triggerOffset: js.UndefOr[Double] = js.native
  
  var mathJaxClass: js.UndefOr[String] = js.native
  
  var mathJaxLib: js.UndefOr[String] = js.native
  
  var menu_groups: js.UndefOr[String] = js.native
  
  var menu_subMenuDelay: js.UndefOr[Double] = js.native
  
  var newpage_html: js.UndefOr[String] = js.native
  
  var notification_duration: js.UndefOr[Double] = js.native
  
  var on: js.UndefOr[eventObject] = js.native
  
  var pasteFilter: js.UndefOr[String] = js.native
  
  var pasteFromWordCleanupFile: js.UndefOr[String] = js.native
  
  var pasteFromWordNumberedHeadingToList: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordPromptCleanup: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordRemoveFontStyles: js.UndefOr[Boolean] = js.native
  
  var pasteFromWordRemoveStyles: js.UndefOr[Boolean] = js.native
  
  var pasteFromWord_heuristicsEdgeList: js.UndefOr[Boolean] = js.native
  
  var pasteFromWord_inlineImages: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[String] = js.native
  
  var protectedSource: js.UndefOr[js.Array[RegExp]] = js.native
  
  var readOnly: js.UndefOr[Boolean] = js.native
  
  var removeButtons: js.UndefOr[String] = js.native
  
  var removeDialogTabs: js.UndefOr[String] = js.native
  
  var removeFormatAttributes: js.UndefOr[String] = js.native
  
  var removeFormatTags: js.UndefOr[String] = js.native
  
  var removePlugins: js.UndefOr[String] = js.native
  
  var resize_dir: js.UndefOr[String] = js.native
  
  var resize_enabled: js.UndefOr[Boolean] = js.native
  
  var resize_maxHeight: js.UndefOr[Double] = js.native
  
  var resize_maxWidth: js.UndefOr[Double] = js.native
  
  var resize_minHeight: js.UndefOr[Double] = js.native
  
  var resize_minWidth: js.UndefOr[Double] = js.native
  
  var scayt_autoStartup: js.UndefOr[Boolean] = js.native
  
  var scayt_contextCommands: js.UndefOr[String] = js.native
  
  var scayt_contextMenuItemsOrder: js.UndefOr[String] = js.native
  
  var scayt_customDictionaryIds: js.UndefOr[String] = js.native
  
  var scayt_customerId: js.UndefOr[String] = js.native
  
  var scayt_disableOptionsStorage: js.UndefOr[String | js.Array[String]] = js.native
  
  var scayt_elementsToIgnore: js.UndefOr[String] = js.native
  
  var scayt_handleCheckDirty: js.UndefOr[String] = js.native
  
  var scayt_handleUndoRedo: js.UndefOr[String] = js.native
  
  var scayt_ignoreAllCapsWords: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreDomainNames: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreWordsWithMixedCases: js.UndefOr[Boolean] = js.native
  
  var scayt_ignoreWordsWithNumbers: js.UndefOr[Boolean] = js.native
  
  var scayt_inlineModeImmediateMarkup: js.UndefOr[Boolean] = js.native
  
  var scayt_maxSuggestions: js.UndefOr[Double] = js.native
  
  var scayt_minWordLength: js.UndefOr[Double] = js.native
  
  var scayt_moreSuggestions: js.UndefOr[String] = js.native
  
  var scayt_multiLanguageMode: js.UndefOr[Boolean] = js.native
  
  var scayt_multiLanguageStyles: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var scayt_sLang: js.UndefOr[String] = js.native
  
  var scayt_serviceHost: js.UndefOr[String] = js.native
  
  var scayt_servicePath: js.UndefOr[String] = js.native
  
  var scayt_servicePort: js.UndefOr[String] = js.native
  
  var scayt_serviceProtocol: js.UndefOr[String] = js.native
  
  var scayt_srcUrl: js.UndefOr[String] = js.native
  
  var scayt_uiTabs: js.UndefOr[String] = js.native
  
  var scayt_userDictionaryName: js.UndefOr[String] = js.native
  
  var sharedSpaces: js.UndefOr[sharedSpace] = js.native
  
  var shiftEnterMode: js.UndefOr[Double] = js.native
  
  var skin: js.UndefOr[String] = js.native
  
  var smiley_columns: js.UndefOr[Double] = js.native
  
  var smiley_descriptions: js.UndefOr[js.Array[String]] = js.native
  
  var smiley_images: js.UndefOr[js.Array[String]] = js.native
  
  var smiley_path: js.UndefOr[String] = js.native
  
  var sourceAreaTabSize: js.UndefOr[Double] = js.native
  
  var specialChars: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.native
  
  var startupFocus: js.UndefOr[String | Boolean] = js.native
  
  var startupMode: js.UndefOr[String] = js.native
  
  var startupOutlineBlocks: js.UndefOr[Boolean] = js.native
  
  var startupShowBorders: js.UndefOr[Boolean] = js.native
  
  var stylesSet: js.UndefOr[String | Boolean | js.Array[styleObject]] = js.native
  
  var stylesheetParser_skipSelectors: js.UndefOr[RegExp] = js.native
  
  var stylesheetParser_validSelectors: js.UndefOr[RegExp] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tabSpaces: js.UndefOr[Double] = js.native
  
  var templates: js.UndefOr[String] = js.native
  
  var templates_files: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var templates_replaceContent: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String | Boolean] = js.native
  
  var toolbar: js.UndefOr[String | (js.Array[String | js.Array[String] | Groups]) | Null] = js.native
  
  var toolbarCanCollapse: js.UndefOr[Boolean] = js.native
  
  var toolbarGroupCycling: js.UndefOr[Boolean] = js.native
  
  var toolbarGroups: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.toolbarGroups | String]] = js.native
  
  var toolbarLocation: js.UndefOr[String] = js.native
  
  var toolbarStartupExpanded: js.UndefOr[Boolean] = js.native
  
  var uiColor: js.UndefOr[String] = js.native
  
  var undoStackSize: js.UndefOr[Double] = js.native
  
  var uploadUrl: js.UndefOr[String] = js.native
  
  var useComputedState: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
  
  var wsc_cmd: js.UndefOr[String] = js.native
  
  var wsc_customDictionaryIds: js.UndefOr[String] = js.native
  
  var wsc_customLoaderScript: js.UndefOr[String] = js.native
  
  var wsc_customerId: js.UndefOr[String] = js.native
  
  var wsc_height: js.UndefOr[String] = js.native
  
  var wsc_lang: js.UndefOr[String] = js.native
  
  var wsc_left: js.UndefOr[String] = js.native
  
  var wsc_top: js.UndefOr[String] = js.native
  
  var wsc_userDictionaryName: js.UndefOr[String] = js.native
  
  var wsc_width: js.UndefOr[String] = js.native
}
object config_ {
  
  @scala.inline
  def apply(): config_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config_]
  }
  
  @scala.inline
  implicit class config_Ops[Self <: config_] (val x: Self) extends AnyVal {
    
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
    def setAllowedContentVarargs(value: allowedContentRule*): Self = this.set("allowedContent", js.Array(value :_*))
    
    @scala.inline
    def setAllowedContent(value: Boolean | allowedContentRules): Self = this.set("allowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedContent: Self = this.set("allowedContent", js.undefined)
    
    @scala.inline
    def setAutoEmbed_widgetFunction1(value: /* url */ String => String): Self = this.set("autoEmbed_widget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAutoEmbed_widget(value: String | (js.Function1[/* url */ String, String])): Self = this.set("autoEmbed_widget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEmbed_widget: Self = this.set("autoEmbed_widget", js.undefined)
    
    @scala.inline
    def setAutoGrow_bottomSpace(value: Double): Self = this.set("autoGrow_bottomSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGrow_bottomSpace: Self = this.set("autoGrow_bottomSpace", js.undefined)
    
    @scala.inline
    def setAutoGrow_maxHeight(value: Double): Self = this.set("autoGrow_maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGrow_maxHeight: Self = this.set("autoGrow_maxHeight", js.undefined)
    
    @scala.inline
    def setAutoGrow_minHeight(value: Double): Self = this.set("autoGrow_minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGrow_minHeight: Self = this.set("autoGrow_minHeight", js.undefined)
    
    @scala.inline
    def setAutoGrow_onStartup(value: Boolean): Self = this.set("autoGrow_onStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGrow_onStartup: Self = this.set("autoGrow_onStartup", js.undefined)
    
    @scala.inline
    def setAutoUpdateElement(value: Boolean): Self = this.set("autoUpdateElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpdateElement: Self = this.set("autoUpdateElement", js.undefined)
    
    @scala.inline
    def setBaseFloatZIndex(value: Double): Self = this.set("baseFloatZIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseFloatZIndex: Self = this.set("baseFloatZIndex", js.undefined)
    
    @scala.inline
    def setBaseHref(value: String): Self = this.set("baseHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseHref: Self = this.set("baseHref", js.undefined)
    
    @scala.inline
    def setBasicEntities(value: Boolean): Self = this.set("basicEntities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicEntities: Self = this.set("basicEntities", js.undefined)
    
    @scala.inline
    def setBlockedKeystrokesVarargs(value: Double*): Self = this.set("blockedKeystrokes", js.Array(value :_*))
    
    @scala.inline
    def setBlockedKeystrokes(value: js.Array[Double]): Self = this.set("blockedKeystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedKeystrokes: Self = this.set("blockedKeystrokes", js.undefined)
    
    @scala.inline
    def setBodyClass(value: String): Self = this.set("bodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyClass: Self = this.set("bodyClass", js.undefined)
    
    @scala.inline
    def setBodyId(value: String): Self = this.set("bodyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyId: Self = this.set("bodyId", js.undefined)
    
    @scala.inline
    def setBrowserContextMenuOnCtrl(value: Boolean): Self = this.set("browserContextMenuOnCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowserContextMenuOnCtrl: Self = this.set("browserContextMenuOnCtrl", js.undefined)
    
    @scala.inline
    def setClipboard_defaultContentType(value: html | text): Self = this.set("clipboard_defaultContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard_defaultContentType: Self = this.set("clipboard_defaultContentType", js.undefined)
    
    @scala.inline
    def setClipboard_notificationDuration(value: Double): Self = this.set("clipboard_notificationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClipboard_notificationDuration: Self = this.set("clipboard_notificationDuration", js.undefined)
    
    @scala.inline
    def setCloudServices_tokenUrl(value: String): Self = this.set("cloudServices_tokenUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServices_tokenUrl: Self = this.set("cloudServices_tokenUrl", js.undefined)
    
    @scala.inline
    def setCloudServices_uploadUrl(value: String): Self = this.set("cloudServices_uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudServices_uploadUrl: Self = this.set("cloudServices_uploadUrl", js.undefined)
    
    @scala.inline
    def setCoceSnippet_theme(value: String): Self = this.set("coceSnippet_theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoceSnippet_theme: Self = this.set("coceSnippet_theme", js.undefined)
    
    @scala.inline
    def setCodeSnippetGeshi_url(value: String): Self = this.set("codeSnippetGeshi_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSnippetGeshi_url: Self = this.set("codeSnippetGeshi_url", js.undefined)
    
    @scala.inline
    def setCodeSnippet_codeClass(value: String): Self = this.set("codeSnippet_codeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSnippet_codeClass: Self = this.set("codeSnippet_codeClass", js.undefined)
    
    @scala.inline
    def setCodeSnippet_languages(value: StringDictionary[js.Any]): Self = this.set("codeSnippet_languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodeSnippet_languages: Self = this.set("codeSnippet_languages", js.undefined)
    
    @scala.inline
    def setColorButton_backStyle(value: styleObject): Self = this.set("colorButton_backStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_backStyle: Self = this.set("colorButton_backStyle", js.undefined)
    
    @scala.inline
    def setColorButton_colors(value: String): Self = this.set("colorButton_colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_colors: Self = this.set("colorButton_colors", js.undefined)
    
    @scala.inline
    def setColorButton_colorsPerRow(value: Double): Self = this.set("colorButton_colorsPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_colorsPerRow: Self = this.set("colorButton_colorsPerRow", js.undefined)
    
    @scala.inline
    def setColorButton_enableAutomatic(value: Boolean): Self = this.set("colorButton_enableAutomatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_enableAutomatic: Self = this.set("colorButton_enableAutomatic", js.undefined)
    
    @scala.inline
    def setColorButton_enableMore(value: Boolean): Self = this.set("colorButton_enableMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_enableMore: Self = this.set("colorButton_enableMore", js.undefined)
    
    @scala.inline
    def setColorButton_foreStyle(value: styleObject): Self = this.set("colorButton_foreStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_foreStyle: Self = this.set("colorButton_foreStyle", js.undefined)
    
    @scala.inline
    def setColorButton_normalizeBackground(value: Boolean): Self = this.set("colorButton_normalizeBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorButton_normalizeBackground: Self = this.set("colorButton_normalizeBackground", js.undefined)
    
    @scala.inline
    def setContentsCssVarargs(value: String*): Self = this.set("contentsCss", js.Array(value :_*))
    
    @scala.inline
    def setContentsCss(value: String | js.Array[String]): Self = this.set("contentsCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentsCss: Self = this.set("contentsCss", js.undefined)
    
    @scala.inline
    def setContentsLangDirection(value: String): Self = this.set("contentsLangDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentsLangDirection: Self = this.set("contentsLangDirection", js.undefined)
    
    @scala.inline
    def setContentsLanguage(value: String): Self = this.set("contentsLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentsLanguage: Self = this.set("contentsLanguage", js.undefined)
    
    @scala.inline
    def setCopyFormatting_allowRules(value: String): Self = this.set("copyFormatting_allowRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFormatting_allowRules: Self = this.set("copyFormatting_allowRules", js.undefined)
    
    @scala.inline
    def setCopyFormatting_allowedContextsVarargs(value: String*): Self = this.set("copyFormatting_allowedContexts", js.Array(value :_*))
    
    @scala.inline
    def setCopyFormatting_allowedContexts(value: Boolean | js.Array[String]): Self = this.set("copyFormatting_allowedContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFormatting_allowedContexts: Self = this.set("copyFormatting_allowedContexts", js.undefined)
    
    @scala.inline
    def setCopyFormatting_keystrokeCopy(value: Double): Self = this.set("copyFormatting_keystrokeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFormatting_keystrokeCopy: Self = this.set("copyFormatting_keystrokeCopy", js.undefined)
    
    @scala.inline
    def setCopyFormatting_keystrokePaste(value: Double): Self = this.set("copyFormatting_keystrokePaste", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFormatting_keystrokePaste: Self = this.set("copyFormatting_keystrokePaste", js.undefined)
    
    @scala.inline
    def setCopyFormatting_outerCursor(value: Boolean): Self = this.set("copyFormatting_outerCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFormatting_outerCursor: Self = this.set("copyFormatting_outerCursor", js.undefined)
    
    @scala.inline
    def setCoreStyles_bold(value: styleObject): Self = this.set("coreStyles_bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_bold: Self = this.set("coreStyles_bold", js.undefined)
    
    @scala.inline
    def setCoreStyles_italic(value: styleObject): Self = this.set("coreStyles_italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_italic: Self = this.set("coreStyles_italic", js.undefined)
    
    @scala.inline
    def setCoreStyles_strike(value: styleObject): Self = this.set("coreStyles_strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_strike: Self = this.set("coreStyles_strike", js.undefined)
    
    @scala.inline
    def setCoreStyles_subscript(value: styleObject): Self = this.set("coreStyles_subscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_subscript: Self = this.set("coreStyles_subscript", js.undefined)
    
    @scala.inline
    def setCoreStyles_superscript(value: styleObject): Self = this.set("coreStyles_superscript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_superscript: Self = this.set("coreStyles_superscript", js.undefined)
    
    @scala.inline
    def setCoreStyles_underline(value: styleObject): Self = this.set("coreStyles_underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreStyles_underline: Self = this.set("coreStyles_underline", js.undefined)
    
    @scala.inline
    def setCustomConfig(value: String): Self = this.set("customConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomConfig: Self = this.set("customConfig", js.undefined)
    
    @scala.inline
    def setDataIndentationChars(value: String): Self = this.set("dataIndentationChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndentationChars: Self = this.set("dataIndentationChars", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setDevtools_styles(value: String): Self = this.set("devtools_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtools_styles: Self = this.set("devtools_styles", js.undefined)
    
    @scala.inline
    def setDevtools_textCallback(
      value: (/* editor */ editor, /* dialog */ dialog, /* element */ element, /* tabName */ String) => String
    ): Self = this.set("devtools_textCallback", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteDevtools_textCallback: Self = this.set("devtools_textCallback", js.undefined)
    
    @scala.inline
    def setDialog_backgroundCoverColor(value: String): Self = this.set("dialog_backgroundCoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_backgroundCoverColor: Self = this.set("dialog_backgroundCoverColor", js.undefined)
    
    @scala.inline
    def setDialog_backgroundCoverOpacity(value: Double): Self = this.set("dialog_backgroundCoverOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_backgroundCoverOpacity: Self = this.set("dialog_backgroundCoverOpacity", js.undefined)
    
    @scala.inline
    def setDialog_buttonsOrder(value: String): Self = this.set("dialog_buttonsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_buttonsOrder: Self = this.set("dialog_buttonsOrder", js.undefined)
    
    @scala.inline
    def setDialog_magnetDistance(value: Double): Self = this.set("dialog_magnetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_magnetDistance: Self = this.set("dialog_magnetDistance", js.undefined)
    
    @scala.inline
    def setDialog_noConfirmCancel(value: Boolean): Self = this.set("dialog_noConfirmCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_noConfirmCancel: Self = this.set("dialog_noConfirmCancel", js.undefined)
    
    @scala.inline
    def setDialog_startupFocusTab(value: Boolean): Self = this.set("dialog_startupFocusTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialog_startupFocusTab: Self = this.set("dialog_startupFocusTab", js.undefined)
    
    @scala.inline
    def setDisableNativeObjectResizing(value: Boolean): Self = this.set("disableNativeObjectResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNativeObjectResizing: Self = this.set("disableNativeObjectResizing", js.undefined)
    
    @scala.inline
    def setDisableNativeReadonlyStyling(value: Boolean): Self = this.set("disableNativeReadonlyStyling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNativeReadonlyStyling: Self = this.set("disableNativeReadonlyStyling", js.undefined)
    
    @scala.inline
    def setDisableNativeSpellChecker(value: Boolean): Self = this.set("disableNativeSpellChecker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNativeSpellChecker: Self = this.set("disableNativeSpellChecker", js.undefined)
    
    @scala.inline
    def setDisableNativeTableHandles(value: Boolean): Self = this.set("disableNativeTableHandles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNativeTableHandles: Self = this.set("disableNativeTableHandles", js.undefined)
    
    @scala.inline
    def setDisallowedContent(value: disallowedContentRules): Self = this.set("disallowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowedContent: Self = this.set("disallowedContent", js.undefined)
    
    @scala.inline
    def setDiv_wrapTable(value: Boolean): Self = this.set("div_wrapTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiv_wrapTable: Self = this.set("div_wrapTable", js.undefined)
    
    @scala.inline
    def setDocType(value: String): Self = this.set("docType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocType: Self = this.set("docType", js.undefined)
    
    @scala.inline
    def setEasyimage_class(value: String): Self = this.set("easyimage_class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasyimage_class: Self = this.set("easyimage_class", js.undefined)
    
    @scala.inline
    def setEasyimage_defaultStyle(value: String): Self = this.set("easyimage_defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasyimage_defaultStyle: Self = this.set("easyimage_defaultStyle", js.undefined)
    
    @scala.inline
    def setEasyimage_styles(value: StringDictionary[js.Any]): Self = this.set("easyimage_styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasyimage_styles: Self = this.set("easyimage_styles", js.undefined)
    
    @scala.inline
    def setEasyimage_toolbarVarargs(value: String*): Self = this.set("easyimage_toolbar", js.Array(value :_*))
    
    @scala.inline
    def setEasyimage_toolbar(value: js.Array[String] | String): Self = this.set("easyimage_toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasyimage_toolbar: Self = this.set("easyimage_toolbar", js.undefined)
    
    @scala.inline
    def setEmailProtection(value: String): Self = this.set("emailProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailProtection: Self = this.set("emailProtection", js.undefined)
    
    @scala.inline
    def setEmbed_provider(value: String): Self = this.set("embed_provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbed_provider: Self = this.set("embed_provider", js.undefined)
    
    @scala.inline
    def setEmoji_emojiListUrl(value: String): Self = this.set("emoji_emojiListUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji_emojiListUrl: Self = this.set("emoji_emojiListUrl", js.undefined)
    
    @scala.inline
    def setEmoji_minChars(value: Double): Self = this.set("emoji_minChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmoji_minChars: Self = this.set("emoji_minChars", js.undefined)
    
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    
    @scala.inline
    def setEnableTabKeyTools(value: Boolean): Self = this.set("enableTabKeyTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTabKeyTools: Self = this.set("enableTabKeyTools", js.undefined)
    
    @scala.inline
    def setEnterMode(value: Double): Self = this.set("enterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterMode: Self = this.set("enterMode", js.undefined)
    
    @scala.inline
    def setEntities(value: Boolean): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setEntities_additional(value: String): Self = this.set("entities_additional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities_additional: Self = this.set("entities_additional", js.undefined)
    
    @scala.inline
    def setEntities_greek(value: Boolean): Self = this.set("entities_greek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities_greek: Self = this.set("entities_greek", js.undefined)
    
    @scala.inline
    def setEntities_latin(value: Boolean): Self = this.set("entities_latin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities_latin: Self = this.set("entities_latin", js.undefined)
    
    @scala.inline
    def setEntities_processNumerical(value: Boolean | String): Self = this.set("entities_processNumerical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities_processNumerical: Self = this.set("entities_processNumerical", js.undefined)
    
    @scala.inline
    def setExtraAllowedContentVarargs(value: allowedContentRule*): Self = this.set("extraAllowedContent", js.Array(value :_*))
    
    @scala.inline
    def setExtraAllowedContent(value: allowedContentRules): Self = this.set("extraAllowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraAllowedContent: Self = this.set("extraAllowedContent", js.undefined)
    
    @scala.inline
    def setExtraPlugins(value: String): Self = this.set("extraPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraPlugins: Self = this.set("extraPlugins", js.undefined)
    
    @scala.inline
    def setFileTools_defaultFileName(value: String): Self = this.set("fileTools_defaultFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTools_defaultFileName: Self = this.set("fileTools_defaultFileName", js.undefined)
    
    @scala.inline
    def setFileTools_requestHeaders(value: StringDictionary[js.Any]): Self = this.set("fileTools_requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileTools_requestHeaders: Self = this.set("fileTools_requestHeaders", js.undefined)
    
    @scala.inline
    def setFilebrowserBrowseUrl(value: String): Self = this.set("filebrowserBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserBrowseUrl: Self = this.set("filebrowserBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserFlashBrowseUrl(value: String): Self = this.set("filebrowserFlashBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserFlashBrowseUrl: Self = this.set("filebrowserFlashBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserFlashUploadUrl(value: String): Self = this.set("filebrowserFlashUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserFlashUploadUrl: Self = this.set("filebrowserFlashUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageBrowseLinkUrl(value: String): Self = this.set("filebrowserImageBrowseLinkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserImageBrowseLinkUrl: Self = this.set("filebrowserImageBrowseLinkUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageBrowseUrl(value: String): Self = this.set("filebrowserImageBrowseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserImageBrowseUrl: Self = this.set("filebrowserImageBrowseUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserImageUploadUrl(value: String): Self = this.set("filebrowserImageUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserImageUploadUrl: Self = this.set("filebrowserImageUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserUploadMethod(value: String): Self = this.set("filebrowserUploadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserUploadMethod: Self = this.set("filebrowserUploadMethod", js.undefined)
    
    @scala.inline
    def setFilebrowserUploadUrl(value: String): Self = this.set("filebrowserUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserUploadUrl: Self = this.set("filebrowserUploadUrl", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowFeatures(value: String): Self = this.set("filebrowserWindowFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserWindowFeatures: Self = this.set("filebrowserWindowFeatures", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowHeight(value: Double | String): Self = this.set("filebrowserWindowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserWindowHeight: Self = this.set("filebrowserWindowHeight", js.undefined)
    
    @scala.inline
    def setFilebrowserWindowWidth(value: Double | String): Self = this.set("filebrowserWindowWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilebrowserWindowWidth: Self = this.set("filebrowserWindowWidth", js.undefined)
    
    @scala.inline
    def setFillEmptyBlocksFunction1(value: /* element */ typings.ckeditor.CKEDITOR.htmlParser.element => Boolean): Self = this.set("fillEmptyBlocks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFillEmptyBlocks(
      value: Boolean | (js.Function1[/* element */ typings.ckeditor.CKEDITOR.htmlParser.element, Boolean])
    ): Self = this.set("fillEmptyBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillEmptyBlocks: Self = this.set("fillEmptyBlocks", js.undefined)
    
    @scala.inline
    def setFind_highlight(value: styleObject): Self = this.set("find_highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind_highlight: Self = this.set("find_highlight", js.undefined)
    
    @scala.inline
    def setFlashAddEmbedTag(value: Boolean): Self = this.set("flashAddEmbedTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashAddEmbedTag: Self = this.set("flashAddEmbedTag", js.undefined)
    
    @scala.inline
    def setFlashConvertOnEdit(value: Boolean): Self = this.set("flashConvertOnEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashConvertOnEdit: Self = this.set("flashConvertOnEdit", js.undefined)
    
    @scala.inline
    def setFlashEmbedTagOnly(value: Boolean): Self = this.set("flashEmbedTagOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashEmbedTagOnly: Self = this.set("flashEmbedTagOnly", js.undefined)
    
    @scala.inline
    def setFloatSpaceDockedOffsetX(value: Double): Self = this.set("floatSpaceDockedOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatSpaceDockedOffsetX: Self = this.set("floatSpaceDockedOffsetX", js.undefined)
    
    @scala.inline
    def setFloatSpaceDockedOffsetY(value: Double): Self = this.set("floatSpaceDockedOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatSpaceDockedOffsetY: Self = this.set("floatSpaceDockedOffsetY", js.undefined)
    
    @scala.inline
    def setFloatSpacePinnedOffsetX(value: Double): Self = this.set("floatSpacePinnedOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatSpacePinnedOffsetX: Self = this.set("floatSpacePinnedOffsetX", js.undefined)
    
    @scala.inline
    def setFloatSpacePinnedOffsetY(value: Double): Self = this.set("floatSpacePinnedOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatSpacePinnedOffsetY: Self = this.set("floatSpacePinnedOffsetY", js.undefined)
    
    @scala.inline
    def setFloatSpacePreferRight(value: Boolean): Self = this.set("floatSpacePreferRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatSpacePreferRight: Self = this.set("floatSpacePreferRight", js.undefined)
    
    @scala.inline
    def setFontSize_defaultLabel(value: String): Self = this.set("fontSize_defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize_defaultLabel: Self = this.set("fontSize_defaultLabel", js.undefined)
    
    @scala.inline
    def setFontSize_sizes(value: String): Self = this.set("fontSize_sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize_sizes: Self = this.set("fontSize_sizes", js.undefined)
    
    @scala.inline
    def setFontSize_style(value: styleObject): Self = this.set("fontSize_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize_style: Self = this.set("fontSize_style", js.undefined)
    
    @scala.inline
    def setFont_defaultLabel(value: String): Self = this.set("font_defaultLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_defaultLabel: Self = this.set("font_defaultLabel", js.undefined)
    
    @scala.inline
    def setFont_names(value: String): Self = this.set("font_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_names: Self = this.set("font_names", js.undefined)
    
    @scala.inline
    def setFont_style(value: styleObject): Self = this.set("font_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont_style: Self = this.set("font_style", js.undefined)
    
    @scala.inline
    def setForceEnterMode(value: Boolean): Self = this.set("forceEnterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceEnterMode: Self = this.set("forceEnterMode", js.undefined)
    
    @scala.inline
    def setForcePasteAsPlainText(value: Boolean): Self = this.set("forcePasteAsPlainText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForcePasteAsPlainText: Self = this.set("forcePasteAsPlainText", js.undefined)
    
    @scala.inline
    def setForceSimpleAmpersand(value: Boolean): Self = this.set("forceSimpleAmpersand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSimpleAmpersand: Self = this.set("forceSimpleAmpersand", js.undefined)
    
    @scala.inline
    def setFormat_address(value: styleObject): Self = this.set("format_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_address: Self = this.set("format_address", js.undefined)
    
    @scala.inline
    def setFormat_div(value: styleObject): Self = this.set("format_div", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_div: Self = this.set("format_div", js.undefined)
    
    @scala.inline
    def setFormat_h1(value: styleObject): Self = this.set("format_h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h1: Self = this.set("format_h1", js.undefined)
    
    @scala.inline
    def setFormat_h2(value: styleObject): Self = this.set("format_h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h2: Self = this.set("format_h2", js.undefined)
    
    @scala.inline
    def setFormat_h3(value: styleObject): Self = this.set("format_h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h3: Self = this.set("format_h3", js.undefined)
    
    @scala.inline
    def setFormat_h4(value: styleObject): Self = this.set("format_h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h4: Self = this.set("format_h4", js.undefined)
    
    @scala.inline
    def setFormat_h5(value: styleObject): Self = this.set("format_h5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h5: Self = this.set("format_h5", js.undefined)
    
    @scala.inline
    def setFormat_h6(value: styleObject): Self = this.set("format_h6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_h6: Self = this.set("format_h6", js.undefined)
    
    @scala.inline
    def setFormat_p(value: styleObject): Self = this.set("format_p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_p: Self = this.set("format_p", js.undefined)
    
    @scala.inline
    def setFormat_pre(value: styleObject): Self = this.set("format_pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_pre: Self = this.set("format_pre", js.undefined)
    
    @scala.inline
    def setFormat_tags(value: String): Self = this.set("format_tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat_tags: Self = this.set("format_tags", js.undefined)
    
    @scala.inline
    def setFullPage(value: Boolean): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPage: Self = this.set("fullPage", js.undefined)
    
    @scala.inline
    def setGrayt_autoStartup(value: Boolean): Self = this.set("grayt_autoStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrayt_autoStartup: Self = this.set("grayt_autoStartup", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlEncodeOutput(value: Boolean): Self = this.set("htmlEncodeOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlEncodeOutput: Self = this.set("htmlEncodeOutput", js.undefined)
    
    @scala.inline
    def setIgnoreEmptyParagraph(value: Boolean): Self = this.set("ignoreEmptyParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEmptyParagraph: Self = this.set("ignoreEmptyParagraph", js.undefined)
    
    @scala.inline
    def setImage2_alignClassesVarargs(value: String*): Self = this.set("image2_alignClasses", js.Array(value :_*))
    
    @scala.inline
    def setImage2_alignClasses(value: js.Array[String]): Self = this.set("image2_alignClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage2_alignClasses: Self = this.set("image2_alignClasses", js.undefined)
    
    @scala.inline
    def setImage2_altRequired(value: Boolean): Self = this.set("image2_altRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage2_altRequired: Self = this.set("image2_altRequired", js.undefined)
    
    @scala.inline
    def setImage2_captionedClass(value: String): Self = this.set("image2_captionedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage2_captionedClass: Self = this.set("image2_captionedClass", js.undefined)
    
    @scala.inline
    def setImage2_disableResizer(value: Boolean): Self = this.set("image2_disableResizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage2_disableResizer: Self = this.set("image2_disableResizer", js.undefined)
    
    @scala.inline
    def setImage2_prefillDimensions(value: Boolean): Self = this.set("image2_prefillDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage2_prefillDimensions: Self = this.set("image2_prefillDimensions", js.undefined)
    
    @scala.inline
    def setImageUploadUrl(value: String): Self = this.set("imageUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUploadUrl: Self = this.set("imageUploadUrl", js.undefined)
    
    @scala.inline
    def setImage_prefillDimensions(value: Boolean): Self = this.set("image_prefillDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_prefillDimensions: Self = this.set("image_prefillDimensions", js.undefined)
    
    @scala.inline
    def setImage_previewText(value: String): Self = this.set("image_previewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_previewText: Self = this.set("image_previewText", js.undefined)
    
    @scala.inline
    def setImage_removeLinkByEmptyUrl(value: Boolean): Self = this.set("image_removeLinkByEmptyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_removeLinkByEmptyUrl: Self = this.set("image_removeLinkByEmptyUrl", js.undefined)
    
    @scala.inline
    def setIndentClassesVarargs(value: String*): Self = this.set("indentClasses", js.Array(value :_*))
    
    @scala.inline
    def setIndentClasses(value: js.Array[String]): Self = this.set("indentClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentClasses: Self = this.set("indentClasses", js.undefined)
    
    @scala.inline
    def setIndentOffset(value: Double): Self = this.set("indentOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentOffset: Self = this.set("indentOffset", js.undefined)
    
    @scala.inline
    def setIndentUnit(value: String): Self = this.set("indentUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentUnit: Self = this.set("indentUnit", js.undefined)
    
    @scala.inline
    def setJqueryOverrideVal(value: Boolean): Self = this.set("jqueryOverrideVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJqueryOverrideVal: Self = this.set("jqueryOverrideVal", js.undefined)
    
    @scala.inline
    def setJustifyClassesVarargs(value: String*): Self = this.set("justifyClasses", js.Array(value :_*))
    
    @scala.inline
    def setJustifyClasses(value: js.Array[String]): Self = this.set("justifyClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustifyClasses: Self = this.set("justifyClasses", js.undefined)
    
    @scala.inline
    def setKeystrokesVarargs(value: (js.Tuple2[Double, String])*): Self = this.set("keystrokes", js.Array(value :_*))
    
    @scala.inline
    def setKeystrokes(value: js.Array[js.Tuple2[Double, String]]): Self = this.set("keystrokes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeystrokes: Self = this.set("keystrokes", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguage_listVarargs(value: String*): Self = this.set("language_list", js.Array(value :_*))
    
    @scala.inline
    def setLanguage_list(value: js.Array[String]): Self = this.set("language_list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage_list: Self = this.set("language_list", js.undefined)
    
    @scala.inline
    def setLinkJavaScriptLinksAllowed(value: Boolean): Self = this.set("linkJavaScriptLinksAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkJavaScriptLinksAllowed: Self = this.set("linkJavaScriptLinksAllowed", js.undefined)
    
    @scala.inline
    def setLinkShowAdvancedTab(value: Boolean): Self = this.set("linkShowAdvancedTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkShowAdvancedTab: Self = this.set("linkShowAdvancedTab", js.undefined)
    
    @scala.inline
    def setLinkShowTargetTab(value: Boolean): Self = this.set("linkShowTargetTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkShowTargetTab: Self = this.set("linkShowTargetTab", js.undefined)
    
    @scala.inline
    def setMagicline_color(value: String): Self = this.set("magicline_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_color: Self = this.set("magicline_color", js.undefined)
    
    @scala.inline
    def setMagicline_everywhere(value: Boolean): Self = this.set("magicline_everywhere", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_everywhere: Self = this.set("magicline_everywhere", js.undefined)
    
    @scala.inline
    def setMagicline_holdDistance(value: Double): Self = this.set("magicline_holdDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_holdDistance: Self = this.set("magicline_holdDistance", js.undefined)
    
    @scala.inline
    def setMagicline_keystrokeNext(value: Double): Self = this.set("magicline_keystrokeNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_keystrokeNext: Self = this.set("magicline_keystrokeNext", js.undefined)
    
    @scala.inline
    def setMagicline_keystrokePrevious(value: Double): Self = this.set("magicline_keystrokePrevious", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_keystrokePrevious: Self = this.set("magicline_keystrokePrevious", js.undefined)
    
    @scala.inline
    def setMagicline_tabuListVarargs(value: String*): Self = this.set("magicline_tabuList", js.Array(value :_*))
    
    @scala.inline
    def setMagicline_tabuList(value: js.Array[String]): Self = this.set("magicline_tabuList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_tabuList: Self = this.set("magicline_tabuList", js.undefined)
    
    @scala.inline
    def setMagicline_triggerOffset(value: Double): Self = this.set("magicline_triggerOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagicline_triggerOffset: Self = this.set("magicline_triggerOffset", js.undefined)
    
    @scala.inline
    def setMathJaxClass(value: String): Self = this.set("mathJaxClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathJaxClass: Self = this.set("mathJaxClass", js.undefined)
    
    @scala.inline
    def setMathJaxLib(value: String): Self = this.set("mathJaxLib", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathJaxLib: Self = this.set("mathJaxLib", js.undefined)
    
    @scala.inline
    def setMenu_groups(value: String): Self = this.set("menu_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu_groups: Self = this.set("menu_groups", js.undefined)
    
    @scala.inline
    def setMenu_subMenuDelay(value: Double): Self = this.set("menu_subMenuDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenu_subMenuDelay: Self = this.set("menu_subMenuDelay", js.undefined)
    
    @scala.inline
    def setNewpage_html(value: String): Self = this.set("newpage_html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewpage_html: Self = this.set("newpage_html", js.undefined)
    
    @scala.inline
    def setNotification_duration(value: Double): Self = this.set("notification_duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotification_duration: Self = this.set("notification_duration", js.undefined)
    
    @scala.inline
    def setOn(value: eventObject): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setPasteFilter(value: String): Self = this.set("pasteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFilter: Self = this.set("pasteFilter", js.undefined)
    
    @scala.inline
    def setPasteFromWordCleanupFile(value: String): Self = this.set("pasteFromWordCleanupFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWordCleanupFile: Self = this.set("pasteFromWordCleanupFile", js.undefined)
    
    @scala.inline
    def setPasteFromWordNumberedHeadingToList(value: Boolean): Self = this.set("pasteFromWordNumberedHeadingToList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWordNumberedHeadingToList: Self = this.set("pasteFromWordNumberedHeadingToList", js.undefined)
    
    @scala.inline
    def setPasteFromWordPromptCleanup(value: Boolean): Self = this.set("pasteFromWordPromptCleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWordPromptCleanup: Self = this.set("pasteFromWordPromptCleanup", js.undefined)
    
    @scala.inline
    def setPasteFromWordRemoveFontStyles(value: Boolean): Self = this.set("pasteFromWordRemoveFontStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWordRemoveFontStyles: Self = this.set("pasteFromWordRemoveFontStyles", js.undefined)
    
    @scala.inline
    def setPasteFromWordRemoveStyles(value: Boolean): Self = this.set("pasteFromWordRemoveStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWordRemoveStyles: Self = this.set("pasteFromWordRemoveStyles", js.undefined)
    
    @scala.inline
    def setPasteFromWord_heuristicsEdgeList(value: Boolean): Self = this.set("pasteFromWord_heuristicsEdgeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWord_heuristicsEdgeList: Self = this.set("pasteFromWord_heuristicsEdgeList", js.undefined)
    
    @scala.inline
    def setPasteFromWord_inlineImages(value: Boolean): Self = this.set("pasteFromWord_inlineImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteFromWord_inlineImages: Self = this.set("pasteFromWord_inlineImages", js.undefined)
    
    @scala.inline
    def setPlugins(value: String): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setProtectedSourceVarargs(value: RegExp*): Self = this.set("protectedSource", js.Array(value :_*))
    
    @scala.inline
    def setProtectedSource(value: js.Array[RegExp]): Self = this.set("protectedSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedSource: Self = this.set("protectedSource", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setRemoveButtons(value: String): Self = this.set("removeButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveButtons: Self = this.set("removeButtons", js.undefined)
    
    @scala.inline
    def setRemoveDialogTabs(value: String): Self = this.set("removeDialogTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveDialogTabs: Self = this.set("removeDialogTabs", js.undefined)
    
    @scala.inline
    def setRemoveFormatAttributes(value: String): Self = this.set("removeFormatAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFormatAttributes: Self = this.set("removeFormatAttributes", js.undefined)
    
    @scala.inline
    def setRemoveFormatTags(value: String): Self = this.set("removeFormatTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveFormatTags: Self = this.set("removeFormatTags", js.undefined)
    
    @scala.inline
    def setRemovePlugins(value: String): Self = this.set("removePlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemovePlugins: Self = this.set("removePlugins", js.undefined)
    
    @scala.inline
    def setResize_dir(value: String): Self = this.set("resize_dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_dir: Self = this.set("resize_dir", js.undefined)
    
    @scala.inline
    def setResize_enabled(value: Boolean): Self = this.set("resize_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_enabled: Self = this.set("resize_enabled", js.undefined)
    
    @scala.inline
    def setResize_maxHeight(value: Double): Self = this.set("resize_maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_maxHeight: Self = this.set("resize_maxHeight", js.undefined)
    
    @scala.inline
    def setResize_maxWidth(value: Double): Self = this.set("resize_maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_maxWidth: Self = this.set("resize_maxWidth", js.undefined)
    
    @scala.inline
    def setResize_minHeight(value: Double): Self = this.set("resize_minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_minHeight: Self = this.set("resize_minHeight", js.undefined)
    
    @scala.inline
    def setResize_minWidth(value: Double): Self = this.set("resize_minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize_minWidth: Self = this.set("resize_minWidth", js.undefined)
    
    @scala.inline
    def setScayt_autoStartup(value: Boolean): Self = this.set("scayt_autoStartup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_autoStartup: Self = this.set("scayt_autoStartup", js.undefined)
    
    @scala.inline
    def setScayt_contextCommands(value: String): Self = this.set("scayt_contextCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_contextCommands: Self = this.set("scayt_contextCommands", js.undefined)
    
    @scala.inline
    def setScayt_contextMenuItemsOrder(value: String): Self = this.set("scayt_contextMenuItemsOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_contextMenuItemsOrder: Self = this.set("scayt_contextMenuItemsOrder", js.undefined)
    
    @scala.inline
    def setScayt_customDictionaryIds(value: String): Self = this.set("scayt_customDictionaryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_customDictionaryIds: Self = this.set("scayt_customDictionaryIds", js.undefined)
    
    @scala.inline
    def setScayt_customerId(value: String): Self = this.set("scayt_customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_customerId: Self = this.set("scayt_customerId", js.undefined)
    
    @scala.inline
    def setScayt_disableOptionsStorageVarargs(value: String*): Self = this.set("scayt_disableOptionsStorage", js.Array(value :_*))
    
    @scala.inline
    def setScayt_disableOptionsStorage(value: String | js.Array[String]): Self = this.set("scayt_disableOptionsStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_disableOptionsStorage: Self = this.set("scayt_disableOptionsStorage", js.undefined)
    
    @scala.inline
    def setScayt_elementsToIgnore(value: String): Self = this.set("scayt_elementsToIgnore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_elementsToIgnore: Self = this.set("scayt_elementsToIgnore", js.undefined)
    
    @scala.inline
    def setScayt_handleCheckDirty(value: String): Self = this.set("scayt_handleCheckDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_handleCheckDirty: Self = this.set("scayt_handleCheckDirty", js.undefined)
    
    @scala.inline
    def setScayt_handleUndoRedo(value: String): Self = this.set("scayt_handleUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_handleUndoRedo: Self = this.set("scayt_handleUndoRedo", js.undefined)
    
    @scala.inline
    def setScayt_ignoreAllCapsWords(value: Boolean): Self = this.set("scayt_ignoreAllCapsWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_ignoreAllCapsWords: Self = this.set("scayt_ignoreAllCapsWords", js.undefined)
    
    @scala.inline
    def setScayt_ignoreDomainNames(value: Boolean): Self = this.set("scayt_ignoreDomainNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_ignoreDomainNames: Self = this.set("scayt_ignoreDomainNames", js.undefined)
    
    @scala.inline
    def setScayt_ignoreWordsWithMixedCases(value: Boolean): Self = this.set("scayt_ignoreWordsWithMixedCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_ignoreWordsWithMixedCases: Self = this.set("scayt_ignoreWordsWithMixedCases", js.undefined)
    
    @scala.inline
    def setScayt_ignoreWordsWithNumbers(value: Boolean): Self = this.set("scayt_ignoreWordsWithNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_ignoreWordsWithNumbers: Self = this.set("scayt_ignoreWordsWithNumbers", js.undefined)
    
    @scala.inline
    def setScayt_inlineModeImmediateMarkup(value: Boolean): Self = this.set("scayt_inlineModeImmediateMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_inlineModeImmediateMarkup: Self = this.set("scayt_inlineModeImmediateMarkup", js.undefined)
    
    @scala.inline
    def setScayt_maxSuggestions(value: Double): Self = this.set("scayt_maxSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_maxSuggestions: Self = this.set("scayt_maxSuggestions", js.undefined)
    
    @scala.inline
    def setScayt_minWordLength(value: Double): Self = this.set("scayt_minWordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_minWordLength: Self = this.set("scayt_minWordLength", js.undefined)
    
    @scala.inline
    def setScayt_moreSuggestions(value: String): Self = this.set("scayt_moreSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_moreSuggestions: Self = this.set("scayt_moreSuggestions", js.undefined)
    
    @scala.inline
    def setScayt_multiLanguageMode(value: Boolean): Self = this.set("scayt_multiLanguageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_multiLanguageMode: Self = this.set("scayt_multiLanguageMode", js.undefined)
    
    @scala.inline
    def setScayt_multiLanguageStyles(value: StringDictionary[js.Any]): Self = this.set("scayt_multiLanguageStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_multiLanguageStyles: Self = this.set("scayt_multiLanguageStyles", js.undefined)
    
    @scala.inline
    def setScayt_sLang(value: String): Self = this.set("scayt_sLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_sLang: Self = this.set("scayt_sLang", js.undefined)
    
    @scala.inline
    def setScayt_serviceHost(value: String): Self = this.set("scayt_serviceHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_serviceHost: Self = this.set("scayt_serviceHost", js.undefined)
    
    @scala.inline
    def setScayt_servicePath(value: String): Self = this.set("scayt_servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_servicePath: Self = this.set("scayt_servicePath", js.undefined)
    
    @scala.inline
    def setScayt_servicePort(value: String): Self = this.set("scayt_servicePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_servicePort: Self = this.set("scayt_servicePort", js.undefined)
    
    @scala.inline
    def setScayt_serviceProtocol(value: String): Self = this.set("scayt_serviceProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_serviceProtocol: Self = this.set("scayt_serviceProtocol", js.undefined)
    
    @scala.inline
    def setScayt_srcUrl(value: String): Self = this.set("scayt_srcUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_srcUrl: Self = this.set("scayt_srcUrl", js.undefined)
    
    @scala.inline
    def setScayt_uiTabs(value: String): Self = this.set("scayt_uiTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_uiTabs: Self = this.set("scayt_uiTabs", js.undefined)
    
    @scala.inline
    def setScayt_userDictionaryName(value: String): Self = this.set("scayt_userDictionaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScayt_userDictionaryName: Self = this.set("scayt_userDictionaryName", js.undefined)
    
    @scala.inline
    def setSharedSpaces(value: sharedSpace): Self = this.set("sharedSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedSpaces: Self = this.set("sharedSpaces", js.undefined)
    
    @scala.inline
    def setShiftEnterMode(value: Double): Self = this.set("shiftEnterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShiftEnterMode: Self = this.set("shiftEnterMode", js.undefined)
    
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    
    @scala.inline
    def setSmiley_columns(value: Double): Self = this.set("smiley_columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmiley_columns: Self = this.set("smiley_columns", js.undefined)
    
    @scala.inline
    def setSmiley_descriptionsVarargs(value: String*): Self = this.set("smiley_descriptions", js.Array(value :_*))
    
    @scala.inline
    def setSmiley_descriptions(value: js.Array[String]): Self = this.set("smiley_descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmiley_descriptions: Self = this.set("smiley_descriptions", js.undefined)
    
    @scala.inline
    def setSmiley_imagesVarargs(value: String*): Self = this.set("smiley_images", js.Array(value :_*))
    
    @scala.inline
    def setSmiley_images(value: js.Array[String]): Self = this.set("smiley_images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmiley_images: Self = this.set("smiley_images", js.undefined)
    
    @scala.inline
    def setSmiley_path(value: String): Self = this.set("smiley_path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmiley_path: Self = this.set("smiley_path", js.undefined)
    
    @scala.inline
    def setSourceAreaTabSize(value: Double): Self = this.set("sourceAreaTabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceAreaTabSize: Self = this.set("sourceAreaTabSize", js.undefined)
    
    @scala.inline
    def setSpecialCharsVarargs(value: (String | (js.Tuple2[String, String]))*): Self = this.set("specialChars", js.Array(value :_*))
    
    @scala.inline
    def setSpecialChars(value: js.Array[String | (js.Tuple2[String, String])]): Self = this.set("specialChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialChars: Self = this.set("specialChars", js.undefined)
    
    @scala.inline
    def setStartupFocus(value: String | Boolean): Self = this.set("startupFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupFocus: Self = this.set("startupFocus", js.undefined)
    
    @scala.inline
    def setStartupMode(value: String): Self = this.set("startupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupMode: Self = this.set("startupMode", js.undefined)
    
    @scala.inline
    def setStartupOutlineBlocks(value: Boolean): Self = this.set("startupOutlineBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupOutlineBlocks: Self = this.set("startupOutlineBlocks", js.undefined)
    
    @scala.inline
    def setStartupShowBorders(value: Boolean): Self = this.set("startupShowBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartupShowBorders: Self = this.set("startupShowBorders", js.undefined)
    
    @scala.inline
    def setStylesSetVarargs(value: styleObject*): Self = this.set("stylesSet", js.Array(value :_*))
    
    @scala.inline
    def setStylesSet(value: String | Boolean | js.Array[styleObject]): Self = this.set("stylesSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesSet: Self = this.set("stylesSet", js.undefined)
    
    @scala.inline
    def setStylesheetParser_skipSelectors(value: RegExp): Self = this.set("stylesheetParser_skipSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetParser_skipSelectors: Self = this.set("stylesheetParser_skipSelectors", js.undefined)
    
    @scala.inline
    def setStylesheetParser_validSelectors(value: RegExp): Self = this.set("stylesheetParser_validSelectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheetParser_validSelectors: Self = this.set("stylesheetParser_validSelectors", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    
    @scala.inline
    def setTabSpaces(value: Double): Self = this.set("tabSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSpaces: Self = this.set("tabSpaces", js.undefined)
    
    @scala.inline
    def setTemplates(value: String): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    
    @scala.inline
    def setTemplates_files(value: StringDictionary[js.Any]): Self = this.set("templates_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates_files: Self = this.set("templates_files", js.undefined)
    
    @scala.inline
    def setTemplates_replaceContent(value: Boolean): Self = this.set("templates_replaceContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates_replaceContent: Self = this.set("templates_replaceContent", js.undefined)
    
    @scala.inline
    def setTitle(value: String | Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToolbarVarargs(value: (String | js.Array[String] | Groups)*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: String | (js.Array[String | js.Array[String] | Groups])): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setToolbarNull: Self = this.set("toolbar", null)
    
    @scala.inline
    def setToolbarCanCollapse(value: Boolean): Self = this.set("toolbarCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarCanCollapse: Self = this.set("toolbarCanCollapse", js.undefined)
    
    @scala.inline
    def setToolbarGroupCycling(value: Boolean): Self = this.set("toolbarGroupCycling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarGroupCycling: Self = this.set("toolbarGroupCycling", js.undefined)
    
    @scala.inline
    def setToolbarGroupsVarargs(value: (toolbarGroups | String)*): Self = this.set("toolbarGroups", js.Array(value :_*))
    
    @scala.inline
    def setToolbarGroups(value: js.Array[toolbarGroups | String]): Self = this.set("toolbarGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarGroups: Self = this.set("toolbarGroups", js.undefined)
    
    @scala.inline
    def setToolbarLocation(value: String): Self = this.set("toolbarLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarLocation: Self = this.set("toolbarLocation", js.undefined)
    
    @scala.inline
    def setToolbarStartupExpanded(value: Boolean): Self = this.set("toolbarStartupExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarStartupExpanded: Self = this.set("toolbarStartupExpanded", js.undefined)
    
    @scala.inline
    def setUiColor(value: String): Self = this.set("uiColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUiColor: Self = this.set("uiColor", js.undefined)
    
    @scala.inline
    def setUndoStackSize(value: Double): Self = this.set("undoStackSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoStackSize: Self = this.set("undoStackSize", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
    
    @scala.inline
    def setUseComputedState(value: Boolean): Self = this.set("useComputedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseComputedState: Self = this.set("useComputedState", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWsc_cmd(value: String): Self = this.set("wsc_cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_cmd: Self = this.set("wsc_cmd", js.undefined)
    
    @scala.inline
    def setWsc_customDictionaryIds(value: String): Self = this.set("wsc_customDictionaryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_customDictionaryIds: Self = this.set("wsc_customDictionaryIds", js.undefined)
    
    @scala.inline
    def setWsc_customLoaderScript(value: String): Self = this.set("wsc_customLoaderScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_customLoaderScript: Self = this.set("wsc_customLoaderScript", js.undefined)
    
    @scala.inline
    def setWsc_customerId(value: String): Self = this.set("wsc_customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_customerId: Self = this.set("wsc_customerId", js.undefined)
    
    @scala.inline
    def setWsc_height(value: String): Self = this.set("wsc_height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_height: Self = this.set("wsc_height", js.undefined)
    
    @scala.inline
    def setWsc_lang(value: String): Self = this.set("wsc_lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_lang: Self = this.set("wsc_lang", js.undefined)
    
    @scala.inline
    def setWsc_left(value: String): Self = this.set("wsc_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_left: Self = this.set("wsc_left", js.undefined)
    
    @scala.inline
    def setWsc_top(value: String): Self = this.set("wsc_top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_top: Self = this.set("wsc_top", js.undefined)
    
    @scala.inline
    def setWsc_userDictionaryName(value: String): Self = this.set("wsc_userDictionaryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_userDictionaryName: Self = this.set("wsc_userDictionaryName", js.undefined)
    
    @scala.inline
    def setWsc_width(value: String): Self = this.set("wsc_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsc_width: Self = this.set("wsc_width", js.undefined)
  }
}
