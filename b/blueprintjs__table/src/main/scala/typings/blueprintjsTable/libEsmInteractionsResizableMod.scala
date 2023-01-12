package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.anon.IsResizable
import typings.blueprintjsTable.anon.Size
import typings.blueprintjsTable.libEsmInteractionsResizeHandleMod.ILockableLayout
import typings.blueprintjsTable.libEsmInteractionsResizeHandleMod.Orientation
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsResizableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
  @js.native
  open class Resizable protected ()
    extends AbstractPureComponent2[IResizableProps, IResizeableState, js.Object] {
    def this(props: IResizableProps) = this()
    def this(props: IResizableProps, context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizable(prevProps: IResizableProps): Unit = js.native
    
    /**
      * Returns the CSS style to apply to the child element given the state's
      * size value.
      */
    /* private */ var getStyle: Any = js.native
    
    /* private */ var offsetSize: Any = js.native
    
    /* private */ var onResizeEnd: Any = js.native
    
    /* private */ var onResizeMove: Any = js.native
    
    /* private */ var renderResizeHandle: Any = js.native
  }
  /* static members */
  object Resizable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/resizable", "Resizable.defaultProps")
    @js.native
    def defaultProps: IsResizable = js.native
    inline def defaultProps_=(x: IsResizable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(param0: IResizableProps): Size | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any]).asInstanceOf[Size | Null]
    inline def getDerivedStateFromProps(param0: IResizableProps, prevState: IResizeableState): Size | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[Size | Null]
  }
  
  type IIndexedResizeCallback = js.Function2[/* index */ Double, /* size */ Double, Unit]
  
  @js.native
  trait IResizableProps
    extends StObject
       with IProps
       with ILockableLayout {
    
    /** Element to resize. */
    var children: ReactNode = js.native
    
    /**
      * Enables/disables the resize interaction for the column.
      *
      * @default true
      */
    var isResizable: js.UndefOr[Boolean] = js.native
    
    /**
      * The optional maximum width of the column.
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * The optional minimum width of the column.
      */
    var minSize: js.UndefOr[Double] = js.native
    
    /**
      * A callback that is called when the user double clicks the resize handle
      */
    var onDoubleClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * A callback that is called when the user is done dragging the resize
      * handle.
      *
      * @param size is the final resized size
      */
    var onResizeEnd: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
    
    /**
      * A callback that is called while the user is dragging the resize
      * handle.
      *
      * @param size is the resized size
      */
    var onSizeChanged: js.UndefOr[js.Function1[/* size */ Double, Unit]] = js.native
    
    /**
      * Determines how the resize handle is oriented in the resizable child.
      */
    var orientation: Orientation = js.native
    
    /**
      * The initial dimensional size.
      */
    var size: Double = js.native
  }
  
  trait IResizeableState extends StObject {
    
    /**
      * The dimensional size, respecting minimum and maximum constraints.
      */
    var size: Double
    
    /**
      * The dimensional size, ignoring minimum and maximum constraints.
      */
    var unclampedSize: Double
  }
  object IResizeableState {
    
    inline def apply(size: Double, unclampedSize: Double): IResizeableState = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], unclampedSize = unclampedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResizeableState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeableState] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnclampedSize(value: Double): Self = StObject.set(x, "unclampedSize", value.asInstanceOf[js.Any])
    }
  }
  
  type IndexedResizeCallback = IIndexedResizeCallback
}
