package typings.d3DashTip.d3Mod

import org.scalablytyped.runtime.StringDictionary
import typings.d3DashArray.d3DashArrayMod.Primitive
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tooltip extends js.Object {
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

