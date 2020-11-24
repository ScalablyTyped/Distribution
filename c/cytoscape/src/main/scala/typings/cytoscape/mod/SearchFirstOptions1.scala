package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchFirstOptions1
  extends SearchFirstOptionsBase
     with SearchFirstOptions {
  
  /**
    * The root nodes (selector or collection) to start the search from.
    */
  var root: Selector | CollectionArgument = js.native
}
object SearchFirstOptions1 {
  
  @scala.inline
  def apply(root: Selector | CollectionArgument): SearchFirstOptions1 = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFirstOptions1]
  }
  
  @scala.inline
  implicit class SearchFirstOptions1Ops[Self <: SearchFirstOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoot(value: Selector | CollectionArgument): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
