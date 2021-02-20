package typings.baseui

import typings.baseui.anon.Arrow
import typings.baseui.anon.IsMounted
import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerMod {
  
  @JSImport("baseui/layer", "Layer")
  @js.native
  val Layer: FC[LayerProps] = js.native
  
  @JSImport("baseui/layer", "LayersManager")
  @js.native
  class LayersManager protected ()
    extends Component[LayersManagerProps, js.Object, js.Any] {
    def this(props: LayersManagerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LayersManagerProps, context: js.Any) = this()
    
    var host: Ref[HTMLElement] = js.native
  }
  
  @js.native
  trait TETHER_PLACEMENT extends StObject {
    
    var auto: typings.baseui.baseuiStrings.auto = js.native
    
    var bottom: typings.baseui.baseuiStrings.bottom = js.native
    
    var bottomLeft: typings.baseui.baseuiStrings.bottomLeft = js.native
    
    var bottomRight: typings.baseui.baseuiStrings.bottomRight = js.native
    
    var left: typings.baseui.baseuiStrings.left = js.native
    
    var leftBottom: typings.baseui.baseuiStrings.leftBottom = js.native
    
    var leftTop: typings.baseui.baseuiStrings.leftTop = js.native
    
    var right: typings.baseui.baseuiStrings.right = js.native
    
    var rightBottom: typings.baseui.baseuiStrings.rightBottom = js.native
    
    var rightTop: typings.baseui.baseuiStrings.rightTop = js.native
    
    var top: typings.baseui.baseuiStrings.top = js.native
    
    var topLeft: typings.baseui.baseuiStrings.topLeft = js.native
    
    var topRight: typings.baseui.baseuiStrings.topRight = js.native
  }
  object TETHER_PLACEMENT {
    
    @JSImport("baseui/layer", "TETHER_PLACEMENT")
    @js.native
    val ^ : TETHER_PLACEMENT = js.native
    
    @scala.inline
    implicit class TETHER_PLACEMENTMutableBuilder[Self <: TETHER_PLACEMENT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: bottom): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomLeft(value: bottomLeft): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: bottomRight): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: left): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftBottom(value: leftBottom): Self = StObject.set(x, "leftBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftTop(value: leftTop): Self = StObject.set(x, "leftTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: right): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightBottom(value: rightBottom): Self = StObject.set(x, "rightBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightTop(value: rightTop): Self = StObject.set(x, "rightTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: topLeft): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: topRight): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/layer", "TetherBehavior")
  @js.native
  class TetherBehavior protected ()
    extends Component[TetherProps, TetherState, js.Any] {
    def this(props: TetherProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TetherProps, context: js.Any) = this()
    
    def destroyPopover(): Unit = js.native
    
    def initializePopper(): Unit = js.native
    
    def onPopperUpdate(data: PopperDataObject): Unit = js.native
    
    @JSName("state")
    var state_TetherBehavior: IsMounted = js.native
  }
  
  @js.native
  trait LayerProps extends StObject {
    
    var children: ReactNode = js.native
    
    var host: js.UndefOr[HTMLElement] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var mountNode: js.UndefOr[HTMLElement] = js.native
    
    var onMount: js.UndefOr[js.Function0[_]] = js.native
    
    var onUnmount: js.UndefOr[js.Function0[_]] = js.native
  }
  object LayerProps {
    
    @scala.inline
    def apply(): LayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerProps]
    }
    
    @scala.inline
    implicit class LayerPropsMutableBuilder[Self <: LayerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setMountNode(value: HTMLElement): Self = StObject.set(x, "mountNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountNodeUndefined: Self = StObject.set(x, "mountNode", js.undefined)
      
      @scala.inline
      def setOnMount(value: () => _): Self = StObject.set(x, "onMount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMountUndefined: Self = StObject.set(x, "onMount", js.undefined)
      
      @scala.inline
      def setOnUnmount(value: () => _): Self = StObject.set(x, "onUnmount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnmountUndefined: Self = StObject.set(x, "onUnmount", js.undefined)
    }
  }
  
  @js.native
  trait LayersManagerProps extends StObject {
    
    var children: ReactNode = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object LayersManagerProps {
    
    @scala.inline
    def apply(): LayersManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersManagerProps]
    }
    
    @scala.inline
    implicit class LayersManagerPropsMutableBuilder[Self <: LayersManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait NormalizedOffset extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object NormalizedOffset {
    
    @scala.inline
    def apply(left: Double, top: Double): NormalizedOffset = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOffset]
    }
    
    @scala.inline
    implicit class NormalizedOffsetMutableBuilder[Self <: NormalizedOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NormalizedOffsets extends StObject {
    
    var arrow: js.UndefOr[NormalizedOffset] = js.native
    
    var popper: NormalizedOffset = js.native
  }
  object NormalizedOffsets {
    
    @scala.inline
    def apply(popper: NormalizedOffset): NormalizedOffsets = {
      val __obj = js.Dynamic.literal(popper = popper.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOffsets]
    }
    
    @scala.inline
    implicit class NormalizedOffsetsMutableBuilder[Self <: NormalizedOffsets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: NormalizedOffset): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
      
      @scala.inline
      def setPopper(value: NormalizedOffset): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopperDataObject extends StObject {
    
    var offsets: Arrow = js.native
    
    var placement: String = js.native
  }
  object PopperDataObject {
    
    @scala.inline
    def apply(offsets: Arrow, placement: String): PopperDataObject = {
      val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperDataObject]
    }
    
    @scala.inline
    implicit class PopperDataObjectMutableBuilder[Self <: PopperDataObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsets(value: Arrow): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PopperOffset extends StObject {
    
    var left: js.UndefOr[Double | Null] = js.native
    
    var top: js.UndefOr[Double | Null] = js.native
  }
  object PopperOffset {
    
    @scala.inline
    def apply(): PopperOffset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperOffset]
    }
    
    @scala.inline
    implicit class PopperOffsetMutableBuilder[Self <: PopperOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftNull: Self = StObject.set(x, "left", null)
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopNull: Self = StObject.set(x, "top", null)
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type TetherPlacement = TETHER_PLACEMENT
  
  @js.native
  trait TetherProps extends StObject {
    
    var anchorRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var arrowRef: js.UndefOr[Ref[HTMLElement]] = js.native
    
    var children: ReactNode = js.native
    
    var onPopperUpdate: js.UndefOr[js.Function2[/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject, _]] = js.native
    
    var placement: js.UndefOr[
        topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ] = js.native
    
    var popperOptions: js.UndefOr[js.Any] = js.native
    
    var popperRef: js.UndefOr[Ref[HTMLElement]] = js.native
  }
  object TetherProps {
    
    @scala.inline
    def apply(): TetherProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TetherProps]
    }
    
    @scala.inline
    implicit class TetherPropsMutableBuilder[Self <: TetherProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorRef(value: Ref[HTMLElement]): Self = StObject.set(x, "anchorRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "anchorRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnchorRefNull: Self = StObject.set(x, "anchorRef", null)
      
      @scala.inline
      def setAnchorRefUndefined: Self = StObject.set(x, "anchorRef", js.undefined)
      
      @scala.inline
      def setArrowRef(value: Ref[HTMLElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "arrowRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      @scala.inline
      def setArrowRefUndefined: Self = StObject.set(x, "arrowRef", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnPopperUpdate(value: (/* offsets */ NormalizedOffsets, /* popper */ PopperDataObject) => _): Self = StObject.set(x, "onPopperUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPopperUpdateUndefined: Self = StObject.set(x, "onPopperUpdate", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopperOptions(value: js.Any): Self = StObject.set(x, "popperOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperOptionsUndefined: Self = StObject.set(x, "popperOptions", js.undefined)
      
      @scala.inline
      def setPopperRef(value: Ref[HTMLElement]): Self = StObject.set(x, "popperRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopperRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "popperRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopperRefNull: Self = StObject.set(x, "popperRef", null)
      
      @scala.inline
      def setPopperRefUndefined: Self = StObject.set(x, "popperRef", js.undefined)
    }
  }
  
  @js.native
  trait TetherState extends StObject {
    
    var isMounted: Boolean = js.native
  }
  object TetherState {
    
    @scala.inline
    def apply(isMounted: Boolean): TetherState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any])
      __obj.asInstanceOf[TetherState]
    }
    
    @scala.inline
    implicit class TetherStateMutableBuilder[Self <: TetherState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
    }
  }
}
