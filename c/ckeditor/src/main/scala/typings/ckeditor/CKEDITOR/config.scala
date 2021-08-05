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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
trait config extends StObject {
  
  var allowedContent: js.UndefOr[Boolean | allowedContentRules] = js.undefined
  
  var autoEmbed_widget: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.undefined
  
  var autoGrow_bottomSpace: js.UndefOr[Double] = js.undefined
  
  var autoGrow_maxHeight: js.UndefOr[Double] = js.undefined
  
  var autoGrow_minHeight: js.UndefOr[Double] = js.undefined
  
  var autoGrow_onStartup: js.UndefOr[Boolean] = js.undefined
  
  var autoUpdateElement: js.UndefOr[Boolean] = js.undefined
  
  var baseFloatZIndex: js.UndefOr[Double] = js.undefined
  
  var baseHref: js.UndefOr[String] = js.undefined
  
  var basicEntities: js.UndefOr[Boolean] = js.undefined
  
  var blockedKeystrokes: js.UndefOr[js.Array[Double]] = js.undefined
  
  var bodyClass: js.UndefOr[String] = js.undefined
  
  var bodyId: js.UndefOr[String] = js.undefined
  
  var browserContextMenuOnCtrl: js.UndefOr[Boolean] = js.undefined
  
  var clipboard_defaultContentType: js.UndefOr[html | text] = js.undefined
  
  var clipboard_notificationDuration: js.UndefOr[Double] = js.undefined
  
  var cloudServices_tokenUrl: js.UndefOr[String] = js.undefined
  
  var cloudServices_uploadUrl: js.UndefOr[String] = js.undefined
  
  var coceSnippet_theme: js.UndefOr[String] = js.undefined
  
  var codeSnippetGeshi_url: js.UndefOr[String] = js.undefined
  
  var codeSnippet_codeClass: js.UndefOr[String] = js.undefined
  
  var codeSnippet_languages: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var colorButton_backStyle: js.UndefOr[styleObject] = js.undefined
  
  var colorButton_colors: js.UndefOr[String] = js.undefined
  
  var colorButton_colorsPerRow: js.UndefOr[Double] = js.undefined
  
  var colorButton_enableAutomatic: js.UndefOr[Boolean] = js.undefined
  
  var colorButton_enableMore: js.UndefOr[Boolean] = js.undefined
  
  var colorButton_foreStyle: js.UndefOr[styleObject] = js.undefined
  
  var colorButton_normalizeBackground: js.UndefOr[Boolean] = js.undefined
  
  var contentsCss: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var contentsLangDirection: js.UndefOr[String] = js.undefined
  
  var contentsLanguage: js.UndefOr[String] = js.undefined
  
  var copyFormatting_allowRules: js.UndefOr[String] = js.undefined
  
  var copyFormatting_allowedContexts: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var copyFormatting_keystrokeCopy: js.UndefOr[Double] = js.undefined
  
  var copyFormatting_keystrokePaste: js.UndefOr[Double] = js.undefined
  
  var copyFormatting_outerCursor: js.UndefOr[Boolean] = js.undefined
  
  var coreStyles_bold: js.UndefOr[styleObject] = js.undefined
  
  var coreStyles_italic: js.UndefOr[styleObject] = js.undefined
  
  var coreStyles_strike: js.UndefOr[styleObject] = js.undefined
  
  var coreStyles_subscript: js.UndefOr[styleObject] = js.undefined
  
  var coreStyles_superscript: js.UndefOr[styleObject] = js.undefined
  
  var coreStyles_underline: js.UndefOr[styleObject] = js.undefined
  
  var customConfig: js.UndefOr[String] = js.undefined
  
  var dataIndentationChars: js.UndefOr[String] = js.undefined
  
  var defaultLanguage: js.UndefOr[String] = js.undefined
  
  var devtools_styles: js.UndefOr[String] = js.undefined
  
  var devtools_textCallback: js.UndefOr[
    js.Function4[
      /* editor */ editor, 
      /* dialog */ dialog, 
      /* element */ element, 
      /* tabName */ String, 
      String
    ]
  ] = js.undefined
  
  var dialog_backgroundCoverColor: js.UndefOr[String] = js.undefined
  
  var dialog_backgroundCoverOpacity: js.UndefOr[Double] = js.undefined
  
  var dialog_buttonsOrder: js.UndefOr[String] = js.undefined
  
  var dialog_magnetDistance: js.UndefOr[Double] = js.undefined
  
  var dialog_noConfirmCancel: js.UndefOr[Boolean] = js.undefined
  
  var dialog_startupFocusTab: js.UndefOr[Boolean] = js.undefined
  
  var disableNativeObjectResizing: js.UndefOr[Boolean] = js.undefined
  
  var disableNativeReadonlyStyling: js.UndefOr[Boolean] = js.undefined
  
  var disableNativeSpellChecker: js.UndefOr[Boolean] = js.undefined
  
  var disableNativeTableHandles: js.UndefOr[Boolean] = js.undefined
  
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.undefined
  
  var div_wrapTable: js.UndefOr[Boolean] = js.undefined
  
  var docType: js.UndefOr[String] = js.undefined
  
  var easyimage_class: js.UndefOr[String] = js.undefined
  
  var easyimage_defaultStyle: js.UndefOr[String] = js.undefined
  
  var easyimage_styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var easyimage_toolbar: js.UndefOr[js.Array[String] | String] = js.undefined
  
  var emailProtection: js.UndefOr[String] = js.undefined
  
  var embed_provider: js.UndefOr[String] = js.undefined
  
  var emoji_emojiListUrl: js.UndefOr[String] = js.undefined
  
  var emoji_minChars: js.UndefOr[Double] = js.undefined
  
  var enableContextMenu: js.UndefOr[Boolean] = js.undefined
  
  var enableTabKeyTools: js.UndefOr[Boolean] = js.undefined
  
  var enterMode: js.UndefOr[Double] = js.undefined
  
  var entities: js.UndefOr[Boolean] = js.undefined
  
  var entities_additional: js.UndefOr[String] = js.undefined
  
  var entities_greek: js.UndefOr[Boolean] = js.undefined
  
  var entities_latin: js.UndefOr[Boolean] = js.undefined
  
  var entities_processNumerical: js.UndefOr[Boolean | String] = js.undefined
  
  var extraAllowedContent: js.UndefOr[allowedContentRules] = js.undefined
  
  var extraPlugins: js.UndefOr[String] = js.undefined
  
  var fileTools_defaultFileName: js.UndefOr[String] = js.undefined
  
  var fileTools_requestHeaders: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var filebrowserBrowseUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserFlashBrowseUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserFlashUploadUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserImageBrowseLinkUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserImageBrowseUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserImageUploadUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserUploadMethod: js.UndefOr[String] = js.undefined
  
  var filebrowserUploadUrl: js.UndefOr[String] = js.undefined
  
  var filebrowserWindowFeatures: js.UndefOr[String] = js.undefined
  
  var filebrowserWindowHeight: js.UndefOr[Double | String] = js.undefined
  
  var filebrowserWindowWidth: js.UndefOr[Double | String] = js.undefined
  
  var fillEmptyBlocks: js.UndefOr[
    Boolean | (js.Function1[/* element */ typings.ckeditor.CKEDITOR.htmlParser.element, Boolean])
  ] = js.undefined
  
  var find_highlight: js.UndefOr[styleObject] = js.undefined
  
  var flashAddEmbedTag: js.UndefOr[Boolean] = js.undefined
  
  var flashConvertOnEdit: js.UndefOr[Boolean] = js.undefined
  
  var flashEmbedTagOnly: js.UndefOr[Boolean] = js.undefined
  
  var floatSpaceDockedOffsetX: js.UndefOr[Double] = js.undefined
  
  var floatSpaceDockedOffsetY: js.UndefOr[Double] = js.undefined
  
  var floatSpacePinnedOffsetX: js.UndefOr[Double] = js.undefined
  
  var floatSpacePinnedOffsetY: js.UndefOr[Double] = js.undefined
  
  var floatSpacePreferRight: js.UndefOr[Boolean] = js.undefined
  
  var fontSize_defaultLabel: js.UndefOr[String] = js.undefined
  
  var fontSize_sizes: js.UndefOr[String] = js.undefined
  
  var fontSize_style: js.UndefOr[styleObject] = js.undefined
  
  var font_defaultLabel: js.UndefOr[String] = js.undefined
  
  var font_names: js.UndefOr[String] = js.undefined
  
  var font_style: js.UndefOr[styleObject] = js.undefined
  
  var forceEnterMode: js.UndefOr[Boolean] = js.undefined
  
  var forcePasteAsPlainText: js.UndefOr[Boolean] = js.undefined
  
  var forceSimpleAmpersand: js.UndefOr[Boolean] = js.undefined
  
  var format_address: js.UndefOr[styleObject] = js.undefined
  
  var format_div: js.UndefOr[styleObject] = js.undefined
  
  var format_h1: js.UndefOr[styleObject] = js.undefined
  
  var format_h2: js.UndefOr[styleObject] = js.undefined
  
  var format_h3: js.UndefOr[styleObject] = js.undefined
  
  var format_h4: js.UndefOr[styleObject] = js.undefined
  
  var format_h5: js.UndefOr[styleObject] = js.undefined
  
  var format_h6: js.UndefOr[styleObject] = js.undefined
  
  var format_p: js.UndefOr[styleObject] = js.undefined
  
  var format_pre: js.UndefOr[styleObject] = js.undefined
  
  var format_tags: js.UndefOr[String] = js.undefined
  
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  var grayt_autoStartup: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[String | Double] = js.undefined
  
  var htmlEncodeOutput: js.UndefOr[Boolean] = js.undefined
  
  var ignoreEmptyParagraph: js.UndefOr[Boolean] = js.undefined
  
  var image2_alignClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var image2_altRequired: js.UndefOr[Boolean] = js.undefined
  
  var image2_captionedClass: js.UndefOr[String] = js.undefined
  
  var image2_disableResizer: js.UndefOr[Boolean] = js.undefined
  
  var image2_prefillDimensions: js.UndefOr[Boolean] = js.undefined
  
  var imageUploadUrl: js.UndefOr[String] = js.undefined
  
  var image_prefillDimensions: js.UndefOr[Boolean] = js.undefined
  
  var image_previewText: js.UndefOr[String] = js.undefined
  
  var image_removeLinkByEmptyUrl: js.UndefOr[Boolean] = js.undefined
  
  var indentClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var indentOffset: js.UndefOr[Double] = js.undefined
  
  var indentUnit: js.UndefOr[String] = js.undefined
  
  var jqueryOverrideVal: js.UndefOr[Boolean] = js.undefined
  
  var justifyClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var keystrokes: js.UndefOr[js.Array[js.Tuple2[Double, String]]] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var language_list: js.UndefOr[js.Array[String]] = js.undefined
  
