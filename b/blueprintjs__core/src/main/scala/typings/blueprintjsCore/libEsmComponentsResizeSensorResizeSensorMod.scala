package typings.blueprintjsCore

import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.react.mod.ReactNode
import typings.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsResizeSensorResizeSensorMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
  @js.native
  open class ResizeSensor protected ()
    extends AbstractPureComponent2[ResizeSensorProps, js.Object, js.Object] {
    def this(props: ResizeSensorProps) = this()
    def this(props: ResizeSensorProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeSensor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeSensor(prevProps: ResizeSensorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeSensor(): Unit = js.native
    
    /* private */ var element: Any = js.native
    
    /* private */ var getElement: Any = js.native
    
    /**
      * Observe the DOM element, if defined and different from the currently
      * observed element. Pass `force` argument to skip element checks and always
      * re-observe.
      */
    /* private */ var observeElement: Any = js.native
    
    /* private */ var observer: Any = js.native
  }
  /* static members */
  object ResizeSensor {
    
    @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait IResizeSensorProps extends StObject {
    
    /** Contents to observe for size changes. */
    var children: ReactNode
    
    /**
      * If `true`, all parent DOM elements of the container will also be
      * observed for size changes. The array of entries passed to `onResize`
      * will now contain an entry for each parent element up to the root of the
      * document.
      *
      * Only enable this prop if a parent element resizes in a way that does
      * not also cause the child element to resize.
      *
      * @default false
      */
    var observeParents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked when the wrapped element resizes.
      *
      * The `entries` array contains an entry for each observed element. In the
      * default case (no `observeParents`), the array will contain only one
      * element: the single child of the `ResizeSensor`.
      *
      * Note that this method is called _asynchronously_ after a resize is
      * detected and typically it will be called no more than once per frame.
      */
    def onResize(entries: js.Array[ResizeObserverEntry]): Unit
  }
  object IResizeSensorProps {
    
    inline def apply(onResize: js.Array[ResizeObserverEntry] => Unit): IResizeSensorProps = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[IResizeSensorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IResizeSensorProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      inline def setOnResize(value: js.Array[ResizeObserverEntry] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    }
  }
  
  type ResizeSensorProps = IResizeSensorProps
}
