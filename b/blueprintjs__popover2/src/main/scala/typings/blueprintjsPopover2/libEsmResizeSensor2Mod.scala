package typings.blueprintjsPopover2

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.ResizeObserverEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmResizeSensor2Mod {
  
  @JSImport("@blueprintjs/popover2/lib/esm/resizeSensor2", "ResizeSensor2")
  @js.native
  open class ResizeSensor2 protected ()
    extends AbstractPureComponent2[ResizeSensor2Props, js.Object, js.Object] {
    def this(props: ResizeSensor2Props) = this()
    def this(props: ResizeSensor2Props, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MResizeSensor2(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MResizeSensor2(prevProps: ResizeSensor2Props): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MResizeSensor2(): Unit = js.native
    
    /**
      * Observe the DOM element, if defined and different from the currently
      * observed element. Pass `force` argument to skip element checks and always
      * re-observe.
      */
    /* private */ var observeElement: Any = js.native
    
    /* private */ var observer: Any = js.native
    
    /* private */ var prevElement: Any = js.native
    
    /* private */ var targetRef: Any = js.native
  }
  /* static members */
  object ResizeSensor2 {
    
    @JSImport("@blueprintjs/popover2/lib/esm/resizeSensor2", "ResizeSensor2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/popover2/lib/esm/resizeSensor2", "ResizeSensor2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ResizeSensor2Props extends StObject {
    
    /**
      * Single child, must be an element and not a string or fragment.
      */
    var children: Element
    
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
    
    /**
      * If you attach a `ref` to the child yourself when rendering it, you must pass the
      * same value here (otherwise, ResizeSensor won't be able to attach its own).
      */
    var targetRef: js.UndefOr[Ref[Any]] = js.undefined
  }
  object ResizeSensor2Props {
    
    inline def apply(children: Element, onResize: js.Array[ResizeObserverEntry] => Unit): ResizeSensor2Props = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onResize = js.Any.fromFunction1(onResize))
      __obj.asInstanceOf[ResizeSensor2Props]
    }
    
    extension [Self <: ResizeSensor2Props](x: Self) {
      
      inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setObserveParents(value: Boolean): Self = StObject.set(x, "observeParents", value.asInstanceOf[js.Any])
      
      inline def setObserveParentsUndefined: Self = StObject.set(x, "observeParents", js.undefined)
      
      inline def setOnResize(value: js.Array[ResizeObserverEntry] => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setTargetRef(value: Ref[Any]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "targetRef", js.Any.fromFunction1(value))
      
      inline def setTargetRefNull: Self = StObject.set(x, "targetRef", null)
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
}
