package typings.ckeditor.CKEDITORNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR")
@js.native
object ^ extends js.Object {
  // Properties
  val ALT: Double = js.native
  val CTRL: Double = js.native
  val DATA_TRANSFER_CROSS_EDITORS: Double = js.native
  val DATA_TRANSFER_EXTERNAL: Double = js.native
  val DATA_TRANSFER_INTERNAL: Double = js.native
  val DIALOG_RESIZE_BOTH: Double = js.native
  val DIALOG_RESIZE_HEIGHT: Double = js.native
  val DIALOG_RESIZE_NONE: Double = js.native
  val DIALOG_RESIZE_WIDTH: Double = js.native
  val DIALOG_STATE_BUSY: Double = js.native
  val DIALOG_STATE_IDLE: Double = js.native
  val ELEMENT_MODE_APPENDTO: Double = js.native
  val ELEMENT_MODE_INLINE: Double = js.native
  val ELEMENT_MODE_NONE: Double = js.native
  val ELEMENT_MODE_REPLACE: Double = js.native
  val END: Double = js.native
  val ENLARGE_BLOCK_CONTENTS: Double = js.native
  val ENLARGE_ELEMENT: Double = js.native
  val ENLARGE_INLINE: Double = js.native
  val ENLARGE_LIST_ITEM_CONTENTS: Double = js.native
  val ENTER_BR: Double = js.native
  val ENTER_DIV: Double = js.native
  val ENTER_P: Double = js.native
  val EVENT_PHASE_AT_TARGET: Double = js.native
  val EVENT_PHASE_BUBBLING: Double = js.native
  val EVENT_PHASE_CAPTURING: Double = js.native
  val FILTER_SKIP_TREE: Double = js.native
  val LINEUTILS_AFTER: Double = js.native
  val LINEUTILS_BEFORE: Double = js.native
  val LINEUTIS_INSIDE: Double = js.native
  val MOUSE_BUTTON_LEFT: Double = js.native
  val MOUSE_BUTTON_MIDDLE: Double = js.native
  val MOUSE_BUTTON_RIGHT: Double = js.native
  val NODE_COMMENT: Double = js.native
  val NODE_DOCUMENT: Double = js.native
  val NODE_DOCUMENT_FRAGMENT: Double = js.native
  val NODE_ELEMENT: Double = js.native
  val NODE_TEXT: Double = js.native
  val POSITION_AFTER_END: Double = js.native
  val POSITION_AFTER_START: Double = js.native
  val POSITION_BEFORE_END: Double = js.native
  val POSITION_BEFORE_START: Double = js.native
  val POSITION_CONTAINS: Double = js.native
  val POSITION_DISCONNECTED: Double = js.native
  val POSITION_FOLLOWING: Double = js.native
  val POSITION_IDENTICAL: Double = js.native
  val POSITION_IS_CONTAINED: Double = js.native
  val POSITION_PRECEDING: Double = js.native
  val SELECTION_ELEMENT: Double = js.native
  val SELECTION_NONE: Double = js.native
  val SELECTION_TEXT: Double = js.native
  val SHIFT: Double = js.native
  val SHRINK_ELEMENT: Double = js.native
  val SHRINK_TEXT: Double = js.native
  val START: Double = js.native
  val STYLE_BLOCK: String = js.native
  val STYLE_INLINE: String = js.native
  val STYLE_OBJECT: String = js.native
  val TRISTATE_DISABLED: Double = js.native
  val TRISTATE_OFF: Double = js.native
  val TRISTATE_ON: Double = js.native
  val UI_BUTTON: String = js.native
  val UI_MENUBUTTON: String = js.native
  val UI_PANEL: String = js.native
  val UI_PANELBUTTON: String = js.native
  val UI_RICHCOMBO: String = js.native
  val UI_SEPARATOR: String = js.native
  val VERBOSITY_ERROR: Double = js.native
  val VERBOSITY_WARN: Double = js.native
  var basePath: String = js.native
  val config: typings.ckeditor.CKEDITORNs.config = js.native
  var currentInstance: editor = js.native
  // Config options
  var disableAutoInline: Boolean = js.native
  var document: typings.ckeditor.CKEDITORNs.domNs.document = js.native
  var dtd: dtdDefinition = js.native
  var loadFullCoreTimeout: Double = js.native
  var replaceClass: String = js.native
  var revision: String = js.native
  var rnd: Double = js.native
  var skinName: String = js.native
  var status: String = js.native
  var stylesSet: resourceManager = js.native
  var timestamp: String = js.native
  var verbosity: Double = js.native
  var version: String = js.native
  // Methods
  def add(editor: editor): Unit = js.native
  def addCss(css: String): Unit = js.native
  def addTemplate(name: String, source: String): template = js.native
  def appendTo(element: String): editor = js.native
  def appendTo(element: String, config: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def appendTo(element: String, config: typings.ckeditor.CKEDITORNs.config, data: String): editor = js.native
  def appendTo(element: HTMLElement): editor = js.native
  def appendTo(element: HTMLElement, config: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def appendTo(element: HTMLElement, config: typings.ckeditor.CKEDITORNs.config, data: String): editor = js.native
  // Event interface
  def capture(): Unit = js.native
  def define(name: String, meta: StringDictionary[js.Any]): Unit = js.native
  def domReady(): Unit = js.native
  def editorConfig(config: typings.ckeditor.CKEDITORNs.config): Unit = js.native
  def error(errorCode: String): Unit = js.native
  def error(errorCode: String, additionalData: js.Any): Unit = js.native
  def fire(eventName: String): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fire(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def fireOnce(eventName: String): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any]): js.Any = js.native
  def fireOnce(eventName: String, data: StringDictionary[js.Any], editor: editor): js.Any = js.native
  def getCss(): String = js.native
  def getTemplate(name: String): template = js.native
  def getUrl(resource: String): String = js.native
  def hasListeners(eventName: String): Boolean = js.native
  def `inline`(element: String): editor = js.native
  def `inline`(element: String, instanceConfig: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def `inline`(element: HTMLElement): editor = js.native
  def `inline`(element: HTMLElement, instanceConfig: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def inlineAll(): Unit = js.native
  def loadFullCore(): Unit = js.native
  def on(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any]
  ): Unit = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any]
  ): Unit = js.native
  def on(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any],
    priority: Double
  ): Unit = js.native
  def once(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any]
  ): Unit = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any]
  ): Unit = js.native
  def once(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any],
    priority: Double
  ): Unit = js.native
  def removeAllListeners(): Unit = js.native
  def removeListener(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
  def replace(element: String): editor = js.native
  def replace(element: String, config: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def replace(element: HTMLTextAreaElement): editor = js.native
  def replace(element: HTMLTextAreaElement, config: typings.ckeditor.CKEDITORNs.config): editor = js.native
  def replaceAll(): Unit = js.native
  def replaceAll(
    assertionFunction: js.Function2[
      /* textarea */ HTMLTextAreaElement, 
      /* config */ typings.ckeditor.CKEDITORNs.config, 
      Boolean
    ]
  ): Unit = js.native
  def replaceAll(className: String): Unit = js.native
  def warn(errorCode: String): Unit = js.native
  def warn(errorCode: String, additionalData: js.Any): Unit = js.native
}

