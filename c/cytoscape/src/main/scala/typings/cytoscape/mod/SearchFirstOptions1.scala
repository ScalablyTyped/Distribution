package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFirstOptions1
  extends StObject
     with SearchFirstOptionsBase
     with SearchFirstOptions {
  
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var root: Selector | CollectionArgument
}
object SearchFirstOptions1 {
  
  inline def apply(root: Selector | CollectionArgument): SearchFirstOptions1 = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFirstOptions1] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: Selector | CollectionArgument): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
