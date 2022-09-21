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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorTableContextMenu extends StObject {
  
  /**
    * Specifies whether to enable the table context menu.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures context menu items.
    */
  var items: js.UndefOr[
    js.Array[
      ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
    ]
  ] = js.undefined
}
object dxHtmlEditorTableContextMenu {
  
  inline def apply(): dxHtmlEditorTableContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorTableContextMenu]
  }
  
  extension [Self <: dxHtmlEditorTableContextMenu](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setItems(
      value: js.Array[
          ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(
      value: (ContextMenuItem | background | bold | color | font | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable)*
    ): Self = StObject.set(x, "items", js.Array(value*))
  }
}
