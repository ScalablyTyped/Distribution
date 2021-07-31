package typings.cssSelect

import typings.cssSelect.typesMod.CompiledQuery
import typings.cssSelect.typesMod.InternalOptions
import typings.cssWhat.parseMod.AttributeSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  /* Inlined std.Record<css-what.css-what.AttributeAction, <Node, ElementNode extends Node>(next : css-select.css-select/lib/types.CompiledQuery<ElementNode>, data : css-what.css-what.AttributeSelector, options : css-select.css-select/lib/types.InternalOptions<Node, ElementNode>): css-select.css-select/lib/types.CompiledQuery<ElementNode>> */
  object attributeRules {
    
    @JSImport("css-select/lib/attributes", "attributeRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("css-select/lib/attributes", "attributeRules.any")
    @js.native
    def any: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def any[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def any_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.element")
    @js.native
    def element: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def element[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("element")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def element_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("element")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.end")
    @js.native
    def end: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def end[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("end")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def end_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("end")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.equals")
    @js.native
    def equals_ : js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    
    @scala.inline
    def equals_[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def equals__=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("equals")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.exists")
    @js.native
    def exists: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def exists[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def exists_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exists")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.hyphen")
    @js.native
    def hyphen: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def hyphen[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("hyphen")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def hyphen_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hyphen")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.not")
    @js.native
    def not: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def not[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def not_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("not")(x.asInstanceOf[js.Any])
    
    @JSImport("css-select/lib/attributes", "attributeRules.start")
    @js.native
    def start: js.Function3[
        /* next */ CompiledQuery[js.Any], 
        /* data */ AttributeSelector, 
        /* options */ InternalOptions[js.Any, js.Any], 
        CompiledQuery[js.Any]
      ] = js.native
    @scala.inline
    def start[Node, ElementNode /* <: Node */](
      next: CompiledQuery[ElementNode],
      data: AttributeSelector,
      options: InternalOptions[Node, ElementNode]
    ): CompiledQuery[ElementNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(next.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledQuery[ElementNode]]
    @scala.inline
    def start_=(
      x: js.Function3[
          /* next */ CompiledQuery[js.Any], 
          /* data */ AttributeSelector, 
          /* options */ InternalOptions[js.Any, js.Any], 
          CompiledQuery[js.Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
}
