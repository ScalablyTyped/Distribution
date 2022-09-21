package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignCenter
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignJustify
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignLeft
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignRight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.background
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.blockquote
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bold
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bulletList
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.cellProperties
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.clear
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.codeBlock
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.color
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.decreaseIndent
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteColumn
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteRow
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.deleteTable
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.font
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.header
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.image
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.increaseIndent
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertColumnLeft
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertColumnRight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertHeaderRow
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertRowAbove
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertRowBelow
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertTable
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.italic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.link
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.orderedList
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.redo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.separator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.size
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.strike
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.subscript
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.superscript
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.tableProperties
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.underline
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.undo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.variable
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxHtmlEditor.ToolbarItem
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorToolbar extends StObject {
  
  /**
    * Specifies the container in which to place the toolbar.
    */
  var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Configures toolbar items. These items allow users to format text and execute commands.
    */
  var items: js.UndefOr[
    js.Array[
      ToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties
    ]
  ] = js.undefined
  
  /**
    * Specifies whether or not items are arranged into multiple lines when their combined width exceeds the toolbar width.
    */
  var multiline: js.UndefOr[Boolean] = js.undefined
}
object dxHtmlEditorToolbar {
  
  inline def apply(): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
  
  extension [Self <: dxHtmlEditorToolbar](x: Self) {
    
    inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setItems(
      value: js.Array[
          ToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ToolbarItem | background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties)*
    ): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
    
    inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
  }
}
