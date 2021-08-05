package typings.blueprintjsTable

import typings.blueprintjsCore.editableTextMod.IEditableTextProps
import typings.blueprintjsTable.anon.Truncated
import typings.blueprintjsTable.cellMod.ICellProps
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
  @js.native
  class EditableCell protected ()
    extends Component[IEditableCellProps, IEditableCellState, js.Any] {
    def this(props: IEditableCellProps) = this()
    def this(props: IEditableCellProps, context: js.Any) = this()
    
    /* private */ var cellRef: js.Any = js.native
    
    /* private */ var checkShouldFocus: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableCell(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableCell(prevProps: IEditableCellProps): Unit = js.native
    
    /* private */ var handleCancel: js.Any = js.native
    
    /* private */ var handleCellActivate: js.Any = js.native
    
    /* private */ var handleCellDoubleClick: js.Any = js.native
    
    /* private */ var handleChange: js.Any = js.native
    
    /* private */ var handleConfirm: js.Any = js.native
    
    /* private */ var handleEdit: js.Any = js.native
    
    /* private */ var handleKeyPress: js.Any = js.native
    
    /* private */ var invokeCallback: js.Any = js.native
    
    /* private */ var refHandlers: js.Any = js.native
    
    def renderHotkeys(): Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MEditableCell(nextProps: IEditableCellProps, nextState: IEditableCellState): Boolean = js.native
  }
  /* static members */
  object EditableCell {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell", "EditableCell.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IEditableCellProps
    extends StObject
       with ICellProps {
    
    /**
      * Props that should be passed to the EditableText when it is used to edit
      */
    var editableTextProps: js.UndefOr[IEditableTextProps] = js.undefined
    
    /**
      * Whether the given cell is the current active/focused cell.
      */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A listener that is triggered if the user cancels the edit. This is
      * important to listen to if you are doing anything with `onChange` events,
      * since you'll likely want to revert whatever changes you made. The
      * callback will also receive the row index and column index if they were
      * originally provided via props.
      */
    var onCancel: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A listener that is triggered as soon as the editable name is modified.
      * This can be due, for example, to keyboard input or the clipboard. The
      * callback will also receive the row index and column index if they were
      * originally provided via props.
      */
    var onChange: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A listener that is triggered once the editing is confirmed. This is
      * usually due to the <code>return</code> (or <code>enter</code>) key press.
      * The callback will also receive the row index and column index if they
      * were originally provided via props.
      */
    var onConfirm: js.UndefOr[
        js.Function3[
          /* value */ String, 
          /* rowIndex */ js.UndefOr[Double], 
          /* columnIndex */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The value displayed in the text box. Be sure to update this value when
      * rendering this component after a confirmed change.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object IEditableCellProps {
    
    inline def apply(): IEditableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableCellProps]
    }
    
    extension [Self <: IEditableCellProps](x: Self) {
      
      inline def setEditableTextProps(value: IEditableTextProps): Self = StObject.set(x, "editableTextProps", value.asInstanceOf[js.Any])
      
      inline def setEditableTextPropsUndefined: Self = StObject.set(x, "editableTextProps", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setOnCancel(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction3(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(
        value: (/* value */ String, /* rowIndex */ js.UndefOr[Double], /* columnIndex */ js.UndefOr[Double]) => Unit
      ): Self = StObject.set(x, "onConfirm", js.Any.fromFunction3(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IEditableCellState extends StObject {
    
    var dirtyValue: js.UndefOr[String] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var savedValue: js.UndefOr[String] = js.undefined
  }
  object IEditableCellState {
    
    inline def apply(): IEditableCellState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableCellState]
    }
    
    extension [Self <: IEditableCellState](x: Self) {
      
      inline def setDirtyValue(value: String): Self = StObject.set(x, "dirtyValue", value.asInstanceOf[js.Any])
      
      inline def setDirtyValueUndefined: Self = StObject.set(x, "dirtyValue", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setSavedValue(value: String): Self = StObject.set(x, "savedValue", value.asInstanceOf[js.Any])
      
      inline def setSavedValueUndefined: Self = StObject.set(x, "savedValue", js.undefined)
    }
  }
}
