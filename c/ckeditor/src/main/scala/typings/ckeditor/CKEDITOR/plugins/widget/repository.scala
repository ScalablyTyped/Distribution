package typings.ckeditor.CKEDITOR.plugins.widget

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.anon.FocusInited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait repository extends event {
  
  def add(name: String, widgetDef: definition): Unit = js.native
  
  def addUpcastCallback(callback: js.Function2[/* element */ element, /* data */ js.Any, Boolean]): Unit = js.native
  
  def checkSelection(): Unit = js.native
  
  def checkWidgets(): Unit = js.native
  def checkWidgets(options: FocusInited): Unit = js.native
  
  def del(widget: typings.ckeditor.CKEDITOR.plugins.widget): Unit = js.native
  
  def destroy(widget: typings.ckeditor.CKEDITOR.plugins.widget): Unit = js.native
  def destroy(widget: typings.ckeditor.CKEDITOR.plugins.widget, offline: Boolean): Unit = js.native
  
  def destroyAll(): Unit = js.native
  def destroyAll(offline: Boolean): Unit = js.native
  
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  def finalizeCreation(container: js.Any): Unit = js.native
  
  val focused: typings.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def getByElement(element: js.Any, checkWrapperOnly: Boolean): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def initOn(element: typings.ckeditor.CKEDITOR.dom.element): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typings.ckeditor.CKEDITOR.dom.element,
    widgetDef: js.UndefOr[scala.Nothing],
    startupData: StringDictionary[js.Any]
  ): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(element: typings.ckeditor.CKEDITOR.dom.element, widgetDef: String): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typings.ckeditor.CKEDITOR.dom.element,
    widgetDef: String,
    startupData: StringDictionary[js.Any]
  ): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(element: typings.ckeditor.CKEDITOR.dom.element, widgetDef: definition): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  def initOn(
    element: typings.ckeditor.CKEDITOR.dom.element,
    widgetDef: definition,
    startupData: StringDictionary[js.Any]
  ): typings.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def initOnAll(): js.Array[typings.ckeditor.CKEDITOR.plugins.widget] = js.native
  def initOnAll(container: typings.ckeditor.CKEDITOR.dom.element): js.Array[typings.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  val instances: StringDictionary[typings.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  def parseElementClasses(classes: String): js.Any = js.native
  
  val registered: StringDictionary[definition] = js.native
  
  val selected: js.Array[typings.ckeditor.CKEDITOR.plugins.widget] = js.native
  
  val widgetHoldingFocusedEditable: typings.ckeditor.CKEDITOR.plugins.widget = js.native
  
  def wrapElement(element: js.Any): js.Any = js.native
  def wrapElement(element: js.Any, widgetName: String): js.Any = js.native
}
