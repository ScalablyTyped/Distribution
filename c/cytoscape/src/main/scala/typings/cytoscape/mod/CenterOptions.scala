package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterOptions extends StObject {
  
  var eles: CollectionArgument | Selector
}
object CenterOptions {
  
  inline def apply(eles: CollectionArgument | Selector): CenterOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterOptions]
  }
  
  extension [Self <: CenterOptions](x: Self) {
    
    inline def setEles(value: CollectionArgument | Selector): Self = StObject.set(x, "eles", value.asInstanceOf[js.Any])
  }
}
