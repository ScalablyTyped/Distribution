package typings.carbonComponents.mod

import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Pagination")
@js.native
class Pagination protected ()
  extends typings.carbonComponents.componentsMod.Pagination {
  def this(element: js.Any, options: js.Any) = this()
}
object Pagination {
  
  @JSImport("carbon-components", "Pagination")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Pagination.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object options {
    
    @JSImport("carbon-components", "Pagination.options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "Pagination.options.eventItemsPerPage")
    @js.native
    def eventItemsPerPage: String = js.native
    @scala.inline
    def eventItemsPerPage_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventItemsPerPage")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.eventPageChange")
    @js.native
    def eventPageChange: String = js.native
    @scala.inline
    def eventPageChange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageChange")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.eventPageNumber")
    @js.native
    def eventPageNumber: String = js.native
    @scala.inline
    def eventPageNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventPageNumber")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.selectorInit")
    @js.native
    def selectorInit: String = js.native
    @scala.inline
    def selectorInit_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorInit")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.selectorItemsPerPageInput")
    @js.native
    def selectorItemsPerPageInput: String = js.native
    @scala.inline
    def selectorItemsPerPageInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorItemsPerPageInput")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.selectorPageBackward")
    @js.native
    def selectorPageBackward: String = js.native
    @scala.inline
    def selectorPageBackward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageBackward")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.selectorPageForward")
    @js.native
    def selectorPageForward: String = js.native
    @scala.inline
    def selectorPageForward_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageForward")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Pagination.options.selectorPageNumberInput")
    @js.native
    def selectorPageNumberInput: String = js.native
    @scala.inline
    def selectorPageNumberInput_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPageNumberInput")(x.asInstanceOf[js.Any])
  }
}
