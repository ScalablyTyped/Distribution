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
    
    def onNextClick(event: SyntheticEvent[js.Any, Event]): Unit = js.native
    
    def onPrevClick(event: SyntheticEvent[js.Any, Event]): Unit = js.native
  }
  
  @JSImport("baseui/pagination", "SIZE")
  @js.native
  val SIZE: typings.baseui.inputMod.SIZE = js.native
  
  trait STATE_CHANGE_TYPE extends StObject {
    
    var change: change_
  }
  object STATE_CHANGE_TYPE {
    
    @JSImport("baseui/pagination", "STATE_CHANGE_TYPE")
    @js.native
    val ^ : STATE_CHANGE_TYPE = js.native
    
    extension [Self <: STATE_CHANGE_TYPE](x: Self) {
      
      inline def setChange(value: change_): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
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
  
  trait Callbacks extends StObject {
    
    var onNextClick: js.UndefOr[js.Function1[/* args */ EventAny, js.Any]] = js.undefined
    
    var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, js.Any]] = js.undefined
    
    var onPrevClick: js.UndefOr[js.Function1[/* args */ EventAny, js.Any]] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    extension [Self <: Callbacks](x: Self) {
      
      inline def setOnNextClick(value: /* args */ EventAny => js.Any): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
      
      inline def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
      
      inline def setOnPageChange(value: /* args */ NextPage => js.Any): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setOnPrevClick(value: /* args */ EventAny => js.Any): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
      
      inline def setOnPrevClickUndefined: Self = StObject.set(x, "onPrevClick", js.undefined)
    }
  }
  
  trait Labels extends StObject {
    
    var nextButton: js.UndefOr[String] = js.undefined
    
    var preposition: js.UndefOr[String] = js.undefined
    
    var prevButton: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    inline def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    extension [Self <: Labels](x: Self) {
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setPreposition(value: String): Self = StObject.set(x, "preposition", value.asInstanceOf[js.Any])
      
      inline def setPrepositionUndefined: Self = StObject.set(x, "preposition", js.undefined)
      
      inline def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
    }
  }
  
  trait PageOption extends StObject {
    
    var label: Double
  }
  object PageOption {
    
    inline def apply(label: Double): PageOption = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageOption]
    }
    
    extension [Self <: PageOption](x: Self) {
      
      inline def setLabel(value: Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationOverrides extends StObject {
    
    var DropdownContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var MaxLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var NextButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var PrevButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Select: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object PaginationOverrides {
    
    inline def apply(): PaginationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationOverrides]
    }
    
    extension [Self <: PaginationOverrides](x: Self) {
      
      inline def setDropdownContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "DropdownContainer", value.asInstanceOf[js.Any])
      
      inline def setDropdownContainerUndefined: Self = StObject.set(x, "DropdownContainer", js.undefined)
      
      inline def setMaxLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "MaxLabel", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelUndefined: Self = StObject.set(x, "MaxLabel", js.undefined)
      
      inline def setNextButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "NextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "NextButton", js.undefined)
      
      inline def setPrevButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "PrevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "PrevButton", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSelect(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  trait PaginationProps
    extends StObject
       with Callbacks {
    
    var currentPage: Double
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var numPages: Double
    
    var overrides: js.UndefOr[PaginationOverrides] = js.undefined
    
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(currentPage: Double, numPages: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var currentPage: Double
  }
  object State {
    
    inline def apply(currentPage: Double): State = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    }
  }
  
  type StateReducer = js.Function3[change_, /* changes */ State, /* currentState */ State, State]
  
  trait StatefulContainerProps extends StObject {
    
    var children: ReactNode
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var numPages: Double
    
    var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, js.Any]] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(numPages: Double): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    extension [Self <: StatefulContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOnPageChange(value: /* args */ NextPage => js.Any): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait StatefulPaginationProps
    extends StObject
       with Callbacks {
    
    var initialState: js.UndefOr[State] = js.undefined
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var numPages: Double
    
    var overrides: js.UndefOr[PaginationOverrides] = js.undefined
    
    var stateReducer: js.UndefOr[StateReducer] = js.undefined
  }
  object StatefulPaginationProps {
    
    inline def apply(numPages: Double): StatefulPaginationProps = {
      val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPaginationProps]
    }
    
    extension [Self <: StatefulPaginationProps](x: Self) {
      
      inline def setInitialState(value: State): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setStateReducer(value: (change_, /* changes */ State, /* currentState */ State) => State): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
