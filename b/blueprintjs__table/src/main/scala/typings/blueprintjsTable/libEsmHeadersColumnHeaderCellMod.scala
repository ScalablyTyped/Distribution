package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typings.blueprintjsTable.anon.IsActive
import typings.blueprintjsTable.anon.ValidationMapColumnIntera
import typings.blueprintjsTable.libEsmCommonContextMod.ColumnInteractionBarContextTypes_
import typings.blueprintjsTable.libEsmHeadersHeaderCellMod.IHeaderCellProps
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersColumnHeaderCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
  @js.native
  open class ColumnHeaderCell protected ()
    extends AbstractPureComponent2[IColumnHeaderCellProps, IColumnHeaderCellState, js.Object] {
    def this(props: IColumnHeaderCellProps) = this()
    def this(props: IColumnHeaderCellProps, context: Any) = this()
    
    @JSName("context")
    var context_ColumnHeaderCell: ColumnInteractionBarContextTypes_ = js.native
    
    /* private */ var handlePopoverClosing: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var maybeRenderContent: Any = js.native
    
    /* private */ var maybeRenderDropdownMenu: Any = js.native
    
    /* private */ var renderName: Any = js.native
    
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
    def contextTypes: ValidationMapColumnIntera = js.native
    inline def contextTypes_=(x: ValidationMapColumnIntera): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell.defaultProps")
    @js.native
    def defaultProps: IColumnHeaderCellProps = js.native
    inline def defaultProps_=(x: IColumnHeaderCellProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /**
      * This method determines if a `MouseEvent` was triggered on a target that
      * should be used as the header click/drag target. This enables users of
      * this component to render fully interactive components in their header
      * cells without worry of selection or resize operations from capturing
      * their mouse events.
      */
    inline def isHeaderMouseTarget(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderMouseTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  inline def HorizontalCellDivider(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HorizontalCellDivider")().asInstanceOf[Element]
  
  type ColumnHeaderCellProps = IColumnHeaderCellProps
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.blueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnNameProps because var conflicts: name. Inlined nameRenderer */ trait IColumnHeaderCellProps
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
      *
      * @default "chevron-down"
      */
    var menuIcon: js.UndefOr[BlueprintIcons16Id | Element] = js.undefined
    
    /**
      * A callback to override the default name rendering behavior. The default
      * behavior is to simply use the `ColumnHeaderCell2`s name prop.
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
    
    inline def apply(): IColumnHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnHeaderCellProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColumnHeaderCellProps] (val x: Self) extends AnyVal {
      
      inline def setEnableColumnReordering(value: Boolean): Self = StObject.set(x, "enableColumnReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableColumnReorderingUndefined: Self = StObject.set(x, "enableColumnReordering", js.undefined)
      
      inline def setIsColumnSelected(value: Boolean): Self = StObject.set(x, "isColumnSelected", value.asInstanceOf[js.Any])
      
      inline def setIsColumnSelectedUndefined: Self = StObject.set(x, "isColumnSelected", js.undefined)
      
      inline def setMenuIcon(value: BlueprintIcons16Id | Element): Self = StObject.set(x, "menuIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuIconUndefined: Self = StObject.set(x, "menuIcon", js.undefined)
      
      inline def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      inline def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
    }
  }
  
  trait IColumnHeaderCellState extends StObject {
    
    var isActive: js.UndefOr[Boolean] = js.undefined
  }
  object IColumnHeaderCellState {
    
    inline def apply(): IColumnHeaderCellState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnHeaderCellState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColumnHeaderCellState] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    }
  }
  
  trait IColumnNameProps extends StObject {
    
    /**
      * The name displayed in the header of the column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A callback to override the default name rendering behavior. The default
      * behavior is to simply use the `ColumnHeaderCell2`s name prop.
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
    
    inline def apply(): IColumnNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnNameProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColumnNameProps] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameRenderer(value: (/* name */ String, /* index */ js.UndefOr[Double]) => ReactElement): Self = StObject.set(x, "nameRenderer", js.Any.fromFunction2(value))
      
      inline def setNameRendererUndefined: Self = StObject.set(x, "nameRenderer", js.undefined)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
