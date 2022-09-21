package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProductionWithOccurrence
  extends StObject
     with IProduction {
  
  var idx: Double
}
object IProductionWithOccurrence {
  
  inline def apply(accept: IGASTVisitor => Unit, idx: Double): IProductionWithOccurrence = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), idx = idx.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProductionWithOccurrence]
  }
  
  extension [Self <: IProductionWithOccurrence](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
  }
}
