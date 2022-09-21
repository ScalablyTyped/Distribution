package typings.baseui

import typings.baseui.anon.Expanded
import typings.baseui.anon.ExpandedBoolean
import typings.baseui.anon.OmitPanelPropschildren
import typings.baseui.baseuiStrings.expand
import typings.baseui.overridesMod.Override
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AccordionOnChangeHandler = js.Function1[/* a */ Expanded, Any]
  
  trait AccordionOverrides extends StObject {
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var ContentAnimationContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Header: js.UndefOr[Override[Any]] = js.undefined
    
    var PanelContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleIconGroup: js.UndefOr[Override[Any]] = js.undefined
  }
  object AccordionOverrides {
    
    inline def apply(): AccordionOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionOverrides]
    }
    
    extension [Self <: AccordionOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentAnimationContainer(value: Override[Any]): Self = StObject.set(x, "ContentAnimationContainer", value.asInstanceOf[js.Any])
      
      inline def setContentAnimationContainerUndefined: Self = StObject.set(x, "ContentAnimationContainer", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setHeader(value: Override[Any]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
      
      inline def setPanelContainer(value: Override[Any]): Self = StObject.set(x, "PanelContainer", value.asInstanceOf[js.Any])
      
      inline def setPanelContainerUndefined: Self = StObject.set(x, "PanelContainer", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setToggleIcon(value: Override[Any]): Self = StObject.set(x, "ToggleIcon", value.asInstanceOf[js.Any])
      
      inline def setToggleIconGroup(value: Override[Any]): Self = StObject.set(x, "ToggleIconGroup", value.asInstanceOf[js.Any])
      
      inline def setToggleIconGroupUndefined: Self = StObject.set(x, "ToggleIconGroup", js.undefined)
      
      inline def setToggleIconUndefined: Self = StObject.set(x, "ToggleIcon", js.undefined)
    }
  }
  
  trait AccordionProps extends StObject {
    
    /** Determines how many panels may be expanded at a time. If set to
      * true it will collapse a current panel when a new panel is expanded.
      * If set to false more than one panel may be expanded at a time. */
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    /** Accordion expandable items. See Panel API below for reference. */
    var children: ReactNode
    
    /** If set to true all its children panels will be disabled from toggling. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialState: js.UndefOr[AccordionState] = js.undefined
    
    /** Handler called each time a panel is toggled. expanded prop is an array
      * of Panel keys that are currently expanded. */
    var onChange: js.UndefOr[AccordionOnChangeHandler] = js.undefined
    
    var overrides: js.UndefOr[AccordionOverrides] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /** Handler called each time the component state changes.
      * Used to override default state-change functionality. */
    var stateReducer: StateReducer
  }
  object AccordionProps {
    
    inline def apply(
      stateReducer: (/* stateChangeType */ StateChangeType, /* nextState */ AccordionState, /* currentState */ AccordionState) => AccordionState
    ): AccordionProps = {
      val __obj = js.Dynamic.literal(stateReducer = js.Any.fromFunction3(stateReducer))
      __obj.asInstanceOf[AccordionProps]
    }
    
    extension [Self <: AccordionProps](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInitialState(value: AccordionState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* a */ Expanded => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: AccordionOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ AccordionState, /* currentState */ AccordionState) => AccordionState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
    }
  }
  
  trait AccordionState extends StObject {
    
    var expanded: js.Array[Key]
  }
  object AccordionState {
    
    inline def apply(expanded: js.Array[Key]): AccordionState = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionState]
    }
    
    extension [Self <: AccordionState](x: Self) {
      
      inline def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value*))
    }
  }
  
  type OnChangeHandler = js.Function1[/* a */ ExpandedBoolean, Any]
  
  trait PanelOverrides extends StObject {
    
    var Content: js.UndefOr[Override[Any]] = js.undefined
    
    var ContentAnimationContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Header: js.UndefOr[Override[Any]] = js.undefined
    
    var PanelContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var ToggleIconGroup: js.UndefOr[Override[Any]] = js.undefined
  }
  object PanelOverrides {
    
    inline def apply(): PanelOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelOverrides]
    }
    
    extension [Self <: PanelOverrides](x: Self) {
      
      inline def setContent(value: Override[Any]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setContentAnimationContainer(value: Override[Any]): Self = StObject.set(x, "ContentAnimationContainer", value.asInstanceOf[js.Any])
      
      inline def setContentAnimationContainerUndefined: Self = StObject.set(x, "ContentAnimationContainer", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      inline def setHeader(value: Override[Any]): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
      
      inline def setPanelContainer(value: Override[Any]): Self = StObject.set(x, "PanelContainer", value.asInstanceOf[js.Any])
      
      inline def setPanelContainerUndefined: Self = StObject.set(x, "PanelContainer", js.undefined)
      
      inline def setToggleIcon(value: Override[Any]): Self = StObject.set(x, "ToggleIcon", value.asInstanceOf[js.Any])
      
      inline def setToggleIconGroup(value: Override[Any]): Self = StObject.set(x, "ToggleIconGroup", value.asInstanceOf[js.Any])
      
      inline def setToggleIconGroupUndefined: Self = StObject.set(x, "ToggleIconGroup", js.undefined)
      
      inline def setToggleIconUndefined: Self = StObject.set(x, "ToggleIcon", js.undefined)
    }
  }
  
  trait PanelProps
    extends StObject
       with SharedPanelProps {
    
    /** Defines if the panel is expanded. If set to true the panel is rendered expanded. */
    var expanded: js.UndefOr[Boolean] = js.undefined
  }
  object PanelProps {
    
    inline def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    }
  }
  
  trait PanelState extends StObject {
    
    var expanded: Boolean
  }
  object PanelState {
    
    inline def apply(expanded: Boolean): PanelState = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelState]
    }
    
    extension [Self <: PanelState](x: Self) {
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    }
  }
  
  type PanelStateReducer = js.Function3[
    /* stateChangeType */ StateChangeType, 
    /* nextState */ PanelState, 
    /* currentState */ PanelState, 
    PanelState
  ]
  
  trait SharedPanelProps extends StObject {
    
    /** Id for a panel, when provided populates aria-controls
      * attribute for panel button and content
      * */
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /** The content visible when Panel is expanded. */
    var children: ReactNode
    
    /** Defaults to the disabled value provided by the parent Accordion component. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The key of a Panel. Used to maintain list of expanded panels.
      * Must be unique across children of the Accordion. */
    var key: js.UndefOr[Key] = js.undefined
    
    /** Handler for individual Panel change events. */
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    /** Handler for the Header's click events. */
    var onClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    /** Handler for the Header's keyDown events. */
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Any]] = js.undefined
    
    var overrides: js.UndefOr[PanelOverrides] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderPanelContent: js.UndefOr[Boolean] = js.undefined
    
    /** The title of an accordion panel. */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object SharedPanelProps {
    
    inline def apply(): SharedPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedPanelProps]
    }
    
    extension [Self <: SharedPanelProps](x: Self) {
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnChange(value: /* a */ ExpandedBoolean => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: /* e */ Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOverrides(value: PanelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait SharedStatefulPanelContainerProps extends StObject {
    
    /** Initial state of a stateful panel component.
      * The expanded prop indicates if the panel is initially expanded.
      * If set to true the panel will be expanded initially */
    var initialState: js.UndefOr[PanelState] = js.undefined
    
    var onChange: js.UndefOr[OnChangeHandler] = js.undefined
    
    var stateReducer: js.UndefOr[PanelStateReducer] = js.undefined
  }
  object SharedStatefulPanelContainerProps {
    
    inline def apply(): SharedStatefulPanelContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStatefulPanelContainerProps]
    }
    
    extension [Self <: SharedStatefulPanelContainerProps](x: Self) {
      
      inline def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnChange(value: /* a */ ExpandedBoolean => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setStateReducer(
        value: (/* stateChangeType */ StateChangeType, /* nextState */ PanelState, /* currentState */ PanelState) => PanelState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait SharedStylePropsArg extends StObject {
    
    @JSName("$color")
    var $color: js.UndefOr[String] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$expanded")
    var $expanded: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: Boolean
    
    @JSName("$size")
    var $size: js.UndefOr[String | Double] = js.undefined
  }
  object SharedStylePropsArg {
    
    inline def apply($isFocusVisible: Boolean): SharedStylePropsArg = {
      val __obj = js.Dynamic.literal($isFocusVisible = $isFocusVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharedStylePropsArg]
    }
    
    extension [Self <: SharedStylePropsArg](x: Self) {
      
      inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledNull: Self = StObject.set(x, "$disabled", null)
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$expanded(value: Boolean): Self = StObject.set(x, "$expanded", value.asInstanceOf[js.Any])
      
      inline def set$expandedNull: Self = StObject.set(x, "$expanded", null)
      
      inline def set$expandedUndefined: Self = StObject.set(x, "$expanded", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$size(value: String | Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  type StateChangeType = expand
  
  type StateReducer = js.Function3[
    /* stateChangeType */ StateChangeType, 
    /* nextState */ AccordionState, 
    /* currentState */ AccordionState, 
    AccordionState
  ]
  
  trait StatefulPanelContainerProps
    extends StObject
       with SharedStatefulPanelContainerProps {
    
    def children(props: OmitPanelPropschildren): ReactNode
  }
  object StatefulPanelContainerProps {
    
    inline def apply(children: OmitPanelPropschildren => ReactNode): StatefulPanelContainerProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[StatefulPanelContainerProps]
    }
    
    extension [Self <: StatefulPanelContainerProps](x: Self) {
      
      inline def setChildren(value: OmitPanelPropschildren => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.baseui.typesMod.SharedPanelProps because var conflicts: onChange. Inlined children, disabled, `aria-controls`, key, onClick, onKeyDown, overrides, title, renderPanelContent, renderAll */ trait StatefulPanelProps
    extends StObject
       with SharedStatefulPanelContainerProps {
    
    /** Id for a panel, when provided populates aria-controls
      * attribute for panel button and content
      * */
    var `aria-controls`: js.UndefOr[String] = js.undefined
    
    /** The content visible when Panel is expanded. */
    var children: ReactNode
    
    /** Defaults to the disabled value provided by the parent Accordion component. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** The key of a Panel. Used to maintain list of expanded panels.
      * Must be unique across children of the Accordion. */
    var key: js.UndefOr[Key] = js.undefined
    
    /** Handler for the Header's click events. */
    var onClick: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    /** Handler for the Header's keyDown events. */
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Any]] = js.undefined
    
    var overrides: js.UndefOr[PanelOverrides] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderPanelContent: js.UndefOr[Boolean] = js.undefined
    
    /** The title of an accordion panel. */
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object StatefulPanelProps {
    
    inline def apply(): StatefulPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPanelProps]
    }
    
    extension [Self <: StatefulPanelProps](x: Self) {
      
      inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnClick(value: /* e */ Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOverrides(value: PanelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type StatelessAccordionOnChangeHandler = js.Function1[/* a */ typings.baseui.anon.Key, Any]
  
  trait StatelessAccordionProps extends StObject {
    
    /** Determines how many panels may be expanded at a time. If set to
      * true it will collapse a current panel when a new panel is expanded.
      * If set to false more than one panel may be expanded at a time. */
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    /** Accordion expandable items. See Panel API below for reference. */
    var children: ReactNode
    
    /** If set to true all its children panels will be disabled from toggling. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** List of Panel keys which are expanded. */
    var expanded: js.Array[Key]
    
    /** Handler called each time a panel is toggled. */
    var onChange: js.UndefOr[StatelessAccordionOnChangeHandler] = js.undefined
    
    var overrides: js.UndefOr[AccordionOverrides & PanelOverrides] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows users to render all child content whether a panel is expanded or not
      * for SEO purposed
      */
    var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  }
  object StatelessAccordionProps {
    
    inline def apply(expanded: js.Array[Key]): StatelessAccordionProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatelessAccordionProps]
    }
    
    extension [Self <: StatelessAccordionProps](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value*))
      
      inline def setOnChange(value: /* a */ typings.baseui.anon.Key => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOverrides(value: AccordionOverrides & PanelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    }
  }
}
