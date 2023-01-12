package typings.blueprintjsCore

import typings.blueprintjsCore.anon.AnimationState
import typings.blueprintjsCore.anon.Height
import typings.blueprintjsCore.anon.PartialCollapseProps
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsCollapseCollapseMod {
  
  @js.native
  sealed trait AnimationStates extends StObject
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "AnimationStates")
  @js.native
  object AnimationStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AnimationStates & Double] = js.native
    
    /**
      * The contents of the collapse is not rendered, the collapse height is 0,
      * and the body Y is at -height (so that the bottom of the body is at Y=0).
      */
    @js.native
    sealed trait CLOSED
      extends StObject
         with AnimationStates
    /* 5 */ val CLOSED: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSED & Double = js.native
    
    /**
      * Height is set to 0 and the body Y is at -height. Both of these properties
      * are transformed, and then after the animation is complete, the state
      * changes to CLOSED.
      */
    @js.native
    sealed trait CLOSING
      extends StObject
         with AnimationStates
    /* 4 */ val CLOSING: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING & Double = js.native
    
    /**
      * Height has been changed from auto to the measured height of the body to
      * prepare for the closing animation in CLOSING.
      */
    @js.native
    sealed trait CLOSING_START
      extends StObject
         with AnimationStates
    /* 3 */ val CLOSING_START: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.CLOSING_START & Double = js.native
    
    /**
      * The collapse height is set to auto, and the body Y is set to 0 (so the
      * element can be seen as normal).
      */
    @js.native
    sealed trait OPEN
      extends StObject
         with AnimationStates
    /* 2 */ val OPEN: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN & Double = js.native
    
    /**
      * Animation begins, height is set to auto. This is all animated, and on
      * complete, the state changes to OPEN.
      */
    @js.native
    sealed trait OPENING
      extends StObject
         with AnimationStates
    /* 1 */ val OPENING: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPENING & Double = js.native
    
    /**
      * The body is re-rendered, height is set to the measured body height and
      * the body Y is set to 0.
      */
    @js.native
    sealed trait OPEN_START
      extends StObject
         with AnimationStates
    /* 0 */ val OPEN_START: typings.blueprintjsCore.libEsmComponentsCollapseCollapseMod.AnimationStates.OPEN_START & Double = js.native
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
  @js.native
  open class Collapse protected ()
    extends AbstractPureComponent2[CollapseProps, ICollapseState, js.Object] {
    def this(props: CollapseProps) = this()
    def this(props: CollapseProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MCollapse(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCollapse(): Unit = js.native
    
    /* private */ var contents: Any = js.native
    
    /* private */ var contentsRefHandler: Any = js.native
    
    /* private */ var onDelayedStateChange: Any = js.native
  }
  /* static members */
  object Collapse {
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.defaultProps")
    @js.native
    def defaultProps: PartialCollapseProps = js.native
    inline def defaultProps_=(x: PartialCollapseProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/collapse/collapse", "Collapse.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: CollapseProps, state: ICollapseState): AnimationState | Height | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AnimationState | Height | Null]
  }
  
  type CollapseProps = ICollapseProps
  
  trait ICollapseProps
    extends StObject
       with IProps {
    
    /** Contents to collapse. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Component to render as the root element.
      * Useful when rendering a `Collapse` inside a `<table>`, for instance.
      *
      * @default "div"
      */
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Whether the component is open or closed.
      *
      * @default false
      */
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the child components will remain mounted when the `Collapse` is closed.
      * Setting to true may improve performance by avoiding re-mounting children.
      *
      * @default false
      */
    var keepChildrenMounted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The length of time the transition takes, in milliseconds. This must match
      * the duration of the animation in CSS. Only set this prop if you override
      * Blueprint's default transitions with new transitions of a different
      * length.
      *
      * @default 200
      */
    var transitionDuration: js.UndefOr[Double] = js.undefined
  }
  object ICollapseProps {
    
    inline def apply(): ICollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICollapseProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICollapseProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setKeepChildrenMounted(value: Boolean): Self = StObject.set(x, "keepChildrenMounted", value.asInstanceOf[js.Any])
      
      inline def setKeepChildrenMountedUndefined: Self = StObject.set(x, "keepChildrenMounted", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  trait ICollapseState extends StObject {
    
    /** The state the element is currently in. */
    var animationState: AnimationStates
    
    /** The height that should be used for the content animations. This is a CSS value, not just a number. */
    var height: js.UndefOr[String] = js.undefined
    
    /**
      * The most recent non-zero height (once a height has been measured upon first open; it is undefined until then)
      */
    var heightWhenOpen: js.UndefOr[Double] = js.undefined
  }
  object ICollapseState {
    
    inline def apply(animationState: AnimationStates): ICollapseState = {
      val __obj = js.Dynamic.literal(animationState = animationState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICollapseState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICollapseState] (val x: Self) extends AnyVal {
      
      inline def setAnimationState(value: AnimationStates): Self = StObject.set(x, "animationState", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHeightWhenOpen(value: Double): Self = StObject.set(x, "heightWhenOpen", value.asInstanceOf[js.Any])
      
      inline def setHeightWhenOpenUndefined: Self = StObject.set(x, "heightWhenOpen", js.undefined)
    }
  }
}
