package typings.ckeditor4.global.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor4.CKEDITOR.dom.element
import typings.ckeditor4.CKEDITOR.dom.nodeList
import typings.ckeditor4.CKEDITOR.feature
import typings.ckeditor4.CKEDITOR.ui.dialog.definitions.fieldSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CKEDITOR.ui")
@js.native
open class ui protected ()
  extends StObject
     with typings.ckeditor4.CKEDITOR.ui {
  def this(editor: typings.ckeditor4.CKEDITOR.editor) = this()
}
object ui {
  
  @JSGlobal("CKEDITOR.ui.balloonPanel")
  @js.native
  open class balloonPanel ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.balloonPanel
  
  @JSGlobal("CKEDITOR.ui.balloonToolbar")
  @js.native
  open class balloonToolbar protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.balloonToolbar {
    def this(editor: typings.ckeditor4.CKEDITOR.editor, definition: StringDictionary[Any]) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.button")
  @js.native
  open class button protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.button {
    def this(definition: StringDictionary[Any]) = this()
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor4.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor4.CKEDITOR.editor): feature = js.native
  }
  object button {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.button.handler")
    @js.native
    val handler: typings.ckeditor4.CKEDITOR.ui.handlerDefinition[typings.ckeditor4.CKEDITOR.ui.button] = js.native
  }
  
  object dialog {
    
    @JSGlobal("CKEDITOR.ui.dialog.button")
    @js.native
    open class button protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.button,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(): Unit = js.native
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def click(): Any = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.checkbox")
    @js.native
    open class checkbox protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.checkbox {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.checkbox,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(checked: Boolean, noChangeEvent: Boolean): Unit = js.native
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fieldset")
    @js.native
    open class fieldset protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        childObjList: js.Array[Any],
        childHtmlList: js.Array[Any],
        htmlList: js.Array[Any],
        elementDefinition: fieldSet
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.file")
    @js.native
    open class file protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.file {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.file,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getAction(): String = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      /* CompleteClass */
      override def registerEvents(definition: StringDictionary[Any]): typings.ckeditor4.CKEDITOR.ui.dialog.file = js.native
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def reset(): Unit = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setInitValue(): Unit = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement = js.native
      
      /* CompleteClass */
      override def submit(): typings.ckeditor4.CKEDITOR.ui.dialog.file = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.fileButton")
    @js.native
    open class fileButton protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.button {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.fileButton,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(): Unit = js.native
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def click(): Any = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.hbox")
    @js.native
    open class hbox protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        childObjList: js.Array[Any],
        childHtmlList: js.Array[Any],
        htmlList: js.Array[Any],
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.hbox
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.html")
    @js.native
    open class html protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.uiElement {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.html,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.iframeElement")
    @js.native
    open class iframeElement ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.uiElement {
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.labeledElement")
    @js.native
    open class labeledElement protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.labeledElement,
        htmlList: js.Array[Any],
        contentHtml: js.Function0[String]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.radio")
    @js.native
    open class radio protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.radio {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.radio,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: String, noChangeEvent: Boolean): Unit = js.native
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.select")
    @js.native
    open class select protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.select {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.select,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textInput")
    @js.native
    open class textInput protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.textInput {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.textInput,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(): Unit = js.native
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getDirectionMarker(): String = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def select(): Unit = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setDirectionMarker(dir: String): Unit = js.native
      
      /* CompleteClass */
      override def setValue(value: String, noChangeEvent: Boolean): typings.ckeditor4.CKEDITOR.ui.dialog.textInput = js.native
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.textarea")
    @js.native
    open class textarea protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.textarea,
        htmlList: js.Array[Any]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getLabel(): String = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def setlabel(label: String): typings.ckeditor4.CKEDITOR.ui.dialog.labeledElement = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.uiElement")
    @js.native
    open class uiElement protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.uiElement {
      // Not sure that the htmlList array type is right.
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[Any]]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: js.Function0[StringDictionary[Any]],
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[Any]],
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: js.Function0[String],
        stylesArg: Unit,
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: js.Function0[StringDictionary[Any]],
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: js.Function0[StringDictionary[Any]],
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: js.Function0[StringDictionary[Any]],
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.uiElement,
        htmlList: js.Array[Any],
        nodeNameArg: Unit,
        stylesArg: Unit,
        attributesArg: Unit,
        contentsArg: js.Function0[StringDictionary[Any] | String]
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.dialog.vbox")
    @js.native
    open class vbox protected ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.dialog.hbox {
      def this(
        dialog: typings.ckeditor4.CKEDITOR.dialog,
        childObjList: js.Array[Any],
        childHtmlList: js.Array[Any],
        htmlList: js.Array[Any],
        elementDefinition: typings.ckeditor4.CKEDITOR.ui.dialog.definitions.vbox
      ) = this()
      
