package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableQuadrantStackCacheMod {
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrantStackCache", "TableQuadrantStackCache")
  @js.native
  class TableQuadrantStackCache () extends StObject {
    
    /* private */ var cachedColumnHeaderHeight: js.Any = js.native
    
    /* private */ var cachedRowHeaderWidth: js.Any = js.native
    
    /* private */ var cachedScrollContainerClientHeight: js.Any = js.native
    
    /* private */ var cachedScrollContainerClientWidth: js.Any = js.native
    
    /* private */ var cachedScrollLeft: js.Any = js.native
    
    /* private */ var cachedScrollTop: js.Any = js.native
    
    def getColumnHeaderHeight(): Double = js.native
    
    def getRowHeaderWidth(): Double = js.native
    
    def getScrollContainerClientHeight(): Double = js.native
    
    def getScrollContainerClientWidth(): Double = js.native
    
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
