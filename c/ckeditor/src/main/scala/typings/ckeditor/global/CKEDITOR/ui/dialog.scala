package typings.ckeditor.global.CKEDITOR.ui

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.ui.dialog.definitions.fieldSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.ui.dialog")
@js.native
object dialog extends js.Object {
  @js.native
  class button protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.button {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.button,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
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
  
  @js.native
  class checkbox protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.checkbox {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.checkbox,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
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
    override def setValue(checked: Boolean, noChangeEvent: Boolean): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
  }
  
  @js.native
  class fieldset protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      childObjList: js.Array[_],
      childHtmlList: js.Array[_],
      htmlList: js.Array[_],
      elementDefinition: fieldSet
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class file protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.file {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.file,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class fileButton protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.button {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.fileButton,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
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
  
  @js.native
  class hbox protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.hbox {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      childObjList: js.Array[_],
      childHtmlList: js.Array[_],
      htmlList: js.Array[_],
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.hbox
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class html protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.html,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class iframeElement ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class labeledElement protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.labeledElement {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.labeledElement,
      htmlList: js.Array[_],
      contentHtml: js.Function0[String]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class radio protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.radio {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.radio,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
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
    override def setValue(value: String, noChangeEvent: Boolean): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def setValue(value: js.Any, noChangeEvent: Boolean): js.UndefOr[typings.ckeditor.CKEDITOR.ui.dialog.uiElement] = js.native
    /* CompleteClass */
    override def setlabel(label: String): typings.ckeditor.CKEDITOR.ui.dialog.labeledElement = js.native
  }
  
  @js.native
  class select protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.select {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.select,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class textInput protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.textInput {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textInput,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
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
  
  @js.native
  class textarea protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.labeledElement {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.textarea,
      htmlList: js.Array[_]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class uiElement protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.uiElement {
    // Not sure that the htmlList array type is right.
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
      htmlList: js.Array[_]
    ) = this()
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
      htmlList: js.Array[_],
      nodeNameArg: js.Function0[String]
    ) = this()
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
      htmlList: js.Array[_],
      nodeNameArg: js.Function0[String],
      stylesArg: js.Function0[StringDictionary[_]]
    ) = this()
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
      htmlList: js.Array[_],
      nodeNameArg: js.Function0[String],
      stylesArg: js.Function0[StringDictionary[_]],
      attributesArg: js.Function0[StringDictionary[_]]
    ) = this()
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.uiElement,
      htmlList: js.Array[_],
      nodeNameArg: js.Function0[String],
      stylesArg: js.Function0[StringDictionary[_]],
      attributesArg: js.Function0[StringDictionary[_]],
      contentsArg: js.Function0[StringDictionary[_] | String]
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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
  
  @js.native
  class vbox protected ()
    extends typings.ckeditor.CKEDITOR.ui.dialog.hbox {
    def this(
      dialog: typings.ckeditor.CKEDITOR.dialog,
      childObjList: js.Array[_],
      childHtmlList: js.Array[_],
      htmlList: js.Array[_],
      elementDefinition: typings.ckeditor.CKEDITOR.ui.dialog.definitions.vbox
    ) = this()
    /* CompleteClass */
    override var eventProcessors: js.Any = js.native
    /* CompleteClass */
    override def accessKeyDown(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def accessKeyUp(dialog: typings.ckeditor.CKEDITOR.dialog, key: String): Unit = js.native
    /* CompleteClass */
    override def disable(): Unit = js.native
    /* CompleteClass */
    override def enable(): Unit = js.native
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

