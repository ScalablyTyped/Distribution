package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.nodeList
import typings.ckeditor.CKEDITOR.ui.balloonPanel.parts
import typings.ckeditor.CKEDITOR.ui.balloonPanel.rect
import typings.ckeditor.CKEDITOR.ui.balloonPanel.templateDefinitions
import typings.ckeditor.CKEDITOR.ui.balloonPanel.templates
import typings.ckeditor.CKEDITOR.ui.panel.block
import typings.ckeditor.anon.FocusElement
import typings.ckeditor.anon.RemoveListenerListenerRegistration
import typings.ckeditor.ckeditorStrings.bottom
import typings.ckeditor.ckeditorStrings.horizontal
import typings.ckeditor.ckeditorStrings.left
import typings.ckeditor.ckeditorStrings.right
import typings.ckeditor.ckeditorStrings.top
import typings.ckeditor.ckeditorStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ui
  extends StObject
     with event {
  
  def add(name: String, `type`: StringDictionary[js.Any], definition: StringDictionary[js.Any]): Unit = js.native
  
  def addButton(name: String, definition: buttonDefinition): Unit = js.native
  
  def addHandler(`type`: StringDictionary[js.Any], handler: StringDictionary[js.Any]): Unit = js.native
  
  def addRichCombo(name: String, definition: StringDictionary[js.Any]): Unit = js.native
  
  def addToolbarGroup(name: String, previous: String): Unit = js.native
  def addToolbarGroup(name: String, previous: String, subgroupOf: String): Unit = js.native
  def addToolbarGroup(name: String, previous: Double): Unit = js.native
  def addToolbarGroup(name: String, previous: Double, subgroupOf: String): Unit = js.native
  
  def create(name: String): StringDictionary[js.Any] = js.native
  
  def get(name: String): StringDictionary[js.Any] = js.native
  
  def space(name: String): element = js.native
  
  def spaceId(name: String): String = js.native
}
object ui {
  
  @js.native
  trait balloonPanel extends StObject {
    
    def activateShowListeners(): Unit = js.native
    
    def activeShowListener(id: Double): Unit = js.native
    
    var activeShowListeners: NumberDictionary[RemoveListenerListenerRegistration] = js.native
    
    def addShowListener(listener: js.Function0[listenerRegistration]): listenerRegistration = js.native
    
    def attach(element: element): Unit = js.native
    def attach(element: element, options: Boolean): Unit = js.native
    def attach(element: element, options: element): Unit = js.native
    def attach(element: element, options: FocusElement): Unit = js.native
    
    def blur(): Unit = js.native
    
    def build(): Unit = js.native
    
    def deactivateShowListener(id: Double): Unit = js.native
    
    def deregisterFocusable(element: element): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var editor: typings.ckeditor.CKEDITOR.editor = js.native
    
    var focusables: NumberDictionary[element] = js.native
    
    def getHeight(): Double = js.native
    
    def getWidth(): Double = js.native
    
    var height: String = js.native
    
    def hide(): Unit = js.native
    
    def move(top: Double, left: Double): Unit = js.native
    
    var parts: parts = js.native
    
    var rect: rect = js.native
    
    def registerFocusable(element: element): Unit = js.native
    
    def removeShowListener(id: Double): Unit = js.native
    
    def resize(width: Double, height: Double): Unit = js.native
    
    def setTitle(title: String): Unit = js.native
    
    @JSName("setTriangle")
    def setTriangle_bottom(side: bottom): Unit = js.native
    @JSName("setTriangle")
    def setTriangle_left(side: left): Unit = js.native
    @JSName("setTriangle")
    def setTriangle_right(side: right): Unit = js.native
    @JSName("setTriangle")
    def setTriangle_top(side: top): Unit = js.native
    
    def show(): Unit = js.native
    
    var showListeners: NumberDictionary[js.Function0[listenerRegistration]] = js.native
    
