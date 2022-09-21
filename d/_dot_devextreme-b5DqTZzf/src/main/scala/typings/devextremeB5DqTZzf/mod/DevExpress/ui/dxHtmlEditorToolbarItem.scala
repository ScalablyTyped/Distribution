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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxHtmlEditorToolbarItem
  extends StObject
     with dxToolbarItem {
  
  /**
    * Specifies values for a format with multiple choices. Should be used with the name.
    */
  var acceptedValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  /**
    * Specifies the predefined item that this object customizes or a format with multiple choices.
    * @deprecated Use name instead.
    */
  var formatName: js.UndefOr[
    background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties | String
  ] = js.undefined
  
  /**
    * Specifies values for a format with multiple choices.
    * @deprecated Use acceptedValues instead.
    */
  var formatValues: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  /**
    * Specifies the predefined item that this object customizes or a format with multiple choices.
    */
  var name: js.UndefOr[
    background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties | String
  ] = js.undefined
}
object dxHtmlEditorToolbarItem {
  
  inline def apply(): dxHtmlEditorToolbarItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorToolbarItem]
  }
  
  extension [Self <: dxHtmlEditorToolbarItem](x: Self) {
    
    inline def setAcceptedValues(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "acceptedValues", value.asInstanceOf[js.Any])
    
    inline def setAcceptedValuesUndefined: Self = StObject.set(x, "acceptedValues", js.undefined)
    
    inline def setAcceptedValuesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "acceptedValues", js.Array(value*))
    
    inline def setFormatName(
      value: background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties | String
    ): Self = StObject.set(x, "formatName", value.asInstanceOf[js.Any])
    
    inline def setFormatNameUndefined: Self = StObject.set(x, "formatName", js.undefined)
    
    inline def setFormatValues(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "formatValues", value.asInstanceOf[js.Any])
    
    inline def setFormatValuesUndefined: Self = StObject.set(x, "formatValues", js.undefined)
    
    inline def setFormatValuesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "formatValues", js.Array(value*))
    
    inline def setName(
      value: background | bold | color | font | italic | link | image | size | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear | insertTable | insertHeaderRow | insertRowAbove | insertRowBelow | insertColumnLeft | insertColumnRight | deleteColumn | deleteRow | deleteTable | cellProperties | tableProperties | String
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
