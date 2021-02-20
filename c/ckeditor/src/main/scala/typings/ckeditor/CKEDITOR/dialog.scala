package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.dialog.definition.content
import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.plugins.widget
import typings.ckeditor.CKEDITOR.ui.dialog.button
import typings.ckeditor.CKEDITOR.ui.dialog.uiElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dialog extends StObject {
  
  def addFocusable(element: element): Unit = js.native
  def addFocusable(element: element, index: Double): Unit = js.native
  
  def addPage(contents: StringDictionary[js.Any]): Unit = js.native
  
  def click(id: String): js.Any = js.native
  
  def commitContent(): Unit = js.native
  
  def disableButton(id: String): Unit = js.native
  
  def enableButton(id: String): Unit = js.native
  
  def foreach(fn: js.Function0[Unit]): dialog = js.native
  
  def getButton(id: String): button = js.native
  
  def getContentElement(pageId: String, elementId: String): uiElement = js.native
  
  def getElement(): element = js.native
  
  def getName(): String = js.native
  
  def getPageCount(): Double = js.native
  
  def getParentEditor(): editor = js.native
  
  def getPosition(): StringDictionary[js.Any] = js.native
  
  def getSelectedElement(): element = js.native
  
  def getSize(): StringDictionary[js.Any] = js.native
  
  def getValueOf(pageId: String, elementId: String): js.Any = js.native
  
  def hide(): Unit = js.native
  
  def hidePage(id: String): Unit = js.native
  
  def layout(): Unit = js.native
  
  def move(x: Double, y: Double, save: Boolean): Unit = js.native
  
  def reset(): dialog = js.native
  
  def resize(width: Double, height: Double): Unit = js.native
  
  def selectPage(id: String): Unit = js.native
  
  def setState(state: Double): Unit = js.native
  
  def setValueOf(pageId: String, elementId: String, value: js.Any): Unit = js.native
  
  def setupContent(): Unit = js.native
  
  def show(): Unit = js.native
  
  def showPage(id: String): Unit = js.native
  
  val state: Double = js.native
  
  def updateStyle(): Unit = js.native
}
object dialog {
  
  @js.native
  trait IDialogDefinition extends StObject {
    
