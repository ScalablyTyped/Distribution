package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationNavMod {
  
  @JSImport("carbon-components/components/pagination-nav/pagination-nav", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PaginationNav {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def clearActivePage(evt: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def getActivePageNumber(): js.UndefOr[Double] = js.native
    
    /* CompleteClass */
    override def handleClick(evt: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def handleSelectChange(evt: js.Any): Unit = js.native
    
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
    def components: WeakMap[js.Object, js.Any] = js.native
    inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait PaginationNav extends StObject {
    
    def clearActivePage(evt: js.Any): Unit
    
    def getActivePageNumber(): js.UndefOr[Double]
    
    def handleClick(evt: js.Any): Unit
    
    def handleSelectChange(evt: js.Any): Unit
    
    def setPrevNextStates(): Unit
  }
  object PaginationNav {
    
    inline def apply(
      clearActivePage: js.Any => Unit,
      getActivePageNumber: () => js.UndefOr[Double],
      handleClick: js.Any => Unit,
      handleSelectChange: js.Any => Unit,
      setPrevNextStates: () => Unit
    ): PaginationNav = {
      val __obj = js.Dynamic.literal(clearActivePage = js.Any.fromFunction1(clearActivePage), getActivePageNumber = js.Any.fromFunction0(getActivePageNumber), handleClick = js.Any.fromFunction1(handleClick), handleSelectChange = js.Any.fromFunction1(handleSelectChange), setPrevNextStates = js.Any.fromFunction0(setPrevNextStates))
      __obj.asInstanceOf[PaginationNav]
    }
    
    extension [Self <: PaginationNav](x: Self) {
      
      inline def setClearActivePage(value: js.Any => Unit): Self = StObject.set(x, "clearActivePage", js.Any.fromFunction1(value))
      
      inline def setGetActivePageNumber(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getActivePageNumber", js.Any.fromFunction0(value))
      
      inline def setHandleClick(value: js.Any => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction1(value))
      
      inline def setHandleSelectChange(value: js.Any => Unit): Self = StObject.set(x, "handleSelectChange", js.Any.fromFunction1(value))
      
      inline def setSetPrevNextStates(value: () => Unit): Self = StObject.set(x, "setPrevNextStates", js.Any.fromFunction0(value))
    }
  }
}
