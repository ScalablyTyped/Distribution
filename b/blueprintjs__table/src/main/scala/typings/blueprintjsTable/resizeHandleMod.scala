package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeHandleMod {
  
  @js.native
  sealed trait Orientation extends StObject
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Orientation & Double] = js.native
    
    @js.native
    sealed trait HORIZONTAL
      extends StObject
         with Orientation
    /* 1 */ val HORIZONTAL: typings.blueprintjsTable.resizeHandleMod.Orientation.HORIZONTAL & Double = js.native
    
    @js.native
    sealed trait VERTICAL
      extends StObject
         with Orientation
    /* 0 */ val VERTICAL: typings.blueprintjsTable.resizeHandleMod.Orientation.VERTICAL & Double = js.native
  }
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizeHandle", "ResizeHandle")
  @js.native
  open class ResizeHandle protected () extends PureComponent[IResizeHandleProps, IResizeHandleState, Any] {
    def this(props: IResizeHandleProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IResizeHandleProps, context: Any) = this()
    
    /* private */ var handleActivate: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleDoubleClick: Any = js.native
    
    /* private */ var handleDragEnd: Any = js.native
    
    /* private */ var handleDragMove: Any = js.native
  }
  
  @js.native
  trait ILockableLayout extends StObject {
    
    def onLayoutLock(): Unit = js.native
    def onLayoutLock(isLayoutLocked: Boolean): Unit = js.native
  }
  
  @js.native
  trait IResizeHandleProps
    extends StObject
       with IProps
       with ILockableLayout {
    
    /**
      * A callback that is called when the user double clicks the resize handle
      */
    var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A callback that is called when the user is done dragging the resize
      * handle.
      *
      * @param offset is the difference between the initial and final coordinates
      */
    var onResizeEnd: js.UndefOr[js.Function1[/* offset */ Double, Unit]] = js.native
    
    /**
      * A callback that is called while the user is dragging the resize
      * handle.
      *
      * @param offset is the difference between the initial and current coordinates
      * @param delta is the difference between this and the previous offset
      */
    var onResizeMove: js.UndefOr[js.Function2[/* offset */ Double, /* delta */ Double, Unit]] = js.native
    
    /**
      * An enum value to indicate the orientation of the resize handle.
      */
    var orientation: Orientation = js.native
  }
  
  trait IResizeHandleState extends StObject {
    
    /**
      * A boolean that is true while the user is dragging the resize handle
      */
    var isDragging: Boolean
  }
  object IResizeHandleState {
    
    inline def apply(isDragging: Boolean): IResizeHandleState = {
      val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeHandleState]
    }
    
    extension [Self <: IResizeHandleState](x: Self) {
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    }
  }
}
