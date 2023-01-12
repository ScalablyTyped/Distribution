package typings.baseui

import typings.baseui.anon.EventAny
import typings.baseui.anon.NextPage
import typings.baseui.baseuiStrings.changePage
import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationTypesMod {
  
  trait Callbacks extends StObject {
    
    /** Callback for next button click. */
    var onNextClick: js.UndefOr[js.Function1[/* a */ EventAny, Any]] = js.undefined
    
    /** Callback for when page changes. */
    var onPageChange: js.UndefOr[js.Function1[/* a */ NextPage, Any]] = js.undefined
    
    /** Callback for prev button click. */
    var onPrevClick: js.UndefOr[js.Function1[/* a */ EventAny, Any]] = js.undefined
  }
  object Callbacks {
    
    inline def apply(): Callbacks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Callbacks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
      
      inline def setOnNextClick(value: /* a */ EventAny => Any): Self = StObject.set(x, "onNextClick", js.Any.fromFunction1(value))
      
      inline def setOnNextClickUndefined: Self = StObject.set(x, "onNextClick", js.undefined)
      
      inline def setOnPageChange(value: /* a */ NextPage => Any): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setOnPrevClick(value: /* a */ EventAny => Any): Self = StObject.set(x, "onPrevClick", js.Any.fromFunction1(value))
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setNextButton(value: String): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      inline def setPreposition(value: String): Self = StObject.set(x, "preposition", value.asInstanceOf[js.Any])
      
      inline def setPrepositionUndefined: Self = StObject.set(x, "preposition", js.undefined)
      
      inline def setPrevButton(value: String): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
    }
  }
  
  trait PaginationOverrides extends StObject {
    
    var DropdownContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var MaxLabel: js.UndefOr[Override[Any]] = js.undefined
    
    var NextButton: js.UndefOr[Override[Any]] = js.undefined
    
    var PrevButton: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var Select: js.UndefOr[Override[Any]] = js.undefined
  }
  object PaginationOverrides {
    
    inline def apply(): PaginationOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationOverrides] (val x: Self) extends AnyVal {
      
      inline def setDropdownContainer(value: Override[Any]): Self = StObject.set(x, "DropdownContainer", value.asInstanceOf[js.Any])
      
      inline def setDropdownContainerUndefined: Self = StObject.set(x, "DropdownContainer", js.undefined)
      
      inline def setMaxLabel(value: Override[Any]): Self = StObject.set(x, "MaxLabel", value.asInstanceOf[js.Any])
      
      inline def setMaxLabelUndefined: Self = StObject.set(x, "MaxLabel", js.undefined)
      
      inline def setNextButton(value: Override[Any]): Self = StObject.set(x, "NextButton", value.asInstanceOf[js.Any])
      
      inline def setNextButtonUndefined: Self = StObject.set(x, "NextButton", js.undefined)
      
      inline def setPrevButton(value: Override[Any]): Self = StObject.set(x, "PrevButton", value.asInstanceOf[js.Any])
      
      inline def setPrevButtonUndefined: Self = StObject.set(x, "PrevButton", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setSelect(value: Override[Any]): Self = StObject.set(x, "Select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "Select", js.undefined)
    }
  }
  
  trait PaginationProps
    extends StObject
       with Callbacks {
    
    /** The current page. */
    var currentPage: Double
    
    /** Set of labels to use for the buttons and preposition. */
    var labels: js.UndefOr[Labels] = js.undefined
    
    /** Max number of pages. */
    var numPages: Double
    
    var overrides: js.UndefOr[PaginationOverrides] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(currentPage: Double, numPages: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* keyof baseui.anon.Compact */ /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.mini
    - typings.baseui.baseuiStrings.default_
    - typings.baseui.baseuiStrings.compact
    - typings.baseui.baseuiStrings.large_
  */
  trait Size extends StObject
  
  type StateReducerFn = js.Function3[
    changePage, 
    /* changes */ StatefulContainerState, 
    /* currentState */ StatefulContainerState, 
    StatefulContainerState
  ]
  
  trait StatefulContainerProps extends StObject {
    
    var children: Any
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[StatefulContainerState] = js.undefined
    
    var numPages: Double
    
    /** Callback for when page changes. */
    var onPageChange: js.UndefOr[js.Function1[/* a */ NextPage, Any]] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: js.UndefOr[StateReducerFn] = js.undefined
  }
  object StatefulContainerProps {
    
    inline def apply(children: Any, numPages: Double): StatefulContainerProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulContainerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInitialState(value: StatefulContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOnPageChange(value: /* a */ NextPage => Any): Self = StObject.set(x, "onPageChange", js.Any.fromFunction1(value))
      
      inline def setOnPageChangeUndefined: Self = StObject.set(x, "onPageChange", js.undefined)
      
      inline def setStateReducer(
        value: (changePage, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
  
  trait StatefulContainerState extends StObject {
    
    var currentPage: Double
  }
  object StatefulContainerState {
    
    inline def apply(currentPage: Double): StatefulContainerState = {
      val __obj = js.Dynamic.literal(currentPage = currentPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulContainerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulContainerState] (val x: Self) extends AnyVal {
      
      inline def setCurrentPage(value: Double): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatefulPaginationProps
    extends StObject
       with Callbacks {
    
    /** Initial state populated into the component */
    var initialState: js.UndefOr[StatefulContainerState] = js.undefined
    
    /** Set of labels to use for the buttons and preposition. */
    var labels: js.UndefOr[Labels] = js.undefined
    
    /** Max number of pages. */
    var numPages: Double
    
    var overrides: js.UndefOr[PaginationOverrides] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    /** Reducer function to manipulate internal state updates. */
    var stateReducer: js.UndefOr[StateReducerFn] = js.undefined
  }
  object StatefulPaginationProps {
    
    inline def apply(numPages: Double): StatefulPaginationProps = {
      val __obj = js.Dynamic.literal(numPages = numPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulPaginationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulPaginationProps] (val x: Self) extends AnyVal {
      
      inline def setInitialState(value: StatefulContainerState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setNumPages(value: Double): Self = StObject.set(x, "numPages", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: PaginationOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStateReducer(
        value: (changePage, /* changes */ StatefulContainerState, /* currentState */ StatefulContainerState) => StatefulContainerState
      ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction3(value))
      
      inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    }
  }
}
