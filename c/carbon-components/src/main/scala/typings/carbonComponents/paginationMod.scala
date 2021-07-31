package typings.carbonComponents

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationMod {
  
  @JSImport("carbon-components/components/pagination/pagination", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Pagination {
    def this(element: js.Any, options: js.Any) = this()
    
    /* CompleteClass */
    override def _emitEvent(evtName: js.Any, detail: js.Any): Unit = js.native
  }
  object default {
    
    @JSImport("carbon-components/components/pagination/pagination", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/pagination/pagination", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object options {
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.eventItemsPerPage")
      @js.native
      def eventItemsPerPage: String = js.native
      @scala.inline
      def eventItemsPerPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventItemsPerPage")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.eventPageChange")
      @js.native
      def eventPageChange: String = js.native
      @scala.inline
      def eventPageChange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageChange")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.eventPageNumber")
      @js.native
      def eventPageNumber: String = js.native
      @scala.inline
      def eventPageNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageNumber")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.selectorInit")
      @js.native
      def selectorInit: String = js.native
      @scala.inline
      def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.selectorItemsPerPageInput")
      @js.native
      def selectorItemsPerPageInput: String = js.native
      @scala.inline
      def selectorItemsPerPageInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorItemsPerPageInput")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.selectorPageBackward")
      @js.native
      def selectorPageBackward: String = js.native
      @scala.inline
      def selectorPageBackward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageBackward")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.selectorPageForward")
      @js.native
      def selectorPageForward: String = js.native
      @scala.inline
      def selectorPageForward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageForward")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/pagination/pagination", "default.options.selectorPageNumberInput")
      @js.native
      def selectorPageNumberInput: String = js.native
      @scala.inline
      def selectorPageNumberInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageNumberInput")(x.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait Pagination extends StObject {
    
    def _emitEvent(evtName: js.Any, detail: js.Any): Unit
  }
  object Pagination {
    
    @scala.inline
    def apply(_emitEvent: (js.Any, js.Any) => Unit): Pagination = {
      val __obj = js.Dynamic.literal(_emitEvent = js.Any.fromFunction2(_emitEvent))
      __obj.asInstanceOf[Pagination]
    }
    
    @scala.inline
    implicit class PaginationMutableBuilder[Self <: Pagination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_emitEvent(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "_emitEvent", js.Any.fromFunction2(value))
    }
  }
}
