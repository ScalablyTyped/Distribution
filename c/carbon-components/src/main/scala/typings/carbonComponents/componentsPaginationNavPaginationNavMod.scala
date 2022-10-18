package typings.carbonComponents

import typings.carbonComponents.anon.PartialPaginationNavOptio
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPaginationNavPaginationNavMod {
  
  @JSImport("carbon-components/components/pagination-nav/pagination-nav", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PaginationNav {
    def this(element: HTMLElement) = this()
    def this(element: HTMLElement, options: PartialPaginationNavOptio) = this()
    
    /* CompleteClass */
    override def clearActivePage(evt: Event): Unit = js.native
    
    /* CompleteClass */
    override def getActivePageNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def handleClick(evt: MouseEvent): Unit = js.native
    
    /* CompleteClass */
    override def handleSelectChange(evt: Event): Unit = js.native
    
    /* CompleteClass */
    override def setPrevNextStates(): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/pagination-nav/pagination-nav", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/pagination-nav/pagination-nav", "default.components")
    @js.native
    def components: WeakMap[js.Object, Any] = js.native
    inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait PaginationNav extends StObject {
    
    def clearActivePage(evt: Event): Unit
    
    def getActivePageNumber(): js.UndefOr[Double]
    
    def handleClick(evt: MouseEvent): Unit
    
    def handleSelectChange(evt: Event): Unit
    
    def setPrevNextStates(): Unit
  }
  object PaginationNav {
    
    inline def apply(
      clearActivePage: Event => Unit,
      getActivePageNumber: () => js.UndefOr[Double],
      handleClick: MouseEvent => Unit,
      handleSelectChange: Event => Unit,
      setPrevNextStates: () => Unit
    ): PaginationNav = {
      val __obj = js.Dynamic.literal(clearActivePage = js.Any.fromFunction1(clearActivePage), getActivePageNumber = js.Any.fromFunction0(getActivePageNumber), handleClick = js.Any.fromFunction1(handleClick), handleSelectChange = js.Any.fromFunction1(handleSelectChange), setPrevNextStates = js.Any.fromFunction0(setPrevNextStates))
      __obj.asInstanceOf[PaginationNav]
    }
    
    extension [Self <: PaginationNav](x: Self) {
      
      inline def setClearActivePage(value: Event => Unit): Self = StObject.set(x, "clearActivePage", js.Any.fromFunction1(value))
      
      inline def setGetActivePageNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getActivePageNumber", js.Any.fromFunction0(value))
      
      inline def setHandleClick(value: MouseEvent => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction1(value))
      
      inline def setHandleSelectChange(value: Event => Unit): Self = StObject.set(x, "handleSelectChange", js.Any.fromFunction1(value))
      
      inline def setSetPrevNextStates(value: () => Unit): Self = StObject.set(x, "setPrevNextStates", js.Any.fromFunction0(value))
    }
  }
  
  trait PaginationNavOptions extends StObject {
    
    var attribActive: String
    
    var attribPage: String
    
    var classActive: String
    
    var classDisabled: String
    
    var selectorInit: String
    
    var selectorPageActive: String
    
    var selectorPageButton: String
    
    var selectorPageElement: String
    
    var selectorPageNext: String
    
    var selectorPagePrevious: String
    
    var selectorPageSelect: String
  }
  object PaginationNavOptions {
    
    inline def apply(
      attribActive: String,
      attribPage: String,
      classActive: String,
      classDisabled: String,
      selectorInit: String,
      selectorPageActive: String,
      selectorPageButton: String,
      selectorPageElement: String,
      selectorPageNext: String,
      selectorPagePrevious: String,
      selectorPageSelect: String
    ): PaginationNavOptions = {
      val __obj = js.Dynamic.literal(attribActive = attribActive.asInstanceOf[js.Any], attribPage = attribPage.asInstanceOf[js.Any], classActive = classActive.asInstanceOf[js.Any], classDisabled = classDisabled.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorPageActive = selectorPageActive.asInstanceOf[js.Any], selectorPageButton = selectorPageButton.asInstanceOf[js.Any], selectorPageElement = selectorPageElement.asInstanceOf[js.Any], selectorPageNext = selectorPageNext.asInstanceOf[js.Any], selectorPagePrevious = selectorPagePrevious.asInstanceOf[js.Any], selectorPageSelect = selectorPageSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationNavOptions]
    }
    
    extension [Self <: PaginationNavOptions](x: Self) {
      
      inline def setAttribActive(value: String): Self = StObject.set(x, "attribActive", value.asInstanceOf[js.Any])
      
      inline def setAttribPage(value: String): Self = StObject.set(x, "attribPage", value.asInstanceOf[js.Any])
      
      inline def setClassActive(value: String): Self = StObject.set(x, "classActive", value.asInstanceOf[js.Any])
      
      inline def setClassDisabled(value: String): Self = StObject.set(x, "classDisabled", value.asInstanceOf[js.Any])
      
      inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageActive(value: String): Self = StObject.set(x, "selectorPageActive", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageButton(value: String): Self = StObject.set(x, "selectorPageButton", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageElement(value: String): Self = StObject.set(x, "selectorPageElement", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageNext(value: String): Self = StObject.set(x, "selectorPageNext", value.asInstanceOf[js.Any])
      
      inline def setSelectorPagePrevious(value: String): Self = StObject.set(x, "selectorPagePrevious", value.asInstanceOf[js.Any])
      
      inline def setSelectorPageSelect(value: String): Self = StObject.set(x, "selectorPageSelect", value.asInstanceOf[js.Any])
    }
  }
}
