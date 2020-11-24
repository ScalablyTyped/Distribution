package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.parseMod.AttributeSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-select/lib/attributes", JSImport.Namespace)
@js.native
object attributesMod extends js.Object {
  
  @js.native
  object attributeRules extends js.Object {
    
    def any[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("any")
    var any_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def element[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("element")
    var element_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def end[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("end")
    var end_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def equals[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("equals")
    var equals_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def exists[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("exists")
    var exists_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def hyphen[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("hyphen")
    var hyphen_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def not[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("not")
    var not_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
    
    def start[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = js.native
    @JSName("start")
    var start_Original: js.Function3[
        /* next */ CompiledQuery[_], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[_, _], 
        CompiledQuery[_]
      ] = js.native
  }
}
