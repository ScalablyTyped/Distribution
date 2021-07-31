package typings.d3Tip

import org.scalablytyped.runtime.StringDictionary
import typings.d3Array.mod.Primitive
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("d3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def tip(): Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tip")().asInstanceOf[Tooltip]
  
  @js.native
  trait Tooltip extends StObject {
    
    def attr(name: String): String = js.native
    def attr(name: String, value: Primitive): Tooltip = js.native
    def attr[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def attr[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    
    def destroy(): Tooltip = js.native
    
    def direction(): TooltipDirection = js.native
    def direction(direction: TooltipDirection): Tooltip = js.native
    def direction[Datum](
      func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, TooltipDirection]
    ): Tooltip = js.native
    
    def hide(): Tooltip = js.native
    
    def html(): String = js.native
    def html(content: String): Tooltip = js.native
    def html[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, String]): Tooltip = js.native
    
    def offset(): js.Tuple2[Double, Double] = js.native
    def offset(tuple: js.Tuple2[Double, Double]): Tooltip = js.native
    def offset[Datum](
      func: js.Function3[
          /* datum */ Datum, 
          /* index */ Double, 
          /* outerIndex */ Double, 
          js.Tuple2[Double, Double]
        ]
    ): Tooltip = js.native
    
    def rootElement(): HTMLElement = js.native
    def rootElement(element: HTMLElement): Tooltip = js.native
    def rootElement[Datum](func: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, HTMLElement]): Tooltip = js.native
    
    def show(): Tooltip = js.native
    def show(target: SVGElement): Tooltip = js.native
    def show[Datum](data: js.Array[Datum]): Tooltip = js.native
    def show[Datum](data: js.Array[Datum], target: SVGElement): Tooltip = js.native
    
    def style(name: String): String = js.native
    def style(name: String, value: Primitive): Tooltip = js.native
    def style(name: String, value: Primitive, priority: String): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive]
    ): Tooltip = js.native
    def style[Datum](
      name: String,
      value: js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive],
      priority: String
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ]
    ): Tooltip = js.native
    def style[Datum](
      obj: StringDictionary[
          Primitive | (js.Function3[/* datum */ Datum, /* index */ Double, /* outerIndex */ Double, Primitive])
        ],
      priority: String
    ): Tooltip = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.d3Tip.d3TipStrings.n
    - typings.d3Tip.d3TipStrings.s
    - typings.d3Tip.d3TipStrings.e
    - typings.d3Tip.d3TipStrings.w
    - typings.d3Tip.d3TipStrings.nw
    - typings.d3Tip.d3TipStrings.ne
    - typings.d3Tip.d3TipStrings.sw
    - typings.d3Tip.d3TipStrings.se
  */
  trait TooltipDirection extends StObject
  object TooltipDirection {
    
    @scala.inline
    def e: typings.d3Tip.d3TipStrings.e = "e".asInstanceOf[typings.d3Tip.d3TipStrings.e]
    
    @scala.inline
    def n: typings.d3Tip.d3TipStrings.n = "n".asInstanceOf[typings.d3Tip.d3TipStrings.n]
    
    @scala.inline
    def ne: typings.d3Tip.d3TipStrings.ne = "ne".asInstanceOf[typings.d3Tip.d3TipStrings.ne]
    
    @scala.inline
    def nw: typings.d3Tip.d3TipStrings.nw = "nw".asInstanceOf[typings.d3Tip.d3TipStrings.nw]
    
    @scala.inline
    def s: typings.d3Tip.d3TipStrings.s = "s".asInstanceOf[typings.d3Tip.d3TipStrings.s]
    
    @scala.inline
    def se: typings.d3Tip.d3TipStrings.se = "se".asInstanceOf[typings.d3Tip.d3TipStrings.se]
    
    @scala.inline
    def sw: typings.d3Tip.d3TipStrings.sw = "sw".asInstanceOf[typings.d3Tip.d3TipStrings.sw]
    
    @scala.inline
    def w: typings.d3Tip.d3TipStrings.w = "w".asInstanceOf[typings.d3Tip.d3TipStrings.w]
  }
}
