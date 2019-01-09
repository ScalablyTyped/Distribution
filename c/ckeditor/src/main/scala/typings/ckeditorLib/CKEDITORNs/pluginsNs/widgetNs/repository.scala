package typings
package ckeditorLib.CKEDITORNs.pluginsNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget.repository")
@js.native
class repository ()
  extends ckeditorLib.CKEDITORNs.event {
  val editor: ckeditorLib.CKEDITORNs.editor = js.native
  val focused: ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  val instances: org.scalablytyped.runtime.StringDictionary[ckeditorLib.CKEDITORNs.pluginsNs.widget] = js.native
  val registered: org.scalablytyped.runtime.StringDictionary[definition] = js.native
  val selected: js.Array[ckeditorLib.CKEDITORNs.pluginsNs.widget] = js.native
  val widgetHoldingFocusedEditable: ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def add(name: java.lang.String, widgetDef: definition): scala.Unit = js.native
  def addUpcastCallback(
    callback: js.Function2[
      /* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, 
      /* data */ js.Any, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def checkSelection(): scala.Unit = js.native
  def checkWidgets(): scala.Unit = js.native
  def checkWidgets(options: ckeditorLib.Anon_FocusInited): scala.Unit = js.native
  def del(widget: ckeditorLib.CKEDITORNs.pluginsNs.widget): scala.Unit = js.native
  def destroy(widget: ckeditorLib.CKEDITORNs.pluginsNs.widget): scala.Unit = js.native
  def destroy(widget: ckeditorLib.CKEDITORNs.pluginsNs.widget, offline: scala.Boolean): scala.Unit = js.native
  def destroyAll(): scala.Unit = js.native
  def destroyAll(offline: scala.Boolean): scala.Unit = js.native
  def finalizeCreation(container: js.Any): scala.Unit = js.native
  def getByElement(element: js.Any, checkWrapperOnly: scala.Boolean): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOn(element: ckeditorLib.CKEDITORNs.domNs.element): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOn(element: ckeditorLib.CKEDITORNs.domNs.element, widgetDef: definition): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOn(
    element: ckeditorLib.CKEDITORNs.domNs.element,
    widgetDef: definition,
    startupData: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOn(element: ckeditorLib.CKEDITORNs.domNs.element, widgetDef: java.lang.String): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOn(
    element: ckeditorLib.CKEDITORNs.domNs.element,
    widgetDef: java.lang.String,
    startupData: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): ckeditorLib.CKEDITORNs.pluginsNs.widget = js.native
  def initOnAll(): js.Array[ckeditorLib.CKEDITORNs.pluginsNs.widget] = js.native
  def initOnAll(container: ckeditorLib.CKEDITORNs.domNs.element): js.Array[ckeditorLib.CKEDITORNs.pluginsNs.widget] = js.native
  def parseElementClasses(classes: java.lang.String): js.Any = js.native
  def wrapElement(element: js.Any): js.Any = js.native
  def wrapElement(element: js.Any, widgetName: java.lang.String): js.Any = js.native
}

