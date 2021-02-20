package typings.blueprintjsCore

import typings.blueprintjsCore.anon.AnimationState
import typings.blueprintjsCore.anon.Height
import typings.blueprintjsCore.commonMod.AbstractPureComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @js.native
  sealed trait AnimationStates extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "AnimationStates")
  @js.native
  object AnimationStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimationStates with Double] = js.native
    
    /**
      * The contents of the collapse is not rendered, the collapse height is 0,
      * and the body Y is at -height (so that the bottom of the body is at Y=0).
      */
    @js.native
    sealed trait CLOSED extends AnimationStates
    /* 5 */ val CLOSED: typings.blueprintjsCore.collapseMod.AnimationStates.CLOSED with Double = js.native
    
    /**
      * Height is set to 0 and the body Y is at -height. Both of these properties
      * are transformed, and then after the animation is complete, the state
      * changes to CLOSED.
      */
    @js.native
    sealed trait CLOSING extends AnimationStates
    /* 4 */ val CLOSING: typings.blueprintjsCore.collapseMod.AnimationStates.CLOSING with Double = js.native
    
    /**
      * Height has been changed from auto to the measured height of the body to
      * prepare for the closing animation in CLOSING.
      */
    @js.native
    sealed trait CLOSING_START extends AnimationStates
    /* 3 */ val CLOSING_START: typings.blueprintjsCore.collapseMod.AnimationStates.CLOSING_START with Double = js.native
    
    /**
      * The collapse height is set to auto, and the body Y is set to 0 (so the
      * element can be seen as normal).
      */
    @js.native
    sealed trait OPEN extends AnimationStates
    /* 2 */ val OPEN: typings.blueprintjsCore.collapseMod.AnimationStates.OPEN with Double = js.native
    
    /**
      * Animation begins, height is set to auto. This is all animated, and on
      * complete, the state changes to OPEN.
      */
    @js.native
    sealed trait OPENING extends AnimationStates
    /* 1 */ val OPENING: typings.blueprintjsCore.collapseMod.AnimationStates.OPENING with Double = js.native
    
    /**
      * The body is re-rendered, height is set to the measured body height and
      * the body Y is set to 0.
      */
    @js.native
    sealed trait OPEN_START extends AnimationStates
    /* 0 */ val OPEN_START: typings.blueprintjsCore.collapseMod.AnimationStates.OPEN_START with Double = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
  @js.native
  class Collapse protected ()
    extends AbstractPureComponent2[ICollapseProps, ICollapseState, js.Object] {
    def this(props: ICollapseProps) = this()
    def this(props: ICollapseProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCollapse(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCollapse(): Unit = js.native
    
    var contents: js.Any = js.native
    
    var contentsRefHandler: js.Any = js.native
    
    var onDelayedStateChange: js.Any = js.native
  }
  /* static members */
  object Collapse {
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.defaultProps")
    @js.native
    def defaultProps: ICollapseProps = js.native
    @scala.inline
    def defaultProps_=(x: ICollapseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnimationState | Height | Null = js.native
  }
  
  @js.native
  trait ICollapseProps extends IProps {
    
    /**
      * Component to render as the root element.
      * Useful when rendering a `Collapse` inside a `<table>`, for instance.
      * @default "div"
      */
    var component: js.UndefOr[ElementType[_]] = js.native
    
    /**
      * Whether the component is open or closed.
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the child components will remain mounted when the `Collapse` is closed.
      * Setting to true may improve performance by avoiding re-mounting children.
      * @default false
      */
    var keepChildrenMounted: js.UndefOr[Boolean] = js.native
    
    /**
      * The length of time the transition takes, in milliseconds. This must match
      * the duration of the animation in CSS. Only set this prop if you override
      * Blueprint's default transitions with new transitions of a different
      * length.
      * @default 200
      */
    var transitionDuration: js.UndefOr[Double] = js.native
  }
  object ICollapseProps {
    
    @scala.inline
    def apply(): ICollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollapseProps]
    }
    
    @scala.inline
    implicit class ICollapsePropsMutableBuilder[Self <: ICollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ElementType[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setKeepChildrenMounted(value: Boolean): Self = StObject.set(x, "keepChildrenMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepChildrenMountedUndefined: Self = StObject.set(x, "keepChildrenMounted", js.undefined)
      
      @scala.inline
      def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  @js.native
  trait ICollapseState extends StObject {
    
    /** The state the element is currently in. */
    var animationState: AnimationStates = js.native
    
    /** The height that should be used for the content animations. This is a CSS value, not just a number. */
    var height: js.UndefOr[String] = js.native
    
    /**
      * The most recent non-zero height (once a height has been measured upon first open; it is undefined until then)
      */
    var heightWhenOpen: js.UndefOr[Double] = js.native
  }
  object ICollapseState {
    
    @scala.inline
    def apply(animationState: AnimationStates): ICollapseState = {
      val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollapseState]
    }
    
    @scala.inline
    implicit class ICollapseStateMutableBuilder[Self <: ICollapseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHeightWhenOpen(value: Double): Self = StObject.set(x, "heightWhenOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightWhenOpenUndefined: Self = StObject.set(x, "heightWhenOpen", js.undefined)
    }
  }
}