    var templateDefinitions: templateDefinitions = js.native
    
    var templates: templates = js.native
    
    var triangleHeight: Double = js.native
    
    var triangleMinDistance: Double = js.native
    
    var triangleWidth: Double = js.native
    
    var width: Double = js.native
  }
  object balloonPanel {
    
    trait definition extends StObject {
      
      var content: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object definition {
      
      @scala.inline
      def apply(): definition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[definition]
      }
      
      @scala.inline
      implicit class definitionMutableBuilder[Self <: definition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait parts extends StObject {
      
      var close: js.UndefOr[element] = js.undefined
      
      var content: js.UndefOr[element] = js.undefined
      
      var panel: js.UndefOr[element] = js.undefined
      
      var title: js.UndefOr[element] = js.undefined
      
      var triangle: js.UndefOr[element] = js.undefined
      
      var triangleInner: js.UndefOr[element] = js.undefined
      
      var triangleOuter: js.UndefOr[element] = js.undefined
    }
    object parts {
      
      @scala.inline
      def apply(): parts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[parts]
      }
      
      @scala.inline
      implicit class partsMutableBuilder[Self <: parts] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: element): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        @scala.inline
        def setContent(value: element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setPanel(value: element): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        @scala.inline
        def setTitle(value: element): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTriangle(value: element): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInner(value: element): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        @scala.inline
        def setTriangleOuter(value: element): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        @scala.inline
        def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
    
    trait rect extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      var left: js.UndefOr[Double] = js.undefined
      
      var top: js.UndefOr[Double] = js.undefined
      
      var visible: js.UndefOr[Boolean] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object rect {
      
      @scala.inline
      def apply(): rect = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[rect]
      }
      
      @scala.inline
      implicit class rectMutableBuilder[Self <: rect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
        
        @scala.inline
        def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait templateDefinitions extends StObject {
      
      var close: js.UndefOr[String] = js.undefined
      
      var content: js.UndefOr[String] = js.undefined
      
      var panel: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var triangle: js.UndefOr[String] = js.undefined
      
      var triangleInner: js.UndefOr[String] = js.undefined
      
      var triangleOuter: js.UndefOr[String] = js.undefined
    }
    object templateDefinitions {
      
      @scala.inline
      def apply(): templateDefinitions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[templateDefinitions]
      }
      
      @scala.inline
      implicit class templateDefinitionsMutableBuilder[Self <: templateDefinitions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        @scala.inline
        def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTriangle(value: String): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInner(value: String): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        @scala.inline
        def setTriangleOuter(value: String): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        @scala.inline
        def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
    
    trait templates extends StObject {
      
      var close: js.UndefOr[template] = js.undefined
      
      var content: js.UndefOr[template] = js.undefined
      
      var panel: js.UndefOr[template] = js.undefined
      
      var title: js.UndefOr[template] = js.undefined
      
      var triangle: js.UndefOr[template] = js.undefined
      
      var triangleInner: js.UndefOr[template] = js.undefined
      
      var triangleOuter: js.UndefOr[template] = js.undefined
    }
    object templates {
      
      @scala.inline
      def apply(): templates = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[templates]
      }
      
      @scala.inline
      implicit class templatesMutableBuilder[Self <: templates] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: template): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
        
        @scala.inline
        def setContent(value: template): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        @scala.inline
        def setPanel(value: template): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
        
        @scala.inline
        def setTitle(value: template): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setTriangle(value: template): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInner(value: template): Self = StObject.set(x, "triangleInner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleInnerUndefined: Self = StObject.set(x, "triangleInner", js.undefined)
        
        @scala.inline
        def setTriangleOuter(value: template): Self = StObject.set(x, "triangleOuter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTriangleOuterUndefined: Self = StObject.set(x, "triangleOuter", js.undefined)
        
        @scala.inline
        def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      }
    }
  }
  
  @js.native
  trait balloonToolbar extends StObject {
    
    def addItem(name: String, element: button): Unit = js.native
    def addItem(name: String, element: richCombo): Unit = js.native
    
    def addItems(elements: StringDictionary[button | richCombo]): Unit = js.native
    
    def deleteItem(name: String): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getItem(name: String): button | richCombo = js.native
    
    def hide(): Unit = js.native
    
    def refresh(): Unit = js.native
    
    def show(): Unit = js.native
  }
  
  trait button extends StObject {
    
    def getState(): Double
    
    def render(editor: editor, output: js.Array[String]): Unit
    
    def setState(state: Double): Unit
    
    def toFeature(editor: editor): feature
  }
  object button {
    
    @scala.inline
    def apply(
      getState: () => Double,
      render: (editor, js.Array[String]) => Unit,
      setState: Double => Unit,
      toFeature: editor => feature
    ): button = {
      val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), render = js.Any.fromFunction2(render), setState = js.Any.fromFunction1(setState), toFeature = js.Any.fromFunction1(toFeature))
      __obj.asInstanceOf[button]
    }
    
