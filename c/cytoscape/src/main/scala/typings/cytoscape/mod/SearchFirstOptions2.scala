package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFirstOptions2
  extends StObject
     with SearchFirstOptionsBase
     with SearchFirstOptions {
  
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var roots: Selector | CollectionArgument
}
object SearchFirstOptions2 {
  
  inline def apply(roots: Selector | CollectionArgument): SearchFirstOptions2 = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions2]
  }
  
  extension [Self <: SearchFirstOptions2](x: Self) {
    
    inline def setRoots(value: Selector | CollectionArgument): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
  }
}
