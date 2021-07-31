package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.carbonDottableDotheaderDoticonDotdescription
import typings.carbonComponentsReact.sortingMod.DataTableSortState
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.InternationalProps
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ForwardRefExoticComponent
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

object tableHeaderMod extends Shortcut {
  
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
  - typings.react.mod.ThHTMLAttributes because var conflicts: about, accessKey, `aria-activedescendant`, `aria-atomic`, `aria-autocomplete`, `aria-busy`, `aria-checked`, `aria-colcount`, `aria-colindex`, `aria-colspan`, `aria-controls`, `aria-current`, `aria-describedby`, `aria-details`, `aria-disabled`, `aria-dropeffect`, `aria-errormessage`, `aria-expanded`, `aria-flowto`, `aria-grabbed`, `aria-haspopup`, `aria-hidden`, `aria-invalid`, `aria-keyshortcuts`, `aria-label`, `aria-labelledby`, `aria-level`, `aria-live`, `aria-modal`, `aria-multiline`, `aria-multiselectable`, `aria-orientation`, `aria-owns`, `aria-placeholder`, `aria-posinset`, `aria-pressed`, `aria-readonly`, `aria-relevant`, `aria-required`, `aria-roledescription`, `aria-rowcount`, `aria-rowindex`, `aria-rowspan`, `aria-selected`, `aria-setsize`, `aria-sort`, `aria-valuemax`, `aria-valuemin`, `aria-valuenow`, `aria-valuetext`, autoCapitalize, autoCorrect, autoSave, children, className, color, contentEditable, contextMenu, dangerouslySetInnerHTML, datatype, defaultChecked, defaultValue, dir, draggable, hidden, id, inlist, inputMode, is, itemID, itemProp, itemRef, itemScope, itemType, lang, onAbort, onAnimationEnd, onAnimationIteration, onAnimationStart, onAuxClick, onBeforeInput, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onCompositionEnd, onCompositionStart, onCompositionUpdate, onContextMenu, onCopy, onCut, onDoubleClick, onDrag, onDragEnd, onDragEnter, onDragExit, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEncrypted, onEnded, onError, onFocus, onInput, onInvalid, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPaste, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onReset, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onTouchCancel, onTouchEnd, onTouchMove, onTouchStart, onTransitionEnd, onVolumeChange, onWaiting, onWheel, placeholder, prefix, property, radioGroup, resource, results, role, security, slot, spellCheck, style, suppressContentEditableWarning, suppressHydrationWarning, tabIndex, title, translate, typeof, unselectable, vocab. Inlined rowSpan, scope, colSpan, abbr, align, headers */ trait TableHeaderProps
    extends StObject
       with ButtonHTMLAttributes[HTMLElement]
       with InternationalProps[TableHeaderTranslationKey] {
    
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
    
    @scala.inline
    def apply(): TableHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableHeaderProps]
    }
    
    @scala.inline
    implicit class TableHeaderPropsMutableBuilder[Self <: TableHeaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
      
      @scala.inline
      def setAlign(value: left | center | right | justify | char): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIsSortHeader(value: Boolean): Self = StObject.set(x, "isSortHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSortHeaderUndefined: Self = StObject.set(x, "isSortHeader", js.undefined)
      
      @scala.inline
      def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSortDirection(value: DataTableSortState): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    }
  }
  
  type TableHeaderTranslationKey = carbonDottableDotheaderDoticonDotdescription
  
  type _To = TableHeaderFC
  
  /* This means you don't have to write `default`, but can instead just say `tableHeaderMod.foo` */
  override def _to: TableHeaderFC = default
}
