package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grouping extends StObject {
  
  /**
    * Specifies whether filtering should be performed on the server.
    */
  var filtering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether grouping should be performed on the server.
    */
  var grouping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether sorting should be performed on the server.
    */
  var sorting: js.UndefOr[Boolean] = js.undefined
}
object Grouping {
  
  inline def apply(): Grouping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grouping]
  }
  
  extension [Self <: Grouping](x: Self) {
    
    inline def setFiltering(value: Boolean): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setFilteringUndefined: Self = StObject.set(x, "filtering", js.undefined)
    
    inline def setGrouping(value: Boolean): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
    
    inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
    
    inline def setSorting(value: Boolean): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
  }
}
