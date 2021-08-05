package typings.baseui

import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("baseui/table", "Filter")
  @js.native
  val Filter: FC[FilterProps] = js.native
  
  @js.native
  sealed trait SORT_DIRECTION extends StObject
  @JSImport("baseui/table", "SORT_DIRECTION")
  @js.native
  object SORT_DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SORT_DIRECTION & String] = js.native
    
    @js.native
    sealed trait ASC
      extends StObject
         with SORT_DIRECTION
    /* "ASC" */ val ASC: typings.baseui.tableMod.SORT_DIRECTION.ASC & String = js.native
    
    @js.native
    sealed trait DESC
      extends StObject
         with SORT_DIRECTION
    /* "DESC" */ val DESC: typings.baseui.tableMod.SORT_DIRECTION.DESC & String = js.native
  }
  
  @JSImport("baseui/table", "SortableHeadCell")
  @js.native
  val SortableHeadCell: FC[SortableHeadCellProps] = js.native
  
  @JSImport("baseui/table", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterButton")
  @js.native
  val StyledFilterButton: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterContent")
  @js.native
  val StyledFilterContent: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterFooter")
  @js.native
  val StyledFilterFooter: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledFilterHeading")
  @js.native
  val StyledFilterHeading: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledHead")
  @js.native
  val StyledHead: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledRow")
  @js.native
  val StyledRow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledSortableLabel")
  @js.native
  val StyledSortableLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table", "Table")
  @js.native
  class Table protected ()
    extends Component[TableProps, js.Object, js.Any] {
    def this(props: TableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableProps, context: js.Any) = this()
  }
  
  trait FilterOverrides extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Footer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Heading: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var MenuButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object FilterOverrides {
    
    inline def apply(): FilterOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterOverrides]
    }
    
    extension [Self <: FilterOverrides](x: Self) {
      
      inline def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setFooter(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "Footer", js.undefined)
      
      inline def setHeading(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "Heading", js.undefined)
      
      inline def setMenuButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "MenuButton", value.asInstanceOf[js.Any])
      
      inline def setMenuButtonUndefined: Self = StObject.set(x, "MenuButton", js.undefined)
    }
  }
  
  trait FilterProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onReset: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var onSelectAll: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var overrides: js.UndefOr[FilterOverrides] = js.undefined
  }
  object FilterProps {
    
    inline def apply(): FilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterProps]
    }
    
    extension [Self <: FilterProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnReset(value: () => js.Any): Self = StObject.set(x, "onReset", js.Any.fromFunction0(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSelectAll(value: () => js.Any): Self = StObject.set(x, "onSelectAll", js.Any.fromFunction0(value))
      
      inline def setOnSelectAllUndefined: Self = StObject.set(x, "onSelectAll", js.undefined)
      
      inline def setOverrides(value: FilterOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait SortableHeadCellOverrides extends StObject {
    
    var HeadCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var SortableLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object SortableHeadCellOverrides {
    
    inline def apply(): SortableHeadCellOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableHeadCellOverrides]
    }
    
    extension [Self <: SortableHeadCellOverrides](x: Self) {
      
      inline def setHeadCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "HeadCell", value.asInstanceOf[js.Any])
      
      inline def setHeadCellUndefined: Self = StObject.set(x, "HeadCell", js.undefined)
      
      inline def setSortableLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortableLabel", value.asInstanceOf[js.Any])
      
      inline def setSortableLabelUndefined: Self = StObject.set(x, "SortableLabel", js.undefined)
    }
  }
  
  trait SortableHeadCellProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var direction: ASC | DESC | Null
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fillClickTarget: js.UndefOr[Boolean] = js.undefined
    
    var onSort: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var overrides: js.UndefOr[SortableHeadCellOverrides] = js.undefined
    
    var title: String
  }
  object SortableHeadCellProps {
    
    inline def apply(title: String): SortableHeadCellProps = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], direction = null)
      __obj.asInstanceOf[SortableHeadCellProps]
    }
    
    extension [Self <: SortableHeadCellProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: ASC | DESC): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionNull: Self = StObject.set(x, "direction", null)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFillClickTarget(value: Boolean): Self = StObject.set(x, "fillClickTarget", value.asInstanceOf[js.Any])
      
      inline def setFillClickTargetUndefined: Self = StObject.set(x, "fillClickTarget", js.undefined)
      
      inline def setOnSort(value: () => js.Any): Self = StObject.set(x, "onSort", js.Any.fromFunction0(value))
      
      inline def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      inline def setOverrides(value: SortableHeadCellOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableProps extends StObject {
    
    var columns: js.Array[String | ReactNode]
    
    var data: js.Array[js.Array[ReactNode]]
    
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
  }
  object TableProps {
    
    inline def apply(columns: js.Array[String | ReactNode], data: js.Array[js.Array[ReactNode]]): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    extension [Self <: TableProps](x: Self) {
      
      inline def setColumns(value: js.Array[String | ReactNode]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (String | ReactNode)*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      inline def setData(value: js.Array[js.Array[ReactNode]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Array[ReactNode]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    }
  }
}
