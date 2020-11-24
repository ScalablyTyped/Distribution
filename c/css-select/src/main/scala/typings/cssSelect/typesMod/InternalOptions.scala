package typings.cssSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalOptions[Node, ElementNode /* <: Node */] extends Options[Node, ElementNode] {
  
  @JSName("adapter")
  var adapter_InternalOptions: Adapter[Node, ElementNode] = js.native
  
  def equals(a: Node, b: Node): Boolean = js.native
}
object InternalOptions {
  
  @scala.inline
  def apply[Node, ElementNode /* <: Node */](adapter: Adapter[Node, ElementNode], equals: (Node, Node) => Boolean): InternalOptions[Node, ElementNode] = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], equals = js.Any.fromFunction2(equals))
    __obj.asInstanceOf[InternalOptions[Node, ElementNode]]
  }
  
  @scala.inline
  implicit class InternalOptionsOps[Self <: InternalOptions[_, _], Node, ElementNode /* <: Node */] (val x: Self with (InternalOptions[Node, ElementNode])) extends AnyVal {
    
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
    def setAdapter(value: Adapter[Node, ElementNode]): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: (Node, Node) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
  }
}
