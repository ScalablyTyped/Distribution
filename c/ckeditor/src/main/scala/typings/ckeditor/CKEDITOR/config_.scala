package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.config.styleObject
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor.eventObject
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import typings.ckeditor.anon.Groups
import typings.ckeditor.ckeditorStrings.html
import typings.ckeditor.ckeditorStrings.text
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
trait config_ extends js.Object {
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

object config_ {
  @scala.inline
  def apply(
    allowedContent: Boolean | allowedContentRules = null,
    autoEmbed_widget: String | (js.Function1[/* url */ String, String]) = null,
    autoGrow_bottomSpace: js.UndefOr[Double] = js.undefined,
    autoGrow_maxHeight: js.UndefOr[Double] = js.undefined,
    autoGrow_minHeight: js.UndefOr[Double] = js.undefined,
    autoGrow_onStartup: js.UndefOr[Boolean] = js.undefined,
    autoUpdateElement: js.UndefOr[Boolean] = js.undefined,
    baseFloatZIndex: js.UndefOr[Double] = js.undefined,
    baseHref: String = null,
    basicEntities: js.UndefOr[Boolean] = js.undefined,
    blockedKeystrokes: js.Array[Double] = null,
    bodyClass: String = null,
    bodyId: String = null,
    browserContextMenuOnCtrl: js.UndefOr[Boolean] = js.undefined,
    clipboard_defaultContentType: html | text = null,
    clipboard_notificationDuration: js.UndefOr[Double] = js.undefined,
    cloudServices_tokenUrl: String = null,
    cloudServices_uploadUrl: String = null,
    coceSnippet_theme: String = null,
    codeSnippetGeshi_url: String = null,
    codeSnippet_codeClass: String = null,
    codeSnippet_languages: StringDictionary[js.Any] = null,
    colorButton_backStyle: styleObject = null,
    colorButton_colors: String = null,
    colorButton_colorsPerRow: js.UndefOr[Double] = js.undefined,
    colorButton_enableAutomatic: js.UndefOr[Boolean] = js.undefined,
    colorButton_enableMore: js.UndefOr[Boolean] = js.undefined,
    colorButton_foreStyle: styleObject = null,
    colorButton_normalizeBackground: js.UndefOr[Boolean] = js.undefined,
    contentsCss: String | js.Array[String] = null,
    contentsLangDirection: String = null,
    contentsLanguage: String = null,
    copyFormatting_allowRules: String = null,
    copyFormatting_allowedContexts: Boolean | js.Array[String] = null,
    copyFormatting_keystrokeCopy: js.UndefOr[Double] = js.undefined,
    copyFormatting_keystrokePaste: js.UndefOr[Double] = js.undefined,
    copyFormatting_outerCursor: js.UndefOr[Boolean] = js.undefined,
    coreStyles_bold: styleObject = null,
    coreStyles_italic: styleObject = null,
    coreStyles_strike: styleObject = null,
    coreStyles_subscript: styleObject = null,
    coreStyles_superscript: styleObject = null,
    coreStyles_underline: styleObject = null,
    customConfig: String = null,
    dataIndentationChars: String = null,
    defaultLanguage: String = null,
    devtools_styles: String = null,
    devtools_textCallback: (/* editor */ editor, /* dialog */ dialog, /* element */ element, /* tabName */ String) => String = null,
    dialog_backgroundCoverColor: String = null,
    dialog_backgroundCoverOpacity: js.UndefOr[Double] = js.undefined,
    dialog_buttonsOrder: String = null,
    dialog_magnetDistance: js.UndefOr[Double] = js.undefined,
    dialog_noConfirmCancel: js.UndefOr[Boolean] = js.undefined,
    dialog_startupFocusTab: js.UndefOr[Boolean] = js.undefined,
    disableNativeObjectResizing: js.UndefOr[Boolean] = js.undefined,
    disableNativeReadonlyStyling: js.UndefOr[Boolean] = js.undefined,
    disableNativeSpellChecker: js.UndefOr[Boolean] = js.undefined,
    disableNativeTableHandles: js.UndefOr[Boolean] = js.undefined,
    disallowedContent: disallowedContentRules = null,
    div_wrapTable: js.UndefOr[Boolean] = js.undefined,
    docType: String = null,
    easyimage_class: String = null,
    easyimage_defaultStyle: String = null,
    easyimage_styles: StringDictionary[js.Any] = null,
    easyimage_toolbar: js.Array[String] | String = null,
    emailProtection: String = null,
    embed_provider: String = null,
    emoji_emojiListUrl: String = null,
    emoji_minChars: js.UndefOr[Double] = js.undefined,
    enableContextMenu: js.UndefOr[Boolean] = js.undefined,
    enableTabKeyTools: js.UndefOr[Boolean] = js.undefined,
    enterMode: js.UndefOr[Double] = js.undefined,
    entities: js.UndefOr[Boolean] = js.undefined,
    entities_additional: String = null,
    entities_greek: js.UndefOr[Boolean] = js.undefined,
    entities_latin: js.UndefOr[Boolean] = js.undefined,
    entities_processNumerical: Boolean | String = null,
    extraAllowedContent: allowedContentRules = null,
    extraPlugins: String = null,
    fileTools_defaultFileName: String = null,
    fileTools_requestHeaders: StringDictionary[js.Any] = null,
    filebrowserBrowseUrl: String = null,
    filebrowserFlashBrowseUrl: String = null,
    filebrowserFlashUploadUrl: String = null,
    filebrowserImageBrowseLinkUrl: String = null,
    filebrowserImageBrowseUrl: String = null,
    filebrowserImageUploadUrl: String = null,
    filebrowserUploadMethod: String = null,
    filebrowserUploadUrl: String = null,
    filebrowserWindowFeatures: String = null,
    filebrowserWindowHeight: Double | String = null,
    filebrowserWindowWidth: Double | String = null,
    fillEmptyBlocks: Boolean | (js.Function1[/* element */ typings.ckeditor.CKEDITOR.htmlParser.element, Boolean]) = null,
    find_highlight: styleObject = null,
    flashAddEmbedTag: js.UndefOr[Boolean] = js.undefined,
    flashConvertOnEdit: js.UndefOr[Boolean] = js.undefined,
    flashEmbedTagOnly: js.UndefOr[Boolean] = js.undefined,
    floatSpaceDockedOffsetX: js.UndefOr[Double] = js.undefined,
    floatSpaceDockedOffsetY: js.UndefOr[Double] = js.undefined,
    floatSpacePinnedOffsetX: js.UndefOr[Double] = js.undefined,
    floatSpacePinnedOffsetY: js.UndefOr[Double] = js.undefined,
    floatSpacePreferRight: js.UndefOr[Boolean] = js.undefined,
    fontSize_defaultLabel: String = null,
    fontSize_sizes: String = null,
    fontSize_style: styleObject = null,
    font_defaultLabel: String = null,
    font_names: String = null,
    font_style: styleObject = null,
    forceEnterMode: js.UndefOr[Boolean] = js.undefined,
    forcePasteAsPlainText: js.UndefOr[Boolean] = js.undefined,
    forceSimpleAmpersand: js.UndefOr[Boolean] = js.undefined,
    format_address: styleObject = null,
    format_div: styleObject = null,
    format_h1: styleObject = null,
    format_h2: styleObject = null,
    format_h3: styleObject = null,
    format_h4: styleObject = null,
    format_h5: styleObject = null,
    format_h6: styleObject = null,
    format_p: styleObject = null,
    format_pre: styleObject = null,
    format_tags: String = null,
    fullPage: js.UndefOr[Boolean] = js.undefined,
    grayt_autoStartup: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    htmlEncodeOutput: js.UndefOr[Boolean] = js.undefined,
    ignoreEmptyParagraph: js.UndefOr[Boolean] = js.undefined,
    image2_alignClasses: js.Array[String] = null,
    image2_altRequired: js.UndefOr[Boolean] = js.undefined,
    image2_captionedClass: String = null,
    image2_disableResizer: js.UndefOr[Boolean] = js.undefined,
    image2_prefillDimensions: js.UndefOr[Boolean] = js.undefined,
    imageUploadUrl: String = null,
    image_prefillDimensions: js.UndefOr[Boolean] = js.undefined,
    image_previewText: String = null,
    image_removeLinkByEmptyUrl: js.UndefOr[Boolean] = js.undefined,
    indentClasses: js.Array[String] = null,
    indentOffset: js.UndefOr[Double] = js.undefined,
    indentUnit: String = null,
    jqueryOverrideVal: js.UndefOr[Boolean] = js.undefined,
    justifyClasses: js.Array[String] = null,
    keystrokes: js.Array[js.Tuple2[Double, String]] = null,
    language: String = null,
    language_list: js.Array[String] = null,
    linkJavaScriptLinksAllowed: js.UndefOr[Boolean] = js.undefined,
    linkShowAdvancedTab: js.UndefOr[Boolean] = js.undefined,
    linkShowTargetTab: js.UndefOr[Boolean] = js.undefined,
    magicline_color: String = null,
    magicline_everywhere: js.UndefOr[Boolean] = js.undefined,
    magicline_holdDistance: js.UndefOr[Double] = js.undefined,
    magicline_keystrokeNext: js.UndefOr[Double] = js.undefined,
    magicline_keystrokePrevious: js.UndefOr[Double] = js.undefined,
    magicline_tabuList: js.Array[String] = null,
    magicline_triggerOffset: js.UndefOr[Double] = js.undefined,
    mathJaxClass: String = null,
    mathJaxLib: String = null,
    menu_groups: String = null,
    menu_subMenuDelay: js.UndefOr[Double] = js.undefined,
    newpage_html: String = null,
    notification_duration: js.UndefOr[Double] = js.undefined,
    on: eventObject = null,
    pasteFilter: String = null,
    pasteFromWordCleanupFile: String = null,
    pasteFromWordNumberedHeadingToList: js.UndefOr[Boolean] = js.undefined,
    pasteFromWordPromptCleanup: js.UndefOr[Boolean] = js.undefined,
    pasteFromWordRemoveFontStyles: js.UndefOr[Boolean] = js.undefined,
    pasteFromWordRemoveStyles: js.UndefOr[Boolean] = js.undefined,
    pasteFromWord_heuristicsEdgeList: js.UndefOr[Boolean] = js.undefined,
    pasteFromWord_inlineImages: js.UndefOr[Boolean] = js.undefined,
    plugins: String = null,
    protectedSource: js.Array[RegExp] = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    removeButtons: String = null,
    removeDialogTabs: String = null,
    removeFormatAttributes: String = null,
    removeFormatTags: String = null,
    removePlugins: String = null,
    resize_dir: String = null,
    resize_enabled: js.UndefOr[Boolean] = js.undefined,
    resize_maxHeight: js.UndefOr[Double] = js.undefined,
    resize_maxWidth: js.UndefOr[Double] = js.undefined,
    resize_minHeight: js.UndefOr[Double] = js.undefined,
    resize_minWidth: js.UndefOr[Double] = js.undefined,
    scayt_autoStartup: js.UndefOr[Boolean] = js.undefined,
    scayt_contextCommands: String = null,
    scayt_contextMenuItemsOrder: String = null,
    scayt_customDictionaryIds: String = null,
    scayt_customerId: String = null,
    scayt_disableOptionsStorage: String | js.Array[String] = null,
    scayt_elementsToIgnore: String = null,
    scayt_handleCheckDirty: String = null,
    scayt_handleUndoRedo: String = null,
    scayt_ignoreAllCapsWords: js.UndefOr[Boolean] = js.undefined,
    scayt_ignoreDomainNames: js.UndefOr[Boolean] = js.undefined,
    scayt_ignoreWordsWithMixedCases: js.UndefOr[Boolean] = js.undefined,
    scayt_ignoreWordsWithNumbers: js.UndefOr[Boolean] = js.undefined,
    scayt_inlineModeImmediateMarkup: js.UndefOr[Boolean] = js.undefined,
    scayt_maxSuggestions: js.UndefOr[Double] = js.undefined,
    scayt_minWordLength: js.UndefOr[Double] = js.undefined,
    scayt_moreSuggestions: String = null,
    scayt_multiLanguageMode: js.UndefOr[Boolean] = js.undefined,
    scayt_multiLanguageStyles: StringDictionary[js.Any] = null,
    scayt_sLang: String = null,
    scayt_serviceHost: String = null,
    scayt_servicePath: String = null,
    scayt_servicePort: String = null,
    scayt_serviceProtocol: String = null,
    scayt_srcUrl: String = null,
    scayt_uiTabs: String = null,
    scayt_userDictionaryName: String = null,
    sharedSpaces: sharedSpace = null,
    shiftEnterMode: js.UndefOr[Double] = js.undefined,
    skin: String = null,
    smiley_columns: js.UndefOr[Double] = js.undefined,
    smiley_descriptions: js.Array[String] = null,
    smiley_images: js.Array[String] = null,
    smiley_path: String = null,
    sourceAreaTabSize: js.UndefOr[Double] = js.undefined,
    specialChars: js.Array[String | (js.Tuple2[String, String])] = null,
    startupFocus: String | Boolean = null,
    startupMode: String = null,
    startupOutlineBlocks: js.UndefOr[Boolean] = js.undefined,
    startupShowBorders: js.UndefOr[Boolean] = js.undefined,
    stylesSet: String | Boolean | js.Array[styleObject] = null,
    stylesheetParser_skipSelectors: RegExp = null,
    stylesheetParser_validSelectors: RegExp = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    tabSpaces: js.UndefOr[Double] = js.undefined,
    templates: String = null,
    templates_files: StringDictionary[js.Any] = null,
    templates_replaceContent: js.UndefOr[Boolean] = js.undefined,
    title: String | Boolean = null,
    toolbar: js.UndefOr[Null | String | (js.Array[String | js.Array[String] | Groups])] = js.undefined,
    toolbarCanCollapse: js.UndefOr[Boolean] = js.undefined,
    toolbarGroupCycling: js.UndefOr[Boolean] = js.undefined,
    toolbarGroups: js.Array[toolbarGroups | String] = null,
    toolbarLocation: String = null,
    toolbarStartupExpanded: js.UndefOr[Boolean] = js.undefined,
    uiColor: String = null,
    undoStackSize: js.UndefOr[Double] = js.undefined,
    uploadUrl: String = null,
    useComputedState: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    wsc_cmd: String = null,
    wsc_customDictionaryIds: String = null,
    wsc_customLoaderScript: String = null,
    wsc_customerId: String = null,
    wsc_height: String = null,
    wsc_lang: String = null,
    wsc_left: String = null,
    wsc_top: String = null,
    wsc_userDictionaryName: String = null,
    wsc_width: String = null
  ): config_ = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (autoEmbed_widget != null) __obj.updateDynamic("autoEmbed_widget")(autoEmbed_widget.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrow_bottomSpace)) __obj.updateDynamic("autoGrow_bottomSpace")(autoGrow_bottomSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrow_maxHeight)) __obj.updateDynamic("autoGrow_maxHeight")(autoGrow_maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrow_minHeight)) __obj.updateDynamic("autoGrow_minHeight")(autoGrow_minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrow_onStartup)) __obj.updateDynamic("autoGrow_onStartup")(autoGrow_onStartup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateElement)) __obj.updateDynamic("autoUpdateElement")(autoUpdateElement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(baseFloatZIndex)) __obj.updateDynamic("baseFloatZIndex")(baseFloatZIndex.get.asInstanceOf[js.Any])
    if (baseHref != null) __obj.updateDynamic("baseHref")(baseHref.asInstanceOf[js.Any])
    if (!js.isUndefined(basicEntities)) __obj.updateDynamic("basicEntities")(basicEntities.get.asInstanceOf[js.Any])
    if (blockedKeystrokes != null) __obj.updateDynamic("blockedKeystrokes")(blockedKeystrokes.asInstanceOf[js.Any])
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass.asInstanceOf[js.Any])
    if (bodyId != null) __obj.updateDynamic("bodyId")(bodyId.asInstanceOf[js.Any])
    if (!js.isUndefined(browserContextMenuOnCtrl)) __obj.updateDynamic("browserContextMenuOnCtrl")(browserContextMenuOnCtrl.get.asInstanceOf[js.Any])
    if (clipboard_defaultContentType != null) __obj.updateDynamic("clipboard_defaultContentType")(clipboard_defaultContentType.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboard_notificationDuration)) __obj.updateDynamic("clipboard_notificationDuration")(clipboard_notificationDuration.get.asInstanceOf[js.Any])
    if (cloudServices_tokenUrl != null) __obj.updateDynamic("cloudServices_tokenUrl")(cloudServices_tokenUrl.asInstanceOf[js.Any])
    if (cloudServices_uploadUrl != null) __obj.updateDynamic("cloudServices_uploadUrl")(cloudServices_uploadUrl.asInstanceOf[js.Any])
    if (coceSnippet_theme != null) __obj.updateDynamic("coceSnippet_theme")(coceSnippet_theme.asInstanceOf[js.Any])
    if (codeSnippetGeshi_url != null) __obj.updateDynamic("codeSnippetGeshi_url")(codeSnippetGeshi_url.asInstanceOf[js.Any])
    if (codeSnippet_codeClass != null) __obj.updateDynamic("codeSnippet_codeClass")(codeSnippet_codeClass.asInstanceOf[js.Any])
    if (codeSnippet_languages != null) __obj.updateDynamic("codeSnippet_languages")(codeSnippet_languages.asInstanceOf[js.Any])
    if (colorButton_backStyle != null) __obj.updateDynamic("colorButton_backStyle")(colorButton_backStyle.asInstanceOf[js.Any])
    if (colorButton_colors != null) __obj.updateDynamic("colorButton_colors")(colorButton_colors.asInstanceOf[js.Any])
    if (!js.isUndefined(colorButton_colorsPerRow)) __obj.updateDynamic("colorButton_colorsPerRow")(colorButton_colorsPerRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorButton_enableAutomatic)) __obj.updateDynamic("colorButton_enableAutomatic")(colorButton_enableAutomatic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(colorButton_enableMore)) __obj.updateDynamic("colorButton_enableMore")(colorButton_enableMore.get.asInstanceOf[js.Any])
    if (colorButton_foreStyle != null) __obj.updateDynamic("colorButton_foreStyle")(colorButton_foreStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(colorButton_normalizeBackground)) __obj.updateDynamic("colorButton_normalizeBackground")(colorButton_normalizeBackground.get.asInstanceOf[js.Any])
    if (contentsCss != null) __obj.updateDynamic("contentsCss")(contentsCss.asInstanceOf[js.Any])
    if (contentsLangDirection != null) __obj.updateDynamic("contentsLangDirection")(contentsLangDirection.asInstanceOf[js.Any])
    if (contentsLanguage != null) __obj.updateDynamic("contentsLanguage")(contentsLanguage.asInstanceOf[js.Any])
    if (copyFormatting_allowRules != null) __obj.updateDynamic("copyFormatting_allowRules")(copyFormatting_allowRules.asInstanceOf[js.Any])
    if (copyFormatting_allowedContexts != null) __obj.updateDynamic("copyFormatting_allowedContexts")(copyFormatting_allowedContexts.asInstanceOf[js.Any])
    if (!js.isUndefined(copyFormatting_keystrokeCopy)) __obj.updateDynamic("copyFormatting_keystrokeCopy")(copyFormatting_keystrokeCopy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyFormatting_keystrokePaste)) __obj.updateDynamic("copyFormatting_keystrokePaste")(copyFormatting_keystrokePaste.get.asInstanceOf[js.Any])
    if (!js.isUndefined(copyFormatting_outerCursor)) __obj.updateDynamic("copyFormatting_outerCursor")(copyFormatting_outerCursor.get.asInstanceOf[js.Any])
    if (coreStyles_bold != null) __obj.updateDynamic("coreStyles_bold")(coreStyles_bold.asInstanceOf[js.Any])
    if (coreStyles_italic != null) __obj.updateDynamic("coreStyles_italic")(coreStyles_italic.asInstanceOf[js.Any])
    if (coreStyles_strike != null) __obj.updateDynamic("coreStyles_strike")(coreStyles_strike.asInstanceOf[js.Any])
    if (coreStyles_subscript != null) __obj.updateDynamic("coreStyles_subscript")(coreStyles_subscript.asInstanceOf[js.Any])
    if (coreStyles_superscript != null) __obj.updateDynamic("coreStyles_superscript")(coreStyles_superscript.asInstanceOf[js.Any])
    if (coreStyles_underline != null) __obj.updateDynamic("coreStyles_underline")(coreStyles_underline.asInstanceOf[js.Any])
    if (customConfig != null) __obj.updateDynamic("customConfig")(customConfig.asInstanceOf[js.Any])
    if (dataIndentationChars != null) __obj.updateDynamic("dataIndentationChars")(dataIndentationChars.asInstanceOf[js.Any])
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage.asInstanceOf[js.Any])
    if (devtools_styles != null) __obj.updateDynamic("devtools_styles")(devtools_styles.asInstanceOf[js.Any])
    if (devtools_textCallback != null) __obj.updateDynamic("devtools_textCallback")(js.Any.fromFunction4(devtools_textCallback))
    if (dialog_backgroundCoverColor != null) __obj.updateDynamic("dialog_backgroundCoverColor")(dialog_backgroundCoverColor.asInstanceOf[js.Any])
    if (!js.isUndefined(dialog_backgroundCoverOpacity)) __obj.updateDynamic("dialog_backgroundCoverOpacity")(dialog_backgroundCoverOpacity.get.asInstanceOf[js.Any])
    if (dialog_buttonsOrder != null) __obj.updateDynamic("dialog_buttonsOrder")(dialog_buttonsOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(dialog_magnetDistance)) __obj.updateDynamic("dialog_magnetDistance")(dialog_magnetDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dialog_noConfirmCancel)) __obj.updateDynamic("dialog_noConfirmCancel")(dialog_noConfirmCancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dialog_startupFocusTab)) __obj.updateDynamic("dialog_startupFocusTab")(dialog_startupFocusTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNativeObjectResizing)) __obj.updateDynamic("disableNativeObjectResizing")(disableNativeObjectResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNativeReadonlyStyling)) __obj.updateDynamic("disableNativeReadonlyStyling")(disableNativeReadonlyStyling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNativeSpellChecker)) __obj.updateDynamic("disableNativeSpellChecker")(disableNativeSpellChecker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNativeTableHandles)) __obj.updateDynamic("disableNativeTableHandles")(disableNativeTableHandles.get.asInstanceOf[js.Any])
    if (disallowedContent != null) __obj.updateDynamic("disallowedContent")(disallowedContent.asInstanceOf[js.Any])
    if (!js.isUndefined(div_wrapTable)) __obj.updateDynamic("div_wrapTable")(div_wrapTable.get.asInstanceOf[js.Any])
    if (docType != null) __obj.updateDynamic("docType")(docType.asInstanceOf[js.Any])
    if (easyimage_class != null) __obj.updateDynamic("easyimage_class")(easyimage_class.asInstanceOf[js.Any])
    if (easyimage_defaultStyle != null) __obj.updateDynamic("easyimage_defaultStyle")(easyimage_defaultStyle.asInstanceOf[js.Any])
    if (easyimage_styles != null) __obj.updateDynamic("easyimage_styles")(easyimage_styles.asInstanceOf[js.Any])
    if (easyimage_toolbar != null) __obj.updateDynamic("easyimage_toolbar")(easyimage_toolbar.asInstanceOf[js.Any])
    if (emailProtection != null) __obj.updateDynamic("emailProtection")(emailProtection.asInstanceOf[js.Any])
    if (embed_provider != null) __obj.updateDynamic("embed_provider")(embed_provider.asInstanceOf[js.Any])
    if (emoji_emojiListUrl != null) __obj.updateDynamic("emoji_emojiListUrl")(emoji_emojiListUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(emoji_minChars)) __obj.updateDynamic("emoji_minChars")(emoji_minChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTabKeyTools)) __obj.updateDynamic("enableTabKeyTools")(enableTabKeyTools.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMode)) __obj.updateDynamic("enterMode")(enterMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities.get.asInstanceOf[js.Any])
    if (entities_additional != null) __obj.updateDynamic("entities_additional")(entities_additional.asInstanceOf[js.Any])
    if (!js.isUndefined(entities_greek)) __obj.updateDynamic("entities_greek")(entities_greek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(entities_latin)) __obj.updateDynamic("entities_latin")(entities_latin.get.asInstanceOf[js.Any])
    if (entities_processNumerical != null) __obj.updateDynamic("entities_processNumerical")(entities_processNumerical.asInstanceOf[js.Any])
    if (extraAllowedContent != null) __obj.updateDynamic("extraAllowedContent")(extraAllowedContent.asInstanceOf[js.Any])
    if (extraPlugins != null) __obj.updateDynamic("extraPlugins")(extraPlugins.asInstanceOf[js.Any])
    if (fileTools_defaultFileName != null) __obj.updateDynamic("fileTools_defaultFileName")(fileTools_defaultFileName.asInstanceOf[js.Any])
    if (fileTools_requestHeaders != null) __obj.updateDynamic("fileTools_requestHeaders")(fileTools_requestHeaders.asInstanceOf[js.Any])
    if (filebrowserBrowseUrl != null) __obj.updateDynamic("filebrowserBrowseUrl")(filebrowserBrowseUrl.asInstanceOf[js.Any])
    if (filebrowserFlashBrowseUrl != null) __obj.updateDynamic("filebrowserFlashBrowseUrl")(filebrowserFlashBrowseUrl.asInstanceOf[js.Any])
    if (filebrowserFlashUploadUrl != null) __obj.updateDynamic("filebrowserFlashUploadUrl")(filebrowserFlashUploadUrl.asInstanceOf[js.Any])
    if (filebrowserImageBrowseLinkUrl != null) __obj.updateDynamic("filebrowserImageBrowseLinkUrl")(filebrowserImageBrowseLinkUrl.asInstanceOf[js.Any])
    if (filebrowserImageBrowseUrl != null) __obj.updateDynamic("filebrowserImageBrowseUrl")(filebrowserImageBrowseUrl.asInstanceOf[js.Any])
    if (filebrowserImageUploadUrl != null) __obj.updateDynamic("filebrowserImageUploadUrl")(filebrowserImageUploadUrl.asInstanceOf[js.Any])
    if (filebrowserUploadMethod != null) __obj.updateDynamic("filebrowserUploadMethod")(filebrowserUploadMethod.asInstanceOf[js.Any])
    if (filebrowserUploadUrl != null) __obj.updateDynamic("filebrowserUploadUrl")(filebrowserUploadUrl.asInstanceOf[js.Any])
    if (filebrowserWindowFeatures != null) __obj.updateDynamic("filebrowserWindowFeatures")(filebrowserWindowFeatures.asInstanceOf[js.Any])
    if (filebrowserWindowHeight != null) __obj.updateDynamic("filebrowserWindowHeight")(filebrowserWindowHeight.asInstanceOf[js.Any])
    if (filebrowserWindowWidth != null) __obj.updateDynamic("filebrowserWindowWidth")(filebrowserWindowWidth.asInstanceOf[js.Any])
    if (fillEmptyBlocks != null) __obj.updateDynamic("fillEmptyBlocks")(fillEmptyBlocks.asInstanceOf[js.Any])
    if (find_highlight != null) __obj.updateDynamic("find_highlight")(find_highlight.asInstanceOf[js.Any])
    if (!js.isUndefined(flashAddEmbedTag)) __obj.updateDynamic("flashAddEmbedTag")(flashAddEmbedTag.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flashConvertOnEdit)) __obj.updateDynamic("flashConvertOnEdit")(flashConvertOnEdit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flashEmbedTagOnly)) __obj.updateDynamic("flashEmbedTagOnly")(flashEmbedTagOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpaceDockedOffsetX)) __obj.updateDynamic("floatSpaceDockedOffsetX")(floatSpaceDockedOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpaceDockedOffsetY)) __obj.updateDynamic("floatSpaceDockedOffsetY")(floatSpaceDockedOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpacePinnedOffsetX)) __obj.updateDynamic("floatSpacePinnedOffsetX")(floatSpacePinnedOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpacePinnedOffsetY)) __obj.updateDynamic("floatSpacePinnedOffsetY")(floatSpacePinnedOffsetY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpacePreferRight)) __obj.updateDynamic("floatSpacePreferRight")(floatSpacePreferRight.get.asInstanceOf[js.Any])
    if (fontSize_defaultLabel != null) __obj.updateDynamic("fontSize_defaultLabel")(fontSize_defaultLabel.asInstanceOf[js.Any])
    if (fontSize_sizes != null) __obj.updateDynamic("fontSize_sizes")(fontSize_sizes.asInstanceOf[js.Any])
    if (fontSize_style != null) __obj.updateDynamic("fontSize_style")(fontSize_style.asInstanceOf[js.Any])
    if (font_defaultLabel != null) __obj.updateDynamic("font_defaultLabel")(font_defaultLabel.asInstanceOf[js.Any])
    if (font_names != null) __obj.updateDynamic("font_names")(font_names.asInstanceOf[js.Any])
    if (font_style != null) __obj.updateDynamic("font_style")(font_style.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnterMode)) __obj.updateDynamic("forceEnterMode")(forceEnterMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forcePasteAsPlainText)) __obj.updateDynamic("forcePasteAsPlainText")(forcePasteAsPlainText.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSimpleAmpersand)) __obj.updateDynamic("forceSimpleAmpersand")(forceSimpleAmpersand.get.asInstanceOf[js.Any])
    if (format_address != null) __obj.updateDynamic("format_address")(format_address.asInstanceOf[js.Any])
    if (format_div != null) __obj.updateDynamic("format_div")(format_div.asInstanceOf[js.Any])
    if (format_h1 != null) __obj.updateDynamic("format_h1")(format_h1.asInstanceOf[js.Any])
    if (format_h2 != null) __obj.updateDynamic("format_h2")(format_h2.asInstanceOf[js.Any])
    if (format_h3 != null) __obj.updateDynamic("format_h3")(format_h3.asInstanceOf[js.Any])
    if (format_h4 != null) __obj.updateDynamic("format_h4")(format_h4.asInstanceOf[js.Any])
    if (format_h5 != null) __obj.updateDynamic("format_h5")(format_h5.asInstanceOf[js.Any])
    if (format_h6 != null) __obj.updateDynamic("format_h6")(format_h6.asInstanceOf[js.Any])
    if (format_p != null) __obj.updateDynamic("format_p")(format_p.asInstanceOf[js.Any])
    if (format_pre != null) __obj.updateDynamic("format_pre")(format_pre.asInstanceOf[js.Any])
    if (format_tags != null) __obj.updateDynamic("format_tags")(format_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grayt_autoStartup)) __obj.updateDynamic("grayt_autoStartup")(grayt_autoStartup.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlEncodeOutput)) __obj.updateDynamic("htmlEncodeOutput")(htmlEncodeOutput.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptyParagraph)) __obj.updateDynamic("ignoreEmptyParagraph")(ignoreEmptyParagraph.get.asInstanceOf[js.Any])
    if (image2_alignClasses != null) __obj.updateDynamic("image2_alignClasses")(image2_alignClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(image2_altRequired)) __obj.updateDynamic("image2_altRequired")(image2_altRequired.get.asInstanceOf[js.Any])
    if (image2_captionedClass != null) __obj.updateDynamic("image2_captionedClass")(image2_captionedClass.asInstanceOf[js.Any])
    if (!js.isUndefined(image2_disableResizer)) __obj.updateDynamic("image2_disableResizer")(image2_disableResizer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(image2_prefillDimensions)) __obj.updateDynamic("image2_prefillDimensions")(image2_prefillDimensions.get.asInstanceOf[js.Any])
    if (imageUploadUrl != null) __obj.updateDynamic("imageUploadUrl")(imageUploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(image_prefillDimensions)) __obj.updateDynamic("image_prefillDimensions")(image_prefillDimensions.get.asInstanceOf[js.Any])
    if (image_previewText != null) __obj.updateDynamic("image_previewText")(image_previewText.asInstanceOf[js.Any])
    if (!js.isUndefined(image_removeLinkByEmptyUrl)) __obj.updateDynamic("image_removeLinkByEmptyUrl")(image_removeLinkByEmptyUrl.get.asInstanceOf[js.Any])
    if (indentClasses != null) __obj.updateDynamic("indentClasses")(indentClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(indentOffset)) __obj.updateDynamic("indentOffset")(indentOffset.get.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(jqueryOverrideVal)) __obj.updateDynamic("jqueryOverrideVal")(jqueryOverrideVal.get.asInstanceOf[js.Any])
    if (justifyClasses != null) __obj.updateDynamic("justifyClasses")(justifyClasses.asInstanceOf[js.Any])
    if (keystrokes != null) __obj.updateDynamic("keystrokes")(keystrokes.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (language_list != null) __obj.updateDynamic("language_list")(language_list.asInstanceOf[js.Any])
    if (!js.isUndefined(linkJavaScriptLinksAllowed)) __obj.updateDynamic("linkJavaScriptLinksAllowed")(linkJavaScriptLinksAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkShowAdvancedTab)) __obj.updateDynamic("linkShowAdvancedTab")(linkShowAdvancedTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkShowTargetTab)) __obj.updateDynamic("linkShowTargetTab")(linkShowTargetTab.get.asInstanceOf[js.Any])
    if (magicline_color != null) __obj.updateDynamic("magicline_color")(magicline_color.asInstanceOf[js.Any])
    if (!js.isUndefined(magicline_everywhere)) __obj.updateDynamic("magicline_everywhere")(magicline_everywhere.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magicline_holdDistance)) __obj.updateDynamic("magicline_holdDistance")(magicline_holdDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magicline_keystrokeNext)) __obj.updateDynamic("magicline_keystrokeNext")(magicline_keystrokeNext.get.asInstanceOf[js.Any])
    if (!js.isUndefined(magicline_keystrokePrevious)) __obj.updateDynamic("magicline_keystrokePrevious")(magicline_keystrokePrevious.get.asInstanceOf[js.Any])
    if (magicline_tabuList != null) __obj.updateDynamic("magicline_tabuList")(magicline_tabuList.asInstanceOf[js.Any])
    if (!js.isUndefined(magicline_triggerOffset)) __obj.updateDynamic("magicline_triggerOffset")(magicline_triggerOffset.get.asInstanceOf[js.Any])
    if (mathJaxClass != null) __obj.updateDynamic("mathJaxClass")(mathJaxClass.asInstanceOf[js.Any])
    if (mathJaxLib != null) __obj.updateDynamic("mathJaxLib")(mathJaxLib.asInstanceOf[js.Any])
    if (menu_groups != null) __obj.updateDynamic("menu_groups")(menu_groups.asInstanceOf[js.Any])
    if (!js.isUndefined(menu_subMenuDelay)) __obj.updateDynamic("menu_subMenuDelay")(menu_subMenuDelay.get.asInstanceOf[js.Any])
    if (newpage_html != null) __obj.updateDynamic("newpage_html")(newpage_html.asInstanceOf[js.Any])
    if (!js.isUndefined(notification_duration)) __obj.updateDynamic("notification_duration")(notification_duration.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (pasteFilter != null) __obj.updateDynamic("pasteFilter")(pasteFilter.asInstanceOf[js.Any])
    if (pasteFromWordCleanupFile != null) __obj.updateDynamic("pasteFromWordCleanupFile")(pasteFromWordCleanupFile.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWordNumberedHeadingToList)) __obj.updateDynamic("pasteFromWordNumberedHeadingToList")(pasteFromWordNumberedHeadingToList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWordPromptCleanup)) __obj.updateDynamic("pasteFromWordPromptCleanup")(pasteFromWordPromptCleanup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWordRemoveFontStyles)) __obj.updateDynamic("pasteFromWordRemoveFontStyles")(pasteFromWordRemoveFontStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWordRemoveStyles)) __obj.updateDynamic("pasteFromWordRemoveStyles")(pasteFromWordRemoveStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWord_heuristicsEdgeList)) __obj.updateDynamic("pasteFromWord_heuristicsEdgeList")(pasteFromWord_heuristicsEdgeList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pasteFromWord_inlineImages)) __obj.updateDynamic("pasteFromWord_inlineImages")(pasteFromWord_inlineImages.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (protectedSource != null) __obj.updateDynamic("protectedSource")(protectedSource.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.get.asInstanceOf[js.Any])
    if (removeButtons != null) __obj.updateDynamic("removeButtons")(removeButtons.asInstanceOf[js.Any])
    if (removeDialogTabs != null) __obj.updateDynamic("removeDialogTabs")(removeDialogTabs.asInstanceOf[js.Any])
    if (removeFormatAttributes != null) __obj.updateDynamic("removeFormatAttributes")(removeFormatAttributes.asInstanceOf[js.Any])
    if (removeFormatTags != null) __obj.updateDynamic("removeFormatTags")(removeFormatTags.asInstanceOf[js.Any])
    if (removePlugins != null) __obj.updateDynamic("removePlugins")(removePlugins.asInstanceOf[js.Any])
    if (resize_dir != null) __obj.updateDynamic("resize_dir")(resize_dir.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_enabled)) __obj.updateDynamic("resize_enabled")(resize_enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_maxHeight)) __obj.updateDynamic("resize_maxHeight")(resize_maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_maxWidth)) __obj.updateDynamic("resize_maxWidth")(resize_maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_minHeight)) __obj.updateDynamic("resize_minHeight")(resize_minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resize_minWidth)) __obj.updateDynamic("resize_minWidth")(resize_minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_autoStartup)) __obj.updateDynamic("scayt_autoStartup")(scayt_autoStartup.get.asInstanceOf[js.Any])
    if (scayt_contextCommands != null) __obj.updateDynamic("scayt_contextCommands")(scayt_contextCommands.asInstanceOf[js.Any])
    if (scayt_contextMenuItemsOrder != null) __obj.updateDynamic("scayt_contextMenuItemsOrder")(scayt_contextMenuItemsOrder.asInstanceOf[js.Any])
    if (scayt_customDictionaryIds != null) __obj.updateDynamic("scayt_customDictionaryIds")(scayt_customDictionaryIds.asInstanceOf[js.Any])
    if (scayt_customerId != null) __obj.updateDynamic("scayt_customerId")(scayt_customerId.asInstanceOf[js.Any])
    if (scayt_disableOptionsStorage != null) __obj.updateDynamic("scayt_disableOptionsStorage")(scayt_disableOptionsStorage.asInstanceOf[js.Any])
    if (scayt_elementsToIgnore != null) __obj.updateDynamic("scayt_elementsToIgnore")(scayt_elementsToIgnore.asInstanceOf[js.Any])
    if (scayt_handleCheckDirty != null) __obj.updateDynamic("scayt_handleCheckDirty")(scayt_handleCheckDirty.asInstanceOf[js.Any])
    if (scayt_handleUndoRedo != null) __obj.updateDynamic("scayt_handleUndoRedo")(scayt_handleUndoRedo.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_ignoreAllCapsWords)) __obj.updateDynamic("scayt_ignoreAllCapsWords")(scayt_ignoreAllCapsWords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_ignoreDomainNames)) __obj.updateDynamic("scayt_ignoreDomainNames")(scayt_ignoreDomainNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_ignoreWordsWithMixedCases)) __obj.updateDynamic("scayt_ignoreWordsWithMixedCases")(scayt_ignoreWordsWithMixedCases.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_ignoreWordsWithNumbers)) __obj.updateDynamic("scayt_ignoreWordsWithNumbers")(scayt_ignoreWordsWithNumbers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_inlineModeImmediateMarkup)) __obj.updateDynamic("scayt_inlineModeImmediateMarkup")(scayt_inlineModeImmediateMarkup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_maxSuggestions)) __obj.updateDynamic("scayt_maxSuggestions")(scayt_maxSuggestions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_minWordLength)) __obj.updateDynamic("scayt_minWordLength")(scayt_minWordLength.get.asInstanceOf[js.Any])
    if (scayt_moreSuggestions != null) __obj.updateDynamic("scayt_moreSuggestions")(scayt_moreSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_multiLanguageMode)) __obj.updateDynamic("scayt_multiLanguageMode")(scayt_multiLanguageMode.get.asInstanceOf[js.Any])
    if (scayt_multiLanguageStyles != null) __obj.updateDynamic("scayt_multiLanguageStyles")(scayt_multiLanguageStyles.asInstanceOf[js.Any])
    if (scayt_sLang != null) __obj.updateDynamic("scayt_sLang")(scayt_sLang.asInstanceOf[js.Any])
    if (scayt_serviceHost != null) __obj.updateDynamic("scayt_serviceHost")(scayt_serviceHost.asInstanceOf[js.Any])
    if (scayt_servicePath != null) __obj.updateDynamic("scayt_servicePath")(scayt_servicePath.asInstanceOf[js.Any])
    if (scayt_servicePort != null) __obj.updateDynamic("scayt_servicePort")(scayt_servicePort.asInstanceOf[js.Any])
    if (scayt_serviceProtocol != null) __obj.updateDynamic("scayt_serviceProtocol")(scayt_serviceProtocol.asInstanceOf[js.Any])
    if (scayt_srcUrl != null) __obj.updateDynamic("scayt_srcUrl")(scayt_srcUrl.asInstanceOf[js.Any])
    if (scayt_uiTabs != null) __obj.updateDynamic("scayt_uiTabs")(scayt_uiTabs.asInstanceOf[js.Any])
    if (scayt_userDictionaryName != null) __obj.updateDynamic("scayt_userDictionaryName")(scayt_userDictionaryName.asInstanceOf[js.Any])
    if (sharedSpaces != null) __obj.updateDynamic("sharedSpaces")(sharedSpaces.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftEnterMode)) __obj.updateDynamic("shiftEnterMode")(shiftEnterMode.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (!js.isUndefined(smiley_columns)) __obj.updateDynamic("smiley_columns")(smiley_columns.get.asInstanceOf[js.Any])
    if (smiley_descriptions != null) __obj.updateDynamic("smiley_descriptions")(smiley_descriptions.asInstanceOf[js.Any])
    if (smiley_images != null) __obj.updateDynamic("smiley_images")(smiley_images.asInstanceOf[js.Any])
    if (smiley_path != null) __obj.updateDynamic("smiley_path")(smiley_path.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceAreaTabSize)) __obj.updateDynamic("sourceAreaTabSize")(sourceAreaTabSize.get.asInstanceOf[js.Any])
    if (specialChars != null) __obj.updateDynamic("specialChars")(specialChars.asInstanceOf[js.Any])
    if (startupFocus != null) __obj.updateDynamic("startupFocus")(startupFocus.asInstanceOf[js.Any])
    if (startupMode != null) __obj.updateDynamic("startupMode")(startupMode.asInstanceOf[js.Any])
    if (!js.isUndefined(startupOutlineBlocks)) __obj.updateDynamic("startupOutlineBlocks")(startupOutlineBlocks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startupShowBorders)) __obj.updateDynamic("startupShowBorders")(startupShowBorders.get.asInstanceOf[js.Any])
    if (stylesSet != null) __obj.updateDynamic("stylesSet")(stylesSet.asInstanceOf[js.Any])
    if (stylesheetParser_skipSelectors != null) __obj.updateDynamic("stylesheetParser_skipSelectors")(stylesheetParser_skipSelectors.asInstanceOf[js.Any])
    if (stylesheetParser_validSelectors != null) __obj.updateDynamic("stylesheetParser_validSelectors")(stylesheetParser_validSelectors.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSpaces)) __obj.updateDynamic("tabSpaces")(tabSpaces.get.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (templates_files != null) __obj.updateDynamic("templates_files")(templates_files.asInstanceOf[js.Any])
    if (!js.isUndefined(templates_replaceContent)) __obj.updateDynamic("templates_replaceContent")(templates_replaceContent.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbar)) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarCanCollapse)) __obj.updateDynamic("toolbarCanCollapse")(toolbarCanCollapse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarGroupCycling)) __obj.updateDynamic("toolbarGroupCycling")(toolbarGroupCycling.get.asInstanceOf[js.Any])
    if (toolbarGroups != null) __obj.updateDynamic("toolbarGroups")(toolbarGroups.asInstanceOf[js.Any])
    if (toolbarLocation != null) __obj.updateDynamic("toolbarLocation")(toolbarLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarStartupExpanded)) __obj.updateDynamic("toolbarStartupExpanded")(toolbarStartupExpanded.get.asInstanceOf[js.Any])
    if (uiColor != null) __obj.updateDynamic("uiColor")(uiColor.asInstanceOf[js.Any])
    if (!js.isUndefined(undoStackSize)) __obj.updateDynamic("undoStackSize")(undoStackSize.get.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useComputedState)) __obj.updateDynamic("useComputedState")(useComputedState.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wsc_cmd != null) __obj.updateDynamic("wsc_cmd")(wsc_cmd.asInstanceOf[js.Any])
    if (wsc_customDictionaryIds != null) __obj.updateDynamic("wsc_customDictionaryIds")(wsc_customDictionaryIds.asInstanceOf[js.Any])
    if (wsc_customLoaderScript != null) __obj.updateDynamic("wsc_customLoaderScript")(wsc_customLoaderScript.asInstanceOf[js.Any])
    if (wsc_customerId != null) __obj.updateDynamic("wsc_customerId")(wsc_customerId.asInstanceOf[js.Any])
    if (wsc_height != null) __obj.updateDynamic("wsc_height")(wsc_height.asInstanceOf[js.Any])
    if (wsc_lang != null) __obj.updateDynamic("wsc_lang")(wsc_lang.asInstanceOf[js.Any])
    if (wsc_left != null) __obj.updateDynamic("wsc_left")(wsc_left.asInstanceOf[js.Any])
    if (wsc_top != null) __obj.updateDynamic("wsc_top")(wsc_top.asInstanceOf[js.Any])
    if (wsc_userDictionaryName != null) __obj.updateDynamic("wsc_userDictionaryName")(wsc_userDictionaryName.asInstanceOf[js.Any])
    if (wsc_width != null) __obj.updateDynamic("wsc_width")(wsc_width.asInstanceOf[js.Any])
    __obj.asInstanceOf[config_]
  }
}

