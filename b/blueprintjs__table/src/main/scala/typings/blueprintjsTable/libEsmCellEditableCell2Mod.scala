package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonIntentMod.Intent
import typings.blueprintjsCore.libEsmComponentsEditableTextEditableTextMod.EditableTextProps
import typings.blueprintjsTable.anon.Truncated
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCellEditableCell2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/cell/editableCell2", "EditableCell2")
  @js.native
  open class EditableCell2 protected () extends Component[EditableCell2Props, EditableCell2State, Any] {
    def this(props: EditableCell2Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditableCell2Props, context: Any) = this()
    
    /* private */ var cellRef: Any = js.native
    
    /* private */ var checkShouldFocus: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MEditableCell2(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableCell2(prevProps: EditableCell2Props): Unit = js.native
    
    /* private */ var handleCancel: Any = js.native
    
    /* private */ var handleCellActivate: Any = js.native
    
    /* private */ var handleCellDoubleClick: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleConfirm: Any = js.native
    
    /* private */ var handleEdit: Any = js.native
    
    /* private */ var handleKeyPress: Any = js.native
    
    /* private */ var hotkeys: Any = js.native
    
    /* private */ var invokeCallback: Any = js.native
    
    /* private */ var refHandlers: Any = js.native
    
    /* private */ var renderCell: Any = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MEditableCell2(nextProps: EditableCell2Props, nextState: EditableCell2State): Boolean = js.native
  }
  /* static members */
  object EditableCell2 {
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell2", "EditableCell2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell2", "EditableCell2.defaultProps")
    @js.native
    def defaultProps: Truncated = js.native
    inline def defaultProps_=(x: Truncated): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/table/lib/esm/cell/editableCell2", "EditableCell2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<@blueprintjs/table.@blueprintjs/table/lib/esm/cell/cell.CellProps, 'onKeyDown' | 'onKeyUp'> */
  trait EditableCell2Props extends StObject {
    
    var cellRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Props that should be passed to the EditableText when it is used to edit
      */
    var editableTextProps: js.UndefOr[EditableTextProps] = js.undefined
    
    var intent: js.UndefOr[Intent] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the given cell is the current active/focused cell.
      */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
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
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
    
    /**
      * Optional placeholder value for when the cell is empty (overrides the
      * placeholder in {@link EditableTextProps})
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var truncated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value displayed in the text box. Be sure to update this value when
      * rendering this component after a confirmed change.
      */
    var value: js.UndefOr[String] = js.undefined
    
    var wrapText: js.UndefOr[Boolean] = js.undefined
  }
  object EditableCell2Props {
    
    inline def apply(): EditableCell2Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableCell2Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditableCell2Props] (val x: Self) extends AnyVal {
      
      inline def setCellRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "cellRef", value.asInstanceOf[js.Any])
      
      inline def setCellRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "cellRef", js.Any.fromFunction1(value))
      
      inline def setCellRefNull: Self = StObject.set(x, "cellRef", null)
      
      inline def setCellRefUndefined: Self = StObject.set(x, "cellRef", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setEditableTextProps(value: EditableTextProps): Self = StObject.set(x, "editableTextProps", value.asInstanceOf[js.Any])
      
      inline def setEditableTextPropsUndefined: Self = StObject.set(x, "editableTextProps", js.undefined)
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
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
      
      inline def setOnKeyPress(value: KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      inline def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  trait EditableCell2State extends StObject {
    
    var dirtyValue: js.UndefOr[String] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var savedValue: js.UndefOr[String] = js.undefined
  }
  object EditableCell2State {
    
    inline def apply(): EditableCell2State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableCell2State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditableCell2State] (val x: Self) extends AnyVal {
      
      inline def setDirtyValue(value: String): Self = StObject.set(x, "dirtyValue", value.asInstanceOf[js.Any])
      
      inline def setDirtyValueUndefined: Self = StObject.set(x, "dirtyValue", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setSavedValue(value: String): Self = StObject.set(x, "savedValue", value.asInstanceOf[js.Any])
      
      inline def setSavedValueUndefined: Self = StObject.set(x, "savedValue", js.undefined)
    }
  }
}
