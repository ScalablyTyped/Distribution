package typings.cathoQuantum

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("@catho/quantum/Pagination", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationProps, js.Object, js.Any]
  
  type Pagination = Component[PaginationProps, js.Object, js.Any]
  
  trait PaginationProps extends StObject {
    
    var activePage: js.UndefOr[Double] = js.undefined
    
    var activePageAriaLabel: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var followOnlyFirstPage: js.UndefOr[Boolean] = js.undefined
    
    var infoFormatter: js.UndefOr[
        js.Function2[/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double], Unit]
      ] = js.undefined
    
    var nextButtonText: js.UndefOr[String] = js.undefined
    
    var onPageClick: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.undefined
    
    var pageAriaLabel: js.UndefOr[String] = js.undefined
    
    var pageHref: js.UndefOr[js.Function1[/* page */ js.UndefOr[Double], Unit]] = js.undefined
    
    var prevButtonText: js.UndefOr[String] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var totalPages: Double
  }
  object PaginationProps {
    
    @scala.inline
    def apply(totalPages: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(totalPages = totalPages.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivePage(value: Double): Self = StObject.set(x, "activePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePageAriaLabel(value: String): Self = StObject.set(x, "activePageAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePageAriaLabelUndefined: Self = StObject.set(x, "activePageAriaLabel", js.undefined)
      
      @scala.inline
      def setActivePageUndefined: Self = StObject.set(x, "activePage", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setFollowOnlyFirstPage(value: Boolean): Self = StObject.set(x, "followOnlyFirstPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowOnlyFirstPageUndefined: Self = StObject.set(x, "followOnlyFirstPage", js.undefined)
      
      @scala.inline
      def setInfoFormatter(value: (/* activePage */ js.UndefOr[Double], /* lastPage */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "infoFormatter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInfoFormatterUndefined: Self = StObject.set(x, "infoFormatter", js.undefined)
      
      @scala.inline
      def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
      
      @scala.inline
      def setOnPageClick(value: /* page */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "onPageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageClickUndefined: Self = StObject.set(x, "onPageClick", js.undefined)
      
      @scala.inline
      def setPageAriaLabel(value: String): Self = StObject.set(x, "pageAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageAriaLabelUndefined: Self = StObject.set(x, "pageAriaLabel", js.undefined)
      
      @scala.inline
      def setPageHref(value: /* page */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "pageHref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageHrefUndefined: Self = StObject.set(x, "pageHref", js.undefined)
      
      @scala.inline
      def setPrevButtonText(value: String): Self = StObject.set(x, "prevButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonTextUndefined: Self = StObject.set(x, "prevButtonText", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
    }
  }
}
