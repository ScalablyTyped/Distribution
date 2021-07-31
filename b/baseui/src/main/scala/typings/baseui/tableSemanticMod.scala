package typings.baseui

import typings.baseui.baseuiStrings.ASC
import typings.baseui.baseuiStrings.DESC
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticMod {
  
  @JSImport("baseui/table-semantic", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortAscIcon")
  @js.native
  val StyledSortAscIcon: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortDescIcon")
  @js.native
  val StyledSortDescIcon: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledSortNoneIcon")
  @js.native
  val StyledSortNoneIcon: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBody")
  @js.native
  val StyledTableBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBodyCell")
  @js.native
  val StyledTableBodyCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableBodyRow")
  @js.native
  val StyledTableBodyRow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableEmptyMessage")
  @js.native
  val StyledTableEmptyMessage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHead")
  @js.native
  val StyledTableHead: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadCell")
  @js.native
  val StyledTableHeadCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadCellSortable")
  @js.native
  val StyledTableHeadCellSortable: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableHeadRow")
  @js.native
  val StyledTableHeadRow: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "StyledTableLoadingMessage")
  @js.native
  val StyledTableLoadingMessage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-semantic", "Table")
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
  
  @JSImport("baseui/table-semantic", "TableBuilder")
  @js.native
  class TableBuilder[RowT] protected ()
    extends Component[TableBuilderProps[RowT], js.Object, js.Any] {
    def this(props: TableBuilderProps[RowT]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableBuilderProps[RowT], context: js.Any) = this()
  }
  
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  class TableBuilderColumn[RowT] protected ()
    extends Component[TableBuilderColumnProps[RowT], js.Object, js.Any] {
    def this(props: TableBuilderColumnProps[RowT]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TableBuilderColumnProps[RowT], context: js.Any) = this()
  }
  
  trait BuilderOverrides
    extends StObject
       with TableOverrides {
    
    var SortAscIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var SortDescIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var SortNoneIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHeadCellSortable: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object BuilderOverrides {
    
    @scala.inline
    def apply(): BuilderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOverrides]
    }
    
    @scala.inline
    implicit class BuilderOverridesMutableBuilder[Self <: BuilderOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortAscIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortAscIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAscIconUndefined: Self = StObject.set(x, "SortAscIcon", js.undefined)
      
      @scala.inline
      def setSortDescIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortDescIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDescIconUndefined: Self = StObject.set(x, "SortDescIcon", js.undefined)
      
      @scala.inline
      def setSortNoneIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortNoneIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortNoneIconUndefined: Self = StObject.set(x, "SortNoneIcon", js.undefined)
      
      @scala.inline
      def setTableHeadCellSortable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHeadCellSortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadCellSortableUndefined: Self = StObject.set(x, "TableHeadCellSortable", js.undefined)
    }
  }
  
  trait ColumnOverrides extends StObject {
    
    var SortAscIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var SortDescIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var SortNoneIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableBodyCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHeadCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHeadCellSortable: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object ColumnOverrides {
    
    @scala.inline
    def apply(): ColumnOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnOverrides]
    }
    
    @scala.inline
    implicit class ColumnOverridesMutableBuilder[Self <: ColumnOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSortAscIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortAscIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortAscIconUndefined: Self = StObject.set(x, "SortAscIcon", js.undefined)
      
      @scala.inline
      def setSortDescIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortDescIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDescIconUndefined: Self = StObject.set(x, "SortDescIcon", js.undefined)
      
      @scala.inline
      def setSortNoneIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "SortNoneIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortNoneIconUndefined: Self = StObject.set(x, "SortNoneIcon", js.undefined)
      
      @scala.inline
      def setTableBodyCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableBodyCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyCellUndefined: Self = StObject.set(x, "TableBodyCell", js.undefined)
      
      @scala.inline
      def setTableHeadCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHeadCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadCellSortable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHeadCellSortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadCellSortableUndefined: Self = StObject.set(x, "TableHeadCellSortable", js.undefined)
      
      @scala.inline
      def setTableHeadCellUndefined: Self = StObject.set(x, "TableHeadCell", js.undefined)
    }
  }
  
  @js.native
  trait TableBuilderColumnProps[RowT] extends StObject {
    
    def children(row: RowT): ReactNode = js.native
    def children(row: RowT, rowIndex: Double): ReactNode = js.native
    def children(row: js.Any): ReactNode = js.native
    def children(row: js.Any, rowIndex: Double): ReactNode = js.native
    
    var header: js.UndefOr[ReactNode] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var numeric: js.UndefOr[Boolean] = js.native
    
    var overrides: js.UndefOr[ColumnOverrides] = js.native
    
    var sortable: js.UndefOr[Boolean] = js.native
    
    var tableHeadAriaLabel: js.UndefOr[String] = js.native
  }
  
  trait TableBuilderProps[RowT] extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var data: js.Array[RowT]
    
    var emptyMessage: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingMessage: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var onSort: js.UndefOr[js.Function1[/* columnId */ String, Unit]] = js.undefined
    
    var overrides: js.UndefOr[BuilderOverrides] = js.undefined
    
    var sortColumn: js.UndefOr[String | Null] = js.undefined
    
    var sortOrder: js.UndefOr[ASC | DESC | Null] = js.undefined
  }
  object TableBuilderProps {
    
    @scala.inline
    def apply[RowT](data: js.Array[RowT]): TableBuilderProps[RowT] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBuilderProps[RowT]]
    }
    
    @scala.inline
    implicit class TableBuilderPropsMutableBuilder[Self <: TableBuilderProps[?], RowT] (val x: Self & TableBuilderProps[RowT]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[RowT]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: RowT*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEmptyMessage(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyMessageFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      @scala.inline
      def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingMessageFunction0(value: () => ReactNode): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setOnSort(value: /* columnId */ String => Unit): Self = StObject.set(x, "onSort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSortUndefined: Self = StObject.set(x, "onSort", js.undefined)
      
      @scala.inline
      def setOverrides(value: BuilderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSortColumn(value: String): Self = StObject.set(x, "sortColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortColumnNull: Self = StObject.set(x, "sortColumn", null)
      
      @scala.inline
      def setSortColumnUndefined: Self = StObject.set(x, "sortColumn", js.undefined)
      
      @scala.inline
      def setSortOrder(value: ASC | DESC): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortOrderNull: Self = StObject.set(x, "sortOrder", null)
      
      @scala.inline
      def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    }
  }
  
  trait TableOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Table: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableBody: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableBodyCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableBodyRow: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableEmptyMessage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHead: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHeadCell: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableHeadRow: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TableLoadingMessage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object TableOverrides {
    
    @scala.inline
    def apply(): TableOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOverrides]
    }
    
    @scala.inline
    implicit class TableOverridesMutableBuilder[Self <: TableOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setTable(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableBodyCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyCellUndefined: Self = StObject.set(x, "TableBodyCell", js.undefined)
      
      @scala.inline
      def setTableBodyRow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableBodyRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableBodyRowUndefined: Self = StObject.set(x, "TableBodyRow", js.undefined)
      
      @scala.inline
      def setTableBodyUndefined: Self = StObject.set(x, "TableBody", js.undefined)
      
      @scala.inline
      def setTableEmptyMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableEmptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableEmptyMessageUndefined: Self = StObject.set(x, "TableEmptyMessage", js.undefined)
      
      @scala.inline
      def setTableHead(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadCell(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHeadCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadCellUndefined: Self = StObject.set(x, "TableHeadCell", js.undefined)
      
      @scala.inline
      def setTableHeadRow(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableHeadRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableHeadRowUndefined: Self = StObject.set(x, "TableHeadRow", js.undefined)
      
      @scala.inline
      def setTableHeadUndefined: Self = StObject.set(x, "TableHead", js.undefined)
      
      @scala.inline
      def setTableLoadingMessage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TableLoadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableLoadingMessageUndefined: Self = StObject.set(x, "TableLoadingMessage", js.undefined)
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "Table", js.undefined)
    }
  }
  
  trait TableProps extends StObject {
    
    var columns: js.Array[ReactNode]
    
    var data: js.Array[js.Array[ReactNode]]
    
    var emptyMessage: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var horizontalScrollWidth: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var loadingMessage: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined
    
    var overrides: js.UndefOr[TableOverrides] = js.undefined
  }
  object TableProps {
    
    @scala.inline
    def apply(columns: js.Array[ReactNode], data: js.Array[js.Array[ReactNode]]): TableProps = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[ReactNode]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: ReactNode*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[js.Array[ReactNode]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Array[ReactNode]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setEmptyMessage(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "emptyMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyMessageFunction0(value: () => ReactNode): Self = StObject.set(x, "emptyMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmptyMessageUndefined: Self = StObject.set(x, "emptyMessage", js.undefined)
      
      @scala.inline
      def setHorizontalScrollWidth(value: String): Self = StObject.set(x, "horizontalScrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollWidthUndefined: Self = StObject.set(x, "horizontalScrollWidth", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setLoadingMessage(value: ReactNode | js.Function0[ReactNode]): Self = StObject.set(x, "loadingMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingMessageFunction0(value: () => ReactNode): Self = StObject.set(x, "loadingMessage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadingMessageUndefined: Self = StObject.set(x, "loadingMessage", js.undefined)
      
      @scala.inline
      def setOverrides(value: TableOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
}