      /* CompleteClass */
      override def accessKeyDown(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def accessKeyUp(dialog: typings.ckeditor4.CKEDITOR.dialog, key: String): Unit = js.native
      
      /* CompleteClass */
      override def disable(): Unit = js.native
      
      /* CompleteClass */
      override def enable(): Unit = js.native
      
      /* CompleteClass */
      var eventProcessors: Any = js.native
      
      /* CompleteClass */
      override def focus(): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
      
      /* CompleteClass */
      override def getDialog(): typings.ckeditor4.CKEDITOR.dialog = js.native
      
      /* CompleteClass */
      override def getElement(): element = js.native
      
      /* CompleteClass */
      override def getInputElement(): element = js.native
      
      /* CompleteClass */
      override def getValue(): Any = js.native
      
      /* CompleteClass */
      override def isChanged(): Boolean = js.native
      
      /* CompleteClass */
      override def isEnabled(): Boolean = js.native
      
      /* CompleteClass */
      override def isFocusable(): Boolean = js.native
      
      /* CompleteClass */
      override def isVisible(): Boolean = js.native
      
      // tslint:disable-next-line:no-unnecessary-qualifier
      /* CompleteClass */
      override def registerEvents(definition: typings.ckeditor4.CKEDITOR.dialog.definition.uiElement): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def selectParentTab(): typings.ckeditor4.CKEDITOR.ui.dialog.uiElement = js.native
      
      /* CompleteClass */
      override def setValue(value: Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor4.CKEDITOR.ui.dialog.uiElement] = js.native
    }
  }
  
  @JSGlobal("CKEDITOR.ui.floatPanel")
  @js.native
  open class floatPanel protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.floatPanel {
    def this(
      editor: typings.ckeditor4.CKEDITOR.editor,
      parentElement: element,
      definition: StringDictionary[Any],
      level: Double
    ) = this()
  }
  
  @JSGlobal("CKEDITOR.ui.handlerDefinition")
  @js.native
  open class handlerDefinition[T] ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.handlerDefinition[T] {
    
    /* CompleteClass */
    var contentsElement: element = js.native
    
    /* CompleteClass */
    override def create(definition: StringDictionary[Any]): T = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.menuButton")
  @js.native
  open class menuButton ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.button {
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor4.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor4.CKEDITOR.editor): feature = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.panel")
  @js.native
  open class panel protected ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.panel {
    def this(document: typings.ckeditor4.CKEDITOR.dom.document, definition: StringDictionary[Any]) = this()
  }
  object panel {
    
    @JSGlobal("CKEDITOR.ui.panel.block")
    @js.native
    open class block ()
      extends StObject
         with typings.ckeditor4.CKEDITOR.ui.panel.block {
      
      /* CompleteClass */
      override def getItems(): nodeList = js.native
      
      /* CompleteClass */
      override def markItem(index: Double): Unit = js.native
    }
    
    @JSGlobal("CKEDITOR.ui.panel.handler")
    @js.native
    val handler: typings.ckeditor4.CKEDITOR.ui.handlerDefinition[typings.ckeditor4.CKEDITOR.ui.panel] = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.panelButton")
  @js.native
  open class panelButton ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.button {
    
    /* CompleteClass */
    override def getState(): Double = js.native
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor4.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def setState(state: Double): Unit = js.native
    
    /* CompleteClass */
    override def toFeature(editor: typings.ckeditor4.CKEDITOR.editor): feature = js.native
  }
  
  @JSGlobal("CKEDITOR.ui.richCombo")
  @js.native
  open class richCombo ()
    extends StObject
       with typings.ckeditor4.CKEDITOR.ui.richCombo {
    
    /* CompleteClass */
    override def render(editor: typings.ckeditor4.CKEDITOR.editor, output: js.Array[String]): Unit = js.native
  }
  object richCombo {
    
    /* static member */
    @JSGlobal("CKEDITOR.ui.richCombo.handler")
    @js.native
    val handler: typings.ckeditor4.CKEDITOR.ui.handlerDefinition[typings.ckeditor4.CKEDITOR.ui.richCombo] = js.native
  }
}
