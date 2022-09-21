package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableQuadrantStackCacheMod {
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStackCache", "TableQuadrantStackCache")
  @js.native
  open class TableQuadrantStackCache () extends StObject {
    
    /* private */ var cachedColumnHeaderHeight: Any = js.native
    
    /* private */ var cachedRowHeaderWidth: Any = js.native
    
    /* private */ var cachedScrollContainerClientHeight: Any = js.native
    
    /* private */ var cachedScrollContainerClientWidth: Any = js.native
    
    /* private */ var cachedScrollLeft: Any = js.native
    
    /* private */ var cachedScrollTop: Any = js.native
    
    def getColumnHeaderHeight(): Double = js.native
    
    def getRowHeaderWidth(): Double = js.native
    
    def getScrollContainerClientHeight(): js.UndefOr[Double] = js.native
    
    def getScrollContainerClientWidth(): js.UndefOr[Double] = js.native
    
    def getScrollOffset(scrollKey: ScrollKey): Double = js.native
    
    def reset(): Unit = js.native
    
    def setColumnHeaderHeight(height: Double): Unit = js.native
    
    def setRowHeaderWidth(width: Double): Unit = js.native
    
    def setScrollContainerClientHeight(): Unit = js.native
    def setScrollContainerClientHeight(clientHeight: Double): Unit = js.native
    
    def setScrollContainerClientWidth(): Unit = js.native
    def setScrollContainerClientWidth(clientWidth: Double): Unit = js.native
    
    def setScrollOffset(scrollKey: ScrollKey, offset: Double): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.blueprintjsTable.blueprintjsTableStrings.scrollLeft
    - typings.blueprintjsTable.blueprintjsTableStrings.scrollTop
  */
  trait ScrollKey extends StObject
  object ScrollKey {
    
    inline def scrollLeft: typings.blueprintjsTable.blueprintjsTableStrings.scrollLeft = "scrollLeft".asInstanceOf[typings.blueprintjsTable.blueprintjsTableStrings.scrollLeft]
    
    inline def scrollTop: typings.blueprintjsTable.blueprintjsTableStrings.scrollTop = "scrollTop".asInstanceOf[typings.blueprintjsTable.blueprintjsTableStrings.scrollTop]
  }
}
