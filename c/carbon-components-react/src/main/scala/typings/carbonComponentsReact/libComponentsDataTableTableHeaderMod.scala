package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotheaderDoticonDotdescription
import typings.carbonComponentsReact.libComponentsDataTableStateSortingMod.DataTableSortState
import typings.carbonComponentsReact.libComponentsDataTableStateSortingMod.DataTableSortStates
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.reactStrings.center
import typings.react.reactStrings.char
import typings.react.reactStrings.justify
import typings.react.reactStrings.left
import typings.react.reactStrings.right
import typings.std.HTMLElement
import typings.std.HTMLTableHeaderCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDataTableTableHeaderMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DataTable/TableHeader", JSImport.Default)
  @js.native
  val default: TableHeaderFC = js.native
  
  @js.native
  trait TableHeaderFC
    extends StObject
       with ForwardRefExoticComponent[ForwardRefProps[HTMLTableHeaderCellElement, TableHeaderProps]] {
    
    val translationKeys: js.Array[TableHeaderTranslationKey] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.react.mod.DOMAttributes because Already inherited
  - typings.react.mod.AriaAttributes because Already inherited
  - typings.react.mod.HTMLAttributes because Already inherited
  - typings.react.mod.ThHTMLAttributes because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoCorrect, autoSave, children, className, color, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, nonce, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onResize, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, translate, typeof, unselectable, vocab. Inlined rowSpan, scope, colSpan, abbr, align, headers */ trait TableHeaderProps
    extends StObject
       with ButtonHTMLAttributes[HTMLElement]
       with InternationalProps[TableHeaderTranslationKey, TableHeaderTranslationArgs] {
    
    var abbr: js.UndefOr[String] = js.undefined
    
    var align: js.UndefOr[left | center | right | justify | char] = js.undefined
    
    var colSpan: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[String] = js.undefined
    
    var isSortHeader: js.UndefOr[Boolean] = js.undefined
    
    var isSortable: js.UndefOr[Boolean] = js.undefined
    
    var rowSpan: js.UndefOr[Double] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var sortDirection: js.UndefOr[DataTableSortState] = js.undefined
  }
  object TableHeaderProps {
    
    inline def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
    
    extension [Self <: TableHeaderProps](x: Self) {
      
      inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      inline def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIsSortHeader(value: Boolean): Self = StObject.set(x, "isSortHeader", value.asInstanceOf[js.Any])
      
      inline def setIsSortHeaderUndefined: Self = StObject.set(x, "isSortHeader", js.undefined)
      
      inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      inline def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setSortDirection(value: DataTableSortState): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    }
  }
  
  trait TableHeaderTranslationArgs extends StObject {
    
    var header: ReactNode
    
    var isSortHeader: js.UndefOr[Boolean] = js.undefined
    
    var sortDirection: js.UndefOr[DataTableSortState] = js.undefined
    
    var sortStates: DataTableSortStates
  }
  object TableHeaderTranslationArgs {
    
    inline def apply(sortStates: DataTableSortStates): TableHeaderTranslationArgs = {
      val __obj = js.Dynamic.literal(sortStates = sortStates.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableHeaderTranslationArgs]
    }
    
    extension [Self <: TableHeaderTranslationArgs](x: Self) {
      
      inline def setHeader(value: ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIsSortHeader(value: Boolean): Self = StObject.set(x, "isSortHeader", value.asInstanceOf[js.Any])
      
      inline def setIsSortHeaderUndefined: Self = StObject.set(x, "isSortHeader", js.undefined)
      
      inline def setSortDirection(value: DataTableSortState): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
      
      inline def setSortStates(value: DataTableSortStates): Self = StObject.set(x, "sortStates", value.asInstanceOf[js.Any])
    }
  }
  
  type TableHeaderTranslationKey = carbonDottableDotheaderDoticonDotdescription
  
  type _To = TableHeaderFC
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDataTableTableHeaderMod.foo` */
  override def _to: TableHeaderFC = default
}
