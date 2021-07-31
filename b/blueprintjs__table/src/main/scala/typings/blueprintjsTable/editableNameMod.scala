package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableNameMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/editableName", "EditableName")
  @js.native
  class EditableName protected ()
    extends PureComponent[IEditableNameProps, IEditableNameState, js.Any] {
    def this(props: IEditableNameProps) = this()
    def this(props: IEditableNameProps, context: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MEditableName(prevProps: IEditableNameProps): Unit = js.native
    
    var handleCancel: js.Any = js.native
    
    var handleChange: js.Any = js.native
    
    var handleConfirm: js.Any = js.native
    
    var handleEdit: js.Any = js.native
    
    var invokeCallback: js.Any = js.native
  }
  
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
    
    @scala.inline
    def apply(): IEditableNameProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableNameProps]
    }
    
    @scala.inline
    implicit class IEditableNamePropsMutableBuilder[Self <: IEditableNameProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnCancel(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnConfirm(value: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  trait IEditableNameState extends StObject {
    
    var dirtyName: js.UndefOr[String] = js.undefined
    
    var isEditing: js.UndefOr[Boolean] = js.undefined
    
    var savedName: js.UndefOr[String] = js.undefined
  }
  object IEditableNameState {
    
    @scala.inline
    def apply(): IEditableNameState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IEditableNameState]
    }
    
    @scala.inline
    implicit class IEditableNameStateMutableBuilder[Self <: IEditableNameState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirtyName(value: String): Self = StObject.set(x, "dirtyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyNameUndefined: Self = StObject.set(x, "dirtyName", js.undefined)
      
      @scala.inline
      def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      @scala.inline
      def setSavedName(value: String): Self = StObject.set(x, "savedName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedNameUndefined: Self = StObject.set(x, "savedName", js.undefined)
    }
  }
}
