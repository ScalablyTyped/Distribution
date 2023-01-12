package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IIntentProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersEditableNameMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/editableName", "EditableName")
  @js.native
  open class EditableName protected () extends PureComponent[IEditableNameProps, IEditableNameState, Any] {
    def this(props: IEditableNameProps) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableName(prevProps: IEditableNameProps): Unit = js.native
    
    /* private */ var handleCancel: Any = js.native
    
    /* private */ var handleChange: Any = js.native
    
    /* private */ var handleConfirm: Any = js.native
    
    /* private */ var handleEdit: Any = js.native
  }
  
  type EditableNameProps = IEditableNameProps
  
  trait IEditableNameProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /**
      * The index of the name in the header. If provided, this will be passed as an argument to any
      * callbacks when they are invoked.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * The name displayed in the text box. Be sure to update this value when
      * rendering this component after a confirmed change.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A listener that is triggered if the user cancels the edit. This is
      * important to listen to if you are doing anything with `onChange` events,
      * since you'll likely want to revert whatever changes you made.
      */
    var onCancel: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * A listener that is triggered as soon as the editable name is modified.
      * This can be due, for example, to keyboard input or the clipboard.
      */
    var onChange: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
    
    /**
      * A listener that is triggered once the editing is confirmed. This is
      * usually due to the `return` (or `enter`) key press.
      */
    var onConfirm: js.UndefOr[js.Function2[/* value */ String, /* columnIndex */ js.UndefOr[Double], Unit]] = js.undefined
  }
  object IEditableNameProps {
    
    inline def apply(): IEditableNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableNameProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEditableNameProps] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnCancel(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnConfirm(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  trait IEditableNameState extends StObject {
    
    var dirtyName: js.UndefOr[String] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var savedName: js.UndefOr[String] = js.undefined
  }
  object IEditableNameState {
    
    inline def apply(): IEditableNameState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableNameState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IEditableNameState] (val x: Self) extends AnyVal {
      
      inline def setDirtyName(value: String): Self = StObject.set(x, "dirtyName", value.asInstanceOf[js.Any])
      
      inline def setDirtyNameUndefined: Self = StObject.set(x, "dirtyName", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setSavedName(value: String): Self = StObject.set(x, "savedName", value.asInstanceOf[js.Any])
      
      inline def setSavedNameUndefined: Self = StObject.set(x, "savedName", js.undefined)
    }
  }
}
