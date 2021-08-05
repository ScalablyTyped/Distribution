package typings.carbonComponents.componentsMod

import typings.carbonComponents.paginationMod.default
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components/globals/js/components", "Pagination")
@js.native
class Pagination protected () extends default {
  def this(element: js.Any, options: js.Any) = this()
}
object Pagination {
  
  @JSImport("carbon-components/globals/js/components", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components/globals/js/components", "Pagination.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  inline def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object options {
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.eventItemsPerPage")
    @js.native
    def eventItemsPerPage: String = js.native
    inline def eventItemsPerPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventItemsPerPage")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.eventPageChange")
    @js.native
    def eventPageChange: String = js.native
    inline def eventPageChange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageChange")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.eventPageNumber")
    @js.native
    def eventPageNumber: String = js.native
    inline def eventPageNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.selectorInit")
    @js.native
    def selectorInit: String = js.native
    inline def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.selectorItemsPerPageInput")
    @js.native
    def selectorItemsPerPageInput: String = js.native
    inline def selectorItemsPerPageInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorItemsPerPageInput")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.selectorPageBackward")
    @js.native
    def selectorPageBackward: String = js.native
    inline def selectorPageBackward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageBackward")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.selectorPageForward")
    @js.native
    def selectorPageForward: String = js.native
    inline def selectorPageForward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageForward")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components/globals/js/components", "Pagination.options.selectorPageNumberInput")
    @js.native
    def selectorPageNumberInput: String = js.native
    inline def selectorPageNumberInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageNumberInput")(x.asInstanceOf[js.Any])
  }
}