    @scala.inline
    implicit class buttonMutableBuilder[Self <: button] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetState(value: () => Double): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRender(value: (editor, js.Array[String]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetState(value: Double => Unit): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToFeature(value: editor => feature): Self = StObject.set(x, "toFeature", js.Any.fromFunction1(value))
    }
  }
  
  object dialog {
    
    trait button
      extends StObject
         with uiElement {
      
      def accessKeyDown(): Unit
      
      def accessKeyUp(): Unit
      
      def click(): js.Any
    }
    object button {
      
      @scala.inline
      def apply(
        accessKeyDown: () => Unit,
        accessKeyUp: () => Unit,
        click: () => js.Any,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: () => uiElement,
        setValue: (js.Any, Boolean) => js.UndefOr[uiElement]
      ): typings.ckeditor.CKEDITOR.ui.dialog.button = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction0(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), click = js.Any.fromFunction0(click), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
        __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.button]
      }
      
      @scala.inline
      implicit class buttonMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.button] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKeyDown(value: () => Unit): Self = StObject.set(x, "accessKeyDown", js.Any.fromFunction0(value))
        
        @scala.inline
        def setAccessKeyUp(value: () => Unit): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction0(value))
        
        @scala.inline
        def setClick(value: () => js.Any): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
      }
    }
    
    trait checkbox
      extends StObject
         with uiElement {
      
      def accessKeyUp(): Unit
      
      def setValue(checked: Boolean, noChangeEvent: Boolean): Unit
    }
    object checkbox {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: () => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: () => uiElement,
        setValue: (Boolean, Boolean) => Unit
      ): checkbox = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
        __obj.asInstanceOf[checkbox]
      }
      
      @scala.inline
      implicit class checkboxMutableBuilder[Self <: checkbox] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKeyUp(value: () => Unit): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetValue(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    object definitions {
      
      trait button extends StObject {
        
        var disabled: js.UndefOr[Boolean] = js.undefined
        
        var label: String
      }
      object button {
        
        @scala.inline
        def apply(label: String): typings.ckeditor.CKEDITOR.ui.dialog.definitions.button = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.button]
        }
        
        @scala.inline
        implicit class buttonMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.button] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      trait checkbox extends StObject {
        
        var checked: js.UndefOr[Boolean] = js.undefined
        
        var label: js.UndefOr[String] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object checkbox {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox]
        }
        
        @scala.inline
        implicit class checkboxMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait fieldSet extends StObject {
        
        var children: js.Array[js.Any]
        
        var label: js.UndefOr[String] = js.undefined
      }
      object fieldSet {
        
        @scala.inline
        def apply(children: js.Array[js.Any]): fieldSet = {
          val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
          __obj.asInstanceOf[fieldSet]
        }
        
        @scala.inline
        implicit class fieldSetMutableBuilder[Self <: fieldSet] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChildren(value: js.Array[js.Any]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        }
      }
      
      trait file extends StObject {
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object file {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.file = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.file]
        }
        
        @scala.inline
        implicit class fileMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.file] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait fileButton extends StObject {
        
        var `for`: String
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object fileButton {
        
        @scala.inline
        def apply(`for`: String): typings.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton]
        }
        
        @scala.inline
        implicit class fileButtonMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait hbox extends StObject {
        
        var align: js.UndefOr[String] = js.undefined
        
        var height: js.UndefOr[String] = js.undefined
        
        var padding: js.UndefOr[String] = js.undefined
        
        var widths: js.UndefOr[js.Array[String]] = js.undefined
      }
      object hbox {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.hbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.hbox]
        }
        
        @scala.inline
        implicit class hboxMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.hbox] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
          
          @scala.inline
          def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
          
          @scala.inline
          def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
          
          @scala.inline
          def setWidths(value: js.Array[String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
          
          @scala.inline
          def setWidthsVarargs(value: String*): Self = StObject.set(x, "widths", js.Array(value :_*))
        }
      }
      
      trait html extends StObject {
        
        var html: String
      }
      object html {
        
        @scala.inline
        def apply(html: String): typings.ckeditor.CKEDITOR.ui.dialog.definitions.html = {
          val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.html]
        }
        
        @scala.inline
        implicit class htmlMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.html] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        }
      }
      
      trait iframeElement extends StObject {
        
        var height: String
        
        var onContentLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        var src: String
        
        var width: String
      }
      object iframeElement {
        
        @scala.inline
        def apply(height: String, src: String, width: String): typings.ckeditor.CKEDITOR.ui.dialog.definitions.iframeElement = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.iframeElement]
        }
        
        @scala.inline
        implicit class iframeElementMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.iframeElement] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOnContentLoad(value: () => Unit): Self = StObject.set(x, "onContentLoad", js.Any.fromFunction0(value))
          
          @scala.inline
          def setOnContentLoadUndefined: Self = StObject.set(x, "onContentLoad", js.undefined)
          
          @scala.inline
          def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      trait labeledElement extends StObject {
        
        var includeLabel: js.UndefOr[Boolean] = js.undefined
        
        var label: String
        
        var labelLayout: js.UndefOr[horizontal | vertical] = js.undefined
        
        var role: js.UndefOr[String] = js.undefined
        
        var widths: js.UndefOr[js.Tuple2[String, String]] = js.undefined
      }
      object labeledElement {
        
        @scala.inline
        def apply(label: String): typings.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement]
        }
        
        @scala.inline
        implicit class labeledElementMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIncludeLabel(value: Boolean): Self = StObject.set(x, "includeLabel", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIncludeLabelUndefined: Self = StObject.set(x, "includeLabel", js.undefined)
          
          @scala.inline
          def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelLayout(value: horizontal | vertical): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLabelLayoutUndefined: Self = StObject.set(x, "labelLayout", js.undefined)
          
          @scala.inline
          def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
          
          @scala.inline
          def setWidths(value: js.Tuple2[String, String]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        }
      }
      
      trait radio extends StObject {
        
        var default: js.Any
        
        var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object radio {
        
        @scala.inline
        def apply(default: js.Any, items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): typings.ckeditor.CKEDITOR.ui.dialog.definitions.radio = {
          val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.radio]
        }
        
        @scala.inline
        implicit class radioMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.radio] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItems(value: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemsVarargs(value: ((js.Tuple2[String, String]) | js.Array[String])*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait select extends StObject {
        
        var default: js.Any
        
        var items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]
        
        var multiple: js.UndefOr[Boolean] = js.undefined
        
        var size: js.UndefOr[Double] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object select {
        
        @scala.inline
        def apply(default: js.Any, items: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): typings.ckeditor.CKEDITOR.ui.dialog.definitions.select = {
          val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.select]
        }
        
        @scala.inline
        implicit class selectMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.select] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItems(value: js.Array[(js.Tuple2[String, String]) | js.Array[String]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setItemsVarargs(value: ((js.Tuple2[String, String]) | js.Array[String])*): Self = StObject.set(x, "items", js.Array(value :_*))
          
          @scala.inline
          def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
          
          @scala.inline
          def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait textInput extends StObject {
        
        var default: js.UndefOr[String] = js.undefined
        
        var maxLength: js.UndefOr[Double] = js.undefined
        
        var size: js.UndefOr[String] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object textInput {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.textInput = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.textInput]
        }
        
        @scala.inline
        implicit class textInputMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textInput] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          @scala.inline
          def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
          
          @scala.inline
          def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait textarea extends StObject {
        
        var default: js.UndefOr[String] = js.undefined
        
        var cols: js.UndefOr[Double] = js.undefined
        
        var rows: js.UndefOr[Double] = js.undefined
        
        var validate: js.UndefOr[js.Function0[Boolean]] = js.undefined
      }
      object textarea {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.textarea = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.textarea]
        }
        
        @scala.inline
        implicit class textareaMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textarea] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
          
          @scala.inline
          def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
          
          @scala.inline
          def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
          
          @scala.inline
          def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
          
          @scala.inline
          def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        }
      }
      
      trait uiElement extends StObject {
        
        var accessKey: js.UndefOr[String] = js.undefined
        
        var className: js.UndefOr[String] = js.undefined
        
        var hidden: js.UndefOr[Boolean] = js.undefined
        
        var id: String
        
        var style: js.UndefOr[String] = js.undefined
        
        var title: js.UndefOr[String] = js.undefined
        
        var `type`: Double
      }
      object uiElement {
        
        @scala.inline
        def apply(id: String, `type`: Double): typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement]
        }
        
        @scala.inline
        implicit class uiElementMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
          
          @scala.inline
          def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
          
          @scala.inline
          def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
          
          @scala.inline
          def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
          
          @scala.inline
          def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
          
          @scala.inline
          def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      trait vbox extends StObject {
        
        var align: js.UndefOr[String] = js.undefined
        
        var expand: js.UndefOr[Boolean] = js.undefined
        
        var heights: js.UndefOr[js.Array[String]] = js.undefined
        
        var padding: js.UndefOr[String] = js.undefined
        
        var width: js.UndefOr[String] = js.undefined
      }
      object vbox {
        
        @scala.inline
        def apply(): typings.ckeditor.CKEDITOR.ui.dialog.definitions.vbox = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.ckeditor.CKEDITOR.ui.dialog.definitions.vbox]
        }
        
        @scala.inline
        implicit class vboxMutableBuilder[Self <: typings.ckeditor.CKEDITOR.ui.dialog.definitions.vbox] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
          
          @scala.inline
          def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
          
          @scala.inline
          def setHeights(value: js.Array[String]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
          
          @scala.inline
          def setHeightsVarargs(value: String*): Self = StObject.set(x, "heights", js.Array(value :_*))
          
          @scala.inline
          def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
          
          @scala.inline
          def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
    }
    
    type fieldset = uiElement
    
    trait file
      extends StObject
         with labeledElement {
      
      def getAction(): String
      
      def registerEvents(definition: StringDictionary[js.Any]): file
      
      def reset(): Unit
      
      def setInitValue(): Unit
      
      def submit(): file
    }
    object file {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getAction: () => String,
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getLabel: () => String,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: StringDictionary[js.Any] => file,
        reset: () => Unit,
        selectParentTab: () => uiElement,
        setInitValue: () => Unit,
        setValue: (js.Any, Boolean) => js.UndefOr[uiElement],
        setlabel: String => labeledElement,
        submit: () => file
      ): file = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getAction = js.Any.fromFunction0(getAction), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), reset = js.Any.fromFunction0(reset), selectParentTab = js.Any.fromFunction0(selectParentTab), setInitValue = js.Any.fromFunction0(setInitValue), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel), submit = js.Any.fromFunction0(submit))
        __obj.asInstanceOf[file]
      }
      
      @scala.inline
      implicit class fileMutableBuilder[Self <: file] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetAction(value: () => String): Self = StObject.set(x, "getAction", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRegisterEvents(value: StringDictionary[js.Any] => file): Self = StObject.set(x, "registerEvents", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetInitValue(value: () => Unit): Self = StObject.set(x, "setInitValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSubmit(value: () => file): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
      }
    }
    
    type fileButton = typings.ckeditor.CKEDITOR.ui.dialog.button
    
    @js.native
    trait hbox
      extends StObject
         with uiElement {
      
      def getChild(indices: js.Array[Double]): js.Array[uiElement] = js.native
      def getChild(indices: Double): uiElement = js.native
    }
    
    type html = uiElement
    
    type iframeElement = uiElement
    
    trait labeledElement
      extends StObject
         with uiElement {
      
      def getLabel(): String
      
      def setlabel(label: String): labeledElement
    }
    object labeledElement {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getLabel: () => String,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: () => uiElement,
        setValue: (js.Any, Boolean) => js.UndefOr[uiElement],
        setlabel: String => labeledElement
      ): labeledElement = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[labeledElement]
      }
      
      @scala.inline
      implicit class labeledElementMutableBuilder[Self <: labeledElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetlabel(value: String => labeledElement): Self = StObject.set(x, "setlabel", js.Any.fromFunction1(value))
      }
    }
    
    trait radio
      extends StObject
         with labeledElement {
      
      def accessKeyUp(): Unit
      
      def setValue(value: String, noChangeEvent: Boolean): Unit
    }
    object radio {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: () => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getLabel: () => String,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: () => uiElement,
        setValue: (String, Boolean) => Unit,
        setlabel: String => labeledElement
      ): radio = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[radio]
      }
      
      @scala.inline
      implicit class radioMutableBuilder[Self <: radio] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKeyUp(value: () => Unit): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetValue(value: (String, Boolean) => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait select
      extends StObject
         with uiElement {
      
      def add(label: String): select = js.native
      def add(label: String, value: String): select = js.native
      def add(label: String, value: String, indexedDB: Double): select = js.native
      def add(label: String, value: Unit, indexedDB: Double): select = js.native
      
      def clear(): select = js.native
      
      def remove(index: Double): select = js.native
    }
    
    trait textInput
      extends StObject
         with labeledElement {
      
      def accessKeyUp(): Unit
      
      def getDirectionMarker(): String
      
      def select(): Unit
      
      def setDirectionMarker(dir: String): Unit
      
      def setValue(value: String, noChangeEvent: Boolean): textInput
    }
    object textInput {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: () => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getDirectionMarker: () => String,
        getElement: () => element,
        getInputElement: () => element,
        getLabel: () => String,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        select: () => Unit,
        selectParentTab: () => uiElement,
        setDirectionMarker: String => Unit,
        setValue: (String, Boolean) => textInput,
        setlabel: String => labeledElement
      ): textInput = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction0(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getDirectionMarker = js.Any.fromFunction0(getDirectionMarker), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getLabel = js.Any.fromFunction0(getLabel), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), select = js.Any.fromFunction0(select), selectParentTab = js.Any.fromFunction0(selectParentTab), setDirectionMarker = js.Any.fromFunction1(setDirectionMarker), setValue = js.Any.fromFunction2(setValue), setlabel = js.Any.fromFunction1(setlabel))
        __obj.asInstanceOf[textInput]
      }
      
      @scala.inline
      implicit class textInputMutableBuilder[Self <: textInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKeyUp(value: () => Unit): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDirectionMarker(value: () => String): Self = StObject.set(x, "getDirectionMarker", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSelect(value: () => Unit): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetDirectionMarker(value: String => Unit): Self = StObject.set(x, "setDirectionMarker", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetValue(value: (String, Boolean) => textInput): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    type textarea = labeledElement
    
    trait uiElement extends StObject {
      
      def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit
      
      def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit
      
      def disable(): Unit
      
      def enable(): Unit
      
      var eventProcessors: js.Any
      
      def focus(): js.UndefOr[uiElement]
      
      def getDialog(): typings.ckeditor.CKEDITOR.dialog
      
      def getElement(): element
      
      def getInputElement(): element
      
      def getValue(): js.Any
      
      def isChanged(): Boolean
      
      def isEnabled(): Boolean
      
      def isFocusable(): Boolean
      
      def isVisible(): Boolean
      
      def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): uiElement
      
      def selectParentTab(): uiElement
      
      def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[uiElement]
    }
    object uiElement {
      
      @scala.inline
      def apply(
        accessKeyDown: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        accessKeyUp: (typings.ckeditor.CKEDITOR.dialog, String) => Unit,
        disable: () => Unit,
        enable: () => Unit,
        eventProcessors: js.Any,
        focus: () => js.UndefOr[uiElement],
        getDialog: () => typings.ckeditor.CKEDITOR.dialog,
        getElement: () => element,
        getInputElement: () => element,
        getValue: () => js.Any,
        isChanged: () => Boolean,
        isEnabled: () => Boolean,
        isFocusable: () => Boolean,
        isVisible: () => Boolean,
        registerEvents: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement,
        selectParentTab: () => uiElement,
        setValue: (js.Any, Boolean) => js.UndefOr[uiElement]
      ): uiElement = {
        val __obj = js.Dynamic.literal(accessKeyDown = js.Any.fromFunction2(accessKeyDown), accessKeyUp = js.Any.fromFunction2(accessKeyUp), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), eventProcessors = eventProcessors.asInstanceOf[js.Any], focus = js.Any.fromFunction0(focus), getDialog = js.Any.fromFunction0(getDialog), getElement = js.Any.fromFunction0(getElement), getInputElement = js.Any.fromFunction0(getInputElement), getValue = js.Any.fromFunction0(getValue), isChanged = js.Any.fromFunction0(isChanged), isEnabled = js.Any.fromFunction0(isEnabled), isFocusable = js.Any.fromFunction0(isFocusable), isVisible = js.Any.fromFunction0(isVisible), registerEvents = js.Any.fromFunction1(registerEvents), selectParentTab = js.Any.fromFunction0(selectParentTab), setValue = js.Any.fromFunction2(setValue))
        __obj.asInstanceOf[uiElement]
      }
      
      @scala.inline
      implicit class uiElementMutableBuilder[Self <: uiElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKeyDown(value: (typings.ckeditor.CKEDITOR.dialog, String) => Unit): Self = StObject.set(x, "accessKeyDown", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAccessKeyUp(value: (typings.ckeditor.CKEDITOR.dialog, String) => Unit): Self = StObject.set(x, "accessKeyUp", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEventProcessors(value: js.Any): Self = StObject.set(x, "eventProcessors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocus(value: () => js.UndefOr[uiElement]): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetDialog(value: () => typings.ckeditor.CKEDITOR.dialog): Self = StObject.set(x, "getDialog", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetElement(value: () => element): Self = StObject.set(x, "getElement", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetInputElement(value: () => element): Self = StObject.set(x, "getInputElement", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetValue(value: () => js.Any): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsChanged(value: () => Boolean): Self = StObject.set(x, "isChanged", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsEnabled(value: () => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsFocusable(value: () => Boolean): Self = StObject.set(x, "isFocusable", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRegisterEvents(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => uiElement): Self = StObject.set(x, "registerEvents", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSelectParentTab(value: () => uiElement): Self = StObject.set(x, "selectParentTab", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetValue(value: (js.Any, Boolean) => js.UndefOr[uiElement]): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      }
    }
    
    type vbox = hbox
  }
  
  @js.native
  trait floatPanel extends StObject {
    
    def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
    
    def addListBlock(name: String, multiSelect: Boolean): Unit = js.native
    
    def allowBlur(allow: Boolean): Unit = js.native
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def getBlock(name: String): block = js.native
    
    def hide(returnFocus: Boolean): Unit = js.native
    
    def hideChild(restoreFocus: Boolean): Unit = js.native
    
    def reposition(): Unit = js.native
    
    def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double): Unit = js.native
    def showAsChild(panel: floatPanel, blckName: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
    def showAsChild(
      panel: floatPanel,
      blckName: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Double
    ): Unit = js.native
    def showAsChild(
      panel: floatPanel,
      blckName: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Double
    ): Unit = js.native
    
    def showBlock(name: String, offsetParent: element, corner: Double): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Double,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Double,
      offsetY: Unit,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(name: String, offsetParent: element, corner: Double, offsetX: Unit, offsetY: Double): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Double,
      callback: js.Function0[Unit]
    ): Unit = js.native
    def showBlock(
      name: String,
      offsetParent: element,
      corner: Double,
      offsetX: Unit,
      offsetY: Unit,
      callback: js.Function0[Unit]
    ): Unit = js.native
  }
  
  trait handlerDefinition[T] extends StObject {
    
    var contentsElement: element
    
    def create(definition: StringDictionary[js.Any]): T
  }
  object handlerDefinition {
    
    @scala.inline
    def apply[T](contentsElement: element, create: StringDictionary[js.Any] => T): handlerDefinition[T] = {
      val __obj = js.Dynamic.literal(contentsElement = contentsElement.asInstanceOf[js.Any], create = js.Any.fromFunction1(create))
      __obj.asInstanceOf[handlerDefinition[T]]
    }
    
    @scala.inline
    implicit class handlerDefinitionMutableBuilder[Self <: handlerDefinition[?], T] (val x: Self & handlerDefinition[T]) extends AnyVal {
      
      @scala.inline
      def setContentsElement(value: element): Self = StObject.set(x, "contentsElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreate(value: StringDictionary[js.Any] => T): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    }
  }
  
  type menuButton = button
  
  @js.native
  trait panel extends StObject {
    
    def addBlock(name: String, block: StringDictionary[js.Any]): Unit = js.native
    
    def getBlock(name: String): block = js.native
    
    def render(editor: editor): Unit = js.native
    def render(editor: editor, output: js.Array[String]): Unit = js.native
    
    def showBlock(name: String): Unit = js.native
  }
  object panel {
    
    trait block extends StObject {
      
      def getItems(): nodeList
      
      def markItem(index: Double): Unit
    }
    object block {
      
      @scala.inline
      def apply(getItems: () => nodeList, markItem: Double => Unit): block = {
        val __obj = js.Dynamic.literal(getItems = js.Any.fromFunction0(getItems), markItem = js.Any.fromFunction1(markItem))
        __obj.asInstanceOf[block]
      }
      
      @scala.inline
      implicit class blockMutableBuilder[Self <: block] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetItems(value: () => nodeList): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMarkItem(value: Double => Unit): Self = StObject.set(x, "markItem", js.Any.fromFunction1(value))
      }
    }
  }
  
  type panelButton = button
  
  trait richCombo extends StObject {
    
    def render(editor: editor, output: js.Array[String]): Unit
  }
  object richCombo {
    
    @scala.inline
    def apply(render: (editor, js.Array[String]) => Unit): richCombo = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[richCombo]
    }
    
    @scala.inline
    implicit class richComboMutableBuilder[Self <: richCombo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: (editor, js.Array[String]) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
}
