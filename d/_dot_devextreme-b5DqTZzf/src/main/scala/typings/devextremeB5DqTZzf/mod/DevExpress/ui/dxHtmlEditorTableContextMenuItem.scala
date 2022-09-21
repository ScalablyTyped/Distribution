package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignCenter
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignJustify
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignLeft
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.alignRight
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.background
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.blockquote
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bold
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bulletList
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
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertRowAbove
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertRowBelow
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.insertTable
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.italic
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.link
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.orderedList
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.redo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.separator
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.strike
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.subscript
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.superscript
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.underline
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.undo
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.variable
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxHtmlEditor.ContextMenuItem
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxMenu.MenuBasePlainItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorTableContextMenuItem
  extends StObject
     with MenuBasePlainItem {
  
  /**
    * Configures nested context menu items.
    */
  var items: js.UndefOr[
    js.Array[
      ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
    ]
  ] = js.undefined
  
  /**
    * A name used to identify the context menu item.
    */
  var name: js.UndefOr[
    background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
  ] = js.undefined
}
object dxHtmlEditorTableContextMenuItem {
  
  inline def apply(): dxHtmlEditorTableContextMenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorTableContextMenuItem]
  }
  
  extension [Self <: dxHtmlEditorTableContextMenuItem](x: Self) {
    
    inline def setItems(
      value: js.Array[
          ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable)*
    ): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(
      value: background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
