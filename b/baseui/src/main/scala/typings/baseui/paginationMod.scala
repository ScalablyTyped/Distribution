package typings.baseui

import typings.baseui.anon.EventAny
import typings.baseui.anon.NextPage
import typings.baseui.anon.NextPageNumber
import typings.baseui.anon.Value
import typings.baseui.baseuiStrings.change_
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.dateFns.Locale
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("baseui/pagination", "Pagination")
  @js.native
  class Pagination protected ()
    extends PureComponent[PaginationProps, js.Object, js.Any] {
    def this(props: PaginationProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginationProps, context: js.Any) = this()
    
    def constructAriaWayfinderLabel(locale: Locale, prefix: String): String = js.native
    
    def getMenuOptions(numPages: Double): js.Array[js.Any] = js.native
    
    def onMenuItemSelect(data: Value): Unit = js.native
    
    def onNextClick(event: SyntheticEvent[_, Event]): Unit = js.native
    
    def onPrevClick(event: SyntheticEvent[_, Event]): Unit = js.native
  }
  
  @JSImport("baseui/pagination", "SIZE")
  @js.native
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  
  @js.native
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_ = js.native
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/pagination", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    @scala.inline
    implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/pagination", "StatefulContainer")
  @js.native
  class StatefulContainer protected ()
    extends Component[StatefulContainerProps, State, js.Any] {
    def this(props: StatefulContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StatefulContainerProps, context: js.Any) = this()
    
    @JSName("internalSetState")
    def internalSetState_change(changeType: change_, changes: State): Unit = js.native
    
    def onPageChange(args: NextPageNumber): Unit = js.native
  }
  
  @JSImport("baseui/pagination", "StatefulPagination")
  @js.native
  val StatefulPagination: FC[StatefulPaginationProps] = js.native
  
  @JSImport("baseui/pagination", "StyledDropdownContainer")
  @js.native
  val StyledDropdownContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/pagination", "StyledMaxLabel")
  @js.native
  val StyledMaxLabel: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/pagination", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait Callbacks extends StObject {
    
    var onNextClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
    
    var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.native
    
    var onPrevClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
  }
  object Callbacks {
    
    @scala.inline
    def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit class CallbacksMutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnNextClick(value: /* args */ EventAny => _): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
      
      @scala.inline
      def setOnPageChange(value: /* args */ NextPage => _): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      @scala.inline
      def setOnPrevClick(value: /* args */ EventAny => _): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPrevClickUndefined: Self = StObject.set(x, "onPrevClick", js.undefined)
    }
  }
  
  @js.native
  trait Labels extends StObject {
    
    var nextButton: js.UndefOr[String] = js.native
    
    var preposition: js.UndefOr[String] = js.native
    
    var prevButton: js.UndefOr[String] = js.native
  }
  object Labels {
    
    @scala.inline
    def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      @scala.inline
      def setPreposition(value: String): Self = StObject.set(x, "preposition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepositionUndefined: Self = StObject.set(x, "preposition", js.undefined)
      
      @scala.inline
      def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
    }
  }
  
  @js.native
  trait PageOption extends StObject {
    
    var label: Double = js.native
  }
  object PageOption {
    
    @scala.inline
    def apply(label: Double): PageOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageOption]
    }
    
    @scala.inline
    implicit class PageOptionMutableBuilder[Self <: PageOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationOverrides extends StObject {
    
    var DropdownContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var MaxLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var NextButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var PrevButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Select: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object PaginationOverrides {
    
    @scala.inline
    def apply(): PaginationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationOverrides]
    }
    
    @scala.inline
    implicit class PaginationOverridesMutableBuilder[Self <: PaginationOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDropdownContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "DropdownContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownContainerUndefined: Self = StObject.set(x, "DropdownContainer", js.undefined)
      
      @scala.inline
      def setMaxLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "MaxLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLabelUndefined: Self = StObject.set(x, "MaxLabel", js.undefined)
      
      @scala.inline
      def setNextButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "NextButton", js.undefined)
      
      @scala.inline
      def setPrevButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "PrevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonUndefined: Self = StObject.set(x, "PrevButton", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setSelect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  @js.native
  trait PaginationProps extends Callbacks {
    
    var currentPage: Double = js.native
    
    var labels: js.UndefOr[Labels] = js.native
    
    var numPages: Double = js.native
    
    var overrides: js.UndefOr[PaginationOverrides] = js.native
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(currentPage: Double, numPages: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait State extends StObject {
    
    var currentPage: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(currentPage: Double): State = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function3[change_, /* changes */ State, /* currentState */ State, State]
  
  @js.native
  trait StatefulContainerProps extends StObject {
    
    var children: ReactNode = js.native
    
    var initialState: js.UndefOr[State] = js.native
    
    var numPages: Double = js.native
    
    var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
  }
  object StatefulContainerProps {
    
    @scala.inline
    def apply(numPages: Double): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit class StatefulContainerPropsMutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnPageChange(value: /* args */ NextPage => _): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  @js.native
  trait StatefulPaginationProps extends Callbacks {
    
    var initialState: js.UndefOr[State] = js.native
    
    var labels: js.UndefOr[Labels] = js.native
    
    var numPages: Double = js.native
    
    var overrides: js.UndefOr[PaginationOverrides] = js.native
    
    var stateReducer: js.UndefOr[StateReducer] = js.native
  }
  object StatefulPaginationProps {
    
    @scala.inline
    def apply(numPages: Double): StatefulPaginationProps = {
      val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPaginationProps]
    }
    
    @scala.inline
    implicit class StatefulPaginationPropsMutableBuilder[Self <: StatefulPaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      @scala.inline
      def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
