package typings.baseui

import typings.baseui.anon.Expanded
import typings.baseui.anon.ExpandedBoolean
import typings.baseui.baseuiStrings.expand
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  class Accordion protected ()
    extends Component[AccordionProps, AccordionState, js.Any] {
    def this(props: AccordionProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AccordionProps, context: js.Any) = this()
    
    def getItems(): ReactNode = js.native
    
    @JSName("internalSetState")
    def internalSetState_expand(`type`: expand, changes: AccordionState): Unit = js.native
    
    def onPanelChange(
      key: Key,
      onChange: js.Function0[_],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ): Unit = js.native
  }
  
  @JSImport("baseui/accordion", "Panel")
  @js.native
  class Panel protected ()
    extends Component[PanelProps, js.Object, js.Any] {
    def this(props: PanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PanelProps, context: js.Any) = this()
    
    def getSharedProps(): SharedProps = js.native
    
    def onClick(e: Event): Unit = js.native
    
    def onKeyDown(e: KeyboardEvent): Unit = js.native
  }
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var expand: typings.baseui.baseuiStrings.expand = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/accordion", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpand(value: expand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/accordion", "StatefulPanel")
  @js.native
  val StatefulPanel: FC[StatefulPanelProps] = js.native
  
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  class StatefulPanelContainer protected ()
    extends Component[StatefulPanelContainerProps, PanelState, js.Any] {
    def this(props: StatefulPanelContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulPanelContainerProps, context: js.Any) = this()
    
    @JSName("internalSetState")
    def internalSetState_expand(`type`: expand, changes: PanelState): Unit = js.native
    
    def onChange(args: js.Any): Unit = js.native
  }
  
  @JSImport("baseui/accordion", "StatelessAccordion")
  @js.native
  val StatelessAccordion: FC[StatelessAccordionProps] = js.native
  
  @JSImport("baseui/accordion", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/accordion", "StyledHeader")
  @js.native
  val StyledHeader: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/accordion", "StyledPanelContainer")
  @js.native
  val StyledPanelContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/accordion", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/accordion", "StyledToggleIcon")
  @js.native
  val StyledToggleIcon: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait AccordionOverrides[T] extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var Header: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var PanelContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var ToggleIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
  }
  object AccordionOverrides {
    
    @scala.inline
    def apply[T](): AccordionOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionOverrides[T]]
    }
    
    @scala.inline
    implicit class AccordionOverridesMutableBuilder[Self <: AccordionOverrides[_], T] (val x: Self with AccordionOverrides[T]) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setHeader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
      
      @scala.inline
      def setPanelContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "PanelContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelContainerUndefined: Self = StObject.set(x, "PanelContainer", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setToggleIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ToggleIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleIconUndefined: Self = StObject.set(x, "ToggleIcon", js.undefined)
    }
  }
  
  @js.native
  trait AccordionProps extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var initialState: js.UndefOr[AccordionState] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ Expanded, _]] = js.native
    
    var overrides: js.UndefOr[AccordionOverrides[SharedProps]] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var renderPanelContent: js.UndefOr[Boolean] = js.native
    
    var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.native
  }
  object AccordionProps {
    
    @scala.inline
    def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    @scala.inline
    implicit class AccordionPropsMutableBuilder[Self <: AccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInitialState(value: AccordionState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ Expanded => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: AccordionOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (expand, AccordionState, AccordionState) => AccordionState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  @js.native
  trait AccordionState extends StObject {
    
    var expanded: js.Array[Key] = js.native
  }
  object AccordionState {
    
    @scala.inline
    def apply(expanded: js.Array[Key]): AccordionState = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionState]
    }
    
    @scala.inline
    implicit class AccordionStateMutableBuilder[Self <: AccordionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PanelOverrides[T] extends StObject {
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var Header: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var PanelContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
    
    var ToggleIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.native
  }
  object PanelOverrides {
    
    @scala.inline
    def apply[T](): PanelOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelOverrides[T]]
    }
    
    @scala.inline
    implicit class PanelOverridesMutableBuilder[Self <: PanelOverrides[_], T] (val x: Self with PanelOverrides[T]) extends AnyVal {
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setHeader(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
      
      @scala.inline
      def setPanelContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "PanelContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelContainerUndefined: Self = StObject.set(x, "PanelContainer", js.undefined)
      
      @scala.inline
      def setToggleIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "ToggleIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleIconUndefined: Self = StObject.set(x, "ToggleIcon", js.undefined)
    }
  }
  
  /* Inlined baseui.baseui/accordion.SharedPanelProps & {  expanded :boolean | undefined} */
  @js.native
  trait PanelProps extends StObject {
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expanded: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
    
    var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var renderPanelContent: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object PanelProps {
    
    @scala.inline
    def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    @scala.inline
    implicit class PanelPropsMutableBuilder[Self <: PanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ExpandedBoolean => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ Event => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent => _): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOverrides(value: PanelOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait PanelState extends StObject {
    
    var expanded: Boolean = js.native
  }
  object PanelState {
    
    @scala.inline
    def apply(expanded: Boolean): PanelState = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[PanelState]
    }
    
    @scala.inline
    implicit class PanelStateMutableBuilder[Self <: PanelState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedPanelProps extends StObject {
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, _]] = js.native
    
    var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var renderPanelContent: js.UndefOr[Boolean] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object SharedPanelProps {
    
    @scala.inline
    def apply(): SharedPanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedPanelProps]
    }
    
    @scala.inline
    implicit class SharedPanelPropsMutableBuilder[Self <: SharedPanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ExpandedBoolean => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ Event => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* e */ KeyboardEvent => _): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOverrides(value: PanelOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait SharedProps extends StObject {
    
    @JSName("$color")
    var $color: js.UndefOr[String] = js.native
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.native
    
    @JSName("$expanded")
    var $expanded: js.UndefOr[Boolean] = js.native
    
    @JSName("$size")
    var $size: js.UndefOr[String | Double] = js.native
  }
  object SharedProps {
    
    @scala.inline
    def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit class SharedPropsMutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      @scala.inline
      def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      @scala.inline
      def set$expanded(value: Boolean): Self = StObject.set(x, "$expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$expandedUndefined: Self = StObject.set(x, "$expanded", js.undefined)
      
      @scala.inline
      def set$size(value: String | Double): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  @js.native
  trait SharedStatefulPanelContainerProps extends StObject {
    
    var initialState: js.UndefOr[PanelState] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
    
    var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.native
  }
  object SharedStatefulPanelContainerProps {
    
    @scala.inline
    def apply(): SharedStatefulPanelContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStatefulPanelContainerProps]
    }
    
    @scala.inline
    implicit class SharedStatefulPanelContainerPropsMutableBuilder[Self <: SharedStatefulPanelContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ExpandedBoolean => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type StateReducer[T] = js.Function3[expand, /* nextState */ T, /* currentState */ T, T]
  
  /* Inlined baseui.baseui/accordion.SharedStatefulPanelContainerProps & {  children :react.react.ReactNode} */
  @js.native
  trait StatefulPanelContainerProps extends StObject {
    
    var children: ReactNode = js.native
    
    var initialState: js.UndefOr[PanelState] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, _]] = js.native
    
    var stateReducer: js.UndefOr[StateReducer[PanelState]] = js.native
  }
  object StatefulPanelContainerProps {
    
    @scala.inline
    def apply(): StatefulPanelContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatefulPanelContainerProps]
    }
    
    @scala.inline
    implicit class StatefulPanelContainerPropsMutableBuilder[Self <: StatefulPanelContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: PanelState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ExpandedBoolean => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (expand, PanelState, PanelState) => PanelState): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  type StatefulPanelProps = SharedPanelProps with SharedStatefulPanelContainerProps
  
  @js.native
  trait StatelessAccordionProps extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var children: ReactNode = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var expanded: js.Array[Key] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* args */ typings.baseui.anon.Key, _]] = js.native
    
    var overrides: js.UndefOr[AccordionOverrides[SharedProps] with PanelOverrides[SharedProps]] = js.native
    
    var renderAll: js.UndefOr[Boolean] = js.native
    
    var renderPanelContent: js.UndefOr[Boolean] = js.native
  }
  object StatelessAccordionProps {
    
    @scala.inline
    def apply(expanded: js.Array[Key]): StatelessAccordionProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatelessAccordionProps]
    }
    
    @scala.inline
    implicit class StatelessAccordionPropsMutableBuilder[Self <: StatelessAccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExpanded(value: js.Array[Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedVarargs(value: Key*): Self = StObject.set(x, "expanded", js.Array(value :_*))
      
      @scala.inline
      def setOnChange(value: /* args */ typings.baseui.anon.Key => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: AccordionOverrides[SharedProps] with PanelOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
      
      @scala.inline
      def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    }
  }
}