    var buttons: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.dialog.definition.button]] = js.native
    
    var contents: js.UndefOr[js.Array[content]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var minHeight: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.native
    
    var resizable: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object IDialogDefinition {
    
    @scala.inline
    def apply(): IDialogDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogDefinition]
    }
    
    @scala.inline
    implicit class IDialogDefinitionMutableBuilder[Self <: IDialogDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[typings.ckeditor.CKEDITOR.dialog.definition.button]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: typings.ckeditor.CKEDITOR.dialog.definition.button*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setContents(value: js.Array[content]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setContentsVarargs(value: content*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setResizable(value: Double): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  object definition {
    
    @js.native
    trait button
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var disabled: js.UndefOr[Boolean] = js.native
    }
    object button {
      
      @scala.inline
      def apply(): typings.ckeditor.CKEDITOR.dialog.definition.button = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.ckeditor.CKEDITOR.dialog.definition.button]
      }
      
      @scala.inline
      implicit class buttonMutableBuilder[Self <: typings.ckeditor.CKEDITOR.dialog.definition.button] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      }
    }
    
    @js.native
    trait checkbox
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var default: js.UndefOr[String] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object checkbox {
      
      @scala.inline
      def apply(): checkbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[checkbox]
      }
      
      @scala.inline
      implicit class checkboxMutableBuilder[Self <: checkbox] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    @js.native
    trait content extends StObject {
      
      var accessKey: js.UndefOr[String] = js.native
      
      var elements: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.dialog.definition.uiElement]] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object content {
      
      @scala.inline
      def apply(): content = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[content]
      }
      
      @scala.inline
      implicit class contentMutableBuilder[Self <: content] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
        
        @scala.inline
        def setElements(value: js.Array[typings.ckeditor.CKEDITOR.dialog.definition.uiElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
        
        @scala.inline
        def setElementsVarargs(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait file extends labeledElement {
      
      var action: js.UndefOr[String] = js.native
      
      var size: js.UndefOr[String] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object file {
      
      @scala.inline
      def apply(): file = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[file]
      }
      
      @scala.inline
      implicit class fileMutableBuilder[Self <: file] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
        
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
    
    @js.native
    trait fileButton
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var filebrowser: js.UndefOr[String] = js.native
      
      var `for`: js.UndefOr[String] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object fileButton {
      
      @scala.inline
      def apply(): fileButton = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[fileButton]
      }
      
      @scala.inline
      implicit class fileButtonMutableBuilder[Self <: fileButton] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilebrowser(value: String): Self = StObject.set(x, "filebrowser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilebrowserUndefined: Self = StObject.set(x, "filebrowser", js.undefined)
        
        @scala.inline
        def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForUndefined: Self = StObject.set(x, "for", js.undefined)
        
        @scala.inline
        def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    @js.native
    trait hbox
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var children: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]] = js.native
      
      var height: js.UndefOr[Double] = js.native
      
      var padding: js.UndefOr[Double] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
      
      var widths: js.UndefOr[js.Array[Double]] = js.native
    }
    object hbox {
      
      @scala.inline
      def apply(): hbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[hbox]
      }
      
      @scala.inline
      implicit class hboxMutableBuilder[Self <: hbox] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setChildrenVarargs(value: typings.ckeditor.CKEDITOR.ui.dialog.uiElement*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        @scala.inline
        def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
        
        @scala.inline
        def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        
        @scala.inline
        def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value :_*))
      }
    }
    
    @js.native
    trait html
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var html: js.UndefOr[String] = js.native
    }
    object html {
      
      @scala.inline
      def apply(): html = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[html]
      }
      
      @scala.inline
      implicit class htmlMutableBuilder[Self <: html] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      }
    }
    
    @js.native
    trait labeledElement
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var controlStyle: js.UndefOr[String] = js.native
      
      var inputStyle: js.UndefOr[String] = js.native
      
      var labelLayout: js.UndefOr[String] = js.native
      
      var labelStyle: js.UndefOr[String] = js.native
      
      var widths: js.UndefOr[js.Array[Double]] = js.native
    }
    object labeledElement {
      
      @scala.inline
      def apply(): labeledElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[labeledElement]
      }
      
      @scala.inline
      implicit class labeledElementMutableBuilder[Self <: labeledElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setControlStyle(value: String): Self = StObject.set(x, "controlStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setControlStyleUndefined: Self = StObject.set(x, "controlStyle", js.undefined)
        
        @scala.inline
        def setInputStyle(value: String): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
        
        @scala.inline
        def setLabelLayout(value: String): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelLayoutUndefined: Self = StObject.set(x, "labelLayout", js.undefined)
        
        @scala.inline
        def setLabelStyle(value: String): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
        
        @scala.inline
        def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
        
        @scala.inline
        def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value :_*))
      }
    }
    
    @js.native
    trait radio extends labeledElement {
      
      var default: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object radio {
      
      @scala.inline
      def apply(): radio = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[radio]
      }
      
      @scala.inline
      implicit class radioMutableBuilder[Self <: radio] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setValidate(value: () => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
        
        @scala.inline
        def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      }
    }
    
    @js.native
    trait select extends labeledElement {
      
      var default: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
      
      var multiple: js.UndefOr[Boolean] = js.native
      
      var size: js.UndefOr[Double] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object select {
      
      @scala.inline
      def apply(): select = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[select]
      }
      
      @scala.inline
      implicit class selectMutableBuilder[Self <: select] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[js.Array[String] | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "items", js.Array(value :_*))
        
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
    
    @js.native
    trait textInput extends labeledElement {
      
      var default: js.UndefOr[String] = js.native
      
      var bidi: js.UndefOr[Boolean] = js.native
      
      var maxLength: js.UndefOr[Double] = js.native
      
      var size: js.UndefOr[Double] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object textInput {
      
      @scala.inline
      def apply(): textInput = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[textInput]
      }
      
      @scala.inline
      implicit class textInputMutableBuilder[Self <: textInput] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBidi(value: Boolean): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBidiUndefined: Self = StObject.set(x, "bidi", js.undefined)
        
        @scala.inline
        def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        @scala.inline
        def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
        
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
    
    @js.native
    trait textarea extends labeledElement {
      
      var default: js.UndefOr[String] = js.native
      
      var bidi: js.UndefOr[Boolean] = js.native
      
      var cols: js.UndefOr[Double] = js.native
      
      var rows: js.UndefOr[Double] = js.native
      
      var validate: js.UndefOr[js.Function0[Boolean]] = js.native
    }
    object textarea {
      
      @scala.inline
      def apply(): textarea = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[textarea]
      }
      
      @scala.inline
      implicit class textareaMutableBuilder[Self <: textarea] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBidi(value: Boolean): Self = StObject.set(x, "bidi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBidiUndefined: Self = StObject.set(x, "bidi", js.undefined)
        
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
    
    @js.native
    trait uiElement extends StObject {
      
      var align: js.UndefOr[String] = js.native
      
      var className: js.UndefOr[String] = js.native
      
      var commit: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var onHide: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
      
      var onLoad: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
      
      var onShow: js.UndefOr[js.Function1[/* elem */ this.type, Unit]] = js.native
      
      var requiredContent: js.UndefOr[String | StringDictionary[js.Any] | style] = js.native
      
      var setup: js.UndefOr[js.Function1[/* widget */ widget, Unit]] = js.native
      
      var style: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object uiElement {
      
      @scala.inline
      def apply(): typings.ckeditor.CKEDITOR.dialog.definition.uiElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.ckeditor.CKEDITOR.dialog.definition.uiElement]
      }
      
      @scala.inline
      implicit class uiElementMutableBuilder[Self <: typings.ckeditor.CKEDITOR.dialog.definition.uiElement] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setCommit(value: /* widget */ widget => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setOnHide(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
        
        @scala.inline
        def setOnLoad(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
        
        @scala.inline
        def setOnShow(value: typings.ckeditor.CKEDITOR.dialog.definition.uiElement => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
        
        @scala.inline
        def setRequiredContent(value: String | StringDictionary[js.Any] | style): Self = StObject.set(x, "requiredContent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequiredContentUndefined: Self = StObject.set(x, "requiredContent", js.undefined)
        
        @scala.inline
        def setSetup(value: /* widget */ widget => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
        
        @scala.inline
        def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait vbox
      extends typings.ckeditor.CKEDITOR.dialog.definition.uiElement {
      
      var children: js.UndefOr[js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]] = js.native
      
      var expand: js.UndefOr[Boolean] = js.native
      
      var heights: js.UndefOr[js.Array[Double]] = js.native
      
      var padding: js.UndefOr[Double] = js.native
      
      var styles: js.UndefOr[String] = js.native
      
      var width: js.UndefOr[js.Array[Double]] = js.native
    }
    object vbox {
      
      @scala.inline
      def apply(): vbox = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[vbox]
      }
      
      @scala.inline
      implicit class vboxMutableBuilder[Self <: vbox] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[typings.ckeditor.CKEDITOR.ui.dialog.uiElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setChildrenVarargs(value: typings.ckeditor.CKEDITOR.ui.dialog.uiElement*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
        
        @scala.inline
        def setHeights(value: js.Array[Double]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
        
        @scala.inline
        def setHeightsVarargs(value: Double*): Self = StObject.set(x, "heights", js.Array(value :_*))
        
        @scala.inline
        def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
        
        @scala.inline
        def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
        
        @scala.inline
        def setWidth(value: js.Array[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        
        @scala.inline
        def setWidthVarargs(value: Double*): Self = StObject.set(x, "width", js.Array(value :_*))
      }
    }
  }
}
