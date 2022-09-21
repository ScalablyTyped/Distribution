package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.logicalDTsMod.LogicalComposition
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: LogicalComposition[Predicate]
}
object Filter {
  
  inline def apply(filter: LogicalComposition[Predicate]): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setFilter(value: LogicalComposition[Predicate]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
