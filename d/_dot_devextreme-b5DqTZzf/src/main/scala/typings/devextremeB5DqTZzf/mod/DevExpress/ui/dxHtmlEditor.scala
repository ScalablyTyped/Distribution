package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.`code-block`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.align
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.background
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.blockquote
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bold
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.color
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.font
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.header
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.indent
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.italic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.link
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.list
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.script
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.size
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.strike
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.underline
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.ChangedOptionInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.InitializedEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.events.NativeEventInfo
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.Editor.ValueChangedInfo
import typings.std.ClipboardEvent
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditor
  extends StObject
     with Editor[dxHtmlEditorOptions] {
  
  /**
    * Removes focus from the content field of the editor.
    */
  def blur(): Unit = js.native
  
  /**
    * Clears the history of changes.
    */
  def clearHistory(): Unit = js.native
  
  /**
    * Deletes content from the given range.
    */
  def delete(index: Double, length: Double): Unit = js.native
  
  def format(
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block`,
    formatValue: Any
  ): Unit = js.native
  /**
    * Applies a format to the selected content. Cannot be used with embedded formats.
    */
  def format(formatName: String, formatValue: Any): Unit = js.native
  
  def formatLine(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block`,
    formatValue: Any
  ): Unit = js.native
  /**
    * Applies a single block format to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies several block formats to all lines in the given range.
    */
  def formatLine(index: Double, length: Double, formats: Any): Unit = js.native
  
  def formatText(
    index: Double,
    length: Double,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block`,
    formatValue: Any
  ): Unit = js.native
  /**
    * Applies a single text format to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Applies several text formats to all characters in the given range.
    */
  def formatText(index: Double, length: Double, formats: Any): Unit = js.native
  
  /**
    * Gets a format, module, or Parchment.
    */
  def get(componentPath: String): Any = js.native
  
  /**
    * Retrieves the pixel position and size of a selection at a specified location.
    */
  def getBounds(index: Double, length: Double): Any = js.native
  
  /**
    * Retrieves formatting of the text within the current selection range.
    */
  def getFormat(): Any = js.native
  /**
    * Gets formats applied to the content in the specified range.
    */
  def getFormat(index: Double, length: Double): Any = js.native
  
  /**
    * Gets the entire content&apos;s length.
    */
  def getLength(): Double = js.native
  
  /**
    * Gets the instance of a module.
    */
  def getModule(moduleName: String): Any = js.native
  
  /**
    * Gets the DevExtreme Quill&apos;s instance.
    */
  def getQuillInstance(): Any = js.native
  
  /**
    * Gets the selected content&apos;s position and length.
    */
  def getSelection(): Any = js.native
  def getSelection(focus: Boolean): Any = js.native
  
  /**
    * Retrieves text content from the HtmlEditor.
    */
  def getText(index: Double, length: Double): String = js.native
  
  /**
    * Inserts an embedded content at the specified position.
    */
  def insertEmbed(index: Double, `type`: String, config: Any): Unit = js.native
  
  def insertText(
    index: Double,
    text: String,
    formatName: background | bold | color | font | italic | link | size | strike | script | underline | blockquote | header | indent | list | align | `code-block`,
    formatValue: Any
  ): Unit = js.native
  /**
    * Inserts text into the HtmlEditor.
    */
  def insertText(index: Double, text: String, formatName: String, formatValue: Any): Unit = js.native
  /**
    * Inserts formatted text at the specified position. Used with all formats except embedded.
    */
  def insertText(index: Double, text: String, formats: Any): Unit = js.native
  
  /**
    * Reapplies the most recent undone change. Repeated calls reapply preceding undone changes.
    */
  def redo(): Unit = js.native
  
  /**
    * Registers custom formats and modules.
    */
  def register(modules: Any): Unit = js.native
  
  /**
    * Removes all formatting and embedded content from the specified range.
    */
  def removeFormat(index: Double, length: Double): Unit = js.native
  
  /**
    * Selects and highlights content in the specified range.
    */
  def setSelection(index: Double, length: Double): Unit = js.native
  
  /**
    * Reverses the most recent change. Repeated calls reverse preceding changes.
    */
  def undo(): Unit = js.native
}
object dxHtmlEditor {
  
  type ContentReadyEvent = EventInfo[dxHtmlEditor]
  
  type ContextMenuItem = dxHtmlEditorTableContextMenuItem
  
  type DisposingEvent = EventInfo[dxHtmlEditor]
  
  type FocusInEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  type FocusOutEvent = NativeEventInfo[dxHtmlEditor, FocusEvent]
  
  type InitializedEvent = InitializedEventInfo[dxHtmlEditor]
  
  trait MentionTemplateData extends StObject {
    
    val id: js.UndefOr[String | Double] = js.undefined
    
    val marker: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object MentionTemplateData {
    
    inline def apply(marker: String): MentionTemplateData = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionTemplateData]
    }
    
    extension [Self <: MentionTemplateData](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait OptionChangedEvent
    extends StObject
       with EventInfo[dxHtmlEditor]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement], fullName: String, name: String): OptionChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent]
    }
  }
  
  type Properties = dxHtmlEditorOptions
  
  type ToolbarItem = dxHtmlEditorToolbarItem
  
  trait ValueChangedEvent
    extends StObject
       with NativeEventInfo[dxHtmlEditor, KeyboardEvent | ClipboardEvent | Event]
       with ValueChangedInfo
  object ValueChangedEvent {
    
    inline def apply(component: dxHtmlEditor, element: DxElement_[HTMLElement]): ValueChangedEvent = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueChangedEvent]
    }
  }
}
