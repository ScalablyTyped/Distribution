package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR")
@js.native
object CKEDITORNsMembers extends js.Object {
  // Properties
  val ALT: scala.Double = js.native
  val CTRL: scala.Double = js.native
  val DATA_TRANSFER_CROSS_EDITORS: scala.Double = js.native
  val DATA_TRANSFER_EXTERNAL: scala.Double = js.native
  val DATA_TRANSFER_INTERNAL: scala.Double = js.native
  val DIALOG_RESIZE_BOTH: scala.Double = js.native
  val DIALOG_RESIZE_HEIGHT: scala.Double = js.native
  val DIALOG_RESIZE_NONE: scala.Double = js.native
  val DIALOG_RESIZE_WIDTH: scala.Double = js.native
  val DIALOG_STATE_BUSY: scala.Double = js.native
  val DIALOG_STATE_IDLE: scala.Double = js.native
  val ELEMENT_MODE_APPENDTO: scala.Double = js.native
  val ELEMENT_MODE_INLINE: scala.Double = js.native
  val ELEMENT_MODE_NONE: scala.Double = js.native
  val ELEMENT_MODE_REPLACE: scala.Double = js.native
  val END: scala.Double = js.native
  val ENLARGE_BLOCK_CONTENTS: scala.Double = js.native
  val ENLARGE_ELEMENT: scala.Double = js.native
  val ENLARGE_INLINE: scala.Double = js.native
  val ENLARGE_LIST_ITEM_CONTENTS: scala.Double = js.native
  val ENTER_BR: scala.Double = js.native
  val ENTER_DIV: scala.Double = js.native
  val ENTER_P: scala.Double = js.native
  val EVENT_PHASE_AT_TARGET: scala.Double = js.native
  val EVENT_PHASE_BUBBLING: scala.Double = js.native
  val EVENT_PHASE_CAPTURING: scala.Double = js.native
  val FILTER_SKIP_TREE: scala.Double = js.native
  val LINEUTILS_AFTER: scala.Double = js.native
  val LINEUTILS_BEFORE: scala.Double = js.native
  val LINEUTIS_INSIDE: scala.Double = js.native
  val MOUSE_BUTTON_LEFT: scala.Double = js.native
  val MOUSE_BUTTON_MIDDLE: scala.Double = js.native
  val MOUSE_BUTTON_RIGHT: scala.Double = js.native
  val NODE_COMMENT: scala.Double = js.native
  val NODE_DOCUMENT: scala.Double = js.native
  val NODE_DOCUMENT_FRAGMENT: scala.Double = js.native
  val NODE_ELEMENT: scala.Double = js.native
  val NODE_TEXT: scala.Double = js.native
  val POSITION_AFTER_END: scala.Double = js.native
  val POSITION_AFTER_START: scala.Double = js.native
  val POSITION_BEFORE_END: scala.Double = js.native
  val POSITION_BEFORE_START: scala.Double = js.native
  val POSITION_CONTAINS: scala.Double = js.native
  val POSITION_DISCONNECTED: scala.Double = js.native
  val POSITION_FOLLOWING: scala.Double = js.native
  val POSITION_IDENTICAL: scala.Double = js.native
  val POSITION_IS_CONTAINED: scala.Double = js.native
  val POSITION_PRECEDING: scala.Double = js.native
  val SELECTION_ELEMENT: scala.Double = js.native
  val SELECTION_NONE: scala.Double = js.native
  val SELECTION_TEXT: scala.Double = js.native
  val SHIFT: scala.Double = js.native
  val SHRINK_ELEMENT: scala.Double = js.native
  val SHRINK_TEXT: scala.Double = js.native
  val START: scala.Double = js.native
  val STYLE_BLOCK: java.lang.String = js.native
  val STYLE_INLINE: java.lang.String = js.native
  val STYLE_OBJECT: java.lang.String = js.native
  val TRISTATE_DISABLED: scala.Double = js.native
  val TRISTATE_OFF: scala.Double = js.native
  val TRISTATE_ON: scala.Double = js.native
  val UI_BUTTON: java.lang.String = js.native
  val UI_MENUBUTTON: java.lang.String = js.native
  val UI_PANEL: java.lang.String = js.native
  val UI_PANELBUTTON: java.lang.String = js.native
  val UI_RICHCOMBO: java.lang.String = js.native
  val UI_SEPARATOR: java.lang.String = js.native
  val VERBOSITY_ERROR: scala.Double = js.native
  val VERBOSITY_WARN: scala.Double = js.native
  var basePath: java.lang.String = js.native
  val config: config = js.native
  var currentInstance: editor = js.native
  // Config options
  var disableAutoInline: scala.Boolean = js.native
  var document: ckeditorLib.CKEDITORNs.domNs.document = js.native
  var dtd: dtdDefinition = js.native
  var loadFullCoreTimeout: scala.Double = js.native
  var replaceClass: java.lang.String = js.native
  var revision: java.lang.String = js.native
  var rnd: scala.Double = js.native
  var skinName: java.lang.String = js.native
  var status: java.lang.String = js.native
  var stylesSet: resourceManager = js.native
  var timestamp: java.lang.String = js.native
  var verbosity: scala.Double = js.native
  var version: java.lang.String = js.native
  // Methods
  def add(editor: editor): scala.Unit = js.native
  def addCss(css: java.lang.String): scala.Unit = js.native
  def addTemplate(name: java.lang.String, source: java.lang.String): template = js.native
  def appendTo(element: java.lang.String): editor = js.native
  def appendTo(element: java.lang.String, config: config): editor = js.native
  def appendTo(element: java.lang.String, config: config, data: java.lang.String): editor = js.native
  def appendTo(element: stdLib.HTMLElement): editor = js.native
  def appendTo(element: stdLib.HTMLElement, config: config): editor = js.native
  def appendTo(element: stdLib.HTMLElement, config: config, data: java.lang.String): editor = js.native
  // Event interface
  def capture(): scala.Unit = js.native
  def define(name: java.lang.String, meta: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def domReady(): scala.Unit = js.native
  def editorConfig(config: config): scala.Unit = js.native
  def error(errorCode: java.lang.String): scala.Unit = js.native
  def error(errorCode: java.lang.String, additionalData: js.Any): scala.Unit = js.native
  def fire(eventName: java.lang.String): js.Any = js.native
  def fire(eventName: java.lang.String, data: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def fire(eventName: java.lang.String, data: ScalablyTyped.runtime.StringDictionary[js.Any], editor: editor): js.Any = js.native
  def fireOnce(eventName: java.lang.String): js.Any = js.native
  def fireOnce(eventName: java.lang.String, data: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def fireOnce(eventName: java.lang.String, data: ScalablyTyped.runtime.StringDictionary[js.Any], editor: editor): js.Any = js.native
  def getCss(): java.lang.String = js.native
  def getTemplate(name: java.lang.String): template = js.native
  def getUrl(resource: java.lang.String): java.lang.String = js.native
  def hasListeners(eventName: java.lang.String): scala.Boolean = js.native
  def `inline`(element: java.lang.String): editor = js.native
  def `inline`(element: java.lang.String, instanceConfig: config): editor = js.native
  def `inline`(element: stdLib.HTMLElement): editor = js.native
  def `inline`(element: stdLib.HTMLElement, instanceConfig: config): editor = js.native
  def inlineAll(): scala.Unit = js.native
  def loadFullCore(): scala.Unit = js.native
  def on(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): scala.Unit = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any],
    listenerData: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def on(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any],
    listenerData: ScalablyTyped.runtime.StringDictionary[js.Any],
    priority: scala.Double
  ): scala.Unit = js.native
  def once(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): scala.Unit = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any],
    listenerData: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): scala.Unit = js.native
  def once(
    eventName: java.lang.String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit],
    scopeObj: ScalablyTyped.runtime.StringDictionary[js.Any],
    listenerData: ScalablyTyped.runtime.StringDictionary[js.Any],
    priority: scala.Double
  ): scala.Unit = js.native
  def removeAllListeners(): scala.Unit = js.native
  def removeListener(eventName: java.lang.String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, scala.Unit]): scala.Unit = js.native
  def replace(element: java.lang.String): editor = js.native
  def replace(element: java.lang.String, config: config): editor = js.native
  def replace(element: stdLib.HTMLTextAreaElement): editor = js.native
  def replace(element: stdLib.HTMLTextAreaElement, config: config): editor = js.native
  def replaceAll(): scala.Unit = js.native
  def replaceAll(
    assertionFunction: js.Function2[/* textarea */ stdLib.HTMLTextAreaElement, /* config */ config, scala.Boolean]
  ): scala.Unit = js.native
  def replaceAll(className: java.lang.String): scala.Unit = js.native
  def warn(errorCode: java.lang.String): scala.Unit = js.native
  def warn(errorCode: java.lang.String, additionalData: js.Any): scala.Unit = js.native
}

