package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://docs.com/ckeditor4/latest/api/CKEDITOR_config.html
trait config extends js.Object {
  var allowedContent: js.UndefOr[scala.Boolean | ckeditorLib.CKEDITORNs.filterNs.allowedContentRules] = js.undefined
  var autoEmbed_widget: js.UndefOr[java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String])] = js.undefined
  var autoGrow_bottomSpace: js.UndefOr[scala.Double] = js.undefined
  var autoGrow_maxHeight: js.UndefOr[scala.Double] = js.undefined
  var autoGrow_minHeight: js.UndefOr[scala.Double] = js.undefined
  var autoGrow_onStartup: js.UndefOr[scala.Boolean] = js.undefined
  var autoUpdateElement: js.UndefOr[scala.Boolean] = js.undefined
  var baseFloatZIndex: js.UndefOr[scala.Double] = js.undefined
  var baseHref: js.UndefOr[java.lang.String] = js.undefined
  var basicEntities: js.UndefOr[scala.Boolean] = js.undefined
  var blockedKeystrokes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var bodyClass: js.UndefOr[java.lang.String] = js.undefined
  var bodyId: js.UndefOr[java.lang.String] = js.undefined
  var browserContextMenuOnCtrl: js.UndefOr[scala.Boolean] = js.undefined
  var clipboard_defaultContentType: js.UndefOr[ckeditorLib.ckeditorLibStrings.html | ckeditorLib.ckeditorLibStrings.text] = js.undefined
  var clipboard_notificationDuration: js.UndefOr[scala.Double] = js.undefined
  var cloudServices_tokenUrl: js.UndefOr[java.lang.String] = js.undefined
  var cloudServices_uploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var coceSnippet_theme: js.UndefOr[java.lang.String] = js.undefined
  var codeSnippetGeshi_url: js.UndefOr[java.lang.String] = js.undefined
  var codeSnippet_codeClass: js.UndefOr[java.lang.String] = js.undefined
  var codeSnippet_languages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var colorButton_backStyle: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var colorButton_colors: js.UndefOr[java.lang.String] = js.undefined
  var colorButton_colorsPerRow: js.UndefOr[scala.Double] = js.undefined
  var colorButton_enableAutomatic: js.UndefOr[scala.Boolean] = js.undefined
  var colorButton_enableMore: js.UndefOr[scala.Boolean] = js.undefined
  var colorButton_foreStyle: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var colorButton_normalizeBackground: js.UndefOr[scala.Boolean] = js.undefined
  var contentsCss: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var contentsLangDirection: js.UndefOr[java.lang.String] = js.undefined
  var contentsLanguage: js.UndefOr[java.lang.String] = js.undefined
  var copyFormatting_allowRules: js.UndefOr[java.lang.String] = js.undefined
  var copyFormatting_allowedContexts: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  var copyFormatting_keystrokeCopy: js.UndefOr[scala.Double] = js.undefined
  var copyFormatting_keystrokePaste: js.UndefOr[scala.Double] = js.undefined
  var copyFormatting_outerCursor: js.UndefOr[scala.Boolean] = js.undefined
  var coreStyles_bold: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var coreStyles_italic: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var coreStyles_strike: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var coreStyles_subscript: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var coreStyles_superscript: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var coreStyles_underline: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var customConfig: js.UndefOr[java.lang.String] = js.undefined
  var dataIndentationChars: js.UndefOr[java.lang.String] = js.undefined
  var defaultLanguage: js.UndefOr[java.lang.String] = js.undefined
  var devtools_styles: js.UndefOr[java.lang.String] = js.undefined
  var devtools_textCallback: js.UndefOr[
    js.Function4[
      /* editor */ editor, 
      /* dialog */ dialog, 
      /* element */ ckeditorLib.CKEDITORNs.domNs.element, 
      /* tabName */ java.lang.String, 
      java.lang.String
    ]
  ] = js.undefined
  var dialog_backgroundCoverColor: js.UndefOr[java.lang.String] = js.undefined
  var dialog_backgroundCoverOpacity: js.UndefOr[scala.Double] = js.undefined
  var dialog_buttonsOrder: js.UndefOr[java.lang.String] = js.undefined
  var dialog_magnetDistance: js.UndefOr[scala.Double] = js.undefined
  var dialog_noConfirmCancel: js.UndefOr[scala.Boolean] = js.undefined
  var dialog_startupFocusTab: js.UndefOr[scala.Boolean] = js.undefined
  var disableNativeObjectResizing: js.UndefOr[scala.Boolean] = js.undefined
  var disableNativeReadonlyStyling: js.UndefOr[scala.Boolean] = js.undefined
  var disableNativeSpellChecker: js.UndefOr[scala.Boolean] = js.undefined
  var disableNativeTableHandles: js.UndefOr[scala.Boolean] = js.undefined
  var disallowedContent: js.UndefOr[ckeditorLib.CKEDITORNs.filterNs.disallowedContentRules] = js.undefined
  var div_wrapTable: js.UndefOr[scala.Boolean] = js.undefined
  var docType: js.UndefOr[java.lang.String] = js.undefined
  var easyimage_class: js.UndefOr[java.lang.String] = js.undefined
  var easyimage_defaultStyle: js.UndefOr[java.lang.String] = js.undefined
  var easyimage_styles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var easyimage_toolbar: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var emailProtection: js.UndefOr[java.lang.String] = js.undefined
  var embed_provider: js.UndefOr[java.lang.String] = js.undefined
  var enableTabKeyTools: js.UndefOr[scala.Boolean] = js.undefined
  var enterMode: js.UndefOr[scala.Double] = js.undefined
  var entities: js.UndefOr[scala.Boolean] = js.undefined
  var entities_additional: js.UndefOr[java.lang.String] = js.undefined
  var entities_greek: js.UndefOr[scala.Boolean] = js.undefined
  var entities_latin: js.UndefOr[scala.Boolean] = js.undefined
  var entities_processNumerical: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var extraAllowedContent: js.UndefOr[ckeditorLib.CKEDITORNs.filterNs.allowedContentRules] = js.undefined
  var extraPlugins: js.UndefOr[java.lang.String] = js.undefined
  var fileTools_defaultFileName: js.UndefOr[java.lang.String] = js.undefined
  var fileTools_requestHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var filebrowserBrowseUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserFlashBrowseUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserFlashUploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserImageBrowseLinkUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserImageBrowseUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserImageUploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserUploadMethod: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserUploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserWindowFeatures: js.UndefOr[java.lang.String] = js.undefined
  var filebrowserWindowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var filebrowserWindowWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fillEmptyBlocks: js.UndefOr[
    scala.Boolean | (js.Function1[/* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, scala.Boolean])
  ] = js.undefined
  var find_highlight: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var flashAddEmbedTag: js.UndefOr[scala.Boolean] = js.undefined
  var flashConvertOnEdit: js.UndefOr[scala.Boolean] = js.undefined
  var flashEmbedTagOnly: js.UndefOr[scala.Boolean] = js.undefined
  var floatSpaceDockedOffsetX: js.UndefOr[scala.Double] = js.undefined
  var floatSpaceDockedOffsetY: js.UndefOr[scala.Double] = js.undefined
  var floatSpacePinnedOffsetX: js.UndefOr[scala.Double] = js.undefined
  var floatSpacePinnedOffsetY: js.UndefOr[scala.Double] = js.undefined
  var floatSpacePreferRight: js.UndefOr[scala.Boolean] = js.undefined
  var fontSize_defaultLabel: js.UndefOr[java.lang.String] = js.undefined
  var fontSize_sizes: js.UndefOr[java.lang.String] = js.undefined
  var fontSize_style: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var font_defaultLabel: js.UndefOr[java.lang.String] = js.undefined
  var font_names: js.UndefOr[java.lang.String] = js.undefined
  var font_style: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var forceEnterMode: js.UndefOr[scala.Boolean] = js.undefined
  var forcePasteAsPlainText: js.UndefOr[scala.Boolean] = js.undefined
  var forceSimpleAmpersand: js.UndefOr[scala.Boolean] = js.undefined
  var format_address: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_div: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h1: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h2: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h3: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h4: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h5: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_h6: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_p: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_pre: js.UndefOr[ckeditorLib.CKEDITORNs.configNs.styleObject] = js.undefined
  var format_tags: js.UndefOr[java.lang.String] = js.undefined
  var fullPage: js.UndefOr[scala.Boolean] = js.undefined
  var grayt_autoStartup: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var htmlEncodeOutput: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreEmptyParagraph: js.UndefOr[scala.Boolean] = js.undefined
  var image2_alignClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var image2_altRequired: js.UndefOr[scala.Boolean] = js.undefined
  var image2_captionedClass: js.UndefOr[java.lang.String] = js.undefined
  var image2_disableResizer: js.UndefOr[scala.Boolean] = js.undefined
  var image2_prefillDimensions: js.UndefOr[scala.Boolean] = js.undefined
  var imageUploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var image_prefillDimensions: js.UndefOr[scala.Boolean] = js.undefined
  var image_previewText: js.UndefOr[java.lang.String] = js.undefined
  var image_removeLinkByEmptyUrl: js.UndefOr[scala.Boolean] = js.undefined
  var indentClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indentOffset: js.UndefOr[scala.Double] = js.undefined
  var indentUnit: js.UndefOr[java.lang.String] = js.undefined
  var jqueryOverrideVal: js.UndefOr[scala.Boolean] = js.undefined
  var justifyClasses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var keystrokes: js.UndefOr[js.Array[js.Tuple2[scala.Double, java.lang.String]]] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var language_list: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var linkJavaScriptLinksAllowed: js.UndefOr[scala.Boolean] = js.undefined
  var linkShowAdvancedTab: js.UndefOr[scala.Boolean] = js.undefined
  var linkShowTargetTab: js.UndefOr[scala.Boolean] = js.undefined
  var magicline_color: js.UndefOr[java.lang.String] = js.undefined
  var magicline_everywhere: js.UndefOr[scala.Boolean] = js.undefined
  var magicline_holdDistance: js.UndefOr[scala.Double] = js.undefined
  var magicline_keystrokeNext: js.UndefOr[scala.Double] = js.undefined
  var magicline_keystrokePrevious: js.UndefOr[scala.Double] = js.undefined
  var magicline_tabuList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var magicline_triggerOffset: js.UndefOr[scala.Double] = js.undefined
  var mathJaxClass: js.UndefOr[java.lang.String] = js.undefined
  var mathJaxLib: js.UndefOr[java.lang.String] = js.undefined
  var menu_groups: js.UndefOr[java.lang.String] = js.undefined
  var menu_subMenuDelay: js.UndefOr[scala.Double] = js.undefined
  var newpage_html: js.UndefOr[java.lang.String] = js.undefined
  var notification_duration: js.UndefOr[scala.Double] = js.undefined
  var on: js.UndefOr[ckeditorLib.CKEDITORNs.editorNs.eventObject] = js.undefined
  var pasteFilter: js.UndefOr[java.lang.String] = js.undefined
  var pasteFromWordCleanupFile: js.UndefOr[java.lang.String] = js.undefined
  var pasteFromWordNumberedHeadingToList: js.UndefOr[scala.Boolean] = js.undefined
  var pasteFromWordPromptCleanup: js.UndefOr[scala.Boolean] = js.undefined
  var pasteFromWordRemoveFontStyles: js.UndefOr[scala.Boolean] = js.undefined
  var pasteFromWordRemoveStyles: js.UndefOr[scala.Boolean] = js.undefined
  var pasteFromWord_heuristicsEdgeList: js.UndefOr[scala.Boolean] = js.undefined
  var pasteFromWord_inlineImages: js.UndefOr[scala.Boolean] = js.undefined
  var plugins: js.UndefOr[java.lang.String] = js.undefined
  var protectedSource: js.UndefOr[js.Array[stdLib.RegExp]] = js.undefined
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  var removeButtons: js.UndefOr[java.lang.String] = js.undefined
  var removeDialogTabs: js.UndefOr[java.lang.String] = js.undefined
  var removeFormatAttributes: js.UndefOr[java.lang.String] = js.undefined
  var removeFormatTags: js.UndefOr[java.lang.String] = js.undefined
  var removePlugins: js.UndefOr[java.lang.String] = js.undefined
  var resize_dir: js.UndefOr[java.lang.String] = js.undefined
  var resize_enabled: js.UndefOr[scala.Boolean] = js.undefined
  var resize_maxHeight: js.UndefOr[scala.Double] = js.undefined
  var resize_maxWidth: js.UndefOr[scala.Double] = js.undefined
  var resize_minHeight: js.UndefOr[scala.Double] = js.undefined
  var resize_minWidth: js.UndefOr[scala.Double] = js.undefined
  var scayt_autoStartup: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_contextCommands: js.UndefOr[java.lang.String] = js.undefined
  var scayt_contextMenuItemsOrder: js.UndefOr[java.lang.String] = js.undefined
  var scayt_customDictionaryIds: js.UndefOr[java.lang.String] = js.undefined
  var scayt_customerId: js.UndefOr[java.lang.String] = js.undefined
  var scayt_disableOptionsStorage: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scayt_elementsToIgnore: js.UndefOr[java.lang.String] = js.undefined
  var scayt_handleCheckDirty: js.UndefOr[java.lang.String] = js.undefined
  var scayt_handleUndoRedo: js.UndefOr[java.lang.String] = js.undefined
  var scayt_ignoreAllCapsWords: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_ignoreDomainNames: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_ignoreWordsWithMixedCases: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_ignoreWordsWithNumbers: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_inlineModeImmediateMarkup: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_maxSuggestions: js.UndefOr[scala.Double] = js.undefined
  var scayt_minWordLength: js.UndefOr[scala.Double] = js.undefined
  var scayt_moreSuggestions: js.UndefOr[java.lang.String] = js.undefined
  var scayt_multiLanguageMode: js.UndefOr[scala.Boolean] = js.undefined
  var scayt_multiLanguageStyles: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var scayt_sLang: js.UndefOr[java.lang.String] = js.undefined
  var scayt_serviceHost: js.UndefOr[java.lang.String] = js.undefined
  var scayt_servicePath: js.UndefOr[java.lang.String] = js.undefined
  var scayt_servicePort: js.UndefOr[java.lang.String] = js.undefined
  var scayt_serviceProtocol: js.UndefOr[java.lang.String] = js.undefined
  var scayt_srcUrl: js.UndefOr[java.lang.String] = js.undefined
  var scayt_uiTabs: js.UndefOr[java.lang.String] = js.undefined
  var scayt_userDictionaryName: js.UndefOr[java.lang.String] = js.undefined
  var sharedSpaces: js.UndefOr[sharedSpace] = js.undefined
  var shiftEnterMode: js.UndefOr[scala.Double] = js.undefined
  var skin: js.UndefOr[java.lang.String] = js.undefined
  var smiley_columns: js.UndefOr[scala.Double] = js.undefined
  var smiley_descriptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var smiley_images: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var smiley_path: js.UndefOr[java.lang.String] = js.undefined
  var sourceAreaTabSize: js.UndefOr[scala.Double] = js.undefined
  var specialChars: js.UndefOr[js.Array[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]] = js.undefined
  var startupFocus: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var startupMode: js.UndefOr[java.lang.String] = js.undefined
  var startupOutlineBlocks: js.UndefOr[scala.Boolean] = js.undefined
  var startupShowBorders: js.UndefOr[scala.Boolean] = js.undefined
  var stylesSet: js.UndefOr[
    java.lang.String | scala.Boolean | js.Array[ckeditorLib.CKEDITORNs.configNs.styleObject]
  ] = js.undefined
  var stylesheetParser_skipSelectors: js.UndefOr[stdLib.RegExp] = js.undefined
  var stylesheetParser_validSelectors: js.UndefOr[stdLib.RegExp] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var tabSpaces: js.UndefOr[scala.Double] = js.undefined
  var templates: js.UndefOr[java.lang.String] = js.undefined
  var templates_files: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var templates_replaceContent: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var toolbar: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | js.Array[java.lang.String] | ckeditorLib.Anon_Groups]) | scala.Null
  ] = js.undefined
  var toolbarCanCollapse: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarGroupCycling: js.UndefOr[scala.Boolean] = js.undefined
  var toolbarGroups: js.UndefOr[js.Array[toolbarGroups | java.lang.String]] = js.undefined
  var toolbarLocation: js.UndefOr[java.lang.String] = js.undefined
  var toolbarStartupExpanded: js.UndefOr[scala.Boolean] = js.undefined
  var uiColor: js.UndefOr[java.lang.String] = js.undefined
  var undoStackSize: js.UndefOr[scala.Double] = js.undefined
  var uploadUrl: js.UndefOr[java.lang.String] = js.undefined
  var useComputedState: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wsc_cmd: js.UndefOr[java.lang.String] = js.undefined
  var wsc_customDictionaryIds: js.UndefOr[java.lang.String] = js.undefined
  var wsc_customLoaderScript: js.UndefOr[java.lang.String] = js.undefined
  var wsc_customerId: js.UndefOr[java.lang.String] = js.undefined
  var wsc_height: js.UndefOr[java.lang.String] = js.undefined
  var wsc_lang: js.UndefOr[java.lang.String] = js.undefined
  var wsc_left: js.UndefOr[java.lang.String] = js.undefined
  var wsc_top: js.UndefOr[java.lang.String] = js.undefined
  var wsc_userDictionaryName: js.UndefOr[java.lang.String] = js.undefined
  var wsc_width: js.UndefOr[java.lang.String] = js.undefined
}

object config {
  @scala.inline
  def apply(
    allowedContent: scala.Boolean | ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    autoEmbed_widget: java.lang.String | (js.Function1[/* url */ java.lang.String, java.lang.String]) = null,
    autoGrow_bottomSpace: scala.Int | scala.Double = null,
    autoGrow_maxHeight: scala.Int | scala.Double = null,
    autoGrow_minHeight: scala.Int | scala.Double = null,
    autoGrow_onStartup: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpdateElement: js.UndefOr[scala.Boolean] = js.undefined,
    baseFloatZIndex: scala.Int | scala.Double = null,
    baseHref: java.lang.String = null,
    basicEntities: js.UndefOr[scala.Boolean] = js.undefined,
    blockedKeystrokes: js.Array[scala.Double] = null,
    bodyClass: java.lang.String = null,
    bodyId: java.lang.String = null,
    browserContextMenuOnCtrl: js.UndefOr[scala.Boolean] = js.undefined,
    clipboard_defaultContentType: ckeditorLib.ckeditorLibStrings.html | ckeditorLib.ckeditorLibStrings.text = null,
    clipboard_notificationDuration: scala.Int | scala.Double = null,
    cloudServices_tokenUrl: java.lang.String = null,
    cloudServices_uploadUrl: java.lang.String = null,
    coceSnippet_theme: java.lang.String = null,
    codeSnippetGeshi_url: java.lang.String = null,
    codeSnippet_codeClass: java.lang.String = null,
    codeSnippet_languages: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    colorButton_backStyle: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    colorButton_colors: java.lang.String = null,
    colorButton_colorsPerRow: scala.Int | scala.Double = null,
    colorButton_enableAutomatic: js.UndefOr[scala.Boolean] = js.undefined,
    colorButton_enableMore: js.UndefOr[scala.Boolean] = js.undefined,
    colorButton_foreStyle: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    colorButton_normalizeBackground: js.UndefOr[scala.Boolean] = js.undefined,
    contentsCss: java.lang.String | js.Array[java.lang.String] = null,
    contentsLangDirection: java.lang.String = null,
    contentsLanguage: java.lang.String = null,
    copyFormatting_allowRules: java.lang.String = null,
    copyFormatting_allowedContexts: scala.Boolean | js.Array[java.lang.String] = null,
    copyFormatting_keystrokeCopy: scala.Int | scala.Double = null,
    copyFormatting_keystrokePaste: scala.Int | scala.Double = null,
    copyFormatting_outerCursor: js.UndefOr[scala.Boolean] = js.undefined,
    coreStyles_bold: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    coreStyles_italic: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    coreStyles_strike: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    coreStyles_subscript: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    coreStyles_superscript: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    coreStyles_underline: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    customConfig: java.lang.String = null,
    dataIndentationChars: java.lang.String = null,
    defaultLanguage: java.lang.String = null,
    devtools_styles: java.lang.String = null,
    devtools_textCallback: (/* editor */ editor, /* dialog */ dialog, /* element */ ckeditorLib.CKEDITORNs.domNs.element, /* tabName */ java.lang.String) => java.lang.String = null,
    dialog_backgroundCoverColor: java.lang.String = null,
    dialog_backgroundCoverOpacity: scala.Int | scala.Double = null,
    dialog_buttonsOrder: java.lang.String = null,
    dialog_magnetDistance: scala.Int | scala.Double = null,
    dialog_noConfirmCancel: js.UndefOr[scala.Boolean] = js.undefined,
    dialog_startupFocusTab: js.UndefOr[scala.Boolean] = js.undefined,
    disableNativeObjectResizing: js.UndefOr[scala.Boolean] = js.undefined,
    disableNativeReadonlyStyling: js.UndefOr[scala.Boolean] = js.undefined,
    disableNativeSpellChecker: js.UndefOr[scala.Boolean] = js.undefined,
    disableNativeTableHandles: js.UndefOr[scala.Boolean] = js.undefined,
    disallowedContent: ckeditorLib.CKEDITORNs.filterNs.disallowedContentRules = null,
    div_wrapTable: js.UndefOr[scala.Boolean] = js.undefined,
    docType: java.lang.String = null,
    easyimage_class: java.lang.String = null,
    easyimage_defaultStyle: java.lang.String = null,
    easyimage_styles: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    easyimage_toolbar: js.Array[java.lang.String] | java.lang.String = null,
    emailProtection: java.lang.String = null,
    embed_provider: java.lang.String = null,
    enableTabKeyTools: js.UndefOr[scala.Boolean] = js.undefined,
    enterMode: scala.Int | scala.Double = null,
    entities: js.UndefOr[scala.Boolean] = js.undefined,
    entities_additional: java.lang.String = null,
    entities_greek: js.UndefOr[scala.Boolean] = js.undefined,
    entities_latin: js.UndefOr[scala.Boolean] = js.undefined,
    entities_processNumerical: scala.Boolean | java.lang.String = null,
    extraAllowedContent: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    extraPlugins: java.lang.String = null,
    fileTools_defaultFileName: java.lang.String = null,
    fileTools_requestHeaders: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    filebrowserBrowseUrl: java.lang.String = null,
    filebrowserFlashBrowseUrl: java.lang.String = null,
    filebrowserFlashUploadUrl: java.lang.String = null,
    filebrowserImageBrowseLinkUrl: java.lang.String = null,
    filebrowserImageBrowseUrl: java.lang.String = null,
    filebrowserImageUploadUrl: java.lang.String = null,
    filebrowserUploadMethod: java.lang.String = null,
    filebrowserUploadUrl: java.lang.String = null,
    filebrowserWindowFeatures: java.lang.String = null,
    filebrowserWindowHeight: scala.Double | java.lang.String = null,
    filebrowserWindowWidth: scala.Double | java.lang.String = null,
    fillEmptyBlocks: scala.Boolean | (js.Function1[/* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, scala.Boolean]) = null,
    find_highlight: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    flashAddEmbedTag: js.UndefOr[scala.Boolean] = js.undefined,
    flashConvertOnEdit: js.UndefOr[scala.Boolean] = js.undefined,
    flashEmbedTagOnly: js.UndefOr[scala.Boolean] = js.undefined,
    floatSpaceDockedOffsetX: scala.Int | scala.Double = null,
    floatSpaceDockedOffsetY: scala.Int | scala.Double = null,
    floatSpacePinnedOffsetX: scala.Int | scala.Double = null,
    floatSpacePinnedOffsetY: scala.Int | scala.Double = null,
    floatSpacePreferRight: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize_defaultLabel: java.lang.String = null,
    fontSize_sizes: java.lang.String = null,
    fontSize_style: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    font_defaultLabel: java.lang.String = null,
    font_names: java.lang.String = null,
    font_style: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    forceEnterMode: js.UndefOr[scala.Boolean] = js.undefined,
    forcePasteAsPlainText: js.UndefOr[scala.Boolean] = js.undefined,
    forceSimpleAmpersand: js.UndefOr[scala.Boolean] = js.undefined,
    format_address: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_div: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h1: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h2: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h3: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h4: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h5: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_h6: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_p: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_pre: ckeditorLib.CKEDITORNs.configNs.styleObject = null,
    format_tags: java.lang.String = null,
    fullPage: js.UndefOr[scala.Boolean] = js.undefined,
    grayt_autoStartup: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    htmlEncodeOutput: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreEmptyParagraph: js.UndefOr[scala.Boolean] = js.undefined,
    image2_alignClasses: js.Array[java.lang.String] = null,
    image2_altRequired: js.UndefOr[scala.Boolean] = js.undefined,
    image2_captionedClass: java.lang.String = null,
    image2_disableResizer: js.UndefOr[scala.Boolean] = js.undefined,
    image2_prefillDimensions: js.UndefOr[scala.Boolean] = js.undefined,
    imageUploadUrl: java.lang.String = null,
    image_prefillDimensions: js.UndefOr[scala.Boolean] = js.undefined,
    image_previewText: java.lang.String = null,
    image_removeLinkByEmptyUrl: js.UndefOr[scala.Boolean] = js.undefined,
    indentClasses: js.Array[java.lang.String] = null,
    indentOffset: scala.Int | scala.Double = null,
    indentUnit: java.lang.String = null,
    jqueryOverrideVal: js.UndefOr[scala.Boolean] = js.undefined,
    justifyClasses: js.Array[java.lang.String] = null,
    keystrokes: js.Array[js.Tuple2[scala.Double, java.lang.String]] = null,
    language: java.lang.String = null,
    language_list: js.Array[java.lang.String] = null,
    linkJavaScriptLinksAllowed: js.UndefOr[scala.Boolean] = js.undefined,
    linkShowAdvancedTab: js.UndefOr[scala.Boolean] = js.undefined,
    linkShowTargetTab: js.UndefOr[scala.Boolean] = js.undefined,
    magicline_color: java.lang.String = null,
    magicline_everywhere: js.UndefOr[scala.Boolean] = js.undefined,
    magicline_holdDistance: scala.Int | scala.Double = null,
    magicline_keystrokeNext: scala.Int | scala.Double = null,
    magicline_keystrokePrevious: scala.Int | scala.Double = null,
    magicline_tabuList: js.Array[java.lang.String] = null,
    magicline_triggerOffset: scala.Int | scala.Double = null,
    mathJaxClass: java.lang.String = null,
    mathJaxLib: java.lang.String = null,
    menu_groups: java.lang.String = null,
    menu_subMenuDelay: scala.Int | scala.Double = null,
    newpage_html: java.lang.String = null,
    notification_duration: scala.Int | scala.Double = null,
    on: ckeditorLib.CKEDITORNs.editorNs.eventObject = null,
    pasteFilter: java.lang.String = null,
    pasteFromWordCleanupFile: java.lang.String = null,
    pasteFromWordNumberedHeadingToList: js.UndefOr[scala.Boolean] = js.undefined,
    pasteFromWordPromptCleanup: js.UndefOr[scala.Boolean] = js.undefined,
    pasteFromWordRemoveFontStyles: js.UndefOr[scala.Boolean] = js.undefined,
    pasteFromWordRemoveStyles: js.UndefOr[scala.Boolean] = js.undefined,
    pasteFromWord_heuristicsEdgeList: js.UndefOr[scala.Boolean] = js.undefined,
    pasteFromWord_inlineImages: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: java.lang.String = null,
    protectedSource: js.Array[stdLib.RegExp] = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    removeButtons: java.lang.String = null,
    removeDialogTabs: java.lang.String = null,
    removeFormatAttributes: java.lang.String = null,
    removeFormatTags: java.lang.String = null,
    removePlugins: java.lang.String = null,
    resize_dir: java.lang.String = null,
    resize_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    resize_maxHeight: scala.Int | scala.Double = null,
    resize_maxWidth: scala.Int | scala.Double = null,
    resize_minHeight: scala.Int | scala.Double = null,
    resize_minWidth: scala.Int | scala.Double = null,
    scayt_autoStartup: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_contextCommands: java.lang.String = null,
    scayt_contextMenuItemsOrder: java.lang.String = null,
    scayt_customDictionaryIds: java.lang.String = null,
    scayt_customerId: java.lang.String = null,
    scayt_disableOptionsStorage: java.lang.String | js.Array[java.lang.String] = null,
    scayt_elementsToIgnore: java.lang.String = null,
    scayt_handleCheckDirty: java.lang.String = null,
    scayt_handleUndoRedo: java.lang.String = null,
    scayt_ignoreAllCapsWords: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_ignoreDomainNames: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_ignoreWordsWithMixedCases: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_ignoreWordsWithNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_inlineModeImmediateMarkup: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_maxSuggestions: scala.Int | scala.Double = null,
    scayt_minWordLength: scala.Int | scala.Double = null,
    scayt_moreSuggestions: java.lang.String = null,
    scayt_multiLanguageMode: js.UndefOr[scala.Boolean] = js.undefined,
    scayt_multiLanguageStyles: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    scayt_sLang: java.lang.String = null,
    scayt_serviceHost: java.lang.String = null,
    scayt_servicePath: java.lang.String = null,
    scayt_servicePort: java.lang.String = null,
    scayt_serviceProtocol: java.lang.String = null,
    scayt_srcUrl: java.lang.String = null,
    scayt_uiTabs: java.lang.String = null,
    scayt_userDictionaryName: java.lang.String = null,
    sharedSpaces: sharedSpace = null,
    shiftEnterMode: scala.Int | scala.Double = null,
    skin: java.lang.String = null,
    smiley_columns: scala.Int | scala.Double = null,
    smiley_descriptions: js.Array[java.lang.String] = null,
    smiley_images: js.Array[java.lang.String] = null,
    smiley_path: java.lang.String = null,
    sourceAreaTabSize: scala.Int | scala.Double = null,
    specialChars: js.Array[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    startupFocus: java.lang.String | scala.Boolean = null,
    startupMode: java.lang.String = null,
    startupOutlineBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    startupShowBorders: js.UndefOr[scala.Boolean] = js.undefined,
    stylesSet: java.lang.String | scala.Boolean | js.Array[ckeditorLib.CKEDITORNs.configNs.styleObject] = null,
    stylesheetParser_skipSelectors: stdLib.RegExp = null,
    stylesheetParser_validSelectors: stdLib.RegExp = null,
    tabIndex: scala.Int | scala.Double = null,
    tabSpaces: scala.Int | scala.Double = null,
    templates: java.lang.String = null,
    templates_files: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    templates_replaceContent: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | scala.Boolean = null,
    toolbar: java.lang.String | (js.Array[java.lang.String | js.Array[java.lang.String] | ckeditorLib.Anon_Groups]) = null,
    toolbarCanCollapse: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarGroupCycling: js.UndefOr[scala.Boolean] = js.undefined,
    toolbarGroups: js.Array[toolbarGroups | java.lang.String] = null,
    toolbarLocation: java.lang.String = null,
    toolbarStartupExpanded: js.UndefOr[scala.Boolean] = js.undefined,
    uiColor: java.lang.String = null,
    undoStackSize: scala.Int | scala.Double = null,
    uploadUrl: java.lang.String = null,
    useComputedState: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    wsc_cmd: java.lang.String = null,
    wsc_customDictionaryIds: java.lang.String = null,
    wsc_customLoaderScript: java.lang.String = null,
    wsc_customerId: java.lang.String = null,
    wsc_height: java.lang.String = null,
    wsc_lang: java.lang.String = null,
    wsc_left: java.lang.String = null,
    wsc_top: java.lang.String = null,
    wsc_userDictionaryName: java.lang.String = null,
    wsc_width: java.lang.String = null
  ): config = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (autoEmbed_widget != null) __obj.updateDynamic("autoEmbed_widget")(autoEmbed_widget.asInstanceOf[js.Any])
    if (autoGrow_bottomSpace != null) __obj.updateDynamic("autoGrow_bottomSpace")(autoGrow_bottomSpace.asInstanceOf[js.Any])
    if (autoGrow_maxHeight != null) __obj.updateDynamic("autoGrow_maxHeight")(autoGrow_maxHeight.asInstanceOf[js.Any])
    if (autoGrow_minHeight != null) __obj.updateDynamic("autoGrow_minHeight")(autoGrow_minHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGrow_onStartup)) __obj.updateDynamic("autoGrow_onStartup")(autoGrow_onStartup)
    if (!js.isUndefined(autoUpdateElement)) __obj.updateDynamic("autoUpdateElement")(autoUpdateElement)
    if (baseFloatZIndex != null) __obj.updateDynamic("baseFloatZIndex")(baseFloatZIndex.asInstanceOf[js.Any])
    if (baseHref != null) __obj.updateDynamic("baseHref")(baseHref)
    if (!js.isUndefined(basicEntities)) __obj.updateDynamic("basicEntities")(basicEntities)
    if (blockedKeystrokes != null) __obj.updateDynamic("blockedKeystrokes")(blockedKeystrokes)
    if (bodyClass != null) __obj.updateDynamic("bodyClass")(bodyClass)
    if (bodyId != null) __obj.updateDynamic("bodyId")(bodyId)
    if (!js.isUndefined(browserContextMenuOnCtrl)) __obj.updateDynamic("browserContextMenuOnCtrl")(browserContextMenuOnCtrl)
    if (clipboard_defaultContentType != null) __obj.updateDynamic("clipboard_defaultContentType")(clipboard_defaultContentType.asInstanceOf[js.Any])
    if (clipboard_notificationDuration != null) __obj.updateDynamic("clipboard_notificationDuration")(clipboard_notificationDuration.asInstanceOf[js.Any])
    if (cloudServices_tokenUrl != null) __obj.updateDynamic("cloudServices_tokenUrl")(cloudServices_tokenUrl)
    if (cloudServices_uploadUrl != null) __obj.updateDynamic("cloudServices_uploadUrl")(cloudServices_uploadUrl)
    if (coceSnippet_theme != null) __obj.updateDynamic("coceSnippet_theme")(coceSnippet_theme)
    if (codeSnippetGeshi_url != null) __obj.updateDynamic("codeSnippetGeshi_url")(codeSnippetGeshi_url)
    if (codeSnippet_codeClass != null) __obj.updateDynamic("codeSnippet_codeClass")(codeSnippet_codeClass)
    if (codeSnippet_languages != null) __obj.updateDynamic("codeSnippet_languages")(codeSnippet_languages)
    if (colorButton_backStyle != null) __obj.updateDynamic("colorButton_backStyle")(colorButton_backStyle)
    if (colorButton_colors != null) __obj.updateDynamic("colorButton_colors")(colorButton_colors)
    if (colorButton_colorsPerRow != null) __obj.updateDynamic("colorButton_colorsPerRow")(colorButton_colorsPerRow.asInstanceOf[js.Any])
    if (!js.isUndefined(colorButton_enableAutomatic)) __obj.updateDynamic("colorButton_enableAutomatic")(colorButton_enableAutomatic)
    if (!js.isUndefined(colorButton_enableMore)) __obj.updateDynamic("colorButton_enableMore")(colorButton_enableMore)
    if (colorButton_foreStyle != null) __obj.updateDynamic("colorButton_foreStyle")(colorButton_foreStyle)
    if (!js.isUndefined(colorButton_normalizeBackground)) __obj.updateDynamic("colorButton_normalizeBackground")(colorButton_normalizeBackground)
    if (contentsCss != null) __obj.updateDynamic("contentsCss")(contentsCss.asInstanceOf[js.Any])
    if (contentsLangDirection != null) __obj.updateDynamic("contentsLangDirection")(contentsLangDirection)
    if (contentsLanguage != null) __obj.updateDynamic("contentsLanguage")(contentsLanguage)
    if (copyFormatting_allowRules != null) __obj.updateDynamic("copyFormatting_allowRules")(copyFormatting_allowRules)
    if (copyFormatting_allowedContexts != null) __obj.updateDynamic("copyFormatting_allowedContexts")(copyFormatting_allowedContexts.asInstanceOf[js.Any])
    if (copyFormatting_keystrokeCopy != null) __obj.updateDynamic("copyFormatting_keystrokeCopy")(copyFormatting_keystrokeCopy.asInstanceOf[js.Any])
    if (copyFormatting_keystrokePaste != null) __obj.updateDynamic("copyFormatting_keystrokePaste")(copyFormatting_keystrokePaste.asInstanceOf[js.Any])
    if (!js.isUndefined(copyFormatting_outerCursor)) __obj.updateDynamic("copyFormatting_outerCursor")(copyFormatting_outerCursor)
    if (coreStyles_bold != null) __obj.updateDynamic("coreStyles_bold")(coreStyles_bold)
    if (coreStyles_italic != null) __obj.updateDynamic("coreStyles_italic")(coreStyles_italic)
    if (coreStyles_strike != null) __obj.updateDynamic("coreStyles_strike")(coreStyles_strike)
    if (coreStyles_subscript != null) __obj.updateDynamic("coreStyles_subscript")(coreStyles_subscript)
    if (coreStyles_superscript != null) __obj.updateDynamic("coreStyles_superscript")(coreStyles_superscript)
    if (coreStyles_underline != null) __obj.updateDynamic("coreStyles_underline")(coreStyles_underline)
    if (customConfig != null) __obj.updateDynamic("customConfig")(customConfig)
    if (dataIndentationChars != null) __obj.updateDynamic("dataIndentationChars")(dataIndentationChars)
    if (defaultLanguage != null) __obj.updateDynamic("defaultLanguage")(defaultLanguage)
    if (devtools_styles != null) __obj.updateDynamic("devtools_styles")(devtools_styles)
    if (devtools_textCallback != null) __obj.updateDynamic("devtools_textCallback")(js.Any.fromFunction4(devtools_textCallback))
    if (dialog_backgroundCoverColor != null) __obj.updateDynamic("dialog_backgroundCoverColor")(dialog_backgroundCoverColor)
    if (dialog_backgroundCoverOpacity != null) __obj.updateDynamic("dialog_backgroundCoverOpacity")(dialog_backgroundCoverOpacity.asInstanceOf[js.Any])
    if (dialog_buttonsOrder != null) __obj.updateDynamic("dialog_buttonsOrder")(dialog_buttonsOrder)
    if (dialog_magnetDistance != null) __obj.updateDynamic("dialog_magnetDistance")(dialog_magnetDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(dialog_noConfirmCancel)) __obj.updateDynamic("dialog_noConfirmCancel")(dialog_noConfirmCancel)
    if (!js.isUndefined(dialog_startupFocusTab)) __obj.updateDynamic("dialog_startupFocusTab")(dialog_startupFocusTab)
    if (!js.isUndefined(disableNativeObjectResizing)) __obj.updateDynamic("disableNativeObjectResizing")(disableNativeObjectResizing)
    if (!js.isUndefined(disableNativeReadonlyStyling)) __obj.updateDynamic("disableNativeReadonlyStyling")(disableNativeReadonlyStyling)
    if (!js.isUndefined(disableNativeSpellChecker)) __obj.updateDynamic("disableNativeSpellChecker")(disableNativeSpellChecker)
    if (!js.isUndefined(disableNativeTableHandles)) __obj.updateDynamic("disableNativeTableHandles")(disableNativeTableHandles)
    if (disallowedContent != null) __obj.updateDynamic("disallowedContent")(disallowedContent.asInstanceOf[js.Any])
    if (!js.isUndefined(div_wrapTable)) __obj.updateDynamic("div_wrapTable")(div_wrapTable)
    if (docType != null) __obj.updateDynamic("docType")(docType)
    if (easyimage_class != null) __obj.updateDynamic("easyimage_class")(easyimage_class)
    if (easyimage_defaultStyle != null) __obj.updateDynamic("easyimage_defaultStyle")(easyimage_defaultStyle)
    if (easyimage_styles != null) __obj.updateDynamic("easyimage_styles")(easyimage_styles)
    if (easyimage_toolbar != null) __obj.updateDynamic("easyimage_toolbar")(easyimage_toolbar.asInstanceOf[js.Any])
    if (emailProtection != null) __obj.updateDynamic("emailProtection")(emailProtection)
    if (embed_provider != null) __obj.updateDynamic("embed_provider")(embed_provider)
    if (!js.isUndefined(enableTabKeyTools)) __obj.updateDynamic("enableTabKeyTools")(enableTabKeyTools)
    if (enterMode != null) __obj.updateDynamic("enterMode")(enterMode.asInstanceOf[js.Any])
    if (!js.isUndefined(entities)) __obj.updateDynamic("entities")(entities)
    if (entities_additional != null) __obj.updateDynamic("entities_additional")(entities_additional)
    if (!js.isUndefined(entities_greek)) __obj.updateDynamic("entities_greek")(entities_greek)
    if (!js.isUndefined(entities_latin)) __obj.updateDynamic("entities_latin")(entities_latin)
    if (entities_processNumerical != null) __obj.updateDynamic("entities_processNumerical")(entities_processNumerical.asInstanceOf[js.Any])
    if (extraAllowedContent != null) __obj.updateDynamic("extraAllowedContent")(extraAllowedContent.asInstanceOf[js.Any])
    if (extraPlugins != null) __obj.updateDynamic("extraPlugins")(extraPlugins)
    if (fileTools_defaultFileName != null) __obj.updateDynamic("fileTools_defaultFileName")(fileTools_defaultFileName)
    if (fileTools_requestHeaders != null) __obj.updateDynamic("fileTools_requestHeaders")(fileTools_requestHeaders)
    if (filebrowserBrowseUrl != null) __obj.updateDynamic("filebrowserBrowseUrl")(filebrowserBrowseUrl)
    if (filebrowserFlashBrowseUrl != null) __obj.updateDynamic("filebrowserFlashBrowseUrl")(filebrowserFlashBrowseUrl)
    if (filebrowserFlashUploadUrl != null) __obj.updateDynamic("filebrowserFlashUploadUrl")(filebrowserFlashUploadUrl)
    if (filebrowserImageBrowseLinkUrl != null) __obj.updateDynamic("filebrowserImageBrowseLinkUrl")(filebrowserImageBrowseLinkUrl)
    if (filebrowserImageBrowseUrl != null) __obj.updateDynamic("filebrowserImageBrowseUrl")(filebrowserImageBrowseUrl)
    if (filebrowserImageUploadUrl != null) __obj.updateDynamic("filebrowserImageUploadUrl")(filebrowserImageUploadUrl)
    if (filebrowserUploadMethod != null) __obj.updateDynamic("filebrowserUploadMethod")(filebrowserUploadMethod)
    if (filebrowserUploadUrl != null) __obj.updateDynamic("filebrowserUploadUrl")(filebrowserUploadUrl)
    if (filebrowserWindowFeatures != null) __obj.updateDynamic("filebrowserWindowFeatures")(filebrowserWindowFeatures)
    if (filebrowserWindowHeight != null) __obj.updateDynamic("filebrowserWindowHeight")(filebrowserWindowHeight.asInstanceOf[js.Any])
    if (filebrowserWindowWidth != null) __obj.updateDynamic("filebrowserWindowWidth")(filebrowserWindowWidth.asInstanceOf[js.Any])
    if (fillEmptyBlocks != null) __obj.updateDynamic("fillEmptyBlocks")(fillEmptyBlocks.asInstanceOf[js.Any])
    if (find_highlight != null) __obj.updateDynamic("find_highlight")(find_highlight)
    if (!js.isUndefined(flashAddEmbedTag)) __obj.updateDynamic("flashAddEmbedTag")(flashAddEmbedTag)
    if (!js.isUndefined(flashConvertOnEdit)) __obj.updateDynamic("flashConvertOnEdit")(flashConvertOnEdit)
    if (!js.isUndefined(flashEmbedTagOnly)) __obj.updateDynamic("flashEmbedTagOnly")(flashEmbedTagOnly)
    if (floatSpaceDockedOffsetX != null) __obj.updateDynamic("floatSpaceDockedOffsetX")(floatSpaceDockedOffsetX.asInstanceOf[js.Any])
    if (floatSpaceDockedOffsetY != null) __obj.updateDynamic("floatSpaceDockedOffsetY")(floatSpaceDockedOffsetY.asInstanceOf[js.Any])
    if (floatSpacePinnedOffsetX != null) __obj.updateDynamic("floatSpacePinnedOffsetX")(floatSpacePinnedOffsetX.asInstanceOf[js.Any])
    if (floatSpacePinnedOffsetY != null) __obj.updateDynamic("floatSpacePinnedOffsetY")(floatSpacePinnedOffsetY.asInstanceOf[js.Any])
    if (!js.isUndefined(floatSpacePreferRight)) __obj.updateDynamic("floatSpacePreferRight")(floatSpacePreferRight)
    if (fontSize_defaultLabel != null) __obj.updateDynamic("fontSize_defaultLabel")(fontSize_defaultLabel)
    if (fontSize_sizes != null) __obj.updateDynamic("fontSize_sizes")(fontSize_sizes)
    if (fontSize_style != null) __obj.updateDynamic("fontSize_style")(fontSize_style)
    if (font_defaultLabel != null) __obj.updateDynamic("font_defaultLabel")(font_defaultLabel)
    if (font_names != null) __obj.updateDynamic("font_names")(font_names)
    if (font_style != null) __obj.updateDynamic("font_style")(font_style)
    if (!js.isUndefined(forceEnterMode)) __obj.updateDynamic("forceEnterMode")(forceEnterMode)
    if (!js.isUndefined(forcePasteAsPlainText)) __obj.updateDynamic("forcePasteAsPlainText")(forcePasteAsPlainText)
    if (!js.isUndefined(forceSimpleAmpersand)) __obj.updateDynamic("forceSimpleAmpersand")(forceSimpleAmpersand)
    if (format_address != null) __obj.updateDynamic("format_address")(format_address)
    if (format_div != null) __obj.updateDynamic("format_div")(format_div)
    if (format_h1 != null) __obj.updateDynamic("format_h1")(format_h1)
    if (format_h2 != null) __obj.updateDynamic("format_h2")(format_h2)
    if (format_h3 != null) __obj.updateDynamic("format_h3")(format_h3)
    if (format_h4 != null) __obj.updateDynamic("format_h4")(format_h4)
    if (format_h5 != null) __obj.updateDynamic("format_h5")(format_h5)
    if (format_h6 != null) __obj.updateDynamic("format_h6")(format_h6)
    if (format_p != null) __obj.updateDynamic("format_p")(format_p)
    if (format_pre != null) __obj.updateDynamic("format_pre")(format_pre)
    if (format_tags != null) __obj.updateDynamic("format_tags")(format_tags)
    if (!js.isUndefined(fullPage)) __obj.updateDynamic("fullPage")(fullPage)
    if (!js.isUndefined(grayt_autoStartup)) __obj.updateDynamic("grayt_autoStartup")(grayt_autoStartup)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlEncodeOutput)) __obj.updateDynamic("htmlEncodeOutput")(htmlEncodeOutput)
    if (!js.isUndefined(ignoreEmptyParagraph)) __obj.updateDynamic("ignoreEmptyParagraph")(ignoreEmptyParagraph)
    if (image2_alignClasses != null) __obj.updateDynamic("image2_alignClasses")(image2_alignClasses)
    if (!js.isUndefined(image2_altRequired)) __obj.updateDynamic("image2_altRequired")(image2_altRequired)
    if (image2_captionedClass != null) __obj.updateDynamic("image2_captionedClass")(image2_captionedClass)
    if (!js.isUndefined(image2_disableResizer)) __obj.updateDynamic("image2_disableResizer")(image2_disableResizer)
    if (!js.isUndefined(image2_prefillDimensions)) __obj.updateDynamic("image2_prefillDimensions")(image2_prefillDimensions)
    if (imageUploadUrl != null) __obj.updateDynamic("imageUploadUrl")(imageUploadUrl)
    if (!js.isUndefined(image_prefillDimensions)) __obj.updateDynamic("image_prefillDimensions")(image_prefillDimensions)
    if (image_previewText != null) __obj.updateDynamic("image_previewText")(image_previewText)
    if (!js.isUndefined(image_removeLinkByEmptyUrl)) __obj.updateDynamic("image_removeLinkByEmptyUrl")(image_removeLinkByEmptyUrl)
    if (indentClasses != null) __obj.updateDynamic("indentClasses")(indentClasses)
    if (indentOffset != null) __obj.updateDynamic("indentOffset")(indentOffset.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit)
    if (!js.isUndefined(jqueryOverrideVal)) __obj.updateDynamic("jqueryOverrideVal")(jqueryOverrideVal)
    if (justifyClasses != null) __obj.updateDynamic("justifyClasses")(justifyClasses)
    if (keystrokes != null) __obj.updateDynamic("keystrokes")(keystrokes)
    if (language != null) __obj.updateDynamic("language")(language)
    if (language_list != null) __obj.updateDynamic("language_list")(language_list)
    if (!js.isUndefined(linkJavaScriptLinksAllowed)) __obj.updateDynamic("linkJavaScriptLinksAllowed")(linkJavaScriptLinksAllowed)
    if (!js.isUndefined(linkShowAdvancedTab)) __obj.updateDynamic("linkShowAdvancedTab")(linkShowAdvancedTab)
    if (!js.isUndefined(linkShowTargetTab)) __obj.updateDynamic("linkShowTargetTab")(linkShowTargetTab)
    if (magicline_color != null) __obj.updateDynamic("magicline_color")(magicline_color)
    if (!js.isUndefined(magicline_everywhere)) __obj.updateDynamic("magicline_everywhere")(magicline_everywhere)
    if (magicline_holdDistance != null) __obj.updateDynamic("magicline_holdDistance")(magicline_holdDistance.asInstanceOf[js.Any])
    if (magicline_keystrokeNext != null) __obj.updateDynamic("magicline_keystrokeNext")(magicline_keystrokeNext.asInstanceOf[js.Any])
    if (magicline_keystrokePrevious != null) __obj.updateDynamic("magicline_keystrokePrevious")(magicline_keystrokePrevious.asInstanceOf[js.Any])
    if (magicline_tabuList != null) __obj.updateDynamic("magicline_tabuList")(magicline_tabuList)
    if (magicline_triggerOffset != null) __obj.updateDynamic("magicline_triggerOffset")(magicline_triggerOffset.asInstanceOf[js.Any])
    if (mathJaxClass != null) __obj.updateDynamic("mathJaxClass")(mathJaxClass)
    if (mathJaxLib != null) __obj.updateDynamic("mathJaxLib")(mathJaxLib)
    if (menu_groups != null) __obj.updateDynamic("menu_groups")(menu_groups)
    if (menu_subMenuDelay != null) __obj.updateDynamic("menu_subMenuDelay")(menu_subMenuDelay.asInstanceOf[js.Any])
    if (newpage_html != null) __obj.updateDynamic("newpage_html")(newpage_html)
    if (notification_duration != null) __obj.updateDynamic("notification_duration")(notification_duration.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (pasteFilter != null) __obj.updateDynamic("pasteFilter")(pasteFilter)
    if (pasteFromWordCleanupFile != null) __obj.updateDynamic("pasteFromWordCleanupFile")(pasteFromWordCleanupFile)
    if (!js.isUndefined(pasteFromWordNumberedHeadingToList)) __obj.updateDynamic("pasteFromWordNumberedHeadingToList")(pasteFromWordNumberedHeadingToList)
    if (!js.isUndefined(pasteFromWordPromptCleanup)) __obj.updateDynamic("pasteFromWordPromptCleanup")(pasteFromWordPromptCleanup)
    if (!js.isUndefined(pasteFromWordRemoveFontStyles)) __obj.updateDynamic("pasteFromWordRemoveFontStyles")(pasteFromWordRemoveFontStyles)
    if (!js.isUndefined(pasteFromWordRemoveStyles)) __obj.updateDynamic("pasteFromWordRemoveStyles")(pasteFromWordRemoveStyles)
    if (!js.isUndefined(pasteFromWord_heuristicsEdgeList)) __obj.updateDynamic("pasteFromWord_heuristicsEdgeList")(pasteFromWord_heuristicsEdgeList)
    if (!js.isUndefined(pasteFromWord_inlineImages)) __obj.updateDynamic("pasteFromWord_inlineImages")(pasteFromWord_inlineImages)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (protectedSource != null) __obj.updateDynamic("protectedSource")(protectedSource)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (removeButtons != null) __obj.updateDynamic("removeButtons")(removeButtons)
    if (removeDialogTabs != null) __obj.updateDynamic("removeDialogTabs")(removeDialogTabs)
    if (removeFormatAttributes != null) __obj.updateDynamic("removeFormatAttributes")(removeFormatAttributes)
    if (removeFormatTags != null) __obj.updateDynamic("removeFormatTags")(removeFormatTags)
    if (removePlugins != null) __obj.updateDynamic("removePlugins")(removePlugins)
    if (resize_dir != null) __obj.updateDynamic("resize_dir")(resize_dir)
    if (!js.isUndefined(resize_enabled)) __obj.updateDynamic("resize_enabled")(resize_enabled)
    if (resize_maxHeight != null) __obj.updateDynamic("resize_maxHeight")(resize_maxHeight.asInstanceOf[js.Any])
    if (resize_maxWidth != null) __obj.updateDynamic("resize_maxWidth")(resize_maxWidth.asInstanceOf[js.Any])
    if (resize_minHeight != null) __obj.updateDynamic("resize_minHeight")(resize_minHeight.asInstanceOf[js.Any])
    if (resize_minWidth != null) __obj.updateDynamic("resize_minWidth")(resize_minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(scayt_autoStartup)) __obj.updateDynamic("scayt_autoStartup")(scayt_autoStartup)
    if (scayt_contextCommands != null) __obj.updateDynamic("scayt_contextCommands")(scayt_contextCommands)
    if (scayt_contextMenuItemsOrder != null) __obj.updateDynamic("scayt_contextMenuItemsOrder")(scayt_contextMenuItemsOrder)
    if (scayt_customDictionaryIds != null) __obj.updateDynamic("scayt_customDictionaryIds")(scayt_customDictionaryIds)
    if (scayt_customerId != null) __obj.updateDynamic("scayt_customerId")(scayt_customerId)
    if (scayt_disableOptionsStorage != null) __obj.updateDynamic("scayt_disableOptionsStorage")(scayt_disableOptionsStorage.asInstanceOf[js.Any])
    if (scayt_elementsToIgnore != null) __obj.updateDynamic("scayt_elementsToIgnore")(scayt_elementsToIgnore)
    if (scayt_handleCheckDirty != null) __obj.updateDynamic("scayt_handleCheckDirty")(scayt_handleCheckDirty)
    if (scayt_handleUndoRedo != null) __obj.updateDynamic("scayt_handleUndoRedo")(scayt_handleUndoRedo)
    if (!js.isUndefined(scayt_ignoreAllCapsWords)) __obj.updateDynamic("scayt_ignoreAllCapsWords")(scayt_ignoreAllCapsWords)
    if (!js.isUndefined(scayt_ignoreDomainNames)) __obj.updateDynamic("scayt_ignoreDomainNames")(scayt_ignoreDomainNames)
    if (!js.isUndefined(scayt_ignoreWordsWithMixedCases)) __obj.updateDynamic("scayt_ignoreWordsWithMixedCases")(scayt_ignoreWordsWithMixedCases)
    if (!js.isUndefined(scayt_ignoreWordsWithNumbers)) __obj.updateDynamic("scayt_ignoreWordsWithNumbers")(scayt_ignoreWordsWithNumbers)
    if (!js.isUndefined(scayt_inlineModeImmediateMarkup)) __obj.updateDynamic("scayt_inlineModeImmediateMarkup")(scayt_inlineModeImmediateMarkup)
    if (scayt_maxSuggestions != null) __obj.updateDynamic("scayt_maxSuggestions")(scayt_maxSuggestions.asInstanceOf[js.Any])
    if (scayt_minWordLength != null) __obj.updateDynamic("scayt_minWordLength")(scayt_minWordLength.asInstanceOf[js.Any])
    if (scayt_moreSuggestions != null) __obj.updateDynamic("scayt_moreSuggestions")(scayt_moreSuggestions)
    if (!js.isUndefined(scayt_multiLanguageMode)) __obj.updateDynamic("scayt_multiLanguageMode")(scayt_multiLanguageMode)
    if (scayt_multiLanguageStyles != null) __obj.updateDynamic("scayt_multiLanguageStyles")(scayt_multiLanguageStyles)
    if (scayt_sLang != null) __obj.updateDynamic("scayt_sLang")(scayt_sLang)
    if (scayt_serviceHost != null) __obj.updateDynamic("scayt_serviceHost")(scayt_serviceHost)
    if (scayt_servicePath != null) __obj.updateDynamic("scayt_servicePath")(scayt_servicePath)
    if (scayt_servicePort != null) __obj.updateDynamic("scayt_servicePort")(scayt_servicePort)
    if (scayt_serviceProtocol != null) __obj.updateDynamic("scayt_serviceProtocol")(scayt_serviceProtocol)
    if (scayt_srcUrl != null) __obj.updateDynamic("scayt_srcUrl")(scayt_srcUrl)
    if (scayt_uiTabs != null) __obj.updateDynamic("scayt_uiTabs")(scayt_uiTabs)
    if (scayt_userDictionaryName != null) __obj.updateDynamic("scayt_userDictionaryName")(scayt_userDictionaryName)
    if (sharedSpaces != null) __obj.updateDynamic("sharedSpaces")(sharedSpaces)
    if (shiftEnterMode != null) __obj.updateDynamic("shiftEnterMode")(shiftEnterMode.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin)
    if (smiley_columns != null) __obj.updateDynamic("smiley_columns")(smiley_columns.asInstanceOf[js.Any])
    if (smiley_descriptions != null) __obj.updateDynamic("smiley_descriptions")(smiley_descriptions)
    if (smiley_images != null) __obj.updateDynamic("smiley_images")(smiley_images)
    if (smiley_path != null) __obj.updateDynamic("smiley_path")(smiley_path)
    if (sourceAreaTabSize != null) __obj.updateDynamic("sourceAreaTabSize")(sourceAreaTabSize.asInstanceOf[js.Any])
    if (specialChars != null) __obj.updateDynamic("specialChars")(specialChars)
    if (startupFocus != null) __obj.updateDynamic("startupFocus")(startupFocus.asInstanceOf[js.Any])
    if (startupMode != null) __obj.updateDynamic("startupMode")(startupMode)
    if (!js.isUndefined(startupOutlineBlocks)) __obj.updateDynamic("startupOutlineBlocks")(startupOutlineBlocks)
    if (!js.isUndefined(startupShowBorders)) __obj.updateDynamic("startupShowBorders")(startupShowBorders)
    if (stylesSet != null) __obj.updateDynamic("stylesSet")(stylesSet.asInstanceOf[js.Any])
    if (stylesheetParser_skipSelectors != null) __obj.updateDynamic("stylesheetParser_skipSelectors")(stylesheetParser_skipSelectors)
    if (stylesheetParser_validSelectors != null) __obj.updateDynamic("stylesheetParser_validSelectors")(stylesheetParser_validSelectors)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tabSpaces != null) __obj.updateDynamic("tabSpaces")(tabSpaces.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (templates_files != null) __obj.updateDynamic("templates_files")(templates_files)
    if (!js.isUndefined(templates_replaceContent)) __obj.updateDynamic("templates_replaceContent")(templates_replaceContent)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (!js.isUndefined(toolbarCanCollapse)) __obj.updateDynamic("toolbarCanCollapse")(toolbarCanCollapse)
    if (!js.isUndefined(toolbarGroupCycling)) __obj.updateDynamic("toolbarGroupCycling")(toolbarGroupCycling)
    if (toolbarGroups != null) __obj.updateDynamic("toolbarGroups")(toolbarGroups)
    if (toolbarLocation != null) __obj.updateDynamic("toolbarLocation")(toolbarLocation)
    if (!js.isUndefined(toolbarStartupExpanded)) __obj.updateDynamic("toolbarStartupExpanded")(toolbarStartupExpanded)
    if (uiColor != null) __obj.updateDynamic("uiColor")(uiColor)
    if (undoStackSize != null) __obj.updateDynamic("undoStackSize")(undoStackSize.asInstanceOf[js.Any])
    if (uploadUrl != null) __obj.updateDynamic("uploadUrl")(uploadUrl)
    if (!js.isUndefined(useComputedState)) __obj.updateDynamic("useComputedState")(useComputedState)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wsc_cmd != null) __obj.updateDynamic("wsc_cmd")(wsc_cmd)
    if (wsc_customDictionaryIds != null) __obj.updateDynamic("wsc_customDictionaryIds")(wsc_customDictionaryIds)
    if (wsc_customLoaderScript != null) __obj.updateDynamic("wsc_customLoaderScript")(wsc_customLoaderScript)
    if (wsc_customerId != null) __obj.updateDynamic("wsc_customerId")(wsc_customerId)
    if (wsc_height != null) __obj.updateDynamic("wsc_height")(wsc_height)
    if (wsc_lang != null) __obj.updateDynamic("wsc_lang")(wsc_lang)
    if (wsc_left != null) __obj.updateDynamic("wsc_left")(wsc_left)
    if (wsc_top != null) __obj.updateDynamic("wsc_top")(wsc_top)
    if (wsc_userDictionaryName != null) __obj.updateDynamic("wsc_userDictionaryName")(wsc_userDictionaryName)
    if (wsc_width != null) __obj.updateDynamic("wsc_width")(wsc_width)
    __obj.asInstanceOf[config]
  }
}

