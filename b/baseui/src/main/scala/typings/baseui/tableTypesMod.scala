package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTypesMod {
  
  trait FilterOverrides extends StObject {
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var Footer: js.UndefOr[Override[Any]] = js.undefined
    
    var Heading: js.UndefOr[Override[Any]] = js.undefined
    
    var MenuButton: js.UndefOr[Override[Any]] = js.undefined
  }
  object FilterOverrides {
    
    inline def apply(): FilterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterOverrides] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setFooter(value: Override[Any]): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
      
      inline def setHeading(value: Override[Any]): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "Heading", js.undefined)
      
      inline def setMenuButton(value: Override[Any]): Self = StObject.set(x, "MenuButton", value.asInstanceOf[js.Any])
      
      inline def setMenuButtonUndefined: Self = StObject.set(x, "MenuButton", js.undefined)
    }
  }
  
  trait FilterProps extends StObject {
    
    /** Displays the filter icon in an active state. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** Arbitrary content to display in the filter popover. You will likely want to add checkboxes
      * or similar inputs to control filtering.
      */
    var children: ReactNode
    
    /** Disables the icon click action. Filter menu does not open when clicked. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Adds a button to close the filter menu. */
    var hasCloseButton: js.UndefOr[Boolean] = js.undefined
    
    /** Callback for when the filter closes. */
    var onClose: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** Callback for when the filter opens. */
    var onOpen: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** Callback for when the 'reset' button is clicked. */
    var onReset: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** Callback for when the 'select all' button is clicked. */
    var onSelectAll: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var overrides: js.UndefOr[FilterOverrides] = js.undefined
    
    /** Determines whether focus is returned to Filter menu button. */
    var returnFocus: js.UndefOr[Boolean] = js.undefined
  }
  object FilterProps {
    
    inline def apply(): FilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHasCloseButton(value: Boolean): Self = StObject.set(x, "hasCloseButton", value.asInstanceOf[js.Any])
      
      inline def setHasCloseButtonUndefined: Self = StObject.set(x, "hasCloseButton", js.undefined)
      
      inline def setOnClose(value: () => Any): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => Any): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setOnReset(value: () => Any): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSelectAll(value: () => Any): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction0(value))
      
      inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      inline def setOverrides(value: FilterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setReturnFocus(value: Boolean): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
    }
  }
  
  trait HeadCellOverrides extends StObject {
    
    var HeadCell: js.UndefOr[Override[Any]] = js.undefined
    
    var SortableLabel: js.UndefOr[Override[Any]] = js.undefined
  }
  object HeadCellOverrides {
    
    inline def apply(): HeadCellOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadCellOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadCellOverrides] (val x: Self) extends AnyVal {
      
      inline def setHeadCell(value: Override[Any]): Self = StObject.set(x, "HeadCell", value.asInstanceOf[js.Any])
      
      inline def setHeadCellUndefined: Self = StObject.set(x, "HeadCell", js.undefined)
      
      inline def setSortableLabel(value: Override[Any]): Self = StObject.set(x, "SortableLabel", value.asInstanceOf[js.Any])
      
      inline def setSortableLabelUndefined: Self = StObject.set(x, "SortableLabel", js.undefined)
    }
  }
  
  trait HeadCellProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    /** Aria label applied to the sort button. */
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    /** Additional content to fill head cell. Most likely used for a filter button. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Visually indicates sort direction. Displays a chevron next to column title. */
    var direction: SortDirection
    
    /** Disabled click-to-sort. Renders column title in muted color. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** FillClickTarget enable click to sort on whitespace in a header cell. */
    var fillClickTarget: js.UndefOr[Boolean] = js.undefined
    
    /** Callback for when column title is clicked to trigger sort. */
    var onSort: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var overrides: js.UndefOr[HeadCellOverrides] = js.undefined
    
    /** Column title. */
    var title: ReactNode
  }
  object HeadCellProps {
    
    inline def apply(): HeadCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeadCellProps] (val x: Self) extends AnyVal {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: SortDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFillClickTarget(value: Boolean): Self = StObject.set(x, "fillClickTarget", value.asInstanceOf[js.Any])
      
      inline def setFillClickTargetUndefined: Self = StObject.set(x, "fillClickTarget", js.undefined)
      
      inline def setOnSort(value: () => Any): Self = StObject.set(x, "onSort", js.Any.fromFunction0(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOverrides(value: HeadCellOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.ASC
    - typings.baseui.baseuiStrings.DESC
    - scala.Unit
    - scala.Null
  */
  type SortDirection = js.UndefOr[_SortDirection | Null]
  
  trait TableProps extends StObject {
    
    /** Table columns. Data passed to each header cell. */
    var columns: js.Array[String | ReactNode]
    
    /** Table rows. Data passed to each row and cell */
    var data: js.Array[js.Array[ReactNode]]
    
    /** Table width fills this provided value. */
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    /** Renders the table in a loading state. Not implemented, yet. */
    var isLoading: js.UndefOr[Boolean] = js.undefined
  }
  object TableProps {
    
    inline def apply(columns: js.Array[String | ReactNode], data: js.Array[js.Array[ReactNode]]): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[String | ReactNode]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (String | ReactNode)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[js.Array[ReactNode]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[ReactNode]*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    }
  }
  
  trait _SortDirection extends StObject
}