  var linkJavaScriptLinksAllowed: js.UndefOr[Boolean] = js.undefined
  
  var linkShowAdvancedTab: js.UndefOr[Boolean] = js.undefined
  
  var linkShowTargetTab: js.UndefOr[Boolean] = js.undefined
  
  var magicline_color: js.UndefOr[String] = js.undefined
  
  var magicline_everywhere: js.UndefOr[Boolean] = js.undefined
  
  var magicline_holdDistance: js.UndefOr[Double] = js.undefined
  
  var magicline_keystrokeNext: js.UndefOr[Double] = js.undefined
  
  var magicline_keystrokePrevious: js.UndefOr[Double] = js.undefined
  
  var magicline_tabuList: js.UndefOr[js.Array[String]] = js.undefined
  
  var magicline_triggerOffset: js.UndefOr[Double] = js.undefined
  
  var mathJaxClass: js.UndefOr[String] = js.undefined
  
  var mathJaxLib: js.UndefOr[String] = js.undefined
  
  var menu_groups: js.UndefOr[String] = js.undefined
  
  var menu_subMenuDelay: js.UndefOr[Double] = js.undefined
  
  var newpage_html: js.UndefOr[String] = js.undefined
  
  var notification_duration: js.UndefOr[Double] = js.undefined
  
  var on: js.UndefOr[eventObject] = js.undefined
  
  var pasteFilter: js.UndefOr[String] = js.undefined
  
  var pasteFromWordCleanupFile: js.UndefOr[String] = js.undefined
  
  var pasteFromWordNumberedHeadingToList: js.UndefOr[Boolean] = js.undefined
  
  var pasteFromWordPromptCleanup: js.UndefOr[Boolean] = js.undefined
  
  var pasteFromWordRemoveFontStyles: js.UndefOr[Boolean] = js.undefined
  
  var pasteFromWordRemoveStyles: js.UndefOr[Boolean] = js.undefined
  
  var pasteFromWord_heuristicsEdgeList: js.UndefOr[Boolean] = js.undefined
  
  var pasteFromWord_inlineImages: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[String] = js.undefined
  
  var protectedSource: js.UndefOr[js.Array[RegExp]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var removeButtons: js.UndefOr[String] = js.undefined
  
  var removeDialogTabs: js.UndefOr[String] = js.undefined
  
  var removeFormatAttributes: js.UndefOr[String] = js.undefined
  
  var removeFormatTags: js.UndefOr[String] = js.undefined
  
  var removePlugins: js.UndefOr[String] = js.undefined
  
  var resize_dir: js.UndefOr[String] = js.undefined
  
  var resize_enabled: js.UndefOr[Boolean] = js.undefined
  
  var resize_maxHeight: js.UndefOr[Double] = js.undefined
  
  var resize_maxWidth: js.UndefOr[Double] = js.undefined
  
  var resize_minHeight: js.UndefOr[Double] = js.undefined
  
  var resize_minWidth: js.UndefOr[Double] = js.undefined
  
  var scayt_autoStartup: js.UndefOr[Boolean] = js.undefined
  
  var scayt_contextCommands: js.UndefOr[String] = js.undefined
  
  var scayt_contextMenuItemsOrder: js.UndefOr[String] = js.undefined
  
  var scayt_customDictionaryIds: js.UndefOr[String] = js.undefined
  
  var scayt_customerId: js.UndefOr[String] = js.undefined
  
  var scayt_disableOptionsStorage: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var scayt_elementsToIgnore: js.UndefOr[String] = js.undefined
  
  var scayt_handleCheckDirty: js.UndefOr[String] = js.undefined
  
  var scayt_handleUndoRedo: js.UndefOr[String] = js.undefined
  
  var scayt_ignoreAllCapsWords: js.UndefOr[Boolean] = js.undefined
  
  var scayt_ignoreDomainNames: js.UndefOr[Boolean] = js.undefined
  
  var scayt_ignoreWordsWithMixedCases: js.UndefOr[Boolean] = js.undefined
  
  var scayt_ignoreWordsWithNumbers: js.UndefOr[Boolean] = js.undefined
  
  var scayt_inlineModeImmediateMarkup: js.UndefOr[Boolean] = js.undefined
  
  var scayt_maxSuggestions: js.UndefOr[Double] = js.undefined
  
  var scayt_minWordLength: js.UndefOr[Double] = js.undefined
  
  var scayt_moreSuggestions: js.UndefOr[String] = js.undefined
  
  var scayt_multiLanguageMode: js.UndefOr[Boolean] = js.undefined
  
  var scayt_multiLanguageStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var scayt_sLang: js.UndefOr[String] = js.undefined
  
  var scayt_serviceHost: js.UndefOr[String] = js.undefined
  
  var scayt_servicePath: js.UndefOr[String] = js.undefined
  
  var scayt_servicePort: js.UndefOr[String] = js.undefined
  
  var scayt_serviceProtocol: js.UndefOr[String] = js.undefined
  
  var scayt_srcUrl: js.UndefOr[String] = js.undefined
  
  var scayt_uiTabs: js.UndefOr[String] = js.undefined
  
  var scayt_userDictionaryName: js.UndefOr[String] = js.undefined
  
  var sharedSpaces: js.UndefOr[sharedSpace] = js.undefined
  
  var shiftEnterMode: js.UndefOr[Double] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var smiley_columns: js.UndefOr[Double] = js.undefined
  
  var smiley_descriptions: js.UndefOr[js.Array[String]] = js.undefined
  
  var smiley_images: js.UndefOr[js.Array[String]] = js.undefined
  
  var smiley_path: js.UndefOr[String] = js.undefined
  
  var sourceAreaTabSize: js.UndefOr[Double] = js.undefined
  
  var specialChars: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.undefined
  
  var startupFocus: js.UndefOr[String | Boolean] = js.undefined
  
  var startupMode: js.UndefOr[String] = js.undefined
  
  var startupOutlineBlocks: js.UndefOr[Boolean] = js.undefined
  
  var startupShowBorders: js.UndefOr[Boolean] = js.undefined
  
  var stylesSet: js.UndefOr[String | Boolean | js.Array[styleObject]] = js.undefined
  
  var stylesheetParser_skipSelectors: js.UndefOr[RegExp] = js.undefined
  
  var stylesheetParser_validSelectors: js.UndefOr[RegExp] = js.undefined
  
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  var tabSpaces: js.UndefOr[Double] = js.undefined
  
  var templates: js.UndefOr[String] = js.undefined
  
  var templates_files: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  var templates_replaceContent: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String | Boolean] = js.undefined
  
  var toolbar: js.UndefOr[String | (js.Array[String | js.Array[String] | Groups]) | Null] = js.undefined
  
  var toolbarCanCollapse: js.UndefOr[Boolean] = js.undefined
  
  var toolbarGroupCycling: js.UndefOr[Boolean] = js.undefined
  
  var toolbarGroups: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.toolbarGroups | String]] = js.undefined
  
  var toolbarLocation: js.UndefOr[String] = js.undefined
  
  var toolbarStartupExpanded: js.UndefOr[Boolean] = js.undefined
  
  var uiColor: js.UndefOr[String] = js.undefined
  
  var undoStackSize: js.UndefOr[Double] = js.undefined
  
  var uploadUrl: js.UndefOr[String] = js.undefined
  
  var useComputedState: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[String | Double] = js.undefined
  
  var wsc_cmd: js.UndefOr[String] = js.undefined
  
  var wsc_customDictionaryIds: js.UndefOr[String] = js.undefined
  
  var wsc_customLoaderScript: js.UndefOr[String] = js.undefined
  
  var wsc_customerId: js.UndefOr[String] = js.undefined
  
  var wsc_height: js.UndefOr[String] = js.undefined
  
  var wsc_lang: js.UndefOr[String] = js.undefined
  
  var wsc_left: js.UndefOr[String] = js.undefined
  
  var wsc_top: js.UndefOr[String] = js.undefined
  
  var wsc_userDictionaryName: js.UndefOr[String] = js.undefined
  
  var wsc_width: js.UndefOr[String] = js.undefined
}
object config {
  
