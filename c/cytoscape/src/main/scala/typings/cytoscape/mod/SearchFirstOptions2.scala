package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirstOptions2
  extends SearchFirstOptionsBase
     with SearchFirstOptions {
  
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var roots: Selector | CollectionArgument = js.native
}
object SearchFirstOptions2 {
  
  @scala.inline
  def apply(roots: Selector | CollectionArgument): SearchFirstOptions2 = {
    val __obj = js.Dynamic.literal(roots = roots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions2]
  }
  
  @scala.inline
  implicit class SearchFirstOptions2MutableBuilder[Self <: SearchFirstOptions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoots(value: Selector | CollectionArgument): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
  }
}
