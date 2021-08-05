package typings.ckeditor.CKEDITOR.plugins

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.editable
import typings.ckeditor.CKEDITOR.event
import typings.ckeditor.CKEDITOR.eventInfo
import typings.ckeditor.CKEDITOR.feature
import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable
import typings.ckeditor.CKEDITOR.style
import typings.ckeditor.CKEDITOR.template
import typings.ckeditor.anon.FocusInited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait widget
  extends StObject
     with event
     with typings.ckeditor.CKEDITOR.plugins.widget.definition {
  
  def addClass(className: String): Unit = js.native
  
  def applyStyle(style: style): Unit = js.native
  
  def checkStyleActive(style: style): Boolean = js.native
  
  val dataReady: Boolean = js.native
  
  val definition: typings.ckeditor.CKEDITOR.plugins.widget.definition = js.native
  
  def destroy(): Unit = js.native
  def destroy(offline: Boolean): Unit = js.native
  
  def destroyEditable(editableName: String): Unit = js.native
  def destroyEditable(editableName: String, offline: Boolean): Unit = js.native
  
  @JSName("edit")
  def edit_Mwidget(): Boolean = js.native
  
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  val element: typings.ckeditor.CKEDITOR.dom.element = js.native
  
  def focus(): Unit = js.native
  
  val focusedEditable: nestedEditable = js.native
  
  def getClasses(): js.Any = js.native
  
  def hasClass(className: String, Whether: Boolean): Unit = js.native
  
  val id: Double = js.native
  
  def initEditable(
    editableName: String,
    definition: typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition
  ): Boolean = js.native
  
  val inited: Boolean = js.native
  
  def isInited(): Boolean = js.native
  
  def isReady(): Boolean = js.native
  
  val ready: Boolean = js.native
  
  def removeClass(className: String): Unit = js.native
  
  def removeStyle(style: style): Unit = js.native
  
  val repository: typings.ckeditor.CKEDITOR.plugins.widget.repository = js.native
  
  def setData(keyOrData: js.Any, value: js.Any): widget = js.native
  
  def setFocused(selected: Boolean): widget = js.native
  
  def setSelected(selected: Boolean): widget = js.native
  
  def updateDragHandlerPosition(): Unit = js.native
  
  val wrapper: typings.ckeditor.CKEDITOR.dom.element = js.native
}
object widget {
  
  trait definition
    extends StObject
       with feature {
    
    var button: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
    
    var defaults: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var dialog: js.UndefOr[String] = js.undefined
    
    var downcast: js.UndefOr[String | (js.Function1[/* element */ element, Unit])] = js.undefined
    
    var downcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var edit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var editables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var getLabel: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var init: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var insert: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var parts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var pathName: js.UndefOr[String] = js.undefined
    
    var styleToAllowedContentRules: js.UndefOr[js.Function1[/* style */ style, allowedContentRules]] = js.undefined
    
    var styleableElements: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String | typings.ckeditor.CKEDITOR.template] = js.undefined
    