  inline def apply(): config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[config]
  }
  
  extension [Self <: config](x: Self) {
    
    inline def setAllowedContent(value: Boolean | allowedContentRules): Self = StObject.set(x, "allowedContent", value.asInstanceOf[js.Any])
    
    inline def setAllowedContentUndefined: Self = StObject.set(x, "allowedContent", js.undefined)
    
    inline def setAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "allowedContent", js.Array(value :_*))
    
    inline def setAutoEmbed_widget(value: String | (js.Function1[/* url */ String, String])): Self = StObject.set(x, "autoEmbed_widget", value.asInstanceOf[js.Any])
    
    inline def setAutoEmbed_widgetFunction1(value: /* url */ String => String): Self = StObject.set(x, "autoEmbed_widget", js.Any.fromFunction1(value))
    
    inline def setAutoEmbed_widgetUndefined: Self = StObject.set(x, "autoEmbed_widget", js.undefined)
    
    inline def setAutoGrow_bottomSpace(value: Double): Self = StObject.set(x, "autoGrow_bottomSpace", value.asInstanceOf[js.Any])
    
    inline def setAutoGrow_bottomSpaceUndefined: Self = StObject.set(x, "autoGrow_bottomSpace", js.undefined)
    
    inline def setAutoGrow_maxHeight(value: Double): Self = StObject.set(x, "autoGrow_maxHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoGrow_maxHeightUndefined: Self = StObject.set(x, "autoGrow_maxHeight", js.undefined)
    
    inline def setAutoGrow_minHeight(value: Double): Self = StObject.set(x, "autoGrow_minHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoGrow_minHeightUndefined: Self = StObject.set(x, "autoGrow_minHeight", js.undefined)
    
    inline def setAutoGrow_onStartup(value: Boolean): Self = StObject.set(x, "autoGrow_onStartup", value.asInstanceOf[js.Any])
    
    inline def setAutoGrow_onStartupUndefined: Self = StObject.set(x, "autoGrow_onStartup", js.undefined)
    
    inline def setAutoUpdateElement(value: Boolean): Self = StObject.set(x, "autoUpdateElement", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateElementUndefined: Self = StObject.set(x, "autoUpdateElement", js.undefined)
    
    inline def setBaseFloatZIndex(value: Double): Self = StObject.set(x, "baseFloatZIndex", value.asInstanceOf[js.Any])
    
    inline def setBaseFloatZIndexUndefined: Self = StObject.set(x, "baseFloatZIndex", js.undefined)
    
    inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
    
    inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
    
    inline def setBasicEntities(value: Boolean): Self = StObject.set(x, "basicEntities", value.asInstanceOf[js.Any])
    
    inline def setBasicEntitiesUndefined: Self = StObject.set(x, "basicEntities", js.undefined)
    
    inline def setBlockedKeystrokes(value: js.Array[Double]): Self = StObject.set(x, "blockedKeystrokes", value.asInstanceOf[js.Any])
    
    inline def setBlockedKeystrokesUndefined: Self = StObject.set(x, "blockedKeystrokes", js.undefined)
    
    inline def setBlockedKeystrokesVarargs(value: Double*): Self = StObject.set(x, "blockedKeystrokes", js.Array(value :_*))
    
    inline def setBodyClass(value: String): Self = StObject.set(x, "bodyClass", value.asInstanceOf[js.Any])
    
    inline def setBodyClassUndefined: Self = StObject.set(x, "bodyClass", js.undefined)
    
    inline def setBodyId(value: String): Self = StObject.set(x, "bodyId", value.asInstanceOf[js.Any])
    
    inline def setBodyIdUndefined: Self = StObject.set(x, "bodyId", js.undefined)
    
    inline def setBrowserContextMenuOnCtrl(value: Boolean): Self = StObject.set(x, "browserContextMenuOnCtrl", value.asInstanceOf[js.Any])
    
    inline def setBrowserContextMenuOnCtrlUndefined: Self = StObject.set(x, "browserContextMenuOnCtrl", js.undefined)
    
    inline def setClipboard_defaultContentType(value: html | text): Self = StObject.set(x, "clipboard_defaultContentType", value.asInstanceOf[js.Any])
    
    inline def setClipboard_defaultContentTypeUndefined: Self = StObject.set(x, "clipboard_defaultContentType", js.undefined)
    
    inline def setClipboard_notificationDuration(value: Double): Self = StObject.set(x, "clipboard_notificationDuration", value.asInstanceOf[js.Any])
    
    inline def setClipboard_notificationDurationUndefined: Self = StObject.set(x, "clipboard_notificationDuration", js.undefined)
    
    inline def setCloudServices_tokenUrl(value: String): Self = StObject.set(x, "cloudServices_tokenUrl", value.asInstanceOf[js.Any])
    
    inline def setCloudServices_tokenUrlUndefined: Self = StObject.set(x, "cloudServices_tokenUrl", js.undefined)
    
    inline def setCloudServices_uploadUrl(value: String): Self = StObject.set(x, "cloudServices_uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setCloudServices_uploadUrlUndefined: Self = StObject.set(x, "cloudServices_uploadUrl", js.undefined)
    
    inline def setCoceSnippet_theme(value: String): Self = StObject.set(x, "coceSnippet_theme", value.asInstanceOf[js.Any])
    
    inline def setCoceSnippet_themeUndefined: Self = StObject.set(x, "coceSnippet_theme", js.undefined)
    
    inline def setCodeSnippetGeshi_url(value: String): Self = StObject.set(x, "codeSnippetGeshi_url", value.asInstanceOf[js.Any])
    
    inline def setCodeSnippetGeshi_urlUndefined: Self = StObject.set(x, "codeSnippetGeshi_url", js.undefined)
    
    inline def setCodeSnippet_codeClass(value: String): Self = StObject.set(x, "codeSnippet_codeClass", value.asInstanceOf[js.Any])
    
    inline def setCodeSnippet_codeClassUndefined: Self = StObject.set(x, "codeSnippet_codeClass", js.undefined)
    
    inline def setCodeSnippet_languages(value: StringDictionary[js.Any]): Self = StObject.set(x, "codeSnippet_languages", value.asInstanceOf[js.Any])
    
    inline def setCodeSnippet_languagesUndefined: Self = StObject.set(x, "codeSnippet_languages", js.undefined)
    
    inline def setColorButton_backStyle(value: styleObject): Self = StObject.set(x, "colorButton_backStyle", value.asInstanceOf[js.Any])
    
    inline def setColorButton_backStyleUndefined: Self = StObject.set(x, "colorButton_backStyle", js.undefined)
    
    inline def setColorButton_colors(value: String): Self = StObject.set(x, "colorButton_colors", value.asInstanceOf[js.Any])
    
    inline def setColorButton_colorsPerRow(value: Double): Self = StObject.set(x, "colorButton_colorsPerRow", value.asInstanceOf[js.Any])
    
    inline def setColorButton_colorsPerRowUndefined: Self = StObject.set(x, "colorButton_colorsPerRow", js.undefined)
    
    inline def setColorButton_colorsUndefined: Self = StObject.set(x, "colorButton_colors", js.undefined)
    
    inline def setColorButton_enableAutomatic(value: Boolean): Self = StObject.set(x, "colorButton_enableAutomatic", value.asInstanceOf[js.Any])
    
    inline def setColorButton_enableAutomaticUndefined: Self = StObject.set(x, "colorButton_enableAutomatic", js.undefined)
    
    inline def setColorButton_enableMore(value: Boolean): Self = StObject.set(x, "colorButton_enableMore", value.asInstanceOf[js.Any])
    
    inline def setColorButton_enableMoreUndefined: Self = StObject.set(x, "colorButton_enableMore", js.undefined)
    
    inline def setColorButton_foreStyle(value: styleObject): Self = StObject.set(x, "colorButton_foreStyle", value.asInstanceOf[js.Any])
    
    inline def setColorButton_foreStyleUndefined: Self = StObject.set(x, "colorButton_foreStyle", js.undefined)
    
    inline def setColorButton_normalizeBackground(value: Boolean): Self = StObject.set(x, "colorButton_normalizeBackground", value.asInstanceOf[js.Any])
    
    inline def setColorButton_normalizeBackgroundUndefined: Self = StObject.set(x, "colorButton_normalizeBackground", js.undefined)
    
    inline def setContentsCss(value: String | js.Array[String]): Self = StObject.set(x, "contentsCss", value.asInstanceOf[js.Any])
    
    inline def setContentsCssUndefined: Self = StObject.set(x, "contentsCss", js.undefined)
    
    inline def setContentsCssVarargs(value: String*): Self = StObject.set(x, "contentsCss", js.Array(value :_*))
    
    inline def setContentsLangDirection(value: String): Self = StObject.set(x, "contentsLangDirection", value.asInstanceOf[js.Any])
    
    inline def setContentsLangDirectionUndefined: Self = StObject.set(x, "contentsLangDirection", js.undefined)
    
    inline def setContentsLanguage(value: String): Self = StObject.set(x, "contentsLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentsLanguageUndefined: Self = StObject.set(x, "contentsLanguage", js.undefined)
    
    inline def setCopyFormatting_allowRules(value: String): Self = StObject.set(x, "copyFormatting_allowRules", value.asInstanceOf[js.Any])
    
    inline def setCopyFormatting_allowRulesUndefined: Self = StObject.set(x, "copyFormatting_allowRules", js.undefined)
    
    inline def setCopyFormatting_allowedContexts(value: Boolean | js.Array[String]): Self = StObject.set(x, "copyFormatting_allowedContexts", value.asInstanceOf[js.Any])
    
    inline def setCopyFormatting_allowedContextsUndefined: Self = StObject.set(x, "copyFormatting_allowedContexts", js.undefined)
    
    inline def setCopyFormatting_allowedContextsVarargs(value: String*): Self = StObject.set(x, "copyFormatting_allowedContexts", js.Array(value :_*))
    
    inline def setCopyFormatting_keystrokeCopy(value: Double): Self = StObject.set(x, "copyFormatting_keystrokeCopy", value.asInstanceOf[js.Any])
    
    inline def setCopyFormatting_keystrokeCopyUndefined: Self = StObject.set(x, "copyFormatting_keystrokeCopy", js.undefined)
    
    inline def setCopyFormatting_keystrokePaste(value: Double): Self = StObject.set(x, "copyFormatting_keystrokePaste", value.asInstanceOf[js.Any])
    
    inline def setCopyFormatting_keystrokePasteUndefined: Self = StObject.set(x, "copyFormatting_keystrokePaste", js.undefined)
    
    inline def setCopyFormatting_outerCursor(value: Boolean): Self = StObject.set(x, "copyFormatting_outerCursor", value.asInstanceOf[js.Any])
    
    inline def setCopyFormatting_outerCursorUndefined: Self = StObject.set(x, "copyFormatting_outerCursor", js.undefined)
    
    inline def setCoreStyles_bold(value: styleObject): Self = StObject.set(x, "coreStyles_bold", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_boldUndefined: Self = StObject.set(x, "coreStyles_bold", js.undefined)
    
    inline def setCoreStyles_italic(value: styleObject): Self = StObject.set(x, "coreStyles_italic", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_italicUndefined: Self = StObject.set(x, "coreStyles_italic", js.undefined)
    
    inline def setCoreStyles_strike(value: styleObject): Self = StObject.set(x, "coreStyles_strike", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_strikeUndefined: Self = StObject.set(x, "coreStyles_strike", js.undefined)
    
    inline def setCoreStyles_subscript(value: styleObject): Self = StObject.set(x, "coreStyles_subscript", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_subscriptUndefined: Self = StObject.set(x, "coreStyles_subscript", js.undefined)
    
    inline def setCoreStyles_superscript(value: styleObject): Self = StObject.set(x, "coreStyles_superscript", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_superscriptUndefined: Self = StObject.set(x, "coreStyles_superscript", js.undefined)
    
    inline def setCoreStyles_underline(value: styleObject): Self = StObject.set(x, "coreStyles_underline", value.asInstanceOf[js.Any])
    
    inline def setCoreStyles_underlineUndefined: Self = StObject.set(x, "coreStyles_underline", js.undefined)
    
    inline def setCustomConfig(value: String): Self = StObject.set(x, "customConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomConfigUndefined: Self = StObject.set(x, "customConfig", js.undefined)
    
    inline def setDataIndentationChars(value: String): Self = StObject.set(x, "dataIndentationChars", value.asInstanceOf[js.Any])
    
    inline def setDataIndentationCharsUndefined: Self = StObject.set(x, "dataIndentationChars", js.undefined)
    
    inline def setDefaultLanguage(value: String): Self = StObject.set(x, "defaultLanguage", value.asInstanceOf[js.Any])
    
    inline def setDefaultLanguageUndefined: Self = StObject.set(x, "defaultLanguage", js.undefined)
    
    inline def setDevtools_styles(value: String): Self = StObject.set(x, "devtools_styles", value.asInstanceOf[js.Any])
    
    inline def setDevtools_stylesUndefined: Self = StObject.set(x, "devtools_styles", js.undefined)
    
    inline def setDevtools_textCallback(
      value: (/* editor */ editor, /* dialog */ dialog, /* element */ element, /* tabName */ String) => String
    ): Self = StObject.set(x, "devtools_textCallback", js.Any.fromFunction4(value))
    
    inline def setDevtools_textCallbackUndefined: Self = StObject.set(x, "devtools_textCallback", js.undefined)
    
    inline def setDialog_backgroundCoverColor(value: String): Self = StObject.set(x, "dialog_backgroundCoverColor", value.asInstanceOf[js.Any])
    
    inline def setDialog_backgroundCoverColorUndefined: Self = StObject.set(x, "dialog_backgroundCoverColor", js.undefined)
    
    inline def setDialog_backgroundCoverOpacity(value: Double): Self = StObject.set(x, "dialog_backgroundCoverOpacity", value.asInstanceOf[js.Any])
    
    inline def setDialog_backgroundCoverOpacityUndefined: Self = StObject.set(x, "dialog_backgroundCoverOpacity", js.undefined)
    
    inline def setDialog_buttonsOrder(value: String): Self = StObject.set(x, "dialog_buttonsOrder", value.asInstanceOf[js.Any])
    
    inline def setDialog_buttonsOrderUndefined: Self = StObject.set(x, "dialog_buttonsOrder", js.undefined)
    
    inline def setDialog_magnetDistance(value: Double): Self = StObject.set(x, "dialog_magnetDistance", value.asInstanceOf[js.Any])
    
    inline def setDialog_magnetDistanceUndefined: Self = StObject.set(x, "dialog_magnetDistance", js.undefined)
    
    inline def setDialog_noConfirmCancel(value: Boolean): Self = StObject.set(x, "dialog_noConfirmCancel", value.asInstanceOf[js.Any])
    
    inline def setDialog_noConfirmCancelUndefined: Self = StObject.set(x, "dialog_noConfirmCancel", js.undefined)
    
    inline def setDialog_startupFocusTab(value: Boolean): Self = StObject.set(x, "dialog_startupFocusTab", value.asInstanceOf[js.Any])
    
    inline def setDialog_startupFocusTabUndefined: Self = StObject.set(x, "dialog_startupFocusTab", js.undefined)
    
    inline def setDisableNativeObjectResizing(value: Boolean): Self = StObject.set(x, "disableNativeObjectResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableNativeObjectResizingUndefined: Self = StObject.set(x, "disableNativeObjectResizing", js.undefined)
    
    inline def setDisableNativeReadonlyStyling(value: Boolean): Self = StObject.set(x, "disableNativeReadonlyStyling", value.asInstanceOf[js.Any])
    
    inline def setDisableNativeReadonlyStylingUndefined: Self = StObject.set(x, "disableNativeReadonlyStyling", js.undefined)
    
    inline def setDisableNativeSpellChecker(value: Boolean): Self = StObject.set(x, "disableNativeSpellChecker", value.asInstanceOf[js.Any])
    
    inline def setDisableNativeSpellCheckerUndefined: Self = StObject.set(x, "disableNativeSpellChecker", js.undefined)
    
    inline def setDisableNativeTableHandles(value: Boolean): Self = StObject.set(x, "disableNativeTableHandles", value.asInstanceOf[js.Any])
    
    inline def setDisableNativeTableHandlesUndefined: Self = StObject.set(x, "disableNativeTableHandles", js.undefined)
    
    inline def setDisallowedContent(value: disallowedContentRules): Self = StObject.set(x, "disallowedContent", value.asInstanceOf[js.Any])
    
    inline def setDisallowedContentUndefined: Self = StObject.set(x, "disallowedContent", js.undefined)
    
    inline def setDiv_wrapTable(value: Boolean): Self = StObject.set(x, "div_wrapTable", value.asInstanceOf[js.Any])
    
    inline def setDiv_wrapTableUndefined: Self = StObject.set(x, "div_wrapTable", js.undefined)
    
    inline def setDocType(value: String): Self = StObject.set(x, "docType", value.asInstanceOf[js.Any])
    
    inline def setDocTypeUndefined: Self = StObject.set(x, "docType", js.undefined)
    
    inline def setEasyimage_class(value: String): Self = StObject.set(x, "easyimage_class", value.asInstanceOf[js.Any])
    
    inline def setEasyimage_classUndefined: Self = StObject.set(x, "easyimage_class", js.undefined)
    
    inline def setEasyimage_defaultStyle(value: String): Self = StObject.set(x, "easyimage_defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setEasyimage_defaultStyleUndefined: Self = StObject.set(x, "easyimage_defaultStyle", js.undefined)
    
    inline def setEasyimage_styles(value: StringDictionary[js.Any]): Self = StObject.set(x, "easyimage_styles", value.asInstanceOf[js.Any])
    
    inline def setEasyimage_stylesUndefined: Self = StObject.set(x, "easyimage_styles", js.undefined)
    
    inline def setEasyimage_toolbar(value: js.Array[String] | String): Self = StObject.set(x, "easyimage_toolbar", value.asInstanceOf[js.Any])
    
    inline def setEasyimage_toolbarUndefined: Self = StObject.set(x, "easyimage_toolbar", js.undefined)
    
    inline def setEasyimage_toolbarVarargs(value: String*): Self = StObject.set(x, "easyimage_toolbar", js.Array(value :_*))
    
    inline def setEmailProtection(value: String): Self = StObject.set(x, "emailProtection", value.asInstanceOf[js.Any])
    
    inline def setEmailProtectionUndefined: Self = StObject.set(x, "emailProtection", js.undefined)
    
    inline def setEmbed_provider(value: String): Self = StObject.set(x, "embed_provider", value.asInstanceOf[js.Any])
    
    inline def setEmbed_providerUndefined: Self = StObject.set(x, "embed_provider", js.undefined)
    
    inline def setEmoji_emojiListUrl(value: String): Self = StObject.set(x, "emoji_emojiListUrl", value.asInstanceOf[js.Any])
    
    inline def setEmoji_emojiListUrlUndefined: Self = StObject.set(x, "emoji_emojiListUrl", js.undefined)
    
    inline def setEmoji_minChars(value: Double): Self = StObject.set(x, "emoji_minChars", value.asInstanceOf[js.Any])
    
    inline def setEmoji_minCharsUndefined: Self = StObject.set(x, "emoji_minChars", js.undefined)
    
    inline def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
    
    inline def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
    
    inline def setEnableTabKeyTools(value: Boolean): Self = StObject.set(x, "enableTabKeyTools", value.asInstanceOf[js.Any])
    
    inline def setEnableTabKeyToolsUndefined: Self = StObject.set(x, "enableTabKeyTools", js.undefined)
    
    inline def setEnterMode(value: Double): Self = StObject.set(x, "enterMode", value.asInstanceOf[js.Any])
    
    inline def setEnterModeUndefined: Self = StObject.set(x, "enterMode", js.undefined)
    
    inline def setEntities(value: Boolean): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setEntities_additional(value: String): Self = StObject.set(x, "entities_additional", value.asInstanceOf[js.Any])
    
    inline def setEntities_additionalUndefined: Self = StObject.set(x, "entities_additional", js.undefined)
    
    inline def setEntities_greek(value: Boolean): Self = StObject.set(x, "entities_greek", value.asInstanceOf[js.Any])
    
    inline def setEntities_greekUndefined: Self = StObject.set(x, "entities_greek", js.undefined)
    
    inline def setEntities_latin(value: Boolean): Self = StObject.set(x, "entities_latin", value.asInstanceOf[js.Any])
    
    inline def setEntities_latinUndefined: Self = StObject.set(x, "entities_latin", js.undefined)
    
    inline def setEntities_processNumerical(value: Boolean | String): Self = StObject.set(x, "entities_processNumerical", value.asInstanceOf[js.Any])
    
    inline def setEntities_processNumericalUndefined: Self = StObject.set(x, "entities_processNumerical", js.undefined)
    
    inline def setExtraAllowedContent(value: allowedContentRules): Self = StObject.set(x, "extraAllowedContent", value.asInstanceOf[js.Any])
    
    inline def setExtraAllowedContentUndefined: Self = StObject.set(x, "extraAllowedContent", js.undefined)
    
    inline def setExtraAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "extraAllowedContent", js.Array(value :_*))
    
    inline def setExtraPlugins(value: String): Self = StObject.set(x, "extraPlugins", value.asInstanceOf[js.Any])
    
    inline def setExtraPluginsUndefined: Self = StObject.set(x, "extraPlugins", js.undefined)
    
    inline def setFileTools_defaultFileName(value: String): Self = StObject.set(x, "fileTools_defaultFileName", value.asInstanceOf[js.Any])
    
    inline def setFileTools_defaultFileNameUndefined: Self = StObject.set(x, "fileTools_defaultFileName", js.undefined)
    
    inline def setFileTools_requestHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "fileTools_requestHeaders", value.asInstanceOf[js.Any])
    
    inline def setFileTools_requestHeadersUndefined: Self = StObject.set(x, "fileTools_requestHeaders", js.undefined)
    
    inline def setFilebrowserBrowseUrl(value: String): Self = StObject.set(x, "filebrowserBrowseUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserBrowseUrlUndefined: Self = StObject.set(x, "filebrowserBrowseUrl", js.undefined)
    
    inline def setFilebrowserFlashBrowseUrl(value: String): Self = StObject.set(x, "filebrowserFlashBrowseUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserFlashBrowseUrlUndefined: Self = StObject.set(x, "filebrowserFlashBrowseUrl", js.undefined)
    
    inline def setFilebrowserFlashUploadUrl(value: String): Self = StObject.set(x, "filebrowserFlashUploadUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserFlashUploadUrlUndefined: Self = StObject.set(x, "filebrowserFlashUploadUrl", js.undefined)
    
    inline def setFilebrowserImageBrowseLinkUrl(value: String): Self = StObject.set(x, "filebrowserImageBrowseLinkUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserImageBrowseLinkUrlUndefined: Self = StObject.set(x, "filebrowserImageBrowseLinkUrl", js.undefined)
    
    inline def setFilebrowserImageBrowseUrl(value: String): Self = StObject.set(x, "filebrowserImageBrowseUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserImageBrowseUrlUndefined: Self = StObject.set(x, "filebrowserImageBrowseUrl", js.undefined)
    
    inline def setFilebrowserImageUploadUrl(value: String): Self = StObject.set(x, "filebrowserImageUploadUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserImageUploadUrlUndefined: Self = StObject.set(x, "filebrowserImageUploadUrl", js.undefined)
    
    inline def setFilebrowserUploadMethod(value: String): Self = StObject.set(x, "filebrowserUploadMethod", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserUploadMethodUndefined: Self = StObject.set(x, "filebrowserUploadMethod", js.undefined)
    
    inline def setFilebrowserUploadUrl(value: String): Self = StObject.set(x, "filebrowserUploadUrl", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserUploadUrlUndefined: Self = StObject.set(x, "filebrowserUploadUrl", js.undefined)
    
    inline def setFilebrowserWindowFeatures(value: String): Self = StObject.set(x, "filebrowserWindowFeatures", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserWindowFeaturesUndefined: Self = StObject.set(x, "filebrowserWindowFeatures", js.undefined)
    
    inline def setFilebrowserWindowHeight(value: Double | String): Self = StObject.set(x, "filebrowserWindowHeight", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserWindowHeightUndefined: Self = StObject.set(x, "filebrowserWindowHeight", js.undefined)
    
    inline def setFilebrowserWindowWidth(value: Double | String): Self = StObject.set(x, "filebrowserWindowWidth", value.asInstanceOf[js.Any])
    
    inline def setFilebrowserWindowWidthUndefined: Self = StObject.set(x, "filebrowserWindowWidth", js.undefined)
    
    inline def setFillEmptyBlocks(
      value: Boolean | (js.Function1[/* element */ typings.ckeditor.CKEDITOR.htmlParser.element, Boolean])
    ): Self = StObject.set(x, "fillEmptyBlocks", value.asInstanceOf[js.Any])
    
    inline def setFillEmptyBlocksFunction1(value: /* element */ typings.ckeditor.CKEDITOR.htmlParser.element => Boolean): Self = StObject.set(x, "fillEmptyBlocks", js.Any.fromFunction1(value))
    
    inline def setFillEmptyBlocksUndefined: Self = StObject.set(x, "fillEmptyBlocks", js.undefined)
    
    inline def setFind_highlight(value: styleObject): Self = StObject.set(x, "find_highlight", value.asInstanceOf[js.Any])
    
    inline def setFind_highlightUndefined: Self = StObject.set(x, "find_highlight", js.undefined)
    
    inline def setFlashAddEmbedTag(value: Boolean): Self = StObject.set(x, "flashAddEmbedTag", value.asInstanceOf[js.Any])
    
    inline def setFlashAddEmbedTagUndefined: Self = StObject.set(x, "flashAddEmbedTag", js.undefined)
    
    inline def setFlashConvertOnEdit(value: Boolean): Self = StObject.set(x, "flashConvertOnEdit", value.asInstanceOf[js.Any])
    
    inline def setFlashConvertOnEditUndefined: Self = StObject.set(x, "flashConvertOnEdit", js.undefined)
    
    inline def setFlashEmbedTagOnly(value: Boolean): Self = StObject.set(x, "flashEmbedTagOnly", value.asInstanceOf[js.Any])
    
    inline def setFlashEmbedTagOnlyUndefined: Self = StObject.set(x, "flashEmbedTagOnly", js.undefined)
    
    inline def setFloatSpaceDockedOffsetX(value: Double): Self = StObject.set(x, "floatSpaceDockedOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFloatSpaceDockedOffsetXUndefined: Self = StObject.set(x, "floatSpaceDockedOffsetX", js.undefined)
    
    inline def setFloatSpaceDockedOffsetY(value: Double): Self = StObject.set(x, "floatSpaceDockedOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFloatSpaceDockedOffsetYUndefined: Self = StObject.set(x, "floatSpaceDockedOffsetY", js.undefined)
    
    inline def setFloatSpacePinnedOffsetX(value: Double): Self = StObject.set(x, "floatSpacePinnedOffsetX", value.asInstanceOf[js.Any])
    
    inline def setFloatSpacePinnedOffsetXUndefined: Self = StObject.set(x, "floatSpacePinnedOffsetX", js.undefined)
    
    inline def setFloatSpacePinnedOffsetY(value: Double): Self = StObject.set(x, "floatSpacePinnedOffsetY", value.asInstanceOf[js.Any])
    
    inline def setFloatSpacePinnedOffsetYUndefined: Self = StObject.set(x, "floatSpacePinnedOffsetY", js.undefined)
    
    inline def setFloatSpacePreferRight(value: Boolean): Self = StObject.set(x, "floatSpacePreferRight", value.asInstanceOf[js.Any])
    
    inline def setFloatSpacePreferRightUndefined: Self = StObject.set(x, "floatSpacePreferRight", js.undefined)
    
    inline def setFontSize_defaultLabel(value: String): Self = StObject.set(x, "fontSize_defaultLabel", value.asInstanceOf[js.Any])
    
    inline def setFontSize_defaultLabelUndefined: Self = StObject.set(x, "fontSize_defaultLabel", js.undefined)
    
    inline def setFontSize_sizes(value: String): Self = StObject.set(x, "fontSize_sizes", value.asInstanceOf[js.Any])
    
    inline def setFontSize_sizesUndefined: Self = StObject.set(x, "fontSize_sizes", js.undefined)
    
    inline def setFontSize_style(value: styleObject): Self = StObject.set(x, "fontSize_style", value.asInstanceOf[js.Any])
    
    inline def setFontSize_styleUndefined: Self = StObject.set(x, "fontSize_style", js.undefined)
    
    inline def setFont_defaultLabel(value: String): Self = StObject.set(x, "font_defaultLabel", value.asInstanceOf[js.Any])
    
    inline def setFont_defaultLabelUndefined: Self = StObject.set(x, "font_defaultLabel", js.undefined)
    
    inline def setFont_names(value: String): Self = StObject.set(x, "font_names", value.asInstanceOf[js.Any])
    
    inline def setFont_namesUndefined: Self = StObject.set(x, "font_names", js.undefined)
    
    inline def setFont_style(value: styleObject): Self = StObject.set(x, "font_style", value.asInstanceOf[js.Any])
    
    inline def setFont_styleUndefined: Self = StObject.set(x, "font_style", js.undefined)
    
    inline def setForceEnterMode(value: Boolean): Self = StObject.set(x, "forceEnterMode", value.asInstanceOf[js.Any])
    
    inline def setForceEnterModeUndefined: Self = StObject.set(x, "forceEnterMode", js.undefined)
    
    inline def setForcePasteAsPlainText(value: Boolean): Self = StObject.set(x, "forcePasteAsPlainText", value.asInstanceOf[js.Any])
    
    inline def setForcePasteAsPlainTextUndefined: Self = StObject.set(x, "forcePasteAsPlainText", js.undefined)
    
    inline def setForceSimpleAmpersand(value: Boolean): Self = StObject.set(x, "forceSimpleAmpersand", value.asInstanceOf[js.Any])
    
    inline def setForceSimpleAmpersandUndefined: Self = StObject.set(x, "forceSimpleAmpersand", js.undefined)
    
    inline def setFormat_address(value: styleObject): Self = StObject.set(x, "format_address", value.asInstanceOf[js.Any])
    
    inline def setFormat_addressUndefined: Self = StObject.set(x, "format_address", js.undefined)
    
    inline def setFormat_div(value: styleObject): Self = StObject.set(x, "format_div", value.asInstanceOf[js.Any])
    
    inline def setFormat_divUndefined: Self = StObject.set(x, "format_div", js.undefined)
    
    inline def setFormat_h1(value: styleObject): Self = StObject.set(x, "format_h1", value.asInstanceOf[js.Any])
    
    inline def setFormat_h1Undefined: Self = StObject.set(x, "format_h1", js.undefined)
    
    inline def setFormat_h2(value: styleObject): Self = StObject.set(x, "format_h2", value.asInstanceOf[js.Any])
    
    inline def setFormat_h2Undefined: Self = StObject.set(x, "format_h2", js.undefined)
    
    inline def setFormat_h3(value: styleObject): Self = StObject.set(x, "format_h3", value.asInstanceOf[js.Any])
    
    inline def setFormat_h3Undefined: Self = StObject.set(x, "format_h3", js.undefined)
    
    inline def setFormat_h4(value: styleObject): Self = StObject.set(x, "format_h4", value.asInstanceOf[js.Any])
    
    inline def setFormat_h4Undefined: Self = StObject.set(x, "format_h4", js.undefined)
    
    inline def setFormat_h5(value: styleObject): Self = StObject.set(x, "format_h5", value.asInstanceOf[js.Any])
    
    inline def setFormat_h5Undefined: Self = StObject.set(x, "format_h5", js.undefined)
    
    inline def setFormat_h6(value: styleObject): Self = StObject.set(x, "format_h6", value.asInstanceOf[js.Any])
    
    inline def setFormat_h6Undefined: Self = StObject.set(x, "format_h6", js.undefined)
    
    inline def setFormat_p(value: styleObject): Self = StObject.set(x, "format_p", value.asInstanceOf[js.Any])
    
    inline def setFormat_pUndefined: Self = StObject.set(x, "format_p", js.undefined)
    
    inline def setFormat_pre(value: styleObject): Self = StObject.set(x, "format_pre", value.asInstanceOf[js.Any])
    
    inline def setFormat_preUndefined: Self = StObject.set(x, "format_pre", js.undefined)
    
    inline def setFormat_tags(value: String): Self = StObject.set(x, "format_tags", value.asInstanceOf[js.Any])
    
    inline def setFormat_tagsUndefined: Self = StObject.set(x, "format_tags", js.undefined)
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    inline def setGrayt_autoStartup(value: Boolean): Self = StObject.set(x, "grayt_autoStartup", value.asInstanceOf[js.Any])
    
    inline def setGrayt_autoStartupUndefined: Self = StObject.set(x, "grayt_autoStartup", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHtmlEncodeOutput(value: Boolean): Self = StObject.set(x, "htmlEncodeOutput", value.asInstanceOf[js.Any])
    
    inline def setHtmlEncodeOutputUndefined: Self = StObject.set(x, "htmlEncodeOutput", js.undefined)
    
    inline def setIgnoreEmptyParagraph(value: Boolean): Self = StObject.set(x, "ignoreEmptyParagraph", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyParagraphUndefined: Self = StObject.set(x, "ignoreEmptyParagraph", js.undefined)
    
    inline def setImage2_alignClasses(value: js.Array[String]): Self = StObject.set(x, "image2_alignClasses", value.asInstanceOf[js.Any])
    
    inline def setImage2_alignClassesUndefined: Self = StObject.set(x, "image2_alignClasses", js.undefined)
    
    inline def setImage2_alignClassesVarargs(value: String*): Self = StObject.set(x, "image2_alignClasses", js.Array(value :_*))
    
    inline def setImage2_altRequired(value: Boolean): Self = StObject.set(x, "image2_altRequired", value.asInstanceOf[js.Any])
    
    inline def setImage2_altRequiredUndefined: Self = StObject.set(x, "image2_altRequired", js.undefined)
    
    inline def setImage2_captionedClass(value: String): Self = StObject.set(x, "image2_captionedClass", value.asInstanceOf[js.Any])
    
    inline def setImage2_captionedClassUndefined: Self = StObject.set(x, "image2_captionedClass", js.undefined)
    
    inline def setImage2_disableResizer(value: Boolean): Self = StObject.set(x, "image2_disableResizer", value.asInstanceOf[js.Any])
    
    inline def setImage2_disableResizerUndefined: Self = StObject.set(x, "image2_disableResizer", js.undefined)
    
    inline def setImage2_prefillDimensions(value: Boolean): Self = StObject.set(x, "image2_prefillDimensions", value.asInstanceOf[js.Any])
    
    inline def setImage2_prefillDimensionsUndefined: Self = StObject.set(x, "image2_prefillDimensions", js.undefined)
    
    inline def setImageUploadUrl(value: String): Self = StObject.set(x, "imageUploadUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUploadUrlUndefined: Self = StObject.set(x, "imageUploadUrl", js.undefined)
    
    inline def setImage_prefillDimensions(value: Boolean): Self = StObject.set(x, "image_prefillDimensions", value.asInstanceOf[js.Any])
    
    inline def setImage_prefillDimensionsUndefined: Self = StObject.set(x, "image_prefillDimensions", js.undefined)
    
    inline def setImage_previewText(value: String): Self = StObject.set(x, "image_previewText", value.asInstanceOf[js.Any])
    
    inline def setImage_previewTextUndefined: Self = StObject.set(x, "image_previewText", js.undefined)
    
    inline def setImage_removeLinkByEmptyUrl(value: Boolean): Self = StObject.set(x, "image_removeLinkByEmptyUrl", value.asInstanceOf[js.Any])
    
    inline def setImage_removeLinkByEmptyUrlUndefined: Self = StObject.set(x, "image_removeLinkByEmptyUrl", js.undefined)
    
    inline def setIndentClasses(value: js.Array[String]): Self = StObject.set(x, "indentClasses", value.asInstanceOf[js.Any])
    
    inline def setIndentClassesUndefined: Self = StObject.set(x, "indentClasses", js.undefined)
    
    inline def setIndentClassesVarargs(value: String*): Self = StObject.set(x, "indentClasses", js.Array(value :_*))
    
    inline def setIndentOffset(value: Double): Self = StObject.set(x, "indentOffset", value.asInstanceOf[js.Any])
    
    inline def setIndentOffsetUndefined: Self = StObject.set(x, "indentOffset", js.undefined)
    
    inline def setIndentUnit(value: String): Self = StObject.set(x, "indentUnit", value.asInstanceOf[js.Any])
    
    inline def setIndentUnitUndefined: Self = StObject.set(x, "indentUnit", js.undefined)
    
    inline def setJqueryOverrideVal(value: Boolean): Self = StObject.set(x, "jqueryOverrideVal", value.asInstanceOf[js.Any])
    
    inline def setJqueryOverrideValUndefined: Self = StObject.set(x, "jqueryOverrideVal", js.undefined)
    
    inline def setJustifyClasses(value: js.Array[String]): Self = StObject.set(x, "justifyClasses", value.asInstanceOf[js.Any])
    
    inline def setJustifyClassesUndefined: Self = StObject.set(x, "justifyClasses", js.undefined)
    
    inline def setJustifyClassesVarargs(value: String*): Self = StObject.set(x, "justifyClasses", js.Array(value :_*))
    
    inline def setKeystrokes(value: js.Array[js.Tuple2[Double, String]]): Self = StObject.set(x, "keystrokes", value.asInstanceOf[js.Any])
    
    inline def setKeystrokesUndefined: Self = StObject.set(x, "keystrokes", js.undefined)
    
    inline def setKeystrokesVarargs(value: (js.Tuple2[Double, String])*): Self = StObject.set(x, "keystrokes", js.Array(value :_*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLanguage_list(value: js.Array[String]): Self = StObject.set(x, "language_list", value.asInstanceOf[js.Any])
    
    inline def setLanguage_listUndefined: Self = StObject.set(x, "language_list", js.undefined)
    
    inline def setLanguage_listVarargs(value: String*): Self = StObject.set(x, "language_list", js.Array(value :_*))
    
    inline def setLinkJavaScriptLinksAllowed(value: Boolean): Self = StObject.set(x, "linkJavaScriptLinksAllowed", value.asInstanceOf[js.Any])
    
    inline def setLinkJavaScriptLinksAllowedUndefined: Self = StObject.set(x, "linkJavaScriptLinksAllowed", js.undefined)
    
    inline def setLinkShowAdvancedTab(value: Boolean): Self = StObject.set(x, "linkShowAdvancedTab", value.asInstanceOf[js.Any])
    
    inline def setLinkShowAdvancedTabUndefined: Self = StObject.set(x, "linkShowAdvancedTab", js.undefined)
    
    inline def setLinkShowTargetTab(value: Boolean): Self = StObject.set(x, "linkShowTargetTab", value.asInstanceOf[js.Any])
    
    inline def setLinkShowTargetTabUndefined: Self = StObject.set(x, "linkShowTargetTab", js.undefined)
    
    inline def setMagicline_color(value: String): Self = StObject.set(x, "magicline_color", value.asInstanceOf[js.Any])
    
    inline def setMagicline_colorUndefined: Self = StObject.set(x, "magicline_color", js.undefined)
    
    inline def setMagicline_everywhere(value: Boolean): Self = StObject.set(x, "magicline_everywhere", value.asInstanceOf[js.Any])
    
    inline def setMagicline_everywhereUndefined: Self = StObject.set(x, "magicline_everywhere", js.undefined)
    
    inline def setMagicline_holdDistance(value: Double): Self = StObject.set(x, "magicline_holdDistance", value.asInstanceOf[js.Any])
    
    inline def setMagicline_holdDistanceUndefined: Self = StObject.set(x, "magicline_holdDistance", js.undefined)
    
    inline def setMagicline_keystrokeNext(value: Double): Self = StObject.set(x, "magicline_keystrokeNext", value.asInstanceOf[js.Any])
    
    inline def setMagicline_keystrokeNextUndefined: Self = StObject.set(x, "magicline_keystrokeNext", js.undefined)
    
    inline def setMagicline_keystrokePrevious(value: Double): Self = StObject.set(x, "magicline_keystrokePrevious", value.asInstanceOf[js.Any])
    
    inline def setMagicline_keystrokePreviousUndefined: Self = StObject.set(x, "magicline_keystrokePrevious", js.undefined)
    
    inline def setMagicline_tabuList(value: js.Array[String]): Self = StObject.set(x, "magicline_tabuList", value.asInstanceOf[js.Any])
    
    inline def setMagicline_tabuListUndefined: Self = StObject.set(x, "magicline_tabuList", js.undefined)
    
    inline def setMagicline_tabuListVarargs(value: String*): Self = StObject.set(x, "magicline_tabuList", js.Array(value :_*))
    
    inline def setMagicline_triggerOffset(value: Double): Self = StObject.set(x, "magicline_triggerOffset", value.asInstanceOf[js.Any])
    
    inline def setMagicline_triggerOffsetUndefined: Self = StObject.set(x, "magicline_triggerOffset", js.undefined)
    
    inline def setMathJaxClass(value: String): Self = StObject.set(x, "mathJaxClass", value.asInstanceOf[js.Any])
    
    inline def setMathJaxClassUndefined: Self = StObject.set(x, "mathJaxClass", js.undefined)
    
    inline def setMathJaxLib(value: String): Self = StObject.set(x, "mathJaxLib", value.asInstanceOf[js.Any])
    
    inline def setMathJaxLibUndefined: Self = StObject.set(x, "mathJaxLib", js.undefined)
    
    inline def setMenu_groups(value: String): Self = StObject.set(x, "menu_groups", value.asInstanceOf[js.Any])
    
    inline def setMenu_groupsUndefined: Self = StObject.set(x, "menu_groups", js.undefined)
    
    inline def setMenu_subMenuDelay(value: Double): Self = StObject.set(x, "menu_subMenuDelay", value.asInstanceOf[js.Any])
    
    inline def setMenu_subMenuDelayUndefined: Self = StObject.set(x, "menu_subMenuDelay", js.undefined)
    
    inline def setNewpage_html(value: String): Self = StObject.set(x, "newpage_html", value.asInstanceOf[js.Any])
    
    inline def setNewpage_htmlUndefined: Self = StObject.set(x, "newpage_html", js.undefined)
    
    inline def setNotification_duration(value: Double): Self = StObject.set(x, "notification_duration", value.asInstanceOf[js.Any])
    
    inline def setNotification_durationUndefined: Self = StObject.set(x, "notification_duration", js.undefined)
    
    inline def setOn(value: eventObject): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setPasteFilter(value: String): Self = StObject.set(x, "pasteFilter", value.asInstanceOf[js.Any])
    
    inline def setPasteFilterUndefined: Self = StObject.set(x, "pasteFilter", js.undefined)
    
    inline def setPasteFromWordCleanupFile(value: String): Self = StObject.set(x, "pasteFromWordCleanupFile", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWordCleanupFileUndefined: Self = StObject.set(x, "pasteFromWordCleanupFile", js.undefined)
    
    inline def setPasteFromWordNumberedHeadingToList(value: Boolean): Self = StObject.set(x, "pasteFromWordNumberedHeadingToList", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWordNumberedHeadingToListUndefined: Self = StObject.set(x, "pasteFromWordNumberedHeadingToList", js.undefined)
    
    inline def setPasteFromWordPromptCleanup(value: Boolean): Self = StObject.set(x, "pasteFromWordPromptCleanup", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWordPromptCleanupUndefined: Self = StObject.set(x, "pasteFromWordPromptCleanup", js.undefined)
    
    inline def setPasteFromWordRemoveFontStyles(value: Boolean): Self = StObject.set(x, "pasteFromWordRemoveFontStyles", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWordRemoveFontStylesUndefined: Self = StObject.set(x, "pasteFromWordRemoveFontStyles", js.undefined)
    
    inline def setPasteFromWordRemoveStyles(value: Boolean): Self = StObject.set(x, "pasteFromWordRemoveStyles", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWordRemoveStylesUndefined: Self = StObject.set(x, "pasteFromWordRemoveStyles", js.undefined)
    
    inline def setPasteFromWord_heuristicsEdgeList(value: Boolean): Self = StObject.set(x, "pasteFromWord_heuristicsEdgeList", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWord_heuristicsEdgeListUndefined: Self = StObject.set(x, "pasteFromWord_heuristicsEdgeList", js.undefined)
    
    inline def setPasteFromWord_inlineImages(value: Boolean): Self = StObject.set(x, "pasteFromWord_inlineImages", value.asInstanceOf[js.Any])
    
    inline def setPasteFromWord_inlineImagesUndefined: Self = StObject.set(x, "pasteFromWord_inlineImages", js.undefined)
    
    inline def setPlugins(value: String): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setProtectedSource(value: js.Array[RegExp]): Self = StObject.set(x, "protectedSource", value.asInstanceOf[js.Any])
    
    inline def setProtectedSourceUndefined: Self = StObject.set(x, "protectedSource", js.undefined)
    
    inline def setProtectedSourceVarargs(value: RegExp*): Self = StObject.set(x, "protectedSource", js.Array(value :_*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRemoveButtons(value: String): Self = StObject.set(x, "removeButtons", value.asInstanceOf[js.Any])
    
    inline def setRemoveButtonsUndefined: Self = StObject.set(x, "removeButtons", js.undefined)
    
    inline def setRemoveDialogTabs(value: String): Self = StObject.set(x, "removeDialogTabs", value.asInstanceOf[js.Any])
    
    inline def setRemoveDialogTabsUndefined: Self = StObject.set(x, "removeDialogTabs", js.undefined)
    
    inline def setRemoveFormatAttributes(value: String): Self = StObject.set(x, "removeFormatAttributes", value.asInstanceOf[js.Any])
    
    inline def setRemoveFormatAttributesUndefined: Self = StObject.set(x, "removeFormatAttributes", js.undefined)
    
    inline def setRemoveFormatTags(value: String): Self = StObject.set(x, "removeFormatTags", value.asInstanceOf[js.Any])
    
    inline def setRemoveFormatTagsUndefined: Self = StObject.set(x, "removeFormatTags", js.undefined)
    
    inline def setRemovePlugins(value: String): Self = StObject.set(x, "removePlugins", value.asInstanceOf[js.Any])
    
    inline def setRemovePluginsUndefined: Self = StObject.set(x, "removePlugins", js.undefined)
    
    inline def setResize_dir(value: String): Self = StObject.set(x, "resize_dir", value.asInstanceOf[js.Any])
    
    inline def setResize_dirUndefined: Self = StObject.set(x, "resize_dir", js.undefined)
    
    inline def setResize_enabled(value: Boolean): Self = StObject.set(x, "resize_enabled", value.asInstanceOf[js.Any])
    
    inline def setResize_enabledUndefined: Self = StObject.set(x, "resize_enabled", js.undefined)
    
    inline def setResize_maxHeight(value: Double): Self = StObject.set(x, "resize_maxHeight", value.asInstanceOf[js.Any])
    
    inline def setResize_maxHeightUndefined: Self = StObject.set(x, "resize_maxHeight", js.undefined)
    
    inline def setResize_maxWidth(value: Double): Self = StObject.set(x, "resize_maxWidth", value.asInstanceOf[js.Any])
    
    inline def setResize_maxWidthUndefined: Self = StObject.set(x, "resize_maxWidth", js.undefined)
    
    inline def setResize_minHeight(value: Double): Self = StObject.set(x, "resize_minHeight", value.asInstanceOf[js.Any])
    
    inline def setResize_minHeightUndefined: Self = StObject.set(x, "resize_minHeight", js.undefined)
    
    inline def setResize_minWidth(value: Double): Self = StObject.set(x, "resize_minWidth", value.asInstanceOf[js.Any])
    
    inline def setResize_minWidthUndefined: Self = StObject.set(x, "resize_minWidth", js.undefined)
    
    inline def setScayt_autoStartup(value: Boolean): Self = StObject.set(x, "scayt_autoStartup", value.asInstanceOf[js.Any])
    
    inline def setScayt_autoStartupUndefined: Self = StObject.set(x, "scayt_autoStartup", js.undefined)
    
    inline def setScayt_contextCommands(value: String): Self = StObject.set(x, "scayt_contextCommands", value.asInstanceOf[js.Any])
    
    inline def setScayt_contextCommandsUndefined: Self = StObject.set(x, "scayt_contextCommands", js.undefined)
    
    inline def setScayt_contextMenuItemsOrder(value: String): Self = StObject.set(x, "scayt_contextMenuItemsOrder", value.asInstanceOf[js.Any])
    
    inline def setScayt_contextMenuItemsOrderUndefined: Self = StObject.set(x, "scayt_contextMenuItemsOrder", js.undefined)
    
    inline def setScayt_customDictionaryIds(value: String): Self = StObject.set(x, "scayt_customDictionaryIds", value.asInstanceOf[js.Any])
    
    inline def setScayt_customDictionaryIdsUndefined: Self = StObject.set(x, "scayt_customDictionaryIds", js.undefined)
    
    inline def setScayt_customerId(value: String): Self = StObject.set(x, "scayt_customerId", value.asInstanceOf[js.Any])
    
    inline def setScayt_customerIdUndefined: Self = StObject.set(x, "scayt_customerId", js.undefined)
    
    inline def setScayt_disableOptionsStorage(value: String | js.Array[String]): Self = StObject.set(x, "scayt_disableOptionsStorage", value.asInstanceOf[js.Any])
    
    inline def setScayt_disableOptionsStorageUndefined: Self = StObject.set(x, "scayt_disableOptionsStorage", js.undefined)
    
    inline def setScayt_disableOptionsStorageVarargs(value: String*): Self = StObject.set(x, "scayt_disableOptionsStorage", js.Array(value :_*))
    
    inline def setScayt_elementsToIgnore(value: String): Self = StObject.set(x, "scayt_elementsToIgnore", value.asInstanceOf[js.Any])
    
    inline def setScayt_elementsToIgnoreUndefined: Self = StObject.set(x, "scayt_elementsToIgnore", js.undefined)
    
    inline def setScayt_handleCheckDirty(value: String): Self = StObject.set(x, "scayt_handleCheckDirty", value.asInstanceOf[js.Any])
    
    inline def setScayt_handleCheckDirtyUndefined: Self = StObject.set(x, "scayt_handleCheckDirty", js.undefined)
    
    inline def setScayt_handleUndoRedo(value: String): Self = StObject.set(x, "scayt_handleUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setScayt_handleUndoRedoUndefined: Self = StObject.set(x, "scayt_handleUndoRedo", js.undefined)
    
    inline def setScayt_ignoreAllCapsWords(value: Boolean): Self = StObject.set(x, "scayt_ignoreAllCapsWords", value.asInstanceOf[js.Any])
    
    inline def setScayt_ignoreAllCapsWordsUndefined: Self = StObject.set(x, "scayt_ignoreAllCapsWords", js.undefined)
    
    inline def setScayt_ignoreDomainNames(value: Boolean): Self = StObject.set(x, "scayt_ignoreDomainNames", value.asInstanceOf[js.Any])
    
    inline def setScayt_ignoreDomainNamesUndefined: Self = StObject.set(x, "scayt_ignoreDomainNames", js.undefined)
    
    inline def setScayt_ignoreWordsWithMixedCases(value: Boolean): Self = StObject.set(x, "scayt_ignoreWordsWithMixedCases", value.asInstanceOf[js.Any])
    
    inline def setScayt_ignoreWordsWithMixedCasesUndefined: Self = StObject.set(x, "scayt_ignoreWordsWithMixedCases", js.undefined)
    
    inline def setScayt_ignoreWordsWithNumbers(value: Boolean): Self = StObject.set(x, "scayt_ignoreWordsWithNumbers", value.asInstanceOf[js.Any])
    
    inline def setScayt_ignoreWordsWithNumbersUndefined: Self = StObject.set(x, "scayt_ignoreWordsWithNumbers", js.undefined)
    
    inline def setScayt_inlineModeImmediateMarkup(value: Boolean): Self = StObject.set(x, "scayt_inlineModeImmediateMarkup", value.asInstanceOf[js.Any])
    
    inline def setScayt_inlineModeImmediateMarkupUndefined: Self = StObject.set(x, "scayt_inlineModeImmediateMarkup", js.undefined)
    
    inline def setScayt_maxSuggestions(value: Double): Self = StObject.set(x, "scayt_maxSuggestions", value.asInstanceOf[js.Any])
    
    inline def setScayt_maxSuggestionsUndefined: Self = StObject.set(x, "scayt_maxSuggestions", js.undefined)
    
    inline def setScayt_minWordLength(value: Double): Self = StObject.set(x, "scayt_minWordLength", value.asInstanceOf[js.Any])
    
    inline def setScayt_minWordLengthUndefined: Self = StObject.set(x, "scayt_minWordLength", js.undefined)
    
    inline def setScayt_moreSuggestions(value: String): Self = StObject.set(x, "scayt_moreSuggestions", value.asInstanceOf[js.Any])
    
    inline def setScayt_moreSuggestionsUndefined: Self = StObject.set(x, "scayt_moreSuggestions", js.undefined)
    
    inline def setScayt_multiLanguageMode(value: Boolean): Self = StObject.set(x, "scayt_multiLanguageMode", value.asInstanceOf[js.Any])
    
    inline def setScayt_multiLanguageModeUndefined: Self = StObject.set(x, "scayt_multiLanguageMode", js.undefined)
    
    inline def setScayt_multiLanguageStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "scayt_multiLanguageStyles", value.asInstanceOf[js.Any])
    
    inline def setScayt_multiLanguageStylesUndefined: Self = StObject.set(x, "scayt_multiLanguageStyles", js.undefined)
    
    inline def setScayt_sLang(value: String): Self = StObject.set(x, "scayt_sLang", value.asInstanceOf[js.Any])
    
    inline def setScayt_sLangUndefined: Self = StObject.set(x, "scayt_sLang", js.undefined)
    
    inline def setScayt_serviceHost(value: String): Self = StObject.set(x, "scayt_serviceHost", value.asInstanceOf[js.Any])
    
    inline def setScayt_serviceHostUndefined: Self = StObject.set(x, "scayt_serviceHost", js.undefined)
    
    inline def setScayt_servicePath(value: String): Self = StObject.set(x, "scayt_servicePath", value.asInstanceOf[js.Any])
    
    inline def setScayt_servicePathUndefined: Self = StObject.set(x, "scayt_servicePath", js.undefined)
    
    inline def setScayt_servicePort(value: String): Self = StObject.set(x, "scayt_servicePort", value.asInstanceOf[js.Any])
    
    inline def setScayt_servicePortUndefined: Self = StObject.set(x, "scayt_servicePort", js.undefined)
    
    inline def setScayt_serviceProtocol(value: String): Self = StObject.set(x, "scayt_serviceProtocol", value.asInstanceOf[js.Any])
    
    inline def setScayt_serviceProtocolUndefined: Self = StObject.set(x, "scayt_serviceProtocol", js.undefined)
    
    inline def setScayt_srcUrl(value: String): Self = StObject.set(x, "scayt_srcUrl", value.asInstanceOf[js.Any])
    
    inline def setScayt_srcUrlUndefined: Self = StObject.set(x, "scayt_srcUrl", js.undefined)
    
    inline def setScayt_uiTabs(value: String): Self = StObject.set(x, "scayt_uiTabs", value.asInstanceOf[js.Any])
    
    inline def setScayt_uiTabsUndefined: Self = StObject.set(x, "scayt_uiTabs", js.undefined)
    
    inline def setScayt_userDictionaryName(value: String): Self = StObject.set(x, "scayt_userDictionaryName", value.asInstanceOf[js.Any])
    
    inline def setScayt_userDictionaryNameUndefined: Self = StObject.set(x, "scayt_userDictionaryName", js.undefined)
    
    inline def setSharedSpaces(value: sharedSpace): Self = StObject.set(x, "sharedSpaces", value.asInstanceOf[js.Any])
    
    inline def setSharedSpacesUndefined: Self = StObject.set(x, "sharedSpaces", js.undefined)
    
    inline def setShiftEnterMode(value: Double): Self = StObject.set(x, "shiftEnterMode", value.asInstanceOf[js.Any])
    
    inline def setShiftEnterModeUndefined: Self = StObject.set(x, "shiftEnterMode", js.undefined)
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSmiley_columns(value: Double): Self = StObject.set(x, "smiley_columns", value.asInstanceOf[js.Any])
    
    inline def setSmiley_columnsUndefined: Self = StObject.set(x, "smiley_columns", js.undefined)
    
    inline def setSmiley_descriptions(value: js.Array[String]): Self = StObject.set(x, "smiley_descriptions", value.asInstanceOf[js.Any])
    
    inline def setSmiley_descriptionsUndefined: Self = StObject.set(x, "smiley_descriptions", js.undefined)
    
    inline def setSmiley_descriptionsVarargs(value: String*): Self = StObject.set(x, "smiley_descriptions", js.Array(value :_*))
    
    inline def setSmiley_images(value: js.Array[String]): Self = StObject.set(x, "smiley_images", value.asInstanceOf[js.Any])
    
    inline def setSmiley_imagesUndefined: Self = StObject.set(x, "smiley_images", js.undefined)
    
    inline def setSmiley_imagesVarargs(value: String*): Self = StObject.set(x, "smiley_images", js.Array(value :_*))
    
    inline def setSmiley_path(value: String): Self = StObject.set(x, "smiley_path", value.asInstanceOf[js.Any])
    
    inline def setSmiley_pathUndefined: Self = StObject.set(x, "smiley_path", js.undefined)
    
    inline def setSourceAreaTabSize(value: Double): Self = StObject.set(x, "sourceAreaTabSize", value.asInstanceOf[js.Any])
    
    inline def setSourceAreaTabSizeUndefined: Self = StObject.set(x, "sourceAreaTabSize", js.undefined)
    
    inline def setSpecialChars(value: js.Array[String | (js.Tuple2[String, String])]): Self = StObject.set(x, "specialChars", value.asInstanceOf[js.Any])
    
    inline def setSpecialCharsUndefined: Self = StObject.set(x, "specialChars", js.undefined)
    
    inline def setSpecialCharsVarargs(value: (String | (js.Tuple2[String, String]))*): Self = StObject.set(x, "specialChars", js.Array(value :_*))
    
    inline def setStartupFocus(value: String | Boolean): Self = StObject.set(x, "startupFocus", value.asInstanceOf[js.Any])
    
    inline def setStartupFocusUndefined: Self = StObject.set(x, "startupFocus", js.undefined)
    
    inline def setStartupMode(value: String): Self = StObject.set(x, "startupMode", value.asInstanceOf[js.Any])
    
    inline def setStartupModeUndefined: Self = StObject.set(x, "startupMode", js.undefined)
    
    inline def setStartupOutlineBlocks(value: Boolean): Self = StObject.set(x, "startupOutlineBlocks", value.asInstanceOf[js.Any])
    
    inline def setStartupOutlineBlocksUndefined: Self = StObject.set(x, "startupOutlineBlocks", js.undefined)
    
    inline def setStartupShowBorders(value: Boolean): Self = StObject.set(x, "startupShowBorders", value.asInstanceOf[js.Any])
    
    inline def setStartupShowBordersUndefined: Self = StObject.set(x, "startupShowBorders", js.undefined)
    
    inline def setStylesSet(value: String | Boolean | js.Array[styleObject]): Self = StObject.set(x, "stylesSet", value.asInstanceOf[js.Any])
    
    inline def setStylesSetUndefined: Self = StObject.set(x, "stylesSet", js.undefined)
    
    inline def setStylesSetVarargs(value: styleObject*): Self = StObject.set(x, "stylesSet", js.Array(value :_*))
    
    inline def setStylesheetParser_skipSelectors(value: RegExp): Self = StObject.set(x, "stylesheetParser_skipSelectors", value.asInstanceOf[js.Any])
    
    inline def setStylesheetParser_skipSelectorsUndefined: Self = StObject.set(x, "stylesheetParser_skipSelectors", js.undefined)
    
    inline def setStylesheetParser_validSelectors(value: RegExp): Self = StObject.set(x, "stylesheetParser_validSelectors", value.asInstanceOf[js.Any])
    
    inline def setStylesheetParser_validSelectorsUndefined: Self = StObject.set(x, "stylesheetParser_validSelectors", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setTabSpaces(value: Double): Self = StObject.set(x, "tabSpaces", value.asInstanceOf[js.Any])
    
    inline def setTabSpacesUndefined: Self = StObject.set(x, "tabSpaces", js.undefined)
    
    inline def setTemplates(value: String): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
    
    inline def setTemplates_files(value: StringDictionary[js.Any]): Self = StObject.set(x, "templates_files", value.asInstanceOf[js.Any])
    
    inline def setTemplates_filesUndefined: Self = StObject.set(x, "templates_files", js.undefined)
    
    inline def setTemplates_replaceContent(value: Boolean): Self = StObject.set(x, "templates_replaceContent", value.asInstanceOf[js.Any])
    
    inline def setTemplates_replaceContentUndefined: Self = StObject.set(x, "templates_replaceContent", js.undefined)
    
    inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setToolbar(value: String | (js.Array[String | js.Array[String] | Groups])): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarCanCollapse(value: Boolean): Self = StObject.set(x, "toolbarCanCollapse", value.asInstanceOf[js.Any])
    
    inline def setToolbarCanCollapseUndefined: Self = StObject.set(x, "toolbarCanCollapse", js.undefined)
    
    inline def setToolbarGroupCycling(value: Boolean): Self = StObject.set(x, "toolbarGroupCycling", value.asInstanceOf[js.Any])
    
    inline def setToolbarGroupCyclingUndefined: Self = StObject.set(x, "toolbarGroupCycling", js.undefined)
    
    inline def setToolbarGroups(value: js.Array[toolbarGroups | String]): Self = StObject.set(x, "toolbarGroups", value.asInstanceOf[js.Any])
    
    inline def setToolbarGroupsUndefined: Self = StObject.set(x, "toolbarGroups", js.undefined)
    
    inline def setToolbarGroupsVarargs(value: (toolbarGroups | String)*): Self = StObject.set(x, "toolbarGroups", js.Array(value :_*))
    
    inline def setToolbarLocation(value: String): Self = StObject.set(x, "toolbarLocation", value.asInstanceOf[js.Any])
    
    inline def setToolbarLocationUndefined: Self = StObject.set(x, "toolbarLocation", js.undefined)
    
    inline def setToolbarNull: Self = StObject.set(x, "toolbar", null)
    
    inline def setToolbarStartupExpanded(value: Boolean): Self = StObject.set(x, "toolbarStartupExpanded", value.asInstanceOf[js.Any])
    
    inline def setToolbarStartupExpandedUndefined: Self = StObject.set(x, "toolbarStartupExpanded", js.undefined)
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: (String | js.Array[String] | Groups)*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    
    inline def setUiColor(value: String): Self = StObject.set(x, "uiColor", value.asInstanceOf[js.Any])
    
    inline def setUiColorUndefined: Self = StObject.set(x, "uiColor", js.undefined)
    
    inline def setUndoStackSize(value: Double): Self = StObject.set(x, "undoStackSize", value.asInstanceOf[js.Any])
    
    inline def setUndoStackSizeUndefined: Self = StObject.set(x, "undoStackSize", js.undefined)
    
    inline def setUploadUrl(value: String): Self = StObject.set(x, "uploadUrl", value.asInstanceOf[js.Any])
    
    inline def setUploadUrlUndefined: Self = StObject.set(x, "uploadUrl", js.undefined)
    
    inline def setUseComputedState(value: Boolean): Self = StObject.set(x, "useComputedState", value.asInstanceOf[js.Any])
    
    inline def setUseComputedStateUndefined: Self = StObject.set(x, "useComputedState", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWsc_cmd(value: String): Self = StObject.set(x, "wsc_cmd", value.asInstanceOf[js.Any])
    
    inline def setWsc_cmdUndefined: Self = StObject.set(x, "wsc_cmd", js.undefined)
    
    inline def setWsc_customDictionaryIds(value: String): Self = StObject.set(x, "wsc_customDictionaryIds", value.asInstanceOf[js.Any])
    
    inline def setWsc_customDictionaryIdsUndefined: Self = StObject.set(x, "wsc_customDictionaryIds", js.undefined)
    
    inline def setWsc_customLoaderScript(value: String): Self = StObject.set(x, "wsc_customLoaderScript", value.asInstanceOf[js.Any])
    
    inline def setWsc_customLoaderScriptUndefined: Self = StObject.set(x, "wsc_customLoaderScript", js.undefined)
    
    inline def setWsc_customerId(value: String): Self = StObject.set(x, "wsc_customerId", value.asInstanceOf[js.Any])
    
    inline def setWsc_customerIdUndefined: Self = StObject.set(x, "wsc_customerId", js.undefined)
    
    inline def setWsc_height(value: String): Self = StObject.set(x, "wsc_height", value.asInstanceOf[js.Any])
    
    inline def setWsc_heightUndefined: Self = StObject.set(x, "wsc_height", js.undefined)
    
    inline def setWsc_lang(value: String): Self = StObject.set(x, "wsc_lang", value.asInstanceOf[js.Any])
    
    inline def setWsc_langUndefined: Self = StObject.set(x, "wsc_lang", js.undefined)
    
    inline def setWsc_left(value: String): Self = StObject.set(x, "wsc_left", value.asInstanceOf[js.Any])
    
    inline def setWsc_leftUndefined: Self = StObject.set(x, "wsc_left", js.undefined)
    
    inline def setWsc_top(value: String): Self = StObject.set(x, "wsc_top", value.asInstanceOf[js.Any])
    
    inline def setWsc_topUndefined: Self = StObject.set(x, "wsc_top", js.undefined)
    
    inline def setWsc_userDictionaryName(value: String): Self = StObject.set(x, "wsc_userDictionaryName", value.asInstanceOf[js.Any])
    
    inline def setWsc_userDictionaryNameUndefined: Self = StObject.set(x, "wsc_userDictionaryName", js.undefined)
    
    inline def setWsc_width(value: String): Self = StObject.set(x, "wsc_width", value.asInstanceOf[js.Any])
    
    inline def setWsc_widthUndefined: Self = StObject.set(x, "wsc_width", js.undefined)
  }
  
  trait styleObject extends StObject {
    
    var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var element: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var styles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object styleObject {
    
    inline def apply(element: String): styleObject = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[styleObject]
    }
    
    extension [Self <: styleObject](x: Self) {
      
      inline def setAttributes(value: StringDictionary[js.Any]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverrides(value: StringDictionary[js.Any]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
