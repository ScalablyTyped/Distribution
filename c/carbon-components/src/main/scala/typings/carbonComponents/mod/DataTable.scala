package typings.carbonComponents.mod

import typings.carbonComponents.anon.PartialDataTableOptions
import typings.std.HTMLElement
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "DataTable")
@js.native
open class DataTable protected ()
  extends typings.carbonComponents.componentsMod.DataTable {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: PartialDataTableOptions) = this()
}
object DataTable {
  
  @JSImport("carbon-components", "DataTable")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "DataTable.components")
  @js.native
  def components: WeakMap[js.Object, Any] = js.native
  inline def components_=(x: WeakMap[js.Object, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object eventHandlers {
    
    @JSImport("carbon-components", "DataTable.eventHandlers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "DataTable.eventHandlers.action-bar-cancel")
    @js.native
    def actionBarCancel: String = js.native
    
    inline def actionBarCancel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action-bar-cancel")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "DataTable.eventHandlers.expand")
    @js.native
    def expand: String = js.native
    
    @JSImport("carbon-components", "DataTable.eventHandlers.expandAll")
    @js.native
    def expandAll: String = js.native
    inline def expandAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expandAll")(x.asInstanceOf[js.Any])
    
    inline def expand_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "DataTable.eventHandlers.select")
    @js.native
    def select: String = js.native
    
    @JSImport("carbon-components", "DataTable.eventHandlers.select-all")
    @js.native
    def selectAll: String = js.native
    
    inline def selectAll_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select-all")(x.asInstanceOf[js.Any])
    
    inline def select_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "DataTable.eventHandlers.sort")
    @js.native
    def sort: String = js.native
    inline def sort_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sort")(x.asInstanceOf[js.Any])
  }
}