    var upcast: js.UndefOr[String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])] = js.undefined
    
    var upcastPriority: js.UndefOr[Double] = js.undefined
    
    var upcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object definition {
    
    inline def apply(): definition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[definition]
    }
    
    extension [Self <: definition](x: Self) {
      
      inline def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setData(value: /* evt */ eventInfo => Unit): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefaults(value: StringDictionary[js.Any]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setDialog(value: String): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setDialogUndefined: Self = StObject.set(x, "dialog", js.undefined)
      
      inline def setDowncast(value: String | (js.Function1[/* element */ element, Unit])): Self = StObject.set(x, "downcast", value.asInstanceOf[js.Any])
      
      inline def setDowncastFunction1(value: /* element */ element => Unit): Self = StObject.set(x, "downcast", js.Any.fromFunction1(value))
      
      inline def setDowncastUndefined: Self = StObject.set(x, "downcast", js.undefined)
      
      inline def setDowncasts(value: StringDictionary[js.Any]): Self = StObject.set(x, "downcasts", value.asInstanceOf[js.Any])
      
      inline def setDowncastsUndefined: Self = StObject.set(x, "downcasts", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEdit(value: () => Unit): Self = StObject.set(x, "edit", js.Any.fromFunction0(value))
      
      inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
      
      inline def setEditables(value: StringDictionary[js.Any]): Self = StObject.set(x, "editables", value.asInstanceOf[js.Any])
      
      inline def setEditablesUndefined: Self = StObject.set(x, "editables", js.undefined)
      
      inline def setGetLabel(value: () => js.Any): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
      
      inline def setGetLabelUndefined: Self = StObject.set(x, "getLabel", js.undefined)
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInsert(value: () => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction0(value))
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setParts(value: StringDictionary[js.Any]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPathName(value: String): Self = StObject.set(x, "pathName", value.asInstanceOf[js.Any])
      
      inline def setPathNameUndefined: Self = StObject.set(x, "pathName", js.undefined)
      
      inline def setStyleToAllowedContentRules(value: /* style */ style => allowedContentRules): Self = StObject.set(x, "styleToAllowedContentRules", js.Any.fromFunction1(value))
      
      inline def setStyleToAllowedContentRulesUndefined: Self = StObject.set(x, "styleToAllowedContentRules", js.undefined)
      
      inline def setStyleableElements(value: String): Self = StObject.set(x, "styleableElements", value.asInstanceOf[js.Any])
      
      inline def setStyleableElementsUndefined: Self = StObject.set(x, "styleableElements", js.undefined)
      
      inline def setTemplate(value: String | template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setUpcast(value: String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])): Self = StObject.set(x, "upcast", value.asInstanceOf[js.Any])
      
      inline def setUpcastFunction2(value: (/* element */ element, /* data */ js.Any) => Boolean): Self = StObject.set(x, "upcast", js.Any.fromFunction2(value))
      
      inline def setUpcastPriority(value: Double): Self = StObject.set(x, "upcastPriority", value.asInstanceOf[js.Any])
      
      inline def setUpcastPriorityUndefined: Self = StObject.set(x, "upcastPriority", js.undefined)
      
      inline def setUpcastUndefined: Self = StObject.set(x, "upcast", js.undefined)
      
      inline def setUpcasts(value: StringDictionary[js.Any]): Self = StObject.set(x, "upcasts", value.asInstanceOf[js.Any])
      
      inline def setUpcastsUndefined: Self = StObject.set(x, "upcasts", js.undefined)
    }
  }
  
  @js.native
  trait nestedEditable
    extends StObject
       with typings.ckeditor.CKEDITOR.dom.element {
    
    val editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    val enterMode: Double = js.native
    
    val filter: typings.ckeditor.CKEDITOR.filter = js.native
    
    def getData(): String = js.native
    
    def setData(data: String): Unit = js.native
    
    val shiftEnterMode: Double = js.native
  }
  object nestedEditable {
    
    trait definition extends StObject {
      
      var allowedContent: js.UndefOr[allowedContentRules] = js.undefined
      
      var disallowedContent: js.UndefOr[disallowedContentRules] = js.undefined
      
      var pathName: js.UndefOr[String] = js.undefined
      
      var selector: js.UndefOr[String] = js.undefined
    }
    object definition {
      
      inline def apply(): typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition]
      }
      
      extension [Self <: typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable.definition](x: Self) {
        
        inline def setAllowedContent(value: allowedContentRules): Self = StObject.set(x, "allowedContent", value.asInstanceOf[js.Any])
        
        inline def setAllowedContentUndefined: Self = StObject.set(x, "allowedContent", js.undefined)
        
        inline def setAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "allowedContent", js.Array(value :_*))
        
        inline def setDisallowedContent(value: disallowedContentRules): Self = StObject.set(x, "disallowedContent", value.asInstanceOf[js.Any])
        
        inline def setDisallowedContentUndefined: Self = StObject.set(x, "disallowedContent", js.undefined)
        
        inline def setPathName(value: String): Self = StObject.set(x, "pathName", value.asInstanceOf[js.Any])
        
        inline def setPathNameUndefined: Self = StObject.set(x, "pathName", js.undefined)
        
        inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      }
    }
  }
  
  @js.native
  trait repository
    extends StObject
       with event {
    
    def add(name: String, widgetDef: definition): Unit = js.native
    
    def addUpcastCallback(callback: js.Function2[/* element */ element, /* data */ js.Any, Boolean]): Unit = js.native
    
    def checkSelection(): Unit = js.native
    
    def checkWidgets(): Unit = js.native
    def checkWidgets(options: FocusInited): Unit = js.native
    
    def del(widget: widget): Unit = js.native
    
    def destroy(widget: widget): Unit = js.native
    def destroy(widget: widget, offline: Boolean): Unit = js.native
    
    def destroyAll(): Unit = js.native
    def destroyAll(offline: Boolean): Unit = js.native
    
    val editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    def finalizeCreation(container: js.Any): Unit = js.native
    
    val focused: widget = js.native
    
    def getByElement(element: js.Any, checkWrapperOnly: Boolean): widget = js.native
    
    def initOn(element: typings.ckeditor.CKEDITOR.dom.element): widget = js.native
    def initOn(element: typings.ckeditor.CKEDITOR.dom.element, widgetDef: String): widget = js.native
    def initOn(
      element: typings.ckeditor.CKEDITOR.dom.element,
      widgetDef: String,
      startupData: StringDictionary[js.Any]
    ): widget = js.native
    def initOn(
      element: typings.ckeditor.CKEDITOR.dom.element,
      widgetDef: Unit,
      startupData: StringDictionary[js.Any]
    ): widget = js.native
    def initOn(element: typings.ckeditor.CKEDITOR.dom.element, widgetDef: definition): widget = js.native
    def initOn(
      element: typings.ckeditor.CKEDITOR.dom.element,
      widgetDef: definition,
      startupData: StringDictionary[js.Any]
    ): widget = js.native
    
    def initOnAll(): js.Array[widget] = js.native
    def initOnAll(container: typings.ckeditor.CKEDITOR.dom.element): js.Array[widget] = js.native
    
    val instances: StringDictionary[widget] = js.native
    
    def parseElementClasses(classes: String): js.Any = js.native
    
    val registered: StringDictionary[definition] = js.native
    
    val selected: js.Array[widget] = js.native
    
    val widgetHoldingFocusedEditable: widget = js.native
    
    def wrapElement(element: js.Any): js.Any = js.native
    def wrapElement(element: js.Any, widgetName: String): js.Any = js.native
  }
  
  trait widgetselection extends StObject {
    
    def addFillers(editable: editable): Boolean
    
    def removeFillers(editable: editable): Unit
  }
  object widgetselection {
    
    inline def apply(addFillers: editable => Boolean, removeFillers: editable => Unit): widgetselection = {
      val __obj = js.Dynamic.literal(addFillers = js.Any.fromFunction1(addFillers), removeFillers = js.Any.fromFunction1(removeFillers))
      __obj.asInstanceOf[widgetselection]
    }
    
    extension [Self <: widgetselection](x: Self) {
      
      inline def setAddFillers(value: editable => Boolean): Self = StObject.set(x, "addFillers", js.Any.fromFunction1(value))
      
      inline def setRemoveFillers(value: editable => Unit): Self = StObject.set(x, "removeFillers", js.Any.fromFunction1(value))
    }
  }
}
