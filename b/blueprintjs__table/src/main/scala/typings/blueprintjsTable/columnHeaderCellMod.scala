package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.blueprintjsTable.anon.IsActive
import typings.blueprintjsTable.anon.ValidationMapIColumnInter
import typings.blueprintjsTable.contextMod.IColumnInteractionBarContextTypes
import typings.blueprintjsTable.headerCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnHeaderCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
  @js.native
  class ColumnHeaderCell protected ()
    extends AbstractPureComponent2[IColumnHeaderCellProps, IColumnHeaderCellState, js.Object] {
    def this(props: IColumnHeaderCellProps) = this()
    def this(props: IColumnHeaderCellProps, context: js.Any) = this()
    
    @JSName("context")
    var context_ColumnHeaderCell: IColumnInteractionBarContextTypes = js.native
    
    var handlePopoverClosing: js.Any = js.native
    
    var handlePopoverOpened: js.Any = js.native
    
    var maybeRenderContent: js.Any = js.native
    
    var maybeRenderDropdownMenu: js.Any = js.native
    
    var renderName: js.Any = js.native
    
    @JSName("state")
    var state_ColumnHeaderCell: IsActive = js.native
  }
  /* static members */
  object ColumnHeaderCell {
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell.contextTypes")
    @js.native
    def contextTypes: ValidationMapIColumnInter = js.native
    @scala.inline
    def contextTypes_=(x: ValidationMapIColumnInter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell.defaultProps")
    @js.native
    def defaultProps: IColumnHeaderCellProps = js.native
    @scala.inline
    def defaultProps_=(x: IColumnHeaderCellProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /**
      * This method determines if a `MouseEvent` was triggered on a target that
      * should be used as the header click/drag target. This enables users of
      * this component to render fully interactive components in their header
      * cells without worry of selection or resize operations from capturing
      * their mouse events.
      */
    @scala.inline
    def isHeaderMouseTarget(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderMouseTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @scala.inline
  def HorizontalCellDivider(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HorizontalCellDivider")().asInstanceOf[Element]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsTable.columnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ trait IColumnHeaderCellProps
    extends StObject
       with IHeaderCellProps {
    
    /**
      * Specifies if the column is reorderable.
      */
    var enableColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies if the full column is part of a selection.
      */
    var isColumnSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The icon name or element for the header's menu button.
      * @default "chevron-down"
      */
    var menuIcon: js.UndefOr[IconName | Element] = js.undefined
    
    /**
      * A callback to override the default name rendering behavior. The default
      * behavior is to simply use the `ColumnHeaderCell`s name prop.
      *
      * This render callback can be used, for example, to provide a
      * `EditableName` component for editing column names.
      *
      * If you define this callback, we recommend you also set
      * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
      *
      * The callback will also receive the column index if an `index` was originally
      * provided via props.
      */
    var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.undefined
  }
  object IColumnHeaderCellProps {
    
    @scala.inline
    def apply(): IColumnHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnHeaderCellProps]
    }
    
    @scala.inline
    implicit class IColumnHeaderCellPropsMutableBuilder[Self <: IColumnHeaderCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableColumnReordering(value: Boolean): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
      
      @scala.inline
      def setIsColumnSelected(value: Boolean): Self = StObject.set(x, "isColumnSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColumnSelectedUndefined: Self = StObject.set(x, "isColumnSelected", js.undefined)
      
      @scala.inline
      def setMenuIcon(value: IconName | Element): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      @scala.inline
      def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
    }
  }
  
  trait IColumnHeaderCellState extends StObject {
    
    var isActive: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnHeaderCellState {
    
    @scala.inline
    def apply(): IColumnHeaderCellState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnHeaderCellState]
    }
    
    @scala.inline
    implicit class IColumnHeaderCellStateMutableBuilder[Self <: IColumnHeaderCellState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
  
  trait IColumnNameProps extends StObject {
    
    /**
      * The name displayed in the header of the column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A callback to override the default name rendering behavior. The default
      * behavior is to simply use the `ColumnHeaderCell`s name prop.
      *
      * This render callback can be used, for example, to provide a
      * `EditableName` component for editing column names.
      *
      * If you define this callback, we recommend you also set
      * `<Table enableColumnInteractionBar={true}>` to avoid issues with menus or selection.
      *
      * The callback will also receive the column index if an `index` was originally
      * provided via props.
      */
    var nameRenderer: js.UndefOr[js.Function2[/* name */ String, /* index */ js.UndefOr[Double], ReactElement]] = js.undefined
  }
  object IColumnNameProps {
    
    @scala.inline
    def apply(): IColumnNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnNameProps]
    }
    
    @scala.inline
    implicit class IColumnNamePropsMutableBuilder[Self <: IColumnNameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
