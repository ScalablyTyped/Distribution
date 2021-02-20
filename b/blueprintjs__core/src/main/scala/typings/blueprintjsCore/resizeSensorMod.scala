package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.resizeObserverTypesMod.IResizeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeSensorMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
  @js.native
  class ResizeSensor protected ()
    extends AbstractPureComponent2[IResizeSensorProps, js.Object, js.Object] {
    def this(props: IResizeSensorProps) = this()
    def this(props: IResizeSensorProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeSensor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeSensor(prevProps: IResizeSensorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeSensor(): Unit = js.native
    
    var element: js.Any = js.native
    
    var getElement: js.Any = js.native
    
    /**
      * Observe the DOM element, if defined and different from the currently
      * observed element. Pass `force` argument to skip element checks and always
      * re-observe.
      */
    var observeElement: js.Any = js.native
    
    var observer: js.Any = js.native
  }
  /* static members */
  object ResizeSensor {
    
    @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/resize-sensor/resizeSensor", "ResizeSensor.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IResizeSensorProps extends StObject {
    
    /**
      * If `true`, all parent DOM elements of the container will also be
      * observed for size changes. The array of entries passed to `onResize`
      * will now contain an entry for each parent element up to the root of the
      * document.
      *
      * Only enable this prop if a parent element resizes in a way that does
      * not also cause the child element to resize.
      * @default false
      */
    var observeParents: js.UndefOr[Boolean] = js.native
    
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
    def onResize(entries: js.Array[IResizeEntry]): Unit = js.native
  }
  object IResizeSensorProps {
    
    @scala.inline
    def apply(onResize: js.Array[IResizeEntry] => Unit): IResizeSensorProps = {
      val __obj = js.Dynamic.literal(onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[IResizeSensorProps]
    }
    
    @scala.inline
    implicit class IResizeSensorPropsMutableBuilder[Self <: IResizeSensorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      @scala.inline
      def setOnResize(value: js.Array[IResizeEntry] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
    }
  }
}
