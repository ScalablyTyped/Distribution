package typings.ckeditor.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.nodeList
import typings.ckeditor.CKEDITOR.feature
import typings.ckeditor.CKEDITOR.ui.dialog.definitions.fieldSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.ui")
@js.native
class ui protected ()
  extends StObject
     with typings.ckeditor.CKEDITOR.ui {
  def this(editor: typings.ckeditor.CKEDITOR.editor) = this()
}
object ui {
  
  @JSGlobal("CKEDITOR.ui.balloonPanel")
  @js.native
  class balloonPanel ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.balloonPanel
  
  @JSGlobal("CKEDITOR.ui.balloonToolbar")
  @js.native
  class balloonToolbar protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.balloonToolbar {
    def this(editor: typings.ckeditor.CKEDITOR.editor, definition: StringDictionary[js.Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.button")
  @js.native
  class button protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.button {
    def this(definition: StringDictionary[js.Any]) = this()
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor.CKEDITOR.editor): feature = js.native
  }
  object button {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.button.handler")
    @js.native
    val handler: typings.ckeditor.CKEDITOR.ui.handlerDefinition[typings.ckeditor.CKEDITOR.ui.button] = js.native
  }
  
  object dialog {
    
    @JSGlobal("CKEDITOR.ui.dialog.button")
    @js.native
    class button protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.button,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(): Unit = js.native
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def click(): js.Any = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.checkbox")
    @js.native
    class checkbox protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.checkbox {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(checked: Boolean, noChangeEvent: Boolean): Unit = js.native
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fieldset")
    @js.native
    class fieldset protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[js.Any],
        childHtmlList: js.Array[js.Any],
        htmlList: js.Array[js.Any],
        elementDefinition: fieldSet
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.file")
    @js.native
    class file protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.file {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.file,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getAction(): String = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: StringDictionary[js.Any]): typings.ckeditor.CKEDITOR.ui.dialog.file = js.native
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def reset(): Unit = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setInitValue(): Unit = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
      
      /* CompleteClass */
      override def submit(): typings.ckeditor.CKEDITOR.ui.dialog.file = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fileButton")
    @js.native
    class fileButton protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(): Unit = js.native
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def click(): js.Any = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.hbox")
    @js.native
    class hbox protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[js.Any],
        childHtmlList: js.Array[js.Any],
        htmlList: js.Array[js.Any],
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.hbox
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.html")
    @js.native
    class html protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.html,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.iframeElement")
    @js.native
    class iframeElement ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.labeledElement")
    @js.native
    class labeledElement protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement,
        htmlList: js.Array[js.Any],
        contentHtml: js.Function0[String]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.radio")
    @js.native
    class radio protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.radio {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.radio,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: String, noChangeEvent: Boolean): Unit = js.native
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.select")
    @js.native
    class select protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.select {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.select,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textInput")
    @js.native
    class textInput protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.textInput {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textInput,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getDirectionMarker(): String = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def select(): Unit = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setDirectionMarker(dir: String): Unit = js.native
      
      /* CompleteClass */
      override def setValue(value: String, noChangeEvent: Boolean): typings.ckeditor.CKEDITOR.ui.dialog.textInput = js.native
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textarea")
    @js.native
    class textarea protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textarea,
        htmlList: js.Array[js.Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.uiElement")
    @js.native
    class uiElement protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
      // Not sure that the htmlList array type is right.
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[js.Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: js.Function0[StringDictionary[js.Any]],
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[js.Any]],
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: js.Function0[StringDictionary[js.Any]],
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[js.Any]],
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[js.Any]],
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[js.Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[js.Any] | String]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.vbox")
    @js.native
    class vbox protected ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typings.ckeditor.CKEDITOR.dialog,
        childObjList: js.Array[js.Any],
        childHtmlList: js.Array[js.Any],
        htmlList: js.Array[js.Any],
        elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.vbox
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: js.Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): js.Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor.CKEDITOR.dialog.definition.uiElement): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    }
  }
  
  @JSGlobal("CKEDITOR.ui.floatPanel")
  @js.native
  class floatPanel protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.floatPanel {
    def this(
      editor: typings.ckeditor.CKEDITOR.editor,
      parentElement: element,
      definition: StringDictionary[js.Any],
      level: Double
    ) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.handlerDefinition")
  @js.native
  class handlerDefinition[T] ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.handlerDefinition[T] {
    
    /* CompleteClass */
    var contentsElement: element = js.native
    
    /* CompleteClass */
    override def create(definition: StringDictionary[js.Any]): T = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.menuButton")
  @js.native
  class menuButton ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.button {
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor.CKEDITOR.editor): feature = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.panel")
  @js.native
  class panel protected ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.panel {
    def this(document: typings.ckeditor.CKEDITOR.dom.document, definition: StringDictionary[js.Any]) = this()
  }
  object panel {
    
    @JSGlobal("CKEDITOR.ui.panel.block")
    @js.native
    class block ()
      extends StObject
         with typings.ckeditor.CKEDITOR.ui.panel.block {
      
      /* CompleteClass */
      override def getItems(): nodeList = js.native
      
      /* CompleteClass */
      override def markItem(index: Double): Unit = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.panel.handler")
    @js.native
    val handler: typings.ckeditor.CKEDITOR.ui.handlerDefinition[typings.ckeditor.CKEDITOR.ui.panel] = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.panelButton")
  @js.native
  class panelButton ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.button {
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor.CKEDITOR.editor): feature = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.richCombo")
  @js.native
  class richCombo ()
    extends StObject
       with typings.ckeditor.CKEDITOR.ui.richCombo {
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
  }
  object richCombo {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.richCombo.handler")
    @js.native
    val handler: typings.ckeditor.CKEDITOR.ui.handlerDefinition[typings.ckeditor.CKEDITOR.ui.richCombo] = js.native
  }
}
